/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class Database_Connect {
     Connection con = null;
       Statement st = null;
       ResultSet rs = null ,rs1=null;

      public void DatabaseConnection()
    {
  		// Connexion à la base de données 
  			
       
       try {  /*chargement du driver*/
         Class.forName("com.mysql.cj.jdbc.Driver") ;
        // System.out.println("driver charger");
        }
       catch (Exception e1){System.out .println("Erreur driver:  "+e1.getMessage ( ) ) ;}
        // ou 3306
       try {
           con =DriverManager.getConnection ("jdbc:mysql://localhost:8889/Gestion_Cotisation","root","root") ;

       }
       catch (Exception ez ){System.out.println("Erreur de connexion: "+ ez.getMessage ( ));}


    }		
    public boolean verifierAdministrateur(String username,String password) throws SQLException 
    {
        // Cette methode permet de vérifier les infos de l'administrateur
        // pour la permission d'accés 
  		
      this.DatabaseConnection();
   	  
      try 
      {
	st = con.createStatement() ;
        rs = st.executeQuery("select * from Administrateur") ;
        int col= rs.getMetaData().getColumnCount();
                //         rs.getMetaData().
             //   int ligne=rs.getRow();
        while (rs.next() )
        { 
            if(rs.getString("Password").equals(password) && rs.getString("Username").equals(username)){
                return true;
            }
                   
            
             	//System.out .println(rs.getString (2)+" "+rs.getObject(3) ) ;
        }
        
       // ConnexionPage.label_erreur.setText("veuiller revoir les informations que vous avez fournies !!!");
       // JOptionPane.showMessageDialog(,"VEUILLER REMPLIR TOUS LES CHAMPS ","ERREUR!!",JOptionPane.INFORMATION_MESSAGE,null);
 
       rs.close();    st.close();        con.close();
      }
      catch (Exception er)
      {System.out .println("Erreur ResultSet recup "+er.getMessage ( ) ); 
      }
      finally{
 
               if(con!=null)
                 con.close();
            }
      
      return false;

    }
    public int SaveMembreOnDB(Membre k ) throws SQLException {
        // permet de sauvegarder un nouveau membre
        this.DatabaseConnection();
        try 
        {
	  st = con.createStatement() ;
          
	  st.executeUpdate("INSERT INTO Membre (prenom,nom,adresse,poste,numero,matricule) VALUES ('"+k.getPrenom()+"','"+k.getNom()+"','"+k.getAdresse()+"','"+k.getPoste()+"','"+k.getNumero()+"','"+k.getMatricule()+"')") ;
	   		 
	return 0;	   
	         
        }
	catch (Exception er) 
        {
            System.out .println("Erreur ResultSet insertion de membre "+er.getMessage ( ) ); 
            return 1;

        }
        finally{
 
                if(con!=null)
                 st.close();
                    con.close();
         }
        
     
    }

    public void UpdateMembreOnDB(Membre k,int id ) throws SQLException {
        // permet de modifier les infos d'un membre
        this.DatabaseConnection();
        try 
        {
	  st = con.createStatement() ;
          if(k.getAdhesion()!=null)
            st.executeUpdate("Update Membre set prenom='"+k.getPrenom()+"',nom='"+k.getNom()+"',adresse='"+k.getAdresse()+"',poste='"+k.getPoste()+"',numero='"+k.getNumero()+"', etat='"+k.getEtat()+"', adhesion='"+k.getAdhesion()+"'  where id='"+id+"' ") ;
	  //System.out .println("mod iddiidiidii"+id ); 
           else
            st.executeUpdate("Update Membre set prenom='"+k.getPrenom()+"',nom='"+k.getNom()+"',adresse='"+k.getAdresse()+"',poste='"+k.getPoste()+"',numero='"+k.getNumero()+"', etat='"+k.getEtat()+"'  where id='"+id+"' ") ;
		  
        }
	catch (Exception er) 
        {
            System.out .println("Erreur ResultSet modification de membre "+er.getMessage ( ) ); 
        }
        
        finally{
 
                if(con!=null)
                 st.close();
                    con.close();
         }
    }    
    public HashMap<Integer,String> loadMembre() throws SQLException {
        // permet de charger la table des membres
        this.DatabaseConnection();
        HashMap<Integer,String> membres= new HashMap<Integer,String>() ;
        // utiliser un hashmap pour pouvoir réutiliser l'identifiant du membre qui a cotisé
        st=con.createStatement();
        rs=st.executeQuery("select * from Membre order By prenom");
        
        while(rs.next()){
            String membre= rs.getString("nom")+" "+rs.getString("prenom");
            int id=Integer.parseInt(rs.getString("id"));
            membres.put(id, membre);
            
        }
        rs.close();    st.close();        con.close();
        
        return membres;
        
    }
    
      public ArrayList<String> load_Membre() throws SQLException {
         // permet de charger la table des cotisations (membre,mois)
         
        this.DatabaseConnection();
        ArrayList<String> membres= new ArrayList<String>() ;
        // utiliser un hashmap pour recuper en meme temps les 2 infos membres et mois
        st=con.createStatement();
        rs=st.executeQuery("select * from Membre order By prenom");
        while(rs.next()){
            String id= rs.getString("id");
            String prenom= rs.getString("prenom");
            String nom= rs.getString("nom");
            String adresse= rs.getString("adresse");
            String matricule= rs.getString("matricule");
            String poste= rs.getString("poste");
            String Numero= rs.getString("numero");
          // ResultSet  r=returnMemberInfos(id);
           //r.first();
           String membre= matricule+" "+prenom+" "+nom+" "+adresse+" "+poste+" "+Numero;
           
           membres.add(membre);
            //r.close();
        }
        System.out.println("size depart"+membres.size()); 

        rs.close();   st.close();        con.close();
        return membres;
    }
    public ArrayList<String> loadMembrePasCotise(String month,int year) throws SQLException {
        // permet de charger la table des membres
        this.DatabaseConnection();
        ArrayList<String> membres= new ArrayList<String>() ;
        // utiliser un hashmap pour pouvoir réutiliser l'identifiant du membre qui a cotisé
        st=con.createStatement();
        rs=st.executeQuery("select * from Membre Where id not in (select id_membre from Cotise_le_mois where mois ='"+month+"' and annee='"+year+"' ) ");
        
        while(rs.next()){
            String membre= rs.getString("nom")+" "+rs.getString("prenom");
            //int id=Integer.parseInt(rs.getString("id"));
            membres.add(membre);
            
        }
        rs.close();    st.close();        con.close();
        
        return membres;
        
    }
    
    public ArrayList<String> load_Cotisation(int year) throws SQLException {
         // permet de charger la table des cotisations (membre,mois)
         
        this.DatabaseConnection();
        ArrayList<String> membres= new ArrayList<String>() ;
        // utiliser un hashmap pour recuper en meme temps les 2 infos membres et mois
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROm cotise_le_Mois where annee='"+year+"' Order by id_membre ");
        while(rs.next()){
            String mois= rs.getString("mois");
           int id_membre=Integer.parseInt(rs.getString("id_membre"));
           ResultSet  r=returnMemberInfos(id_membre);
           r.first();
           String membre= id_membre+" "+r.getString("prenom")+" "+r.getString("nom");
           
           membres.add(membre+" "+mois+" "+year);
            //r.close();
        }
        System.out.println("size depart"+membres.size()); 

        rs.close();   st.close();        con.close();
        return membres;
    }
    public ArrayList<String> load_CotisationByMonth(String month,int year) throws SQLException {
         // permet de charger la table des cotisations par mois  (membre,mois)
         
        this.DatabaseConnection();
        ArrayList<String> membres= new ArrayList<String>() ;
        // utiliser un hashmap pour recuper en meme temps les 2 infos membres et mois
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM 	cotise_le_mois where mois='"+month+"' and annee='"+year+"' Order by mois");
        while(rs.next()){
            String mois= rs.getString("mois")+" "+rs.getString("annee");
           int id_membre=Integer.parseInt(rs.getString("id_membre"));
           ResultSet  r=returnMemberInfos(id_membre);
           r.first();
           String membre= id_membre+" "+r.getString("prenom")+" "+r.getString("nom");
           
           membres.add(membre+" "+mois);
            //r.close();
        }
        System.out.println("size depart"+membres.size()); 

        rs.close();   st.close();        con.close();
        return membres;
    }
    public ArrayList<String> load_CotisationByIdMembre(int id) throws SQLException {
         // permet de charger la table des cotisations par mois (membre,mois)
         
        this.DatabaseConnection();
        ArrayList<String> membres= new ArrayList<String>() ;
        // utiliser un hashmap pour recuper en meme temps les 2 infos membres et mois
        st=con.createStatement();
        rs=st.executeQuery("SELECT * FROM cotise_le_mois where id_membre='"+id+"'  Order by mois");
        String s="";
        while(rs.next()){
            String mois= rs.getString("mois")+" "+rs.getString("annee");
          // int id_membre=Integer.parseInt(rs.getString("id_membre"));
           ResultSet  r=returnMemberInfos(id);
           r.first();
           String membre=id+" "+r.getString("prenom")+" "+r.getString("nom")+s;
       
           membres.add(membre+" "+mois);
            //r.close();
        }
       System.out.println("size depart"+membres.size()); 

               rs.close();   st.close();        con.close();
        return membres;
    }

     
    public ResultSet returnMemberInfos(int id) throws SQLException{
         //Cette methode permet de récuperer les infos d'un membre ex: nom à partir de son identifiant
        this.DatabaseConnection();
        Statement st1=con.createStatement();
        rs1=st1.executeQuery("select * from Membre where id='"+id+"'");
        //rs1.close();
         return rs1;
    }
    
    public ResultSet returnMemberInfos(String matricule) throws SQLException{
         //Cette methode permet de récuperer les infos d'un membre ex: nom à partir de sa matricule
        this.DatabaseConnection();
        Statement st1=con.createStatement();
        rs1=st1.executeQuery("select * from Membre where matricule='"+matricule+"'");
       // rs1.close();
        return rs1;
    }
    
    
    public boolean SaveCotisation(int id,String mois, int annee) throws SQLException{
        // permet d'inserer une cotisation (membre et mois)
        this.DatabaseConnection();
        st = con.createStatement() ;
      //st.executeUpdate("INSERT INTO Membre (prenom,nom,adresse,poste,numero,matricule) VALUES ('"+k.getPrenom()+"','"+k.getNom()+"','"+k.getAdresse()+"','"+k.getPoste()+"','"+k.getNumero()+"','"+k.getMatricule()+"')") ;
        try{
            st.executeUpdate("INSERT INTO cotise_le_Mois(id_membre,mois,annee) VALUES ('"+id+"','"+mois+"','"+annee+"') ");

            return true;
        }
	catch (SQLException er)  {
            System.out .println("Erreur ResultSet insertion de cotisation "+er.getMessage ( ) ); 
            
            return false;
        }
           finally{
 
                if(con!=null)
                 st.close();
                    con.close();
         }
     
        
    }
    
    public void deleteCotisation(int id_membre,String mois,int annee) throws SQLException{
        
        this.DatabaseConnection();
        st=con.createStatement();
        
        
        try{
            st.executeUpdate("Delete From cotise_le_Mois where id_membre='"+id_membre+"' and mois='"+mois+"' and annee='"+annee+"' ");

        }
        catch(SQLException e){
            System.out.println("erreur de suppression "+e.getMessage());
        }
        finally{
 
                if(con!=null)
                 st.close();
                    con.close();
         }
        
        
        
    }
    
    public int verifierMoisPrecedent(int id_membre,String mois,int annee) throws SQLException{
        // permet de verifier si le membre a déjà cotisé pour le mois précédent
        // Tout en tenant compte si c'est un nouveau membre(qui n'a jamais cotisé)
        // Type de retour :
        // 0: ancien membre ayant cotisé le mois précédent 
        // 1: ancien membre n'ayant pas cotisé le mois précédent 
        // -1: nouveau membre 
        // 2 pour dire que c'est ça premiere cotisation 
        DatabaseConnection();
        ResultSet rs1=null,rs3=null;Statement st2=null,st3=null;
        st= con.createStatement();
        st2= con.createStatement();
        st3= con.createStatement();
        String mois_Precedent= returnMoisPrecedent(mois, annee);
        StringTokenizer date = new StringTokenizer(mois_Precedent);
        rs= st.executeQuery("Select * from  cotise_le_Mois where id_membre='"+id_membre+"' and mois='"+date.nextToken()+"' and annee='"+date.nextToken()+"' ");
        rs1= st2.executeQuery("Select * from  cotise_le_Mois where id_membre='"+id_membre+"'");
        rs3= st3.executeQuery("Select adhesion from Membre where id='"+id_membre+"'");
        if(rs.next())
            return 0;
        else if(rs1.next()==false){
            rs1.close(); con.close();
                        return -1;

        } 
      
        else{
                if(rs3.next()){
                    String adh= rs3.getString("adhesion");
                    StringTokenizer stk= new StringTokenizer(adh);
                    String mois_adh= stk.nextToken();
                    int  annee_adh= Integer.parseInt(stk.nextToken());
                   
                    if(mois_adh.equalsIgnoreCase(mois) && annee_adh==annee){
                        return 2;
                    }
                    else{
                        return 1;
                    }
                }
                        return 1;
                        
        }
    }
    
    public String returnMoisPrecedent(String mois,int year){
        String annee[]= {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Décembre"};
        String date="";
        for(int i=0;i<annee.length;i++){
            if(mois.equals(annee[i])){
                if(i==0){
                    year--;
                    date="Décembre"+" "+year;
                    
                } 
                else
                    date=annee[i-1]+" "+year;
  
            }
        }
        return date;    

    }
    
    public void closeConnectionDB(){
      try{
          con.close();
          st.close();rs.close();
          con=(Connection)null;
          rs=null;
          st=null;
      } 
      catch(Exception e){
          
      }
    }
}
