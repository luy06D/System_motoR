USE moto_repuestos;

-- LISTAR CLIENTES --
DELIMITER //
CREATE PROCEDURE spu_clientes_listar()
BEGIN 
	SELECT idcliente, CLI.idpersona, CONCAT(nombres,' ',apellidos) AS cliente,
			dni, fechaNac, telefono, estado 
    FROM CLIENTES CLI
    INNER JOIN PERSONAS PE ON CLI.idpersona = PE.idpersona
    WHERE CLI.estado = 1;
END //
DELIMITER ;
	
CALL spu_clientes_listar();

-- REGISTRAR CLIENTES -- 
DELIMITER //
CREATE PROCEDURE spu_clientes_create(
 IN _nombres VARCHAR(30),
 IN _apellidos VARCHAR(30),
 IN _dni CHAR(8),
 IN _fechaNac DATE,
 IN _telefono CHAR(9)
)	
BEGIN 
	DECLARE _idpersona INT; 
    
		INSERT INTO PERSONAS (nombres, apellidos, dni , fechaNac, telefono)
				VALUES (_nombres, _apellidos , _dni, _fechaNac, _telefono);
		 
		SET _idpersona = LAST_INSERT_ID();
        
        INSERT INTO CLIENTES (idpersona) VALUES (_idpersona);
END //
DELIMITER ;

CALL spu_clientes_create ('Maritza','Gonzales Salazar','73199911','1998-12-22', '941322002');

-- CAMBIAR ESTADO DE CLIENTE --
DELIMITER //
CREATE PROCEDURE spu_clientes_delete(IN _idcliente INT)
BEGIN 
	UPDATE CLIENTES
    SET estado = 0	
    WHERE idcliente = _idcliente;
END //
DELIMITER ;

CALL spu_clientes_delete(1);






