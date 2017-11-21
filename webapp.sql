-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 21 Nov 2017 pada 19.18
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `webapp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `webapp`
--

CREATE TABLE `webapp` (
  `id` char(4) NOT NULL,
  `tgl_surat` date NOT NULL,
  `judul` varchar(50) NOT NULL,
  `tujuan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `webapp`
--

INSERT INTO `webapp` (`id`, `tgl_surat`, `judul`, `tujuan`) VALUES
('1', '2017-11-08', 'surat dinas', 'direktur'),
('2', '2017-11-09', 'surat peminjaman ruangan', 'BAKEU'),
('3', '2017-11-09', 'surat pemberitahuan', 'wadir III');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `webapp`
--
ALTER TABLE `webapp`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
