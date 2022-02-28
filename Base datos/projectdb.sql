-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 16-10-2021 a las 23:55:12
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `projectdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora`
--

CREATE TABLE IF NOT EXISTS `bitacora` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `hora` varchar(255) NOT NULL,
  `fecha` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `resultado` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=189 ;

--
-- Volcado de datos para la tabla `bitacora`
--

INSERT INTO `bitacora` (`id`, `nombre`, `hora`, `fecha`, `descripcion`, `resultado`) VALUES
(1, 'fbracho', '4/9/2019', '17:36:5', 'Inicio de sesion en el sistema', 'Éxito'),
(2, 'fbracho', '5/9/2019', '9:22:51', 'Inicio de sesion en el sistema', 'Éxito'),
(3, 'fbracho', '5/9/2019', '9:23:54', 'Registro de usuario', 'Éxito'),
(4, 'neida72', '5/9/2019', '9:33:6', 'Inicio de sesion en el sistema', 'Éxito'),
(5, 'fbracho', '5/9/2019', '9:36:4', 'Inicio de sesion en el sistema', 'Éxito'),
(6, 'fbracho', '5/9/2019', '11:59:10', 'Inicio de sesion en el sistema', 'Éxito'),
(7, 'fbracho', '10/9/2019', '11:28:21', 'Inicio de sesion en el sistema', 'Éxito'),
(8, 'fbracho', '17/9/2019', '15:51:17', 'Inicio de sesion en el sistema', 'Éxito'),
(9, 'fbracho', '13/10/2021', '11:54:39', 'Inicio de sesion en el sistema', 'Éxito'),
(10, 'fbracho', '13/10/2021', '11:56:30', 'Inicio de sesion en el sistema', 'Éxito'),
(11, 'fbracho', '13/10/2021', '11:59:39', 'Inicio de sesion en el sistema', 'Éxito'),
(12, 'fbracho', '13/10/2021', '12:0:54', 'Inicio de sesion en el sistema', 'Éxito'),
(13, 'fbracho', '13/10/2021', '12:1:46', 'Inicio de sesion en el sistema', 'Éxito'),
(14, 'fbracho', '13/10/2021', '12:4:43', 'Inicio de sesion en el sistema', 'Éxito'),
(15, 'fbracho', '13/10/2021', '12:5:21', 'Inicio de sesion en el sistema', 'Éxito'),
(16, 'fbracho', '13/10/2021', '12:6:38', 'Inicio de sesion en el sistema', 'Éxito'),
(17, 'fbracho', '13/10/2021', '12:8:11', 'Inicio de sesion en el sistema', 'Éxito'),
(18, 'fbracho', '13/10/2021', '12:9:33', 'Inicio de sesion en el sistema', 'Éxito'),
(19, 'fbracho', '13/10/2021', '12:10:30', 'Inicio de sesion en el sistema', 'Éxito'),
(20, 'fbracho', '13/10/2021', '12:11:2', 'Inicio de sesion en el sistema', 'Éxito'),
(21, 'fbracho', '13/10/2021', '12:11:37', 'Inicio de sesion en el sistema', 'Éxito'),
(22, 'fbracho', '13/10/2021', '12:12:46', 'Inicio de sesion en el sistema', 'Éxito'),
(23, 'fbracho', '13/10/2021', '12:13:17', 'Inicio de sesion en el sistema', 'Éxito'),
(24, 'fbracho', '13/10/2021', '12:14:25', 'Inicio de sesion en el sistema', 'Éxito'),
(25, 'fbracho', '13/10/2021', '12:15:35', 'Inicio de sesion en el sistema', 'Éxito'),
(26, 'fbracho', '13/10/2021', '12:17:53', 'Inicio de sesion en el sistema', 'Éxito'),
(27, 'fbracho', '13/10/2021', '12:18:26', 'Inicio de sesion en el sistema', 'Éxito'),
(28, 'fbracho', '13/10/2021', '12:22:0', 'Inicio de sesion en el sistema', 'Éxito'),
(29, 'fbracho', '13/10/2021', '12:23:10', 'Inicio de sesion en el sistema', 'Éxito'),
(30, 'fbracho', '13/10/2021', '12:23:54', 'Inicio de sesion en el sistema', 'Éxito'),
(31, 'fbracho', '13/10/2021', '12:24:28', 'Inicio de sesion en el sistema', 'Éxito'),
(32, 'fbracho', '13/10/2021', '12:25:42', 'Inicio de sesion en el sistema', 'Éxito'),
(33, 'fbracho', '13/10/2021', '12:26:54', 'Inicio de sesion en el sistema', 'Éxito'),
(34, 'fbracho', '13/10/2021', '12:29:36', 'Inicio de sesion en el sistema', 'Éxito'),
(35, 'fbracho', '13/10/2021', '12:33:21', 'Inicio de sesion en el sistema', 'Éxito'),
(36, 'fbracho', '13/10/2021', '12:35:9', 'Inicio de sesion en el sistema', 'Éxito'),
(37, 'fbracho', '13/10/2021', '12:40:41', 'Inicio de sesion en el sistema', 'Éxito'),
(38, 'fbracho', '13/10/2021', '12:42:29', 'Inicio de sesion en el sistema', 'Éxito'),
(39, 'fbracho', '13/10/2021', '12:44:24', 'Inicio de sesion en el sistema', 'Éxito'),
(40, 'fbracho', '13/10/2021', '12:57:26', 'Inicio de sesion en el sistema', 'Éxito'),
(41, 'fbracho', '13/10/2021', '14:19:49', 'Inicio de sesion en el sistema', 'Éxito'),
(42, 'fbracho', '13/10/2021', '14:31:33', 'Inicio de sesion en el sistema', 'Éxito'),
(43, 'fbracho', '13/10/2021', '14:45:50', 'Inicio de sesion en el sistema', 'Éxito'),
(44, 'fbracho', '13/10/2021', '14:49:24', 'Inicio de sesion en el sistema', 'Éxito'),
(45, 'fbracho', '13/10/2021', '14:51:29', 'Inicio de sesion en el sistema', 'Éxito'),
(46, 'fbracho', '13/10/2021', '14:57:56', 'Inicio de sesion en el sistema', 'Éxito'),
(47, 'fbracho', '13/10/2021', '14:58:45', 'Inicio de sesion en el sistema', 'Éxito'),
(48, 'fbracho', '13/10/2021', '15:1:58', 'Inicio de sesion en el sistema', 'Éxito'),
(49, 'fbracho', '13/10/2021', '15:12:23', 'Inicio de sesion en el sistema', 'Éxito'),
(50, 'fbracho', '13/10/2021', '15:17:11', 'Inicio de sesion en el sistema', 'Éxito'),
(51, 'fbracho', '13/10/2021', '15:19:5', 'Inicio de sesion en el sistema', 'Éxito'),
(52, 'fbracho', '13/10/2021', '15:21:31', 'Inicio de sesion en el sistema', 'Éxito'),
(53, 'fbracho', '13/10/2021', '15:23:56', 'Inicio de sesion en el sistema', 'Éxito'),
(54, 'fbracho', '13/10/2021', '15:26:57', 'Inicio de sesion en el sistema', 'Éxito'),
(55, 'fbracho', '13/10/2021', '15:33:37', 'Inicio de sesion en el sistema', 'Éxito'),
(56, 'fbracho', '13/10/2021', '15:34:22', 'Inicio de sesion en el sistema', 'Éxito'),
(57, 'fbracho', '13/10/2021', '15:35:39', 'Inicio de sesion en el sistema', 'Éxito'),
(58, 'fbracho', '13/10/2021', '15:41:52', 'Inicio de sesion en el sistema', 'Éxito'),
(59, 'fbracho', '13/10/2021', '15:48:10', 'Inicio de sesion en el sistema', 'Éxito'),
(60, 'fbracho', '13/10/2021', '15:50:58', 'Inicio de sesion en el sistema', 'Éxito'),
(61, 'fbracho', '13/10/2021', '15:52:2', 'Inicio de sesion en el sistema', 'Éxito'),
(62, 'fbracho', '13/10/2021', '15:52:31', 'Inicio de sesion en el sistema', 'Éxito'),
(63, 'fbracho', '13/10/2021', '15:56:41', 'Inicio de sesion en el sistema', 'Éxito'),
(64, 'fbracho', '13/10/2021', '16:2:5', 'Inicio de sesion en el sistema', 'Éxito'),
(65, 'fbracho', '13/10/2021', '16:3:22', 'Inicio de sesion en el sistema', 'Éxito'),
(66, 'fbracho', '13/10/2021', '16:4:9', 'Inicio de sesion en el sistema', 'Éxito'),
(67, 'fbracho', '13/10/2021', '16:4:55', 'Inicio de sesion en el sistema', 'Éxito'),
(68, 'fbracho', '13/10/2021', '16:6:19', 'Inicio de sesion en el sistema', 'Éxito'),
(69, 'fbracho', '13/10/2021', '16:7:36', 'Inicio de sesion en el sistema', 'Éxito'),
(70, 'fbracho', '13/10/2021', '16:14:5', 'Inicio de sesion en el sistema', 'Éxito'),
(71, 'fbracho', '13/10/2021', '16:16:14', 'Inicio de sesion en el sistema', 'Éxito'),
(72, 'fbracho', '13/10/2021', '16:18:4', 'Inicio de sesion en el sistema', 'Éxito'),
(73, 'fbracho', '13/10/2021', '16:19:4', 'Inicio de sesion en el sistema', 'Éxito'),
(74, 'fbracho', '13/10/2021', '16:27:14', 'Inicio de sesion en el sistema', 'Éxito'),
(75, 'fbracho', '13/10/2021', '16:41:19', 'Inicio de sesion en el sistema', 'Éxito'),
(76, 'fbracho', '13/10/2021', '19:31:41', 'Inicio de sesion en el sistema', 'Éxito'),
(77, 'fbracho', '13/10/2021', '19:40:33', 'Inicio de sesion en el sistema', 'Éxito'),
(78, 'fbracho', '13/10/2021', '19:43:14', 'Inicio de sesion en el sistema', 'Éxito'),
(79, 'fbracho', '13/10/2021', '19:44:48', 'Inicio de sesion en el sistema', 'Éxito'),
(80, 'fbracho', '13/10/2021', '19:46:49', 'Inicio de sesion en el sistema', 'Éxito'),
(81, 'fbracho', '13/10/2021', '19:50:42', 'Inicio de sesion en el sistema', 'Éxito'),
(82, 'fbracho', '13/10/2021', '19:51:47', 'Inicio de sesion en el sistema', 'Éxito'),
(83, 'fbracho', '13/10/2021', '20:2:23', 'Inicio de sesion en el sistema', 'Éxito'),
(84, 'fbracho', '13/10/2021', '20:26:19', 'Inicio de sesion en el sistema', 'Éxito'),
(85, 'fbracho', '13/10/2021', '20:39:38', 'Inicio de sesion en el sistema', 'Éxito'),
(86, 'fbracho', '13/10/2021', '20:42:44', 'Inicio de sesion en el sistema', 'Éxito'),
(87, 'fbracho', '13/10/2021', '20:44:42', 'Inicio de sesion en el sistema', 'Éxito'),
(88, 'fbracho', '13/10/2021', '20:48:31', 'Inicio de sesion en el sistema', 'Éxito'),
(89, 'fbracho', '13/10/2021', '20:52:51', 'Inicio de sesion en el sistema', 'Éxito'),
(90, 'fbracho', '13/10/2021', '21:1:44', 'Inicio de sesion en el sistema', 'Éxito'),
(91, 'fbracho', '13/10/2021', '21:13:5', 'Inicio de sesion en el sistema', 'Éxito'),
(92, 'fbracho', '13/10/2021', '21:14:32', 'Inicio de sesion en el sistema', 'Éxito'),
(93, 'fbracho', '13/10/2021', '21:15:21', 'Inicio de sesion en el sistema', 'Éxito'),
(94, 'fbracho', '13/10/2021', '21:17:35', 'Inicio de sesion en el sistema', 'Éxito'),
(95, 'fbracho', '13/10/2021', '21:18:14', 'Inicio de sesion en el sistema', 'Éxito'),
(96, 'fbracho', '13/10/2021', '21:19:15', 'Inicio de sesion en el sistema', 'Éxito'),
(97, 'fbracho', '13/10/2021', '21:31:10', 'Inicio de sesion en el sistema', 'Éxito'),
(98, 'fbracho', '13/10/2021', '21:33:37', 'Inicio de sesion en el sistema', 'Éxito'),
(99, 'fbracho', '14/10/2021', '16:45:43', 'Inicio de sesion en el sistema', 'Éxito'),
(100, 'fbracho', '14/10/2021', '18:46:24', 'Inicio de sesion en el sistema', 'Éxito'),
(101, 'fbracho', '14/10/2021', '19:4:38', 'Inicio de sesion en el sistema', 'Éxito'),
(102, 'fbracho', '14/10/2021', '19:13:45', 'Inicio de sesion en el sistema', 'Éxito'),
(103, 'fbracho', '14/10/2021', '19:14:48', 'Inicio de sesion en el sistema', 'Éxito'),
(104, 'fbracho', '14/10/2021', '19:16:3', 'Registro de marca del producto', 'Éxito'),
(105, 'fbracho', '14/10/2021', '19:57:12', 'Inicio de sesion en el sistema', 'Éxito'),
(106, 'fbracho', '14/10/2021', '19:58:50', 'Inicio de sesion en el sistema', 'Éxito'),
(107, 'fbracho', '14/10/2021', '20:12:16', 'Inicio de sesion en el sistema', 'Éxito'),
(108, 'fbracho', '14/10/2021', '20:17:1', 'Inicio de sesion en el sistema', 'Éxito'),
(109, 'fbracho', '14/10/2021', '20:30:13', 'Inicio de sesion en el sistema', 'Éxito'),
(110, 'fbracho', '14/10/2021', '20:31:22', 'Inicio de sesion en el sistema', 'Éxito'),
(111, 'fbracho', '14/10/2021', '20:39:38', 'Inicio de sesion en el sistema', 'Éxito'),
(112, 'fbracho', '14/10/2021', '20:49:5', 'Inicio de sesion en el sistema', 'Éxito'),
(113, 'fbracho', '14/10/2021', '20:50:35', 'Inicio de sesion en el sistema', 'Éxito'),
(114, 'fbracho', '14/10/2021', '20:51:26', 'Inicio de sesion en el sistema', 'Éxito'),
(115, 'fbracho', '14/10/2021', '20:53:48', 'Inicio de sesion en el sistema', 'Éxito'),
(116, 'fbracho', '14/10/2021', '21:19:37', 'Inicio de sesion en el sistema', 'Éxito'),
(117, 'fbracho', '14/10/2021', '21:32:7', 'Inicio de sesion en el sistema', 'Éxito'),
(118, 'fbracho', '14/10/2021', '22:7:4', 'Inicio de sesion en el sistema', 'Éxito'),
(119, 'fbracho', '14/10/2021', '22:28:5', 'Inicio de sesion en el sistema', 'Éxito'),
(120, 'fbracho', '14/10/2021', '22:43:46', 'Inicio de sesion en el sistema', 'Éxito'),
(121, 'fbracho', '14/10/2021', '22:46:57', 'Inicio de sesion en el sistema', 'Éxito'),
(122, 'fbracho', '14/10/2021', '22:50:52', 'Inicio de sesion en el sistema', 'Éxito'),
(123, 'fbracho', '14/10/2021', '22:52:16', 'Inicio de sesion en el sistema', 'Éxito'),
(124, 'fbracho', '15/10/2021', '6:35:15', 'Inicio de sesion en el sistema', 'Éxito'),
(125, 'fbracho', '15/10/2021', '8:28:25', 'Inicio de sesion en el sistema', 'Éxito'),
(126, 'fbracho', '15/10/2021', '8:32:33', 'Inicio de sesion en el sistema', 'Éxito'),
(127, 'fbracho', '15/10/2021', '8:35:43', 'Registro de usuario', 'Éxito'),
(128, 'jmuvdi', '15/10/2021', '8:36:8', 'Inicio de sesion en el sistema', 'Éxito'),
(129, 'Jmuvdi', '15/10/2021', '8:57:8', 'Inicio de sesion en el sistema', 'Éxito'),
(130, 'Jmuvdi', '15/10/2021', '9:10:22', 'Inicio de sesion en el sistema', 'Éxito'),
(131, 'fbracho', '15/10/2021', '20:41:36', 'Inicio de sesion en el sistema', 'Éxito'),
(132, 'fbracho', '15/10/2021', '20:48:29', 'Inicio de sesion en el sistema', 'Éxito'),
(133, 'fbracho', '15/10/2021', '20:52:48', 'Inicio de sesion en el sistema', 'Éxito'),
(134, 'fbracho', '15/10/2021', '20:54:27', 'Inicio de sesion en el sistema', 'Éxito'),
(135, 'fbracho', '15/10/2021', '20:58:45', 'Inicio de sesion en el sistema', 'Éxito'),
(136, 'fbracho', '15/10/2021', '20:58:50', 'Inicio de sesion en el sistema', 'Éxito'),
(137, 'fbracho', '15/10/2021', '20:59:43', 'Inicio de sesion en el sistema', 'Éxito'),
(138, 'fbracho', '15/10/2021', '21:0:35', 'Inicio de sesion en el sistema', 'Éxito'),
(139, 'fbracho', '15/10/2021', '21:2:1', 'Inicio de sesion en el sistema', 'Éxito'),
(140, 'fbracho', '15/10/2021', '21:14:3', 'Inicio de sesion en el sistema', 'Éxito'),
(141, 'fbracho', '15/10/2021', '21:20:42', 'Inicio de sesion en el sistema', 'Éxito'),
(142, 'fbracho', '15/10/2021', '21:21:32', 'Inicio de sesion en el sistema', 'Éxito'),
(143, 'fbracho', '15/10/2021', '21:29:6', 'Inicio de sesion en el sistema', 'Éxito'),
(144, 'fbracho', '15/10/2021', '21:33:10', 'Inicio de sesion en el sistema', 'Éxito'),
(145, 'fbracho', '16/10/2021', '8:9:42', 'Inicio de sesion en el sistema', 'Éxito'),
(146, 'fbracho', '16/10/2021', '8:50:25', 'Inicio de sesion en el sistema', 'Éxito'),
(147, 'fbracho', '16/10/2021', '8:51:17', 'Inicio de sesion en el sistema', 'Éxito'),
(148, 'fbracho', '16/10/2021', '8:52:16', 'Inicio de sesion en el sistema', 'Éxito'),
(149, 'fbracho', '16/10/2021', '8:53:5', 'Inicio de sesion en el sistema', 'Éxito'),
(150, 'fbracho', '16/10/2021', '8:55:45', 'Inicio de sesion en el sistema', 'Éxito'),
(151, 'fbracho', '16/10/2021', '8:56:40', 'Inicio de sesion en el sistema', 'Éxito'),
(152, 'fbracho', '16/10/2021', '10:27:15', 'Inicio de sesion en el sistema', 'Éxito'),
(153, 'fbracho', '16/10/2021', '10:31:4', 'Inicio de sesion en el sistema', 'Éxito'),
(154, 'fbracho', '16/10/2021', '10:37:59', 'Inicio de sesion en el sistema', 'Éxito'),
(155, 'fbracho', '16/10/2021', '10:42:5', 'Inicio de sesion en el sistema', 'Éxito'),
(156, 'fbracho', '16/10/2021', '10:50:31', 'Inicio de sesion en el sistema', 'Éxito'),
(157, 'fbracho', '16/10/2021', '10:56:49', 'Inicio de sesion en el sistema', 'Éxito'),
(158, 'fbracho', '16/10/2021', '11:19:22', 'Inicio de sesion en el sistema', 'Éxito'),
(159, 'fbracho', '16/10/2021', '11:39:1', 'Inicio de sesion en el sistema', 'Éxito'),
(160, 'fbracho', '16/10/2021', '11:47:26', 'Inicio de sesion en el sistema', 'Éxito'),
(161, 'fbracho', '16/10/2021', '11:48:46', 'Inicio de sesion en el sistema', 'Éxito'),
(162, 'fbracho', '16/10/2021', '11:50:8', 'Inicio de sesion en el sistema', 'Éxito'),
(163, 'fbracho', '16/10/2021', '11:51:0', 'Inicio de sesion en el sistema', 'Éxito'),
(164, 'fbracho', '16/10/2021', '11:53:13', 'Inicio de sesion en el sistema', 'Éxito'),
(165, 'fbracho', '16/10/2021', '11:53:51', 'Inicio de sesion en el sistema', 'Éxito'),
(166, 'fbracho', '16/10/2021', '11:55:12', 'Inicio de sesion en el sistema', 'Éxito'),
(167, 'fbracho', '16/10/2021', '12:1:1', 'Inicio de sesion en el sistema', 'Éxito'),
(168, 'fbracho', '16/10/2021', '12:4:23', 'Inicio de sesion en el sistema', 'Éxito'),
(169, 'fbracho', '16/10/2021', '12:6:12', 'Inicio de sesion en el sistema', 'Éxito'),
(170, 'fbracho', '16/10/2021', '12:7:29', 'Inicio de sesion en el sistema', 'Éxito'),
(171, 'fbracho', '16/10/2021', '13:15:39', 'Inicio de sesion en el sistema', 'Éxito'),
(172, 'fbracho', '16/10/2021', '13:17:28', 'Inicio de sesion en el sistema', 'Éxito'),
(173, 'fbracho', '16/10/2021', '15:37:4', 'Inicio de sesion en el sistema', 'Éxito'),
(174, 'fbracho', '16/10/2021', '15:43:44', 'Inicio de sesion en el sistema', 'Éxito'),
(175, 'Jmuvdi', '16/10/2021', '15:44:44', 'Inicio de sesion en el sistema', 'Éxito'),
(176, 'fbracho', '16/10/2021', '16:51:50', 'Inicio de sesion en el sistema', 'Éxito'),
(177, 'fbracho', '16/10/2021', '16:54:2', 'Inicio de sesion en el sistema', 'Éxito'),
(178, 'Jmuvdi', '16/10/2021', '16:55:17', 'Inicio de sesion en el sistema', 'Éxito'),
(179, 'Jmuvdi', '16/10/2021', '17:12:49', 'Inicio de sesion en el sistema', 'Éxito'),
(180, 'Jmuvdi', '16/10/2021', '17:13:52', 'Inicio de sesion en el sistema', 'Éxito'),
(181, 'fbracho', '16/10/2021', '17:29:38', 'Inicio de sesion en el sistema', 'Éxito'),
(182, 'fbracho', '16/10/2021', '17:31:20', 'Inicio de sesion en el sistema', 'Éxito'),
(183, 'Jmuvdi', '16/10/2021', '17:33:9', 'Inicio de sesion en el sistema', 'Éxito'),
(184, 'Jmuvdi', '16/10/2021', '17:39:47', 'Inicio de sesion en el sistema', 'Éxito'),
(185, 'Jmuvdi', '16/10/2021', '17:56:37', 'Inicio de sesion en el sistema', 'Éxito'),
(186, 'fbracho', '16/10/2021', '18:2:10', 'Inicio de sesion en el sistema', 'Éxito'),
(187, 'Jmuvdi', '16/10/2021', '18:4:44', 'Inicio de sesion en el sistema', 'Éxito'),
(188, 'Jmuvdi', '16/10/2021', '19:2:43', 'Inicio de sesion en el sistema', 'Éxito');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cedula`
--

CREATE TABLE IF NOT EXISTS `cedula` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `cedula`
--

INSERT INTO `cedula` (`id`, `cedula`) VALUES
(1, '--'),
(2, 'V-'),
(3, 'E-'),
(4, 'J-');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `correo`
--

CREATE TABLE IF NOT EXISTS `correo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `correo` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `correo`
--

