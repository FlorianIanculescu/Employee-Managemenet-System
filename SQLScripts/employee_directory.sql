CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Aubrie ','Jarvis','aubrie@employee.com'),
	(2,'Cora ','Nicholson','cora@employee.com'),
	(3,'Legacy ','Cohen','legacy@employee.com'),
	(4,'Marlon ','Howell','marlon@employee.com'),
	(5,'Tristan ','Dennis','tristan@employee.com');
