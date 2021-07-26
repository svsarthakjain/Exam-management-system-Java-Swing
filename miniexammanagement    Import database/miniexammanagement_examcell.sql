-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: miniexammanagement
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `examcell`
--

DROP TABLE IF EXISTS `examcell`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `examcell` (
  `ExamCellId` int NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `MobileNo` bigint DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `Gender` varchar(1) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ExamCellId`),
  UNIQUE KEY `ExamCelIId_UNIQUE` (`ExamCellId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examcell`
--

LOCK TABLES `examcell` WRITE;
/*!40000 ALTER TABLE `examcell` DISABLE KEYS */;
INSERT INTO `examcell` VALUES (1,'t1','t1',1234567890,'abc','1988-08-08','M','Pune'),(1001,'Examcell@1','KALANI MADHURI ANAND',1234567890,'ExamCell01@gmail.com','2000-06-04','F','Satara'),(1002,'Examcell@2','KALE VISHAKHA AVINASH',1234567890,'ExamCell02@gmail.com','1972-07-08','F','Solapur'),(1003,'Examcell@3','KANHED AYUSH MANISH',1234567890,'ExamCell03@gmail.com','1998-12-08','M','Mumbai'),(1004,'Examcell@4','Sarthak Jain',1234567890,'ExamCell04@gmail.com','1996-12-24','M','Ashoknagar'),(1005,'Examcell@5','KASLIWAL YASH NILESH',1234567890,'ExamCell05@gmail.com','1989-01-30','M','Solapur'),(1006,'Examcell@6','KATKAR SONAL NITIN',1234567890,'ExamCell06@gmail.com','1977-08-05','F','Solapur'),(1007,'Examcell@7','KHAVASI MANASI SANJAY',1234567890,'ExamCell07@gmail.com','1968-04-09','F','Solapur'),(1008,'Examcell@8','KHIANI TARUN PRADEEP',1234567890,'ExamCell08@gmail.com','1947-11-01','M','Solapur'),(1009,'Examcell@9','KOTA SELINA SHRINIVAS',1234567890,'ExamCell10@gmail.com','1988-12-12','F','Pune');
/*!40000 ALTER TABLE `examcell` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-26 18:22:57
