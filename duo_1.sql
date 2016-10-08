DROP TABLE IF EXISTS `band_artiest`;
DROP TABLE IF EXISTS `optreden`;
DROP TABLE IF EXISTS `podium`;

CREATE TABLE `band_artiest` (
  `Sleutel` int(11) PRIMARY KEY,
  `Naam` varchar(10) DEFAULT NULL,
  `Beschrijving` varchar(20) DEFAULT NULL
);

INSERT INTO `band_artiest` (`Sleutel`, `Naam`, `Beschrijving`) VALUES
(1, 'A', 'AA'),
(2, 'B', 'BB'),
(3, 'C', 'CC'),
(4, 'D', 'DD');

CREATE TABLE `podium` (
  `ID` varchar(10) PRIMARY KEY,
  `Beschrijving` varchar(10) DEFAULT NULL
);

INSERT INTO `podium` (`ID`, `Beschrijving`) VALUES
('P1', 'Podium 1'),
('P2', 'Podium 2'),
('P3', 'Podium 3'),
('P4', 'Podium 4');

CREATE TABLE `optreden` (
  `Sleutel` int(11) PRIMARY KEY,
  `Podium` varchar(10) DEFAULT NULL,
  `Starttijd` time DEFAULT NULL,
  `Eindtijd` time DEFAULT NULL,
  `Band_Artiest` int(11) NOT NULL
);

INSERT INTO `optreden` (`Sleutel`, `Podium`, `Starttijd`, `Eindtijd`, `Band_Artiest`) VALUES
(1, 'P1', '20:00:00', '22:00:00', 4),
(2, 'P2', '10:00:00', '16:00:00', 3),
(3, 'P3', '20:00:00', '23:00:00', 2),
(4, 'P4', '12:00:00', '16:00:00', 1);

ALTER TABLE `optreden`
  ADD CONSTRAINT `optreden_ibfk_1` FOREIGN KEY (`Podium`) REFERENCES `podium` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `optreden_ibfk_2` FOREIGN KEY (`Band_Artiest`) REFERENCES `band_artiest` (`Sleutel`) ON DELETE CASCADE ON UPDATE CASCADE;
