/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.text.Document;


/**
 *
 * @author macbookpro
 */
public class Liste_Cotisations extends javax.swing.JFrame {

    /**
     * Creates new form Liste_Cotisations
     */
    public Liste_Cotisations() {
        try {
            initComponents();
            getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            load_table_Cotisation(Integer.parseInt(jT_annee.getText()));
            //new new_cotisation().loadCombo(jComboBox_membre);
            jPanel_table.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Liste_Cotisations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_cotisation = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel_table = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_cotisation1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Jmatricule = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jT_annee = new javax.swing.JTextField();
        btn_supp = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icon_list.jpeg"))); // NOI18N
        jLabel16.setText("Liste des Cotisations");

        exit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(204, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_Exit_25px.png"))); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 693, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable_cotisation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Membre", "Mois", "année"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_cotisation.getTableHeader().setReorderingAllowed(false);
        jTable_cotisation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_cotisationMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_cotisation);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Trier par mois ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choisir le mois:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet ", "Aout", "Septembre", "Octobre", "Novembre", "Décembre" }));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Voir Tous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Trier par membre");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Entrer la matricule:");

        jButton4.setText("Voir PDF");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel_table.setBackground(new java.awt.Color(255, 255, 255));

        jTable_cotisation1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Membre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_cotisation1);

        jLabel3.setText("Les membres n'ayant pas cotisé ce mois");

