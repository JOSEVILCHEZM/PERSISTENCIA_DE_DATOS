CREATE DATABASE mensajes_db

SHOW DATABASES;

SELECT * FROM mensajes_db.mensajes;

INSERT INTO mensajes_db.mensajes(mensaje,autor,fecha) 
VALUES ('Primer mensaje', 'Jose', current_time())

INSERT INTO mensajes_db.mensajes(mensaje,autor,fecha) 
VALUES ('Segundo mensaje', 'Jose', current_time())