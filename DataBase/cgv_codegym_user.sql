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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `birth_day` date NOT NULL,
  `sex` varchar(25) NOT NULL,
  `email` varchar(255) NOT NULL,
  `license` varchar(255) NOT NULL,
  `number_phone` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `name_member_card` varchar(255) NOT NULL,
  `point` int(11) NOT NULL,
  `id_role` int(11) NOT NULL,
  `id_account` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `license_UNIQUE` (`license`),
  UNIQUE KEY `number_phone_UNIQUE` (`number_phone`),
  UNIQUE KEY `name_member_card_UNIQUE` (`name_member_card`),
  KEY `fk_id_role_idx` (`id_role`),
  CONSTRAINT `fk_id_role` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` VALUES (1,'Thanh Lam','123456','Lê Thanh Lâm','1996-11-30','Man','thanhlam3096@gmail.com','69696969',90999666,'69 Phố Mỹ Hưng','VIP-CGV01',69996,3),(2,'Toan De Lam','123123','Toan 5cm','1987-10-11','Woman','toam@yahoo.com','12512512',252512412,'14 Ga','MEMBER-CGV2',1112,3),(3,'Chuc SIDA','123456789','Chực 10cm','1991-07-11','Man','chucHIV@gamil.com','21412125',184629213,'100 Cho','MEMBER-CGV1',1411,3),(4,'Quoc WEAK','1241241','Quốc 1 phút','1997-05-09','Woman','quoc30s@gmail.com','56842361',125667927,'20 Chuot','Slave-CGV-01',112,3);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


