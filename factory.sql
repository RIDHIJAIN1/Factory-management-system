-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2024 at 04:35 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `factory`
--

-- --------------------------------------------------------

--
-- Table structure for table `dealer`
--

CREATE TABLE `dealer` (
  `dealerid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `dealeraddress` varchar(1000) NOT NULL,
  `contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dealer`
--

INSERT INTO `dealer` (`dealerid`, `name`, `dealeraddress`, `contact`) VALUES
(3, 'darshil', 'cfgchgvjhbj', 345678),
(4, 'Rishil', 'dybcbhjcbdscn', 3243546),
(11, 'Gonu', 'uhiuguyfu', 547567),
(12, 'Vidushi', 'Subhashnagar BHILWARA , RAJ.', 9929595),
(13, 'Mayur', 'ShastriNagar', 265334),
(14, 'Ajay', 'RC Vyas colony', 345678),
(15, 'Akhilesh mehta', 'western heights , mumbai', 657656);

-- --------------------------------------------------------

--
-- Table structure for table `deals`
--

CREATE TABLE `deals` (
  `id` int(11) NOT NULL,
  `dealerid` int(11) NOT NULL,
  `locked_amt` int(11) NOT NULL,
  `received_amt` int(11) NOT NULL,
  `status` enum('pending','shipped','delivered','completed') NOT NULL,
  `expected_delivery` date NOT NULL,
  `deal_creation` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `deals`
--

INSERT INTO `deals` (`id`, `dealerid`, `locked_amt`, `received_amt`, `status`, `expected_delivery`, `deal_creation`) VALUES
(3, 3, 50000, 100000, 'shipped', '2023-12-31', '2023-12-31'),
(4, 11, 4000, 40000, 'delivered', '2023-12-31', '2023-12-11'),
(5, 4, 30000, 70000, 'delivered', '2023-12-31', '2023-12-31'),
(6, 5, 1000, 100000, 'pending', '2023-12-31', '2023-12-31'),
(7, 5, 1000, 9000, 'shipped', '2023-12-26', '2023-12-26'),
(10, 8, 2000, 1000, 'delivered', '2024-01-05', '2024-01-05'),
(11, 13, 40000, 10000, 'pending', '2024-01-01', '2024-01-26'),
(12, 3, 30000, 5000, 'delivered', '2024-01-01', '2024-01-25'),
(13, 13, 50000, 49000, 'shipped', '2024-01-01', '2024-01-27'),
(14, 15, 990, 90, 'pending', '2024-01-10', '2024-01-24');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `work_hours` int(11) NOT NULL,
  `extra_hrs` int(11) NOT NULL,
  `wage_per_hour` int(11) NOT NULL,
  `total_wage` int(11) NOT NULL,
  `Pay_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `employee_id`, `work_hours`, `extra_hrs`, `wage_per_hour`, `total_wage`, `Pay_date`) VALUES
(1, 1, 10, 2, 100, 1000, '2017-06-15'),
(3, 2, 8, 12, 50, 1400, '2023-01-01'),
(4, 3, 6, 0, 80, 960, '2023-12-10'),
(7, 8, 8, 4, 80, 1600, '2024-01-04'),
(8, 1, 8, 7, 50, 750, '2024-01-27'),
(9, 1, 8, 72, 7, 560, '2024-01-02');

-- --------------------------------------------------------

--
-- Table structure for table `employeedetails`
--