INSERT INTO `correo` (`id`, `correo`) VALUES
(1, '--'),
(2, '@gmail.com'),
(3, '@hotmail.com'),
(4, '@yahoo.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`id`, `estado`) VALUES
(1, '--'),
(2, 'Barquisimeto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_civil`
--

CREATE TABLE IF NOT EXISTS `estado_civil` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `estado_civil`
--

INSERT INTO `estado_civil` (`id`, `estado`) VALUES
(1, '--'),
(2, 'Soltero'),
(3, 'Casado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado_instrucion`
--

CREATE TABLE IF NOT EXISTS `grado_instrucion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grado` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `grado_instrucion`
--

INSERT INTO `grado_instrucion` (`id`, `grado`) VALUES
(1, '--'),
(2, 'Primaria'),
(3, 'Segundaria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexo`
--

CREATE TABLE IF NOT EXISTS `sexo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sexo` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `sexo`
--

INSERT INTO `sexo` (`id`, `sexo`) VALUES
(1, '--'),
(2, 'Masculino'),
(3, 'Femenino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telf`
--

CREATE TABLE IF NOT EXISTS `telf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `telf` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `telf`
--

INSERT INTO `telf` (`id`, `telf`) VALUES
(1, '--'),
(2, '0414'),
(3, '0424'),
(4, '0416'),
(5, '0426'),
(6, '0412'),
(7, '0251'),
(8, '0253');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_paci`
--

CREATE TABLE IF NOT EXISTS `tipo_paci` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_paci` varchar(244) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `tipo_paci`
--

INSERT INTO `tipo_paci` (`id`, `tipo_paci`) VALUES
(1, '--'),
(2, 'Particular'),
(3, 'Asegurado'),
(4, 'Empresa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `user` varchar(255) NOT NULL,
  `passw` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `nivel_acceso` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `apellido`, `user`, `passw`, `email`, `telefono`, `estado`, `nivel_acceso`) VALUES
(1, 'fraiberth', 'bracho', 'fbracho', '0f3d014eead934bbdbacb62a01dc4831', 'fbracho@gmail.com', '0414255655', 'Activado', 'Administrador'),
(2, 'Neida ', 'Bracho', 'neida72', '0f3d014eead934bbdbacb62a01dc4831', 'neida1972@gmail.com', '02518865576', 'Activado', 'Usuario'),
(7, 'fraiberth', 'bracho', 'fbracho', '14cdb141a7b468051b922b77618abd9e', 'fbracho@gmail.com', '042404245934091', 'Activado', 'Administrador'),
(8, 'Joha', 'muvdi', 'Jmuvdi', '81dc9bdb52d04dc20036dbd8313ed055', 'jmuvdi@gmail.com', '04143333333', 'Activado', 'Moderador');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
