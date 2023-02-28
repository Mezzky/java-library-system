-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 25 Jan 2016 pada 16.59
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_buku`
--

CREATE TABLE IF NOT EXISTS `tb_buku` (
  `kode_buku` varchar(15) NOT NULL,
  `judul_buku` varchar(40) NOT NULL,
  `tanggal_terbit` date NOT NULL,
  `pengarang` varchar(30) NOT NULL,
  PRIMARY KEY (`kode_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_buku`
--

INSERT INTO `tb_buku` (`kode_buku`, `judul_buku`, `tanggal_terbit`, `pengarang`) VALUES
('001', 'Kualitas I', '2016-01-09', 'asdasd '),
('002', 'Kualitas III', '2016-01-02', 'kd kjbaksdb kjabs');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mahasiswa`
--

CREATE TABLE IF NOT EXISTS `tb_mahasiswa` (
  `no_bp` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jurusan` varchar(25) NOT NULL,
  `tanggal_masuk` date NOT NULL,
  PRIMARY KEY (`no_bp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`no_bp`, `nama`, `tempat_lahir`, `tanggal_lahir`, `jurusan`, `tanggal_masuk`) VALUES
('141400002', 'Soni Arwan', 'Flores', '1993-02-06', 'Sistem Imformasi', '2016-01-02'),
('141400009', 'Nova Fortianti Fitrianti', 'padang', '2016-01-16', 'ALKnsllk', '2019-01-11'),
('141400013', 'Joni Herianto', 'Pesisir Selatan', '1990-01-05', 'Sistem Informatika', '2016-01-02');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjaman`
--

CREATE TABLE IF NOT EXISTS `tb_peminjaman` (
  `no_bp` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jurusan` varchar(25) NOT NULL,
  `kode_buku` varchar(15) NOT NULL,
  `judul_buku` varchar(40) NOT NULL,
  `tanggal_terbit` date NOT NULL,
  `tanggal_pinjam` date NOT NULL,
  PRIMARY KEY (`no_bp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_peminjaman`
--

INSERT INTO `tb_peminjaman` (`no_bp`, `nama`, `jurusan`, `kode_buku`, `judul_buku`, `tanggal_terbit`, `tanggal_pinjam`) VALUES
('141400002', 'Soni Arwan', 'Sistem Imformasi', '002', 'Kualitas III', '2016-01-02', '2016-01-24'),
('141400009', 'Nova Fortianti Fitrianti', 'ALKnsllk', '001', 'Kualitas I', '2016-01-09', '2016-01-22'),
('141400013', 'Joni Herianto', 'Sistem Informatika', '002', 'Kualitas III', '2016-01-02', '2016-01-22');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
