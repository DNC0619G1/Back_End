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
-- Table structure for table `show_time`
--

DROP TABLE IF EXISTS `show_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `show_time` (
  `id_show_time` int(11) NOT NULL AUTO_INCREMENT,
  `id_movie` int(11) NOT NULL,
  `id_time_frame` int(11) NOT NULL,
  `room` int(11) NOT NULL,
  `show_date` date NOT NULL,
  PRIMARY KEY (`id_show_time`),
  KEY `roomFk_idx` (`room`),
  KEY `movieFK_idx` (`id_movie`),
  KEY `timeframefk_idx` (`id_time_frame`),
  CONSTRAINT `movieFK` FOREIGN KEY (`id_movie`) REFERENCES `movie` (`id_movie`),
  CONSTRAINT `roomFk` FOREIGN KEY (`room`) REFERENCES `room` (`id_room`),
  CONSTRAINT `timeFrame_FK` FOREIGN KEY (`id_time_frame`) REFERENCES `time_frame` (`id_time_frame`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `show_time`
--

LOCK TABLES `show_time` WRITE;
/*!40000 ALTER TABLE `show_time` DISABLE KEYS */;
INSERT INTO `show_time` VALUES (1,1,1,1,'2019-10-22'),(2,2,2,2,'2019-10-22'),(3,3,3,3,'2019-10-22'),(4,4,4,1,'2019-10-22'),(5,1,5,2,'2019-10-22'),(6,2,1,3,'2019-10-22'),(7,3,2,1,'2019-10-22'),(8,4,3,2,'2019-10-22'),(9,1,4,3,'2019-10-23'),(10,2,5,1,'2019-10-23'),(11,3,1,2,'2019-10-23'),(12,4,2,3,'2019-10-23'),(13,1,3,1,'2019-10-21'),(14,2,4,2,'2019-10-21'),(15,1,5,3,'2019-10-21'),(16,2,1,1,'2019-10-21');
/*!40000 ALTER TABLE `show_time` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


