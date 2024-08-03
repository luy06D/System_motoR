USE moto_repuestos;



-- LISTAR PERSONAS -- 
DELIMITER 
CREATE PROCEDURE spu_personas_listar()
BEGIN 
	SELECT * FROM PERSONAS;
END;
DELIMITER;


-- REGISTRAR PERSONAS --
DELIMITER 
CREATE PROCEDURE spu_personas_create(
 IN _nombres VARCHAR(30),
 IN _apellidos VARCHAR(30),
 IN _dni CHAR(8),
 IN _fechaNac DATE,
 IN _telefono CHAR(9)
)
BEGIN 
	INSERT INTO PERSONAS (nombres, apellidos, dni , fechaNac, telefono)
				VALUES (_nombres, _apellidos , _dni, _fechaNac, _telefono);

END;
DELIMITER; 

CALL 

-- ACTUALIZAR PERSONAS -- 
DELIMITER
CREATE PROCEDURE spu_personas_update(
 IN _idpersona INT,
 IN _nombres VARCHAR(30),
 IN _apellidos VARCHAR(30),
 IN _dni CHAR(8),
 IN _fechaNac DATE,
 IN _telefono CHAR(9)
)
BEGIN 
	UPDATE PERSONAS 
    SET nombres = _nombres,
		apellidos = _apellidos,
        dni = _dni,
        fechaNac = _fechaNac,
        telefono = _telefono
	WHERE idpersona = _idpersona;

END;
DELIMITER;









