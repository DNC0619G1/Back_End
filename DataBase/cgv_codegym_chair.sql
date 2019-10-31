-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cgv_codegym
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `chair`
--

DROP TABLE IF EXISTS `chair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chair` (
  `id_chair` int(11) NOT NULL AUTO_INCREMENT,
  `column_chair` int(11) NOT NULL,
  `row_chair` int(11) NOT NULL,
  `room` int(11) NOT NULL,
  `status_chair` int(11) NOT NULL,
  `position` varchar(255) NOT NULL,
  `price_type_chair` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,

  `choise_status` tinyint(1) NOT NULL,
  `chair_detail` int(11) NOT NULL,
  PRIMARY KEY (`id_chair`),
  KEY `roomfk_idx` (`room`),
  CONSTRAINT `roomchairfk` FOREIGN KEY (`room`) REFERENCES `room` (`id_room`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chair`
--

LOCK TABLES `chair` WRITE;
/*!40000 ALTER TABLE `chair` DISABLE KEYS */;


INSERT INTO `chair` VALUES (1,1,1,1,0,'A1',0,'VIP',0,2),(2,2,1,2,1,'A2',10000,'VIP',0,2),(3,3,1,2,1,'A3',0,'VIP',0,2),(4,4,1,2,1,'A4',0,'VIP',0,2),(5,5,1,2,1,'A5',0,'VIP',0,2),(73,1,2,2,1,'B1',0,'Normal',0,1),(74,2,2,2,1,'B2',0,'Normal',0,1),(78,3,2,2,1,'B3',0,'Normal',0,1),(79,1,3,2,1,'C1',0,'Normal',0,1),(80,1,1,2,1,'A1',10000,'VIP',0,2),(81,2,1,1,1,'A2',10000,'VIP',0,2),(82,1,4,2,1,'D1',0,'Normal',0,1),(83,3,1,1,1,'A3',10000,'VIP',0,2),(84,4,1,1,1,'A4',10000,'VIP',0,2),(85,5,1,1,1,'A5',10000,'VIP',0,2),(86,6,1,1,1,'A6',10000,'VIP',0,2),(87,7,1,1,1,'A7',10000,'VIP',0,2),(88,1,2,1,1,'B1',0,'Normal',0,1),(89,2,2,1,1,'B2',0,'Normal',0,1),(91,4,2,1,1,'B4',0,'Normal',0,1),(92,5,2,1,1,'B5',0,'Normal',0,1),(93,6,2,1,1,'B6',0,'Normal',0,1),(97,2,3,1,1,'C2',0,'Normal',0,1),(99,1,4,1,1,'D1',0,'Normal',0,1),(100,3,2,1,1,'B3',0,'Normal',0,1),(101,4,4,1,1,'D4',0,'Normal',0,1),(102,2,4,1,1,'D2',0,'Normal',0,1),(103,3,4,1,1,'D3',0,'Normal',0,1),(104,3,3,1,1,'C3',0,'Normal',0,1),(105,4,3,1,1,'C4',0,'Normal',0,1),(107,7,2,1,1,'B7',0,'Normal',0,1),(108,7,4,1,1,'D7',0,'Normal',0,1),(111,1,3,1,1,'C1',0,'Normal',0,1),(112,1,1,3,1,'A1',10000,'VIP',0,2),(113,2,1,3,1,'A2',10000,'VIP',0,2),(114,3,1,3,1,'A3',10000,'VIP',0,2),(115,4,1,3,1,'A4',10000,'VIP',0,2),(116,5,1,3,1,'A5',10000,'VIP',0,2),(117,6,1,3,1,'A6',10000,'VIP',0,2),(118,5,4,2,1,'D5',0,'Normal',0,1);

INSERT INTO `chair` VALUES (1,1,1,1,0,'A1',0,'VIP',0,2),(2,2,1,2,1,'A2',10000,'VIP',0,2),(3,3,1,2,1,'A3',0,'VIP',0,2),(4,4,1,2,1,'A4',0,'VIP',0,2),(5,5,1,2,1,'A5',0,'VIP',0,2),(73,1,2,2,1,'B1',0,'Normal',0,1),(74,2,2,2,1,'B2',0,'Normal',0,1),(78,3,2,2,1,'B3',0,'Normal',0,1),(79,1,3,2,1,'C1',0,'Normal',0,1),(80,1,1,2,1,'A1',10000,'VIP',0,2),(81,2,1,1,1,'A2',10000,'VIP',0,2),(82,1,4,2,1,'D1',0,'Normal',0,1),(83,3,1,1,1,'A3',10000,'VIP',0,2),(84,4,1,1,1,'A4',10000,'VIP',0,2),(85,5,1,1,1,'A5',10000,'VIP',0,2),(86,6,1,1,1,'A6',10000,'VIP',0,2),(87,7,1,1,1,'A7',10000,'VIP',0,2),(88,1,2,1,1,'B1',0,'Normal',0,1),(89,2,2,1,1,'B2',0,'Normal',0,1),(91,4,2,1,1,'B4',0,'Normal',0,1),(92,5,2,1,1,'B5',0,'Normal',0,1),(93,6,2,1,1,'B6',0,'Normal',0,1),(95,1,3,1,1,'C1',0,'Normal',0,1),(97,2,3,1,1,'C2',0,'Normal',0,1),(99,1,4,1,1,'D1',0,'Normal',0,1),(100,3,2,1,1,'B3',0,'Normal',0,1),(101,4,4,1,1,'D4',0,'Normal',0,1),(102,2,4,1,1,'D2',0,'Normal',0,1),(103,3,4,1,1,'D3',0,'Normal',0,1);

/*!40000 ALTER TABLE `chair` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