CREATE TABLE `employeedetails` (
  `employee_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `designation` varchar(255) NOT NULL,
  `contact_no` int(11) NOT NULL,
  `wage` int(11) NOT NULL,
  `joining_date` date NOT NULL,
  `leaving_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employeedetails`
--

INSERT INTO `employeedetails` (`employee_id`, `name`, `designation`, `contact_no`, `wage`, `joining_date`, `leaving_date`) VALUES
(1, 'Mahaveer', 'Machine Operator', 265334, 5000, '2001-10-10', '2023-01-12'),
(2, 'Sadak', 'Manual Worker', 235232, 2000, '2007-05-11', '2034-04-12'),
(3, 'Manju srivastava', 'File organizer', 254889, 3000, '2020-12-10', '2026-12-10'),
(4, 'Raju', 'Designer', 567654, 87989, '2024-01-02', '2024-01-31'),
(6, 'Nirmala', 'Pin applyer', 675676, 34, '2024-01-01', '2024-01-27'),
(8, 'Ranbir kapoor', 'Media Manager', 324324, 20000, '2023-12-21', '2024-12-12'),
(9, 'Rafeek', 'Cutter', 868766, 9000, '2024-01-02', '2028-01-08');

-- --------------------------------------------------------

--
-- Table structure for table `otherexpense`
--

CREATE TABLE `otherexpense` (
  `id` int(11) NOT NULL,
  `repair&maintenance` int(11) NOT NULL,
  `packing` int(11) NOT NULL,
  `machinery` int(11) NOT NULL,
  `lights` int(11) NOT NULL,
  `conveyance` int(11) NOT NULL,
  `office_expense` int(11) NOT NULL,
  `promotion` int(11) NOT NULL,
  `taxes` bigint(20) NOT NULL,
  `other_commissions` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `otherexpense`
--

INSERT INTO `otherexpense` (`id`, `repair&maintenance`, `packing`, `machinery`, `lights`, `conveyance`, `office_expense`, `promotion`, `taxes`, `other_commissions`, `total`) VALUES
(1, 34, 234123, 234, 34, 43, 324, 234, 3244335, 435, 3479796);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `mfgcost` int(11) NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `mfgcost`, `time`) VALUES
(1, 'Science Notebook', 20, '10:23:10'),
(2, 'New diary', 45, '12:40:12'),
(3, 'Notebook', 30, '16:49:59'),
(4, 'Paper', 10, '17:06:53'),
(5, 'File', 20, '10:48:26'),
(6, 'Diary', 20, '10:59:25'),
(7, 'Project paper', 5, '10:22:01'),
(9, 'A4 size Notebook', 20, '11:19:19');

-- --------------------------------------------------------

--
-- Table structure for table `profitloss`
--

CREATE TABLE `profitloss` (
  `id` int(11) NOT NULL,
  `sales` int(11) NOT NULL,
  `product_expense` int(11) NOT NULL,
  `eid` int(11) NOT NULL,
  `oeid` int(11) NOT NULL,
  `siid` int(11) NOT NULL,
  `total_expense` int(11) NOT NULL,
  `profit_loss` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `pid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `stockincoming`
--

CREATE TABLE `stockincoming` (
  `id` int(11) NOT NULL,
  `product_desc` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `size` enum('small','medium','large') NOT NULL,
  `product_cost` int(11) NOT NULL,
  `incoming_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stockincoming`
--

INSERT INTO `stockincoming` (`id`, `product_desc`, `qty`, `size`, `product_cost`, `incoming_date`) VALUES
(1, 'New diary', 3, 'large', 270, '2023-12-12'),
(2, 'Paper', 1000, 'large', 5000, '2023-12-11'),
(13, 'Paper', 10, 'small', 20, '2023-12-10'),
(15, 'Cardboard', 10, 'large', 30, '2023-12-10'),
(16, 'Cover Material', 20, 'medium', 20, '2024-01-01'),
(18, 'Binding Material', 1000, 'small', 2000, '2024-01-01'),
(19, 'Pen ', 12, 'small', 20, '2024-01-03');

-- --------------------------------------------------------

--
-- Table structure for table `stockoutward`
--

CREATE TABLE `stockoutward` (
  `id` int(11) NOT NULL,
  `dealsid` int(11) NOT NULL,
  `productid` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `size` enum('small','medium','large') NOT NULL,
  `mfgcost` int(11) NOT NULL,
  `outgoingdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stockoutward`
--

INSERT INTO `stockoutward` (`id`, `dealsid`, `productid`, `qty`, `size`, `mfgcost`, `outgoingdate`) VALUES
(1, 3, 1, 2, 'small', 30, '2023-12-31'),
(3, 3, 1, 10, 'small', 30, '2023-12-12'),
(5, 3, 1, 45, 'small', 450, '2023-12-10'),
(6, 3, 1, 456, 'small', 45678, '2023-12-11'),
(7, 3, 4, 1, 'small', 2, '2023-12-12'),
(8, 12, 9, 30, 'small', 600, '2023-01-01'),
(10, 13, 5, 10, 'large', 300, '2023-12-12'),
(12, 3, 4, 12, 'small', 20, '2024-01-01'),
(13, 5, 1, 1, 'small', 1, '2024-01-02');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dealer`
--
ALTER TABLE `dealer`
  ADD PRIMARY KEY (`dealerid`);

--
-- Indexes for table `deals`
--
ALTER TABLE `deals`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employeedetails`
--
ALTER TABLE `employeedetails`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `otherexpense`
--
ALTER TABLE `otherexpense`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stockincoming`
--
ALTER TABLE `stockincoming`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stockoutward`
--
ALTER TABLE `stockoutward`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dealer`
--
ALTER TABLE `dealer`
  MODIFY `dealerid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `deals`
--
ALTER TABLE `deals`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `employeedetails`
--
ALTER TABLE `employeedetails`
  MODIFY `employee_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `otherexpense`
--
ALTER TABLE `otherexpense`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=246;

--
-- AUTO_INCREMENT for table `stockincoming`
--
ALTER TABLE `stockincoming`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `stockoutward`
--
ALTER TABLE `stockoutward`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
