USE moto_repuestos;

-- REGISTRAR MARCA --
DELIMITER //
CREATE PROCEDURE spu_marcas_create(IN _marca VARCHAR(30))
BEGIN 
	INSERT INTO MARCAS (marca) VALUES (_marca);
END //
DELIMITER ;

-- REGISTRAR CATEGORIA 
DELIMITER //
CREATE PROCEDURE spu_categorias_create(
IN _categoria VARCHAR(40),
IN _descripcion VARCHAR(100)
)
BEGIN 
	INSERT INTO CATEGORIA (categoria , descripcion)
		VALUES (_categoria, _descripcion);	

END // 
DELIMITER ;