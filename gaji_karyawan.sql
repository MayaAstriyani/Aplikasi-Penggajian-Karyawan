-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Jan 2023 pada 00.21
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gaji_karyawan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `kode_admin` varchar(20) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`kode_admin`, `nama`, `username`, `password`) VALUES
('1', 'admin', 'admin', 'admin'),
('2', 'maya', 'maya', 'maya12');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jabatan`
--

CREATE TABLE `jabatan` (
  `kode_jabatan` varchar(20) NOT NULL,
  `nama_jabatan` varchar(20) DEFAULT NULL,
  `gaji_pokok` varchar(20) DEFAULT NULL,
  `uang_makan` int(20) DEFAULT NULL,
  `tunjangan_bpjs` int(20) DEFAULT NULL,
  `total_gaji` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `jabatan`
--

INSERT INTO `jabatan` (`kode_jabatan`, `nama_jabatan`, `gaji_pokok`, `uang_makan`, `tunjangan_bpjs`, `total_gaji`) VALUES
('KD001', 'Manager', '10000000', 100000, 2000000, 12100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `kode_karyawan` varchar(20) NOT NULL,
  `nama_karyawan` varchar(40) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `no_telpon` varchar(20) DEFAULT NULL,
  `jabatan` varchar(20) DEFAULT NULL,
  `gaji_pokok` int(20) DEFAULT NULL,
  `uang_makan` int(20) DEFAULT NULL,
  `tunjangan_bpjs` int(20) DEFAULT NULL,
  `total_gaji` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`kode_karyawan`, `nama_karyawan`, `alamat`, `no_telpon`, `jabatan`, `gaji_pokok`, `uang_makan`, `tunjangan_bpjs`, `total_gaji`) VALUES
('KR001', 'Arif', 'Purwokerto Barat', '08234565776', 'Manager', 10000000, 1000000, 2000000, 13000000),
('KR002', 'Maya', 'Purwokerto', '1234567890', 'Manager', 10000000, 100000, 2000000, 12100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `kode_transaksi` varchar(20) NOT NULL,
  `kode_karyawan` varchar(20) DEFAULT NULL,
  `nama_karyawan` varchar(40) DEFAULT NULL,
  `jabatan` varchar(20) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `gaji_pokok` int(20) DEFAULT NULL,
  `uang_makan` int(20) DEFAULT NULL,
  `tunjangan_bpjs` int(20) DEFAULT NULL,
  `total_gaji` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`kode_transaksi`, `kode_karyawan`, `nama_karyawan`, `jabatan`, `tanggal`, `gaji_pokok`, `uang_makan`, `tunjangan_bpjs`, `total_gaji`) VALUES
('TS001', 'KR001', 'Arif', 'Manager', '1970-01-01', 10000000, 1000000, 2000000, 13000000),
('TS002', 'KR002', 'Maya', 'Manager', '2022-09-07', 10000000, 100000, 2000000, 12100000),
('ugg', 'KR002', 'Maya', 'Manager', '2022-12-17', 10000000, 100000, 2000000, 12100000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`kode_admin`);

--
-- Indeks untuk tabel `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`kode_jabatan`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`kode_karyawan`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kode_transaksi`),
  ADD KEY `kode_karyawan` (`kode_karyawan`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `kode_karyawan` FOREIGN KEY (`kode_karyawan`) REFERENCES `karyawan` (`kode_karyawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
