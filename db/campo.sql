-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2025 at 06:24 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

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
(15, 11, 'User Logout: Noya', '2025-04-05 15:32:49');

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
(9, 'Diovely', '12345678', 'diovely@gmail.com', '09282438841', 'Admin', 'Active', '', '', ''),
(10, 'Markjoseph', '12345678', 'markjoseph@gmail.com', '09282438841', 'Admin', 'Pending', '', '', ''),
(11, 'Noya', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'noya@noya.com', '09280056394', 'Admin', 'Active', '', '', ''),
(12, 'Campoy', 'CJQal82XQkkDXeo/zdszlHdzfoysSTicjde5uKcNTOs=', 'campoy@campoy.com', '12345678902', 'User', 'Active', 'src/userImages/company_7716170.png', 'What is your fav color?', 'blue');

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
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

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
