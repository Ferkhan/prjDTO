CREATE TABLE PLATAFORMA (
    IdPlataforma    INTEGER PRIMARY KEY AUTOINCREMENT ID,
    Nombre          TEXT NOT NULL,
    Estado          INTEGER DEFAULT 1,
    FechaIng        DATETIME DEFAULT CURRENT_TIMESTAMP,           
    FechaMod        DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Microsoft Windows');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Android');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('IOS');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('macOS');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Xbox One');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Xbox 360');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Xbox Series X');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('PlayStation Vita');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('PlayStation');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('PlayStation 2');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('PlayStation 3');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('PlayStation 4');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('PlayStation 5');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Wii');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Game Boy Advance');

INSERT INTO PLATAFORMA (Nombre) 
VALUES                 ('Nintendo Switch');
