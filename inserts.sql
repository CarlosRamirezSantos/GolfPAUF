INSERT INTO golf.jugadores (nombre, apellidos, nacionalidad, handicap) VALUES
('Jon', 'Rahm', 'España', 1),
('Sergio', 'García', 'España', 3),
('Rory', 'McIlroy', 'Irlanda del Norte', 2),
('Tiger', 'Woods', 'Estados Unidos', 4),
('Scottie', 'Scheffler', 'Estados Unidos', 1),
('Justin', 'Thomas', 'Estados Unidos', 3),
('Dustin', 'Johnson', 'Estados Unidos', 2),
('Brooks', 'Koepka', 'Estados Unidos', 2),
('Jordan', 'Spieth', 'Estados Unidos', 3),
('Hideki', 'Matsuyama', 'Japón', 4),
('Viktor', 'Hovland', 'Noruega', 2),
('Collin', 'Morikawa', 'Estados Unidos', 1),
('Cameron', 'Smith', 'Australia', 3),
('Tommy', 'Fleetwood', 'Inglaterra', 4),
('Matt', 'Fitzpatrick', 'Inglaterra', 3),
('Patrick', 'Cantlay', 'Estados Unidos', 2),
('Xander', 'Schauffele', 'Estados Unidos', 2),
('Louis', 'Oosthuizen', 'Sudáfrica', 4),
('Shane', 'Lowry', 'Irlanda', 5),
('Adam', 'Scott', 'Australia', 4);



INSERT INTO golf.torneos (nombre, lugar, fecha_inicio, fecha_fin, premio_total) VALUES
('Masters de Augusta', 'Augusta, Estados Unidos', '2025-04-10', '2025-04-13', 18000000),
('US Open', 'Pebble Beach, Estados Unidos', '2025-06-12', '2025-06-15', 20000000),
('The Open Championship', 'St Andrews, Escocia', '2025-07-17', '2025-07-20', 16500000),
('PGA Championship', 'Louisville, Estados Unidos', '2025-05-15', '2025-05-18', 17000000),
('Open de España', 'Madrid, España', '2025-10-09', '2025-10-12', 3500000),
('DP World Tour Championship', 'Dubái, Emiratos Árabes Unidos', '2025-11-13', '2025-11-16', 10000000);



INSERT INTO golf.clasificaciones (posicion, jugador_id, torneo_id) VALUES
-- Masters de Augusta (torneo 1)
(1, 1, 1),
(2, 3, 1),
(3, 5, 1),
(4, 9, 1),
(5, 12, 1),

-- US Open (torneo 2)
(1, 5, 2),
(2, 7, 2),
(3, 2, 2),
(4, 10, 2),
(5, 17, 2),

-- The Open Championship (torneo 3)
(1, 3, 3),
(2, 11, 3),
(3, 14, 3),
(4, 18, 3),
(5, 20, 3),

-- PGA Championship (torneo 4)
(1, 7, 4),
(2, 16, 4),
(3, 8, 4),
(4, 4, 4),
(5, 6, 4),

-- Open de España (torneo 5)
(1, 1, 5),
(2, 2, 5),
(3, 15, 5),
(4, 19, 5),
(5, 13, 5),

-- DP World Tour Championship (torneo 6)
(1, 16, 6),
(2, 11, 6),
(3, 12, 6),
(4, 20, 6),
(5, 3, 6);