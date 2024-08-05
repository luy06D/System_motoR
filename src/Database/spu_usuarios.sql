USE moto_repuestos;


-- LOGEAR USUARIOS --
DELIMITER //
CREATE PROCEDURE spu_usuarios_login(IN _username VARCHAR(30))
BEGIN 
	SELECT idusuario, username, clave_acceso, nivel_acceso,
			estado
    FROM USUARIOS 
    WHERE username = _username AND estado = 1;
END //
DELIMITER ;

CALL spu_usuarios_login('Luy06');


-- REGISTRAR USUARIOS --
DELIMITER //
CREATE PROCEDURE spu_usuarios_create(
 IN _nombres VARCHAR(30),
 IN _apellidos VARCHAR(30),
 IN _dni CHAR(8),
 IN _fechaNac DATE,
 IN _telefono CHAR(9),
 IN _username VARCHAR(30),
 IN _clave_acceso VARCHAR(100),
 IN _nivel_acceso CHAR(1)
)
BEGIN 
DECLARE _idpersona INT; 
    
		INSERT INTO PERSONAS (nombres, apellidos, dni , fechaNac, telefono)
				VALUES (_nombres, _apellidos , _dni, _fechaNac, _telefono);
		 
		SET _idpersona = LAST_INSERT_ID();
        
        INSERT INTO USUARIOS (idpersona, username, clave_acceso, nivel_acceso)
				VALUES (_idpersona, _username, _clave_acceso, _nivel_acceso);
END //
DELIMITER ;

CALL spu_usuarios_create ('Luis David','Cusi Gonzales','73196921','2003-09-06', '934651825', 'Luy06', '060903', 'A');

