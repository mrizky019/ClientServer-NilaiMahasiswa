/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.1.33-MariaDB : Database - clientserver
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`clientserver` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `clientserver`;

/*Table structure for table `dosen` */

DROP TABLE IF EXISTS `dosen`;

CREATE TABLE `dosen` (
  `idDosen` int(11) NOT NULL AUTO_INCREMENT,
  `namaDosen` varchar(50) DEFAULT NULL,
  `mataKuliah` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idDosen`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `dosen` */

insert  into `dosen`(`idDosen`,`namaDosen`,`mataKuliah`) values 
(1,'Fransiskus Adikara','Arsitektur Berbasis Layanan'),
(2,'M. Bahrul Ulum','Pemrograman Berorientasi Objek');

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `idPerson` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) DEFAULT NULL,
  `jenisKelamin` varchar(50) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `nilaiTugas1` varchar(50) DEFAULT NULL,
  `nilaiTugas2` varchar(50) DEFAULT NULL,
  `nilaiUTS` varchar(50) DEFAULT NULL,
  `nilaiUAS` varchar(50) DEFAULT NULL,
  `nilaiAkhir` varchar(50) DEFAULT NULL,
  `grade` varchar(50) DEFAULT NULL,
  `mataKuliah` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idPerson`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `person` */

insert  into `person`(`idPerson`,`firstName`,`jenisKelamin`,`birthday`,`nilaiTugas1`,`nilaiTugas2`,`nilaiUTS`,`nilaiUAS`,`nilaiAkhir`,`grade`,`mataKuliah`) values 
(1,'Muhamad Rizky','Pria','1998-04-06 00:00:00','87','92','91','84','88.4','A','Arsitektur Berbasis Layanan'),
(2,'Danu','Pria','2019-04-15 00:00:00','50','50','65','70','59.0','D','Arsitektur Berbasis Layanan'),
(3,'Muhamad Rizky','Pria','2020-02-24 00:00:00','88','76','89','78','81.6','A','Pemrograman Berorientasi Objek');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
