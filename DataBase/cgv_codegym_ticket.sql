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
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `id_ticket` int(11) NOT NULL,
  `name_ticket` varchar(255) NOT NULL,
  `date_order_ticket` date NOT NULL,
  `price_ticket` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `plus_point` int(11) NOT NULL,
  `use_point` int(11) NOT NULL,
  `ticket_id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_ticket`),
  KEY `fk_id_user_idx` (`ticket_id_user`),
  CONSTRAINT `fk_id_user` FOREIGN KEY (`ticket_id_user`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,'Iron Man','2018-01-02',52155,'Da Nhan Ve',11251,2152,1),(2,'BatMan','2014-12-12',12412,'Da Nhan Ve',2512,4124,2),(3,'SuperMan','2000-05-01',123123,'Da Nhan Ve',5552,4132,3),(4,'SpiderMan','2019-11-02',55555,'Da Huy Ve',2414,2521,4),(5,'DogMan','2019-02-01',44421,'Da Huy Ve',4843,7567,1),(6,'CatMan','2019-06-01',56789,'Da Huy Ve',8563,2643,2),(7,'Human','2019-01-01',20706,'Cho Nhan Ve',8563,2467,3),(8,'Human','2019-01-01',20706,'Cho Nhan Ve',2362,2632,4),(9,'SpiderMan','2019-12-02',123123,'Da Huy Ve',3521,1512,1),(10,'Human','2019-12-02',523511,'Da Huy Ve',2362,2326,2),(11,'End Game','2019-07-02',341512,'Da Nhan Ve',2362,2326,3);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


