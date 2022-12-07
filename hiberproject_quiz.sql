-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: hiberproject
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `quiz`
--

DROP TABLE IF EXISTS `quiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quiz` (
  `questions` varchar(255) DEFAULT NULL,
  `answers` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz`
--

LOCK TABLES `quiz` WRITE;
/*!40000 ALTER TABLE `quiz` DISABLE KEYS */;
INSERT INTO `quiz` VALUES ('Who invented Java?\nA. James WebWing\nB. Oracle Inc\nC. Oaks Inc\nD.James Gosling','D'),(' Which component is responsible to run java program?\nA. JVM\nB. JDK\nC. JIT\nD.JRE','D'),(' Which of the below is invalid identifier with the main method?\nA. Public \nB. Static \nC. Private\nD. Final','C'),(' When does method overloading is determined?\nA. At Runtime\nB. Complile Time\nC. At Coding Time\nD. At Execution Time','B'),(' Which exception is thrown when java is out of memory\nA. Memory Error EXception\nB. Out Of Memory Error Exception\nC. Memoery Out Of Bound Exception\nD.Memory Full Exception','B'),(' Which of the following is a superclass of every class in Java?\nA. ArrayList\nB. MainClass\nC. ObjectClass\nD. AbstractClass','C'),(' How do you create a variable with the numeric value 5?\nA. num X=5;.\nB. X=5;\nC. int X=5;\nD. float X=5;','C'),(' Explicit Type Conversion in Java refers to ________?\nA. Narraowing Type Conversion\nB. Widening Type Conversion\nC. No Type Conversion\nD. All Of The Above','A'),(' Which of these keywords is used to define interfaces in Java?\nA. intf\nB. interface\nC. Intf\nD.Interface','D'),(' Which of the following is not a core interface of Hibernate?\nA. Configuration\nB. Criteria\nC. SessionManagement\nD.Session','C');
/*!40000 ALTER TABLE `quiz` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-07 15:25:48
