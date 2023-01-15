-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Jan 2023 pada 23.38
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2010010259_kepegawaian`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `bagian`
--

CREATE TABLE `bagian` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `bagian`
--

INSERT INTO `bagian` (`id`, `nama`) VALUES
(1, 'TU'),
(2, 'KABAG'),
(3, 'STAFF'),
(4, 'PIMPINAN'),
(5, 'GUDANG');

-- --------------------------------------------------------

--
-- Struktur dari tabel `gaji`
--

CREATE TABLE `gaji` (
  `id` int(11) NOT NULL,
  `karyawan` varchar(50) NOT NULL,
  `tahun` int(4) NOT NULL,
  `bulan` int(2) NOT NULL,
  `bayar_gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `gaji`
--

INSERT INTO `gaji` (`id`, `karyawan`, `tahun`, `bulan`, `bayar_gaji`) VALUES
(9, 'Agus', 2024, 1, 100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `nik` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tanggal_mulai` text NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `status_karyawan` varchar(15) NOT NULL,
  `bagian_id` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`nik`, `nama`, `tanggal_mulai`, `gaji_pokok`, `status_karyawan`, `bagian_id`) VALUES
('00009', 'Agus', '13/01/2022', 800000, 'Tetap', 'TU'),
('00008', 'Putri', '14/01/2000', 800000, 'Tetap', 'TU');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `bagian`
--
ALTER TABLE `bagian`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
