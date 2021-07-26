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
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `Sub_Code` varchar(20) NOT NULL,
  `Sub_Name` varchar(100) NOT NULL,
  `Dept_Id` int NOT NULL,
  `Semester` int DEFAULT NULL,
  `Class` varchar(10) DEFAULT NULL,
  `Type` varchar(45) NOT NULL,
  `TheoryPractical` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Sub_Code`),
  KEY `Dept_id_idx` (`Dept_Id`),
  CONSTRAINT `Dept_id` FOREIGN KEY (`Dept_Id`) REFERENCES `department` (`Dept_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('CSE020401','Applied Mathematics-II',1,4,'SY','Mandatory','Theory'),('CSE020402','Theory of Computation',1,4,'SY','Mandatory','Theory'),('CSE020403','Microprocessor',1,4,'SY','Mandatory','Practical'),('CSE020404','Data Strucure',1,4,'SY','Mandatory','Theory'),('CSE020405','Computer Networks',1,4,'SY','Mandatory','Practical'),('CSE020406','Object Oriented Programming through C++',1,4,'SY','Mandatory','Theory/Practical'),('CSE020407','Environmental Science-II',1,4,'SY','Mandatory','Practical'),('CSE030601','Software Engineering',1,6,'TY','Mandatory','Theory'),('CSE030602','OOMD',1,6,'TY','Mandatory','Theory'),('CSE030603','Artificial Engineering',1,6,'TY','Mandatory','Theory/Practical'),('CSE030604','Data Science',1,6,'TY','Elective','Theory'),('CSE030605','Mobile Application Development',1,6,'TY','Mandatory','Theory/Practical'),('CSE030606','Java Programming',1,6,'TY','Mandatory','Theory'),('CSE030607','Self Learning',1,6,'TY','Mandatory','Theory'),('CSE040701','Cloud Computing',1,7,'BE','Mandatory','Theory'),('ET030601','Antenna and WavePropogation',3,6,'TY','Mandatory','Theory/Practical'),('ET030602','Embedded System',3,6,'TY','Mandatory','Practical'),('ET030603','Electronic System Design',3,6,'TY','Mandatory','Practical'),('ET030604','Advanced Mobile Communication',3,6,'TY','Mandatory','Theory/Practical'),('ET030605','Elective-II',3,6,'TY','Elective','Practical'),('ET030606','Self Learning',3,6,'TY','Mandatory','Theory/Practical'),('IT030601','Software Engineering',2,6,'TY','Mandatory','Theory'),('IT030602','OOMD',2,6,'TY','Mandatory','Theory'),('IT030603','Artificial Engineering',2,6,'TY','Mandatory','Theory/Practical'),('IT030604','Data Science',2,6,'TY','Elective','Practical'),('IT030605','Mobile Application Development',2,6,'TY','Mandatory','Practical'),('IT030606','Java Programming',2,6,'TY','Mandatory','Theory/Practical'),('IT030608','Agile',2,6,'TY','Elective','Theory');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-26 18:22:58
