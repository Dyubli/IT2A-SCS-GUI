-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2025 at 10:48 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `campo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(11) NOT NULL,
  `log_uid` int(11) NOT NULL,
  `log_action` varchar(255) NOT NULL,
  `log_timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `log_uid`, `log_action`, `log_timestamp`) VALUES
(1, 11, 'User Login: Noya', '2025-04-05 14:49:49'),
(2, 11, 'User Login: Noya', '2025-04-05 14:59:03'),
(3, 11, 'User Login: Noya', '2025-04-05 14:59:49'),
(4, 11, 'User Login: Noya', '2025-04-05 15:00:34'),
(5, 11, 'User Login: Noya', '2025-04-05 15:01:41'),
(6, 11, 'User Login: Noya', '2025-04-05 15:03:51'),
(7, 11, 'Updated a user: Noya', '2025-04-05 15:04:30'),
(8, 11, 'User Login: Noya', '2025-04-05 15:07:45'),
(9, 11, 'User Login: Noya', '2025-04-05 15:13:58'),
(10, 11, 'Create a user: Campoy', '2025-04-05 15:14:45'),
(11, 11, 'User Login: Noya', '2025-04-05 15:17:55'),
(12, 11, 'Updated a user: Campoys', '2025-04-05 15:18:16'),
(13, 11, 'User Login: Noya', '2025-04-05 15:29:50'),
(14, 11, 'User Login: Noya', '2025-04-05 15:32:36'),
(15, 11, 'User Logout: Noya', '2025-04-05 15:32:49'),
(16, 13, 'User Login: Dyubli', '2025-04-18 11:10:13'),
(17, 13, 'User Login: Dyubli', '2025-04-18 11:48:22'),
(18, 13, 'Updated a user: Noya', '2025-04-18 11:54:36'),
(19, 13, 'Updated a user: Noya', '2025-04-18 11:54:48'),
(20, 13, 'User Login: Dyubli', '2025-04-18 11:55:40'),
(21, 13, 'Deleted user ID: 9', '2025-04-18 11:56:05'),
(22, 13, 'Deleted user ID: 10', '2025-04-18 11:56:11'),
(23, 13, 'User Logout: Dyubli', '2025-04-18 11:56:24'),
(24, 13, 'User Login: Dyubli', '2025-04-18 12:51:54'),
(25, 13, 'User Login: Dyubli', '2025-04-18 12:53:48'),
(26, 13, 'User Login: Dyubli', '2025-04-18 13:00:08'),
(27, 13, 'User Login: Dyubli', '2025-04-18 13:01:41'),
(28, 13, 'User Login: Dyubli', '2025-04-18 13:20:38'),
(29, 13, 'User Login: Dyubli', '2025-04-18 13:27:04'),
(30, 13, 'User Login: Dyubli', '2025-04-18 13:27:50'),
(31, 13, 'User Login: Dyubli', '2025-04-18 14:34:06'),
(32, 13, 'User Login: Dyubli', '2025-04-18 14:36:41'),
(33, 13, 'User Login: Dyubli', '2025-04-18 14:37:25'),
(34, 13, 'User Login: Dyubli', '2025-04-18 14:38:03'),
(35, 13, 'User Login: Dyubli', '2025-04-18 14:38:44'),
(36, 13, 'User Login: Dyubli', '2025-04-18 14:41:05'),
(37, 13, 'User Login: Dyubli', '2025-04-18 14:56:11'),
(38, 13, 'User Login: Dyubli', '2025-04-18 14:57:41'),
(39, 13, 'User Login: Dyubli', '2025-04-18 14:59:11'),
(40, 13, 'User Login: Dyubli', '2025-04-18 15:00:16'),
(41, 13, 'User Login: Dyubli', '2025-04-18 15:02:06'),
(42, 13, 'User Login: Dyubli', '2025-04-18 15:03:07'),
(43, 13, 'User Login: Dyubli', '2025-04-21 11:07:21'),
(44, 13, 'User Login: Dyubli', '2025-04-21 11:36:10'),
(45, 13, 'User Login: Dyubli', '2025-04-21 13:57:53'),
(46, 13, 'User Login: Dyubli', '2025-04-23 07:50:27'),
(53, 13, 'User Login: Dyubli', '2025-04-23 08:46:27');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_meds`
--

CREATE TABLE `tbl_meds` (
  `m_id` int(11) NOT NULL,
  `m_name` int(11) NOT NULL,
  `stocks` int(11) NOT NULL,
  `mg` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patients`
--

CREATE TABLE `tbl_patients` (
  `patient_id` int(11) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_user` varchar(250) NOT NULL,
  `u_pass` varchar(250) NOT NULL,
  `u_email` varchar(250) NOT NULL,
  `u_contact` varchar(250) NOT NULL,
  `u_type` varchar(250) NOT NULL,
  `u_status` varchar(250) NOT NULL,
  `u_image` varchar(50) NOT NULL,
  `u_question` varchar(50) NOT NULL,
  `u_answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_user`, `u_pass`, `u_email`, `u_contact`, `u_type`, `u_status`, `u_image`, `u_question`, `u_answer`) VALUES
(11, 'Noya', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'noya@noya.com', '09280056394', 'Admin', 'Active', '', '', ''),
(12, 'Campoy', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'campoy@campoy.com', '12345678902', 'User', 'Active', 'src/userImages/company_7716170.png', 'What is your fav color?', 'blue'),
(13, 'Dyubli', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Diovely@gmail.com', '123123123123', 'Admin', 'Active', '', 'favorite food', 'chicken'),
(14, 'markjoseph', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'markjoseph@gmail.com', '123123123123', 'User', 'Active', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `log_uid` (`log_uid`);

--
-- Indexes for table `tbl_meds`
--
ALTER TABLE `tbl_meds`
  ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `tbl_patients`
--
ALTER TABLE `tbl_patients`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `tbl_patients`
--
ALTER TABLE `tbl_patients`
  MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`log_uid`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
