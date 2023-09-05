CREATE TABLE  EMPRESA (
    IdEmpresa       INTEGER PRIMARY KEY AUTOINCREMENT ID,
    Nombre          TEXT    NOT NULL,
    SitioWeb        TEXT    DEFAULT NULL,
    DireccionSede   TEXT    DEFAULT NULL,
    AnioFundacion   TEXT    NOT NULL,
    Estado          INTEGER DEFAULT 1,
    FechaIng        DATETIME DEFAULT CURRENT_TIMESTAMP,
    FechaMod        DATETIME DEFAULT CURRENT_TIMESTAMP
)

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Mojan Studios', 'www.mojang.com', 'Estocolmo, Suecia', '2009');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Rockstar Games', 'www.rockstar.com', 'Nueva York, EE. UU.', '1998');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Electronic Arts', 'www.ea.com', 'California, EE. UU.', '1982');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Nintendo', 'www.nintendo.com', 'Kioto, Japón', '1889');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Krafton', 'www.krafton.com', 'Seongnam', '2007');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Bethesda Softworks', 'www.bethesda.net', 'Maryland, EE. UU.', '1986');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('CD Projekt', 'www.cdprojekt.com', 'Varsovia, Polonia', '1994');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('505 Games', 'www.505games.com', 'Milán, Italia', '2006');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Activision', 'www.activision.com', 'California, EE. UU.', '1979');

INSERT INTO EMPRESA (Nombre, SitioWeb, DireccionSede, AnioFundacion) 
VALUES              ('Blizzard Entertainment', 'www.blizzard.com', 'California, EE. UU.', '1991');