        javax.swing.GroupLayout jPanel_tableLayout = new javax.swing.GroupLayout(jPanel_table);
        jPanel_table.setLayout(jPanel_tableLayout);
        jPanel_tableLayout.setHorizontalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tableLayout.createSequentialGroup()
                .addGroup(jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tableLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_tableLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel_tableLayout.setVerticalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tableLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        Jmatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmatriculeActionPerformed(evt);
            }
        });

        jLabel4.setText("Choisir l'année:");

        jT_annee.setText("2020");
        jT_annee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_anneeActionPerformed(evt);
            }
        });
        jT_annee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_anneeKeyTyped(evt);
            }
        });

        btn_supp.setBackground(new java.awt.Color(255, 51, 51));
        btn_supp.setText("Supprimer la cotisation");
        btn_supp.setEnabled(false);
        btn_supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_supp)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_annee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jT_annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_exitMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel_table.setVisible(true);
        String mois = (String) jComboBox1.getSelectedItem();
        int annee = Integer.parseInt(jT_annee.getText());
        new new_cotisation().clearTable2(jTable_cotisation);
        if(annee<2020 || annee>2050){
            JOptionPane.showMessageDialog(this," Veuiller renseigner une bonne date !!! ","ATTENTION !!",JOptionPane.INFORMATION_MESSAGE,null);
        }
        else{
            try {
            load_table_CotisationByMonth(mois,annee);
            load_table_Non_Cotise(mois,annee);
            } catch (SQLException ex) {
                System.out.println("Erreur ici ici Erreur"+ex.getMessage());
                Logger.getLogger(Liste_Cotisations.class.getName()).log(Level.SEVERE, null, ex);
            }
            jButton2.setEnabled(true);   
        }
                new Database_Connect().closeConnectionDB();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
        jPanel_table.setVisible(false);

         new new_cotisation().clearTable2(jTable_cotisation);
        try {
            load_table_Cotisation(Integer.parseInt(jT_annee.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(Liste_Cotisations.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton2.setEnabled(false);
        new Database_Connect().closeConnectionDB();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel_table.setVisible(false);
        jButton2.setEnabled(true);
        String membre= (String) Jmatricule.getText();
        if(!membre.equals("")){
            try {
                ResultSet rs= new Database_Connect().returnMemberInfos(membre);
                rs.next(); 
                int ID= Integer.parseInt(rs.getString("id"));
                new new_cotisation().clearTable2(jTable_cotisation);
                load_table_CotisationByID(ID);
                rs.close();
            } catch (SQLException ex) {
                 Logger.getLogger(Liste_Cotisations.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        else
            JOptionPane.showMessageDialog(this," Veuiller renseigner la matricule !!! ","ATTENTION !!",JOptionPane.INFORMATION_MESSAGE,null);
        
                new Database_Connect().closeConnectionDB();



    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
      //  MessageFormat header = new MessageFormat("Liste des cotisations ");
       // MessageFormat h = new MessageFormat("Liste des cotisations ");
        
        try {
          //  jTable_cotisation.print(JTable.PrintMode.NORMAL, header, header);
            
            
            
           JTable Jt= jTable_cotisation;
            JTable2Pdf frame = new JTable2Pdf(Jt);
             frame.pack();
             frame.setVisible(true);
             frame.print(Jt);
        } catch (Exception ex) {
            System.err.format("erreur d'impression "+ex.getMessage());
           // Logger.getLogger(Liste_Cotisations.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JmatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmatriculeActionPerformed

    private void jT_anneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_anneeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jT_anneeActionPerformed

    private void jTable_cotisationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_cotisationMouseClicked
        // TODO add your handling code here:
       // getValueAt(int row, int column)
        //getSelectedRow()
        //getSelectedColumn()
        btn_supp.setEnabled(true);

      


       
    }//GEN-LAST:event_jTable_cotisationMouseClicked

    private void btn_suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suppActionPerformed
        int i = jTable_cotisation.getSelectedRow();
        try{
            String membre= (String) jTable_cotisation.getValueAt(i, 0);
            String mois= (String) jTable_cotisation.getValueAt(i, 1);
            String annee = (String) jTable_cotisation.getValueAt(i,2);
            System.out.println(membre+""+mois+" "+annee);

            if(!(membre.equals("") || mois.equals(""))){

                int rep=showConfirmDialog();
                if(rep==0){
                    StringTokenizer membre_infos= new StringTokenizer(membre);
                   // int id_membre= Integer.parseInt(membre_infos.nextToken());
                   String id = membre_infos.nextToken();
                   
                    try {
                        new Database_Connect().deleteCotisation(Integer.parseInt(id), mois, Integer.parseInt(annee));
                        JOptionPane.showMessageDialog(this,"La cotisation a été bien supprimée ","Notification !!",JOptionPane.INFORMATION_MESSAGE,null);
                        new new_cotisation().clearTable2(jTable_cotisation);
                        load_table_Cotisation(Integer.parseInt(annee));
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Liste_Cotisations.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    System.out.println(id+""+mois+" "+annee);
                    btn_supp.setEnabled(false);
                   
                }
                        new Database_Connect().closeConnectionDB();

            }
            
        }
        catch(Exception e){
            System.err.println(""+e.getLocalizedMessage());

           JOptionPane.showMessageDialog(this,"Veuiller choisir une ligne contenant une cotisation!!!","Notification !!",JOptionPane.INFORMATION_MESSAGE,null);
          //  btn_supp.setEnabled(false);

        }


    }//GEN-LAST:event_btn_suppActionPerformed

    private void jT_anneeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_anneeKeyTyped
        // TODO add your handling code here:
        keyTyped(evt);
    }//GEN-LAST:event_jT_anneeKeyTyped
    public void load_table_Cotisation(int year) throws SQLException{
        // cette methode permet de charger la table des cotisations 
        // avec les données de la base de données $
        ArrayList<String> cotisations= new Database_Connect().load_Cotisation(year);
        System.out.println("size "+cotisations.size()); 
        int a=0,b=0; // compteurs 
        for(String cotisation : cotisations){
            StringTokenizer cotis= new StringTokenizer(cotisation);
            jTable_cotisation.setValueAt(cotis.nextToken()+" "+cotis.nextToken()+" "+cotis.nextToken(), a, b);
            jTable_cotisation.setValueAt(cotis.nextToken(), a, b+1);
            jTable_cotisation.setValueAt(cotis.nextToken(), a, b+2);

            a++;
            
            
        }
        new Database_Connect().closeConnectionDB();
    }
    public void load_table_CotisationByMonth(String month,int year) throws SQLException{
        // cette methode permet de charger la table des cotisations 
        // avec les données de la base de données $
        ArrayList<String> cotisations= new Database_Connect().load_CotisationByMonth(month,year);
        System.out.println("size "+cotisations.size()); 
        int a=0,b=0; // compteurs 
       for(String cotisation : cotisations){
            StringTokenizer cotis= new StringTokenizer(cotisation);
            jTable_cotisation.setValueAt(cotis.nextToken()+" "+cotis.nextToken()+" "+cotis.nextToken(), a, b);
            jTable_cotisation.setValueAt(cotis.nextToken(), a, b+1);
            jTable_cotisation.setValueAt(cotis.nextToken(), a, b+2);

            a++;      
        }  
               new Database_Connect().closeConnectionDB();

    }
    public void load_table_CotisationByID(int ID) throws SQLException{
        // cette methode permet de charger la table des cotisations 
        // avec les données de la base de données $
        ArrayList<String> cotisations= new Database_Connect().load_CotisationByIdMembre(ID);
        System.out.println("size "+cotisations.size()); 
        int a=0,b=0; // compteurs 
        for(String cotisation : cotisations){
            StringTokenizer cotis= new StringTokenizer(cotisation);
            jTable_cotisation.setValueAt(cotis.nextToken()+" "+cotis.nextToken()+" "+cotis.nextToken(), a, b);
            jTable_cotisation.setValueAt(cotis.nextToken(), a, b+1);
            jTable_cotisation.setValueAt(cotis.nextToken(), a, b+2);

            a++;
            
            
        }
                new Database_Connect().closeConnectionDB();

    }
    public void load_table_Non_Cotise(String month,int year) throws SQLException{
        // cette methode permet de charger la table des cotisations 
        // avec les données de la base de données $
        ArrayList<String> membres= new Database_Connect().loadMembrePasCotise(month,year);
        System.out.println("size "+membres.size()); 
        int a=0,b=0; // compteurs 
        for(String membre : membres ){
            jTable_cotisation1.setValueAt(membre,a,b);
            a++;
            
            
        }
                new Database_Connect().closeConnectionDB();

    }
        public void keyTyped(KeyEvent k)  
     {  
         // cette methode permet le refus d'entrer de lettre sur un champ !!
      if (! Character.isDigit(k.getKeyChar()))  
      {  
       k.consume();
      }    
    }
    
    static int showConfirmDialog(){
         
        return JOptionPane.showConfirmDialog(
        null,
        " Voulez-vous vraiment supprimer cette cotisation de ce membre ?",
        "Quitter",
        JOptionPane.YES_NO_OPTION);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Liste_Cotisations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liste_Cotisations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liste_Cotisations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liste_Cotisations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liste_Cotisations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jmatricule;
    private javax.swing.JButton btn_supp;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_table;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jT_annee;
    private javax.swing.JTable jTable_cotisation;
    private javax.swing.JTable jTable_cotisation1;
    // End of variables declaration//GEN-END:variables
}
