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
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion` (
  `id_promotion` int(11) NOT NULL AUTO_INCREMENT,
  `title_promotion` varchar(255) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `sale_off` int(11) NOT NULL,
  `detail_promotion` text NOT NULL,
  `img_promotion` text,
  PRIMARY KEY (`id_promotion`)
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
INSERT INTO `promotion` VALUES (104,'hoc hanh','2019-10-02','2019-10-19',232323,'rêrewr',NULL),(105,'luyen tap','2019-10-02','2019-10-19',232323,'rêrewr',NULL),(106,'tuan dien','2019-10-02','2019-10-19',232323,'rêrewr',NULL),(108,'dfdsfdsf','2019-10-01','2019-10-25',323213,'efdfdsfsdsf',NULL),(109,'khuyen mai codegym','2019-10-09','2019-10-18',23213,'dsadasdsad',NULL),(111,'dsadas','2019-10-01','2019-10-25',2313213,'dgdg',NULL),(112,'2312312','2019-10-12','2019-10-05',321312,'weqweqwe',NULL),(113,'eerererere','2019-10-04','2019-10-26',23213213,'rerererewr',NULL),(114,'231','2019-10-03','2019-10-18',232132,'wqeqwewqe',NULL),(115,'dsdwqdds','2019-10-05','2019-10-13',213232,'sdsadsadasd',NULL),(116,'32321','2019-10-02','2019-10-13',213213,'ewqeqwewq',NULL),(117,'2321312','2019-10-03','2019-10-19',2323,'weqwe',NULL),(118,'23213','2019-10-03','2019-10-17',23123,'23123123',NULL),(119,'aaaaa','2019-10-12','2019-10-20',1111,'aaaa',NULL),(120,'ewr','2019-10-11','2019-10-11',324324,'erewr',NULL),(122,'21212','2019-10-02','2019-10-18',23213123,'qwqwqw',NULL),(123,'32232','2019-10-02','2019-10-19',232132,'qwewqeqwe',NULL);
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-31 13:47:32
