-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  sam. 17 avr. 2021 à 00:13
-- Version du serveur :  5.7.25
-- Version de PHP :  7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `Gestion_Cotisation`
--

-- --------------------------------------------------------

--
-- Structure de la table `Administrateur`
--

CREATE TABLE `Administrateur` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Administrateur`
--

INSERT INTO `Administrateur` (`Username`, `Password`) VALUES
('Admin', '0000'),
('Admin', '0000'),
('AAA', 'AAAA');

-- --------------------------------------------------------

--
-- Structure de la table `cotise_le_Mois`
--

CREATE TABLE `cotise_le_Mois` (
  `id_membre` int(11) NOT NULL,
  `mois` varchar(20) NOT NULL,
  `annee` int(11) NOT NULL DEFAULT '2020'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `cotise_le_Mois`
--

INSERT INTO `cotise_le_Mois` (`id_membre`, `mois`, `annee`) VALUES
(1, 'Avril', 2020),
(1, 'Février', 2020),
(1, 'Janvier', 2020),
(1, 'Mars', 2020),
(16, 'Janvier', 2020),
(20, 'Janvier', 2020),
(22, 'Février', 2020),
(22, 'Mars', 2020);

-- --------------------------------------------------------

--
-- Structure de la table `Membre`
--

CREATE TABLE `Membre` (
  `id` int(11) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `adresse` varchar(200) NOT NULL,
  `poste` varchar(100) NOT NULL,
  `numero` int(20) NOT NULL,
  `matricule` varchar(100) NOT NULL,
  `etat` varchar(10) NOT NULL DEFAULT 'actif',
  `adhesion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Membre`
--

INSERT INTO `Membre` (`id`, `prenom`, `nom`, `adresse`, `poste`, `numero`, `matricule`, `etat`, `adhesion`) VALUES
(1, 'Mountaha', 'Ndoye', 'Thioce Mbour', 'Informaticien', 778890909, '1997', 'actif', 'Janvier 2020'),
(2, 'Mbaye', 'Faye', 'Fanne', 'Admin resau', 777889900, '1995TRF', 'actif', ''),
(3, 'Alou', 'Breezy', 'Yenne', 'Dev Junior', 778889900, '19970800FQQ', 'actif', ''),
(4, 'Diczo', 'Diop', 'Saly', 'Electricien', 776665544, '1996YTF', 'actif', ''),
(5, 'Momo', 'Dia', 'Saly', 'Dev junior', 778889900, '19970899FDH', 'actif', ''),
(7, 'Ameth', 'Sy', 'Mbour thioce Est', 'Dev Junior', 776665544, '2012OKJ', 'Actif', ''),
(8, 'Mamadou Talla', 'Kane ', 'Mbour Thioce', 'Dev Junior', 776665544, '199809YHT', 'actif', ''),
(9, 'Astou ', 'Seck ', 'Médine ', 'Commercante', 777554455, '1999OPL', 'actif', ''),
(10, 'Mouhamed', 'Diassy', 'Gueule Tapee', 'Informaticien DEV', 776547876, '1997001', 'actif', ''),
(11, 'Bassirou', 'Sarr', 'Fann', 'Informaticien', 765454355, '0011', 'actif', NULL),
(12, 'Abdoul Aziz', 'Ndiaye', 'Fann Hock', 'Informaticien', 778976545, '0012', 'actif', NULL),
(13, 'Alassane', 'Sall', 'Dieupeul', 'Informaticien', 778890900, '1100', 'actif', NULL),
(14, 'Moussa', 'Soumare', 'Fann', 'Informaticien', 765546788, '0013', 'actif', NULL),
(15, 'Alioune', 'Ndoye', 'Saly', 'Technicien', 786654344, '0014', 'actif', NULL),
(16, 'Souleyman', 'Cisse', 'Mbour Thioce', 'Technicien', 779235433, '0015', 'actif', 'Janvier 2020'),
(17, 'Ibrahima', 'Kote', 'Khelcom', 'Technicien', 786554465, '0016', 'actif', NULL),
(18, 'Mamadou', 'Fall', 'Touba', 'Dev', 776665577, '0017', 'actif', 'janvier 2020'),
(19, 'Birane', 'Kebe', 'Thies', 'Informaticien', 786667788, '0018', 'actif', NULL),
(20, 'Magueye', 'Sy', 'Thies', 'Informaticien', 778890909, '0020', 'actif', 'Janvier 2020'),
(21, 'Fatima', 'Dia', 'Grand dakar', 'Informaticienne', 781132323, '0021', 'actif', 'Janvier 2020'),
(22, 'Test', 'Test ', 'adresse', 'IT', 777778899, '00', 'actif', 'Février 2020'),
(24, 'Mamadou', 'Thiongane', 'Fann', 'Professeur', 776668899, '001', 'actif', NULL),
(32, 'RR', 'rr', 'rr', 'UU', 99, '009', 'actif', NULL);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `cotise_le_Mois`
--
ALTER TABLE `cotise_le_Mois`
  ADD PRIMARY KEY (`id_membre`,`mois`);

--
-- Index pour la table `Membre`
--
ALTER TABLE `Membre`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `matricule` (`matricule`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Membre`
--
ALTER TABLE `Membre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `cotise_le_Mois`
--
ALTER TABLE `cotise_le_Mois`
  ADD CONSTRAINT `FK_membre` FOREIGN KEY (`id_membre`) REFERENCES `Membre` (`id`);


