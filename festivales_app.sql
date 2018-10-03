CREATE DATABASE festivales_app;

USE festivales_app;

CREATE TABLE festival (
    id INT(10) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    descripcion TEXT,
    genero VARCHAR(20),
    precio FLOAT(6,2),
    dias INT(10),
    fecha_ini VARCHAR(20),
    fecha_fin VARCHAR(20)
    );
    
CREATE TABLE usuario (
    id INT(10) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    user_name VARCHAR(30),
    contrasena VARCHAR(50),
    date_nacimiento VARCHAR(50),
    genero_favorito VARCHAR(20)
    );
    
CREATE TABLE festivales_usuario (
    id_festival INT(10),
    id_usuario INT(10),
    PRIMARY KEY(id_festival, id_usuario),
    CONSTRAINT fk_id_festival FOREIGN KEY (id_festival) REFERENCES festival(id),
    CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id)
    );

INSERT INTO `festival`(`id`, `name`, `descripcion`, `genero`, `precio`, `dias`, `fecha_ini`, `fecha_fin`) 
VALUES (1,'Viñarock','Festival de rock rap y mestizaje', 'rock', 50.0, 3, '10-05-2019', '12-05-2019'),
(2,'Resurrection Fest','Festival de rock, metal, hardcore..', 'rock', 80.0, 3, '10-07-2019', '12-07-2019'),
(3,'MareaRock Fest','Festival de punk rock', 'punk', 15.0, 1, '10-04-2019', '12-04-2019'),
(4,'Festardor','Festival de punk y rap', 'otros', 20.0, 2, '10-09-2019', '12-09-2019'),
(5,'Festival de les arts','Festival indie', 'otros', 40.0, 2, '10-06-2019', '12-06-2019');

INSERT INTO `usuario`(`id`, `name`, `user_name`, `contrasena`, `date_nacimiento`, `genero_favorito`) 
VALUES (1, 'Santi', 'AlbusAllDay', 'ofuscar', '17-07-1993', 'rock');

