CREATE TABLE VIDEOJUEGO (
    IdJuego         INTEGER PRIMARY KEY AUTOINCREMENT ID,
    IdEmpresa       INTEGER NOT NULL,
    IdPlataforma    INTEGER NOT NULL,
    Nombre          TEXT NOT NULL,
    AnioLanzamiento TEXT NOT NULL,
    VentasEstimadas INTEGER NOT NULL,
    Estado          INTEGER DEFAULT 1, 
    FechaIng        DATETIME DEFAULT CURRENT_TIMESTAMP,
    FechaMod        DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (IdEmpresa)     REFERENCES EMPRESA      (IdEmpresa),
    FOREIGN KEY (IdPlataforma)  REFERENCES PLATAFORMA   (IdPlataforma)
);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (10, 12, 'Diablo III', '2012', 30000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (3, 3, 'Tetris (EA)', '2006', 100000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 14, 'Mario Kart 8 Deluxe', '2014', 60000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 14, 'Wii Sports', '2006', 82900000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (5, 5, 'PUBG: Battlegrounds', '2017', 75000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (2, 12, 'Red Dead Redemption 2', '2018', 53000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (7, 7, 'The Witcher 3', '2015', 50000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 14, 'Wii Fit', '2007', 43820000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (3, 7, 'FIFA 18', '2017', 24000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (2, 10, 'Grand Theft Auto: San Andreas', '2004', 27500000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 15, 'Tetris (Nintendo)', '1989', 43000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (6, 6, 'The Elder Scrolls V: Skyrim', '2011', 60000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 16, 'Animal Crossing: New Horizons', '2020', 41590000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (8, 1, 'Terraria', '2011', 44500000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (9, 13, 'Call of Duty: Modern Warfare', '2019', 30000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (9, 11, 'Call of Duty: Modern Warfare 3', '2011', 26500000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (1, 1, 'Minecraft', '2011', 238000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 15, 'Super Mario Bros', '1985', 58000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (4, 16, 'The Legend of Zelda: Breath of the Wild', '2017', 29000000);

INSERT INTO VIDEOJUEGO (IdEmpresa, IdPlataforma, Nombre, AnioLanzamiento, VentasEstimadas)
VALUES                 (2, 11, 'Grand Theft Auto v', '2013', 180000000);

