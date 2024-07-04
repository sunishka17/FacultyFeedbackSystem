-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.33-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema feedback_db
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ feedback_db;
USE feedback_db;

--
-- Table structure for table `feedback_db`.`login_tbl`
--

DROP TABLE IF EXISTS `login_tbl`;
CREATE TABLE `login_tbl` (
  `ID` int(11) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `UNAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL,
  `category` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback_db`.`login_tbl`
--

/*!40000 ALTER TABLE `login_tbl` DISABLE KEYS */;
INSERT INTO `login_tbl` (`ID`,`first_name`,`last_name`,`UNAME`,`PASSWORD`,`category`,`email`) VALUES 
 (1,'Sarita','Nathawat','admin','admins','coordinator','pihu09sep@outlook.com'),
 (123,'Sunishka','Sharma','Sunishka123','hellos','student','shrmsun@outlook.com'),
 (4456,'Divyansh','Bagle','Divyansh4456','gsdui','student','ddbW@ghs.com'),
 (6543,'Kanishka','Godha','Kanishka6543','kkgg','student','kani@gmail.com'),
 (7265,'Anuj','Agarwal','Anuj7265','student','student','anuj@gmail.com'),
 (7623,'Adhiraj','Singh','Adhiraj7623','adi234','student','adhiraj@gmail.com'),
 (42537,'Sana','Sharma','Sana42537','gaudni','student','dsfhia@adi.com'),
 (53648,'Sama','Singh','Sama53648','hsfuihb','student','dsbh@huf.com');
/*!40000 ALTER TABLE `login_tbl` ENABLE KEYS */;


--
-- Table structure for table `feedback_db`.`questions_tbl`
--

DROP TABLE IF EXISTS `questions_tbl`;
CREATE TABLE `questions_tbl` (
  `Question_ID` int(11) DEFAULT NULL,
  `Question` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback_db`.`questions_tbl`
--

/*!40000 ALTER TABLE `questions_tbl` DISABLE KEYS */;
INSERT INTO `questions_tbl` (`Question_ID`,`Question`) VALUES 
 (1,'Begins and ends our class on time.'),
 (2,'Is well-prepared for class.'),
 (3,'Is organized and teaches clearly.'),
 (4,'Checks during class to see if students understand the material.'),
 (5,'Encourages students to ask questions and participate.'),
 (6,'Answers questions clearly.'),
 (7,'Knows the subject matter of this course.'),
 (8,'Shows interest in the material that we are studying.'),
 (9,'Encourages me to think and explore new ideas.'),
 (10,'Tells the class at each meeting what we are going to do and  what we are expected to learn.'),
 (11,'Treats all students respectfully. '),
 (12,'Returns my papers, tests, and other work within two weeks of  collecting them.'),
 (13,'Responds to my work so I know how I\'m doing and what I  need to work on.'),
 (14,'Responds to me when I need help outside of class.'),
 (15,'Follows the grading guidelines in our course syllabus and  explains my grade if I ask.'),
 (16,'Helps me meet the goals and learning objectives/outcomes of  the course.');
/*!40000 ALTER TABLE `questions_tbl` ENABLE KEYS */;


--
-- Table structure for table `feedback_db`.`student_details_tbl`
--

DROP TABLE IF EXISTS `student_details_tbl`;
CREATE TABLE `student_details_tbl` (
  `Admission_no` varchar(50) NOT NULL,
  `first_name` varchar(60) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `grade` varchar(10) DEFAULT NULL,
  `sub1` varchar(20) DEFAULT NULL,
  `sub2` varchar(20) DEFAULT NULL,
  `sub3` varchar(20) DEFAULT NULL,
  `sub4` varchar(20) DEFAULT NULL,
  `sub5` varchar(20) DEFAULT NULL,
  `sub6` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Admission_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback_db`.`student_details_tbl`
--

/*!40000 ALTER TABLE `student_details_tbl` DISABLE KEYS */;
INSERT INTO `student_details_tbl` (`Admission_no`,`first_name`,`last_name`,`grade`,`sub1`,`sub2`,`sub3`,`sub4`,`sub5`,`sub6`) VALUES 
 ('123','Sunishka','Sharma','IBDP 2','English','Mathematics','Physics','Computer Science','French','Psychology'),
 ('42537','Sana','Sharma','IBDP 1','English','Mathematics','Physics','Chemistry','Computer Science','Hindi'),
 ('4456','Divyansh','Bagle','IBDP 1','English','Mathematics','Physics','Chemistry','Computer Science','French'),
 ('53648','Sama','Singh','IBDP 2','English','Mathematics','Physics','Hindi','Psychology','Economics'),
 ('6543','Kanishka','Godha','IBDP 1','English','Mathematics','Computer Science','French','Business Management','Economics'),
 ('7265','Anuj','Agarwal','IBDP 1','English','Mathematics','Computer Science','Hindi','Business Management','Economics'),
 ('7623','Adhiraj','Singh','IBDP 2','English','Mathematics','Physics','Computer Science','Hindi','History');
/*!40000 ALTER TABLE `student_details_tbl` ENABLE KEYS */;


--
-- Table structure for table `feedback_db`.`suggestion_box_tbl`
--

DROP TABLE IF EXISTS `suggestion_box_tbl`;
CREATE TABLE `suggestion_box_tbl` (
  `Suggestions` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback_db`.`suggestion_box_tbl`
--

/*!40000 ALTER TABLE `suggestion_box_tbl` DISABLE KEYS */;
INSERT INTO `suggestion_box_tbl` (`Suggestions`) VALUES 
 ('Making IAs, EEs, and TOK essays more manageable for the students.'),
 ('have math classes everyday for IBDP'),
 ('better timetable '),
 ('better cultural activities '),
 ('We want student counseling in our school to help us with our mental health'),
 ('hbusd dafuh dhfb'),
 ('i really like the games period. please give 2 in one week'),
 ('thankyou for your support but i want more games periods'),
 ('We would like to have weekly tests for revision in math.');
/*!40000 ALTER TABLE `suggestion_box_tbl` ENABLE KEYS */;


--
-- Table structure for table `feedback_db`.`teacher_details_tbl`
--

DROP TABLE IF EXISTS `teacher_details_tbl`;
CREATE TABLE `teacher_details_tbl` (
  `Teacher_ID` varchar(50) NOT NULL,
  `teacher_name` varchar(20) DEFAULT NULL,
  `Teacher_subject` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Teacher_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback_db`.`teacher_details_tbl`
--

/*!40000 ALTER TABLE `teacher_details_tbl` DISABLE KEYS */;
INSERT INTO `teacher_details_tbl` (`Teacher_ID`,`teacher_name`,`Teacher_subject`) VALUES 
 ('121','Gunjan Raisinghania ','Economics'),
 ('124','Suparna Mukherjee','English'),
 ('133','Ritika Fanda','Biology'),
 ('179','Krishna Purohit','Physics'),
 ('291','Priyanka Chaudhary ','Computer Science'),
 ('318','Suman Singh Rathore','Business Management'),
 ('414','Vandana Sharma','Chemistry'),
 ('64','Himani Joshi','Psychology'),
 ('8','Sanjeev Jadon','French'),
 ('86','Aarti Nandwani','Mathematics');
/*!40000 ALTER TABLE `teacher_details_tbl` ENABLE KEYS */;


--
-- Table structure for table `feedback_db`.`teacher_feedback_tbl`
--

DROP TABLE IF EXISTS `teacher_feedback_tbl`;
CREATE TABLE `teacher_feedback_tbl` (
  `teacher_id` varchar(50) DEFAULT NULL,
  `student_id` varchar(50) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback_db`.`teacher_feedback_tbl`
--

/*!40000 ALTER TABLE `teacher_feedback_tbl` DISABLE KEYS */;
INSERT INTO `teacher_feedback_tbl` (`teacher_id`,`student_id`,`question_id`,`score`) VALUES 
 ('124','534',1,3),
 ('124','534',2,4),
 ('124','534',3,3),
 ('124','534',4,5),
 ('124','534',5,3),
 ('124','534',6,5),
 ('124','534',7,3),
 ('124','534',8,3),
 ('124','534',9,3),
 ('124','534',10,4),
 ('124','534',11,3),
 ('124','534',12,4),
 ('124','534',13,5),
 ('124','534',14,4),
 ('124','534',15,3),
 ('124','534',16,4),
 ('124','123',1,2),
 ('124','123',2,4),
 ('124','123',3,5),
 ('124','123',4,5),
 ('124','123',5,3),
 ('124','123',6,3),
 ('124','123',7,4),
 ('124','123',8,2),
 ('124','123',9,4),
 ('124','123',10,2),
 ('124','123',11,4),
 ('124','123',12,3),
 ('124','123',13,4),
 ('124','123',14,3),
 ('124','123',15,5),
 ('124','123',16,3),
 ('124','7623',1,2),
 ('124','7623',2,4),
 ('124','7623',3,5),
 ('124','7623',4,4),
 ('124','7623',5,3),
 ('124','7623',6,4),
 ('124','7623',7,5),
 ('124','7623',8,4),
 ('124','7623',9,3),
 ('124','7623',10,4),
 ('124','7623',11,5),
 ('124','7623',12,3),
 ('124','7623',13,3);
INSERT INTO `teacher_feedback_tbl` (`teacher_id`,`student_id`,`question_id`,`score`) VALUES 
 ('124','7623',14,4),
 ('124','7623',15,4),
 ('124','7623',16,3),
 ('124','7265',1,3),
 ('124','7265',2,4),
 ('124','7265',3,5),
 ('124','7265',4,4),
 ('124','7265',5,3),
 ('124','7265',6,4),
 ('124','7265',7,5),
 ('124','7265',8,3),
 ('124','7265',9,2),
 ('124','7265',10,4),
 ('124','7265',11,4),
 ('124','7265',12,3),
 ('124','7265',13,3),
 ('124','7265',14,3),
 ('124','7265',15,3),
 ('124','7265',16,3),
 ('11','7623',1,4),
 ('11','7623',2,3),
 ('8','123',1,3),
 ('8','123',2,4),
 ('8','123',3,3),
 ('8','123',4,4),
 ('8','123',5,5),
 ('8','123',6,3),
 ('8','123',7,4),
 ('8','123',8,4),
 ('8','123',9,3),
 ('8','123',10,3),
 ('8','123',11,5),
 ('8','123',12,3),
 ('8','123',13,5),
 ('8','123',14,4),
 ('8','123',15,4),
 ('8','123',16,3),
 ('291','123',1,3),
 ('291','123',2,4),
 ('291','123',3,5),
 ('291','123',4,3),
 ('291','123',5,4),
 ('291','123',6,5),
 ('291','123',7,3),
 ('291','123',8,4),
 ('291','123',9,4),
 ('291','123',10,4);
INSERT INTO `teacher_feedback_tbl` (`teacher_id`,`student_id`,`question_id`,`score`) VALUES 
 ('291','123',11,4),
 ('291','123',12,3),
 ('291','123',13,4),
 ('291','123',14,4),
 ('291','123',15,4),
 ('291','123',16,4),
 ('461','123',1,4),
 ('461','123',2,4),
 ('461','123',3,5),
 ('461','123',4,4),
 ('461','123',5,5),
 ('461','123',6,4),
 ('461','123',7,3),
 ('461','123',8,1),
 ('461','123',9,1),
 ('461','123',10,3),
 ('461','123',11,1),
 ('461','123',12,3),
 ('461','123',13,1),
 ('461','123',14,4),
 ('461','123',15,1),
 ('461','123',16,4),
 ('291','123',1,3),
 ('291','123',2,5),
 ('291','123',3,3),
 ('291','123',4,4),
 ('291','123',5,5),
 ('291','123',6,4),
 ('291','123',7,1),
 ('291','123',8,1),
 ('291','123',9,1),
 ('291','123',10,4),
 ('291','123',11,1),
 ('291','123',12,2),
 ('291','123',13,4),
 ('291','123',14,1),
 ('291','123',15,4),
 ('291','123',16,1),
 ('8','123',1,2),
 ('8','123',2,5),
 ('8','123',3,4),
 ('8','123',4,5),
 ('8','123',5,4),
 ('8','123',6,3),
 ('8','123',7,3),
 ('8','123',8,5),
 ('8','123',9,4);
INSERT INTO `teacher_feedback_tbl` (`teacher_id`,`student_id`,`question_id`,`score`) VALUES 
 ('8','123',10,4),
 ('8','123',11,3),
 ('8','123',12,4),
 ('8','123',13,4),
 ('8','123',14,4),
 ('8','123',15,3),
 ('8','123',16,5),
 ('86','123',1,2),
 ('86','123',2,5),
 ('86','123',3,4),
 ('86','123',4,5),
 ('86','123',5,4),
 ('86','123',6,4),
 ('86','123',7,4),
 ('86','123',8,1),
 ('86','123',9,4),
 ('86','123',10,1),
 ('86','123',11,4),
 ('86','123',12,1),
 ('86','123',13,2),
 ('86','123',14,2),
 ('86','123',15,3),
 ('86','123',16,4),
 ('64','123',1,3),
 ('64','123',2,4),
 ('64','123',3,5),
 ('64','123',4,4),
 ('64','123',5,3),
 ('64','123',6,4),
 ('64','123',7,4),
 ('64','123',8,4),
 ('64','123',9,4),
 ('64','123',10,1),
 ('64','123',11,2),
 ('64','123',12,4),
 ('64','123',13,5),
 ('64','123',14,4),
 ('64','123',15,1),
 ('64','123',16,4),
 ('179','123',1,3),
 ('179','123',2,5),
 ('179','123',3,4),
 ('179','123',4,4),
 ('179','123',5,1),
 ('179','123',6,3),
 ('179','123',7,1),
 ('179','123',8,3),
 ('179','123',9,1);
INSERT INTO `teacher_feedback_tbl` (`teacher_id`,`student_id`,`question_id`,`score`) VALUES 
 ('179','123',10,1),
 ('179','123',11,3),
 ('179','123',12,1),
 ('179','123',13,5),
 ('179','123',14,1),
 ('179','123',15,3),
 ('179','123',16,4),
 ('179','7623',1,5),
 ('179','7623',2,3),
 ('179','7623',3,4),
 ('179','7623',4,4),
 ('179','7623',5,1),
 ('179','7623',6,1),
 ('179','7623',7,1),
 ('179','7623',8,2),
 ('179','7623',9,1),
 ('179','7623',10,2),
 ('179','7623',11,4),
 ('179','7623',12,3),
 ('179','7623',13,1),
 ('179','7623',14,3),
 ('179','7623',15,5),
 ('179','7623',16,4);
/*!40000 ALTER TABLE `teacher_feedback_tbl` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
