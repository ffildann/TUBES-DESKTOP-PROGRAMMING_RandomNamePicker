-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2022 at 06:09 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_undian`
--

-- --------------------------------------------------------

--
-- Table structure for table `dataundi`
--

CREATE TABLE `dataundi` (
  `NIM` varchar(20) NOT NULL,
  `Nama` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dataundi`
--

INSERT INTO `dataundi` (`NIM`, `Nama`) VALUES
('3260108', 'Subekti'),
('3260109', 'Bagus Widodo'),
('3260201', 'Salsabila'),
('3260111', 'Amelia'),
('3260122', 'Fajar Saputra'),
('3260104', 'Valeria'),
('3260166', 'Faradiba'),
('3260140', 'Jamaludin'),
('3260199', 'Hermawan'),
('3260177', 'Bambang'),
('3260144', 'Dimas'),
('3260101', 'Firdaus');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
