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
 IN _idpersona INT,
 IN _username VARCHAR(30),
 IN _clave_acceso VARCHAR(100),
 IN _nivel_acceso CHAR(1)
)
BEGIN     
        INSERT INTO USUARIOS (idpersona, username, clave_acceso, nivel_acceso)
				VALUES (_idpersona, _username, _clave_acceso, _nivel_acceso);
END //
DELIMITER ;

CALL spu_usuarios_create ( 1 , 'Luy06', '060903', 'A');

