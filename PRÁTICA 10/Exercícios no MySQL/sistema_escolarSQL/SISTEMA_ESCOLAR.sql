-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sistema_escolar
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `academico`
--

DROP TABLE IF EXISTS `academico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `academico` (
  `Id` int unsigned NOT NULL AUTO_INCREMENT,
  `RA` char(8) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `NotaTeoria` decimal(5,2) NOT NULL,
  `NotaLab` decimal(5,2) NOT NULL,
  `Media` decimal(5,2) GENERATED ALWAYS AS (((`NotaTeoria` + `NotaLab`) / 2)) STORED,
  `CPF` char(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `RA` (`RA`),
  KEY `CPF` (`CPF`),
  CONSTRAINT `academico_ibfk_1` FOREIGN KEY (`CPF`) REFERENCES `pessoal` (`CPF`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `academico`
--

LOCK TABLES `academico` WRITE;
/*!40000 ALTER TABLE `academico` DISABLE KEYS */;
INSERT INTO `academico` (`Id`, `RA`, `Nome`, `NotaTeoria`, `NotaLab`, `CPF`) VALUES (1,'20230001','João Silva',8.50,9.00,'12345678901'),(2,'20230002','Maria Souza',7.00,8.50,'09876543210');
/*!40000 ALTER TABLE `academico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoal`
--

DROP TABLE IF EXISTS `pessoal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoal` (
  `Id` int unsigned NOT NULL AUTO_INCREMENT,
  `CPF` char(11) NOT NULL,
  `RG` char(9) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `DataNascimento` date NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `CPF` (`CPF`),
  UNIQUE KEY `RG` (`RG`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoal`
--

LOCK TABLES `pessoal` WRITE;
/*!40000 ALTER TABLE `pessoal` DISABLE KEYS */;
INSERT INTO `pessoal` VALUES (1,'12345678901','123456789','João Silva','2000-05-15'),(2,'09876543210','987654321','Maria Souza','1998-11-22');
/*!40000 ALTER TABLE `pessoal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-28 14:27:39
