USE moto_repuestos;

-- REGISTRAR PROVEEDORES 
DELIMITER //
CREATE PROCEDURE spu_prov_registrar
(
IN _razon_social VARCHAR(40),
IN _direccion	VARCHAR(50),
IN _telefono CHAR(9),
IN _email VARCHAR(100)
)
BEGIN

INSERT INTO PROVEEDORES (razon_social, direccion, telefono, email) VALUES
						(_razon_social, _direccion, _telefono, _email);

END //
DELIMITER ;





