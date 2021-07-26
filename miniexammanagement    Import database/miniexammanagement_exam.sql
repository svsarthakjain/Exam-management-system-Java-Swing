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
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam` (
  `Examinationid` varchar(45) NOT NULL,
  `DeptId` int DEFAULT NULL,
  `Class` varchar(10) DEFAULT NULL,
  `SubCode` varchar(45) NOT NULL,
  `AcademicId` int DEFAULT NULL,
  `ExamDate` date DEFAULT NULL,
  `ExamStartTime` varchar(15) DEFAULT NULL,
  `ExamEndTime` varchar(15) DEFAULT NULL,
  `ExamType` varchar(50) DEFAULT NULL,
  `SetVisible` int DEFAULT NULL,
  PRIMARY KEY (`Examinationid`,`SubCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES ('2021-2022-02-CSE',1,'TY-06','CSE030603',6,'2021-07-10','08:44 AM','11:44 AM','Theory/Practical',1),('2021-2022-02-CSE',1,'TY-06','CSE030604',6,'2021-07-09','08:44 AM','11:44 AM','Theory',1),('2021-2022-02-CSE',1,'TY-06','CSE030605',6,'2021-07-22','01:39 PM','01:39 PM','Theory/Practical',1),('2021-2022-02-CSE',1,'TY-06','CSE030606',6,'2021-07-08','08:44 AM','11:44 AM','Theory',1),('2021-2022-02-CSE',1,'TY-06','CSE030607',6,'2021-07-09','08:44 AM','11:44 AM','Theory',1),('2021-2022-02-ENTC',3,'TY-06','ET030601',6,'2021-07-31','08:40 PM','08:40 PM','Theory/Practical',1),('2021-2022-02-ENTC',3,'TY-06','ET030602',6,'2021-07-16','01:43 PM','01:43 PM','Practical',1),('2021-2022-02-ENTC',3,'TY-06','ET030603',6,'2021-07-25','08:40 PM','08:40 PM','Practical',1),('2021-2022-02-ENTC',3,'TY-06','ET030604',6,'2021-07-23','08:42 PM','08:42 PM','Theory/Practical',1),('2021-2022-02-ENTC',3,'TY-06','ET030605',6,'2021-07-26','08:40 PM','08:40 PM','Practical',1),('2021-2022-02-ENTC',3,'TY-06','ET030606',6,'2021-08-11','12:42 PM','08:42 PM','Theory/Practical',1),('2021-2022-02-IT',2,'TY-06','IT030601',6,'2021-07-08','01:39 PM','01:39 PM','Theory',1),('2021-2022-02-IT',2,'TY-06','IT030602',6,'2021-07-09','01:39 PM','01:39 PM','Theory',1),('2021-2022-02-IT',2,'TY-06','IT030603',6,'2021-07-09','01:39 PM','01:39 PM','Theory/Practical',1),('2021-2022-02-IT',2,'TY-06','IT030604',6,'2021-07-24','03:10 PM','03:10 PM','Practical',1),('2021-2022-02-IT',2,'TY-06','IT030605',6,'2021-07-28','03:10 PM','03:10 PM','Practical',1);
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-26 18:22:55
