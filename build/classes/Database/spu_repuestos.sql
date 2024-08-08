USE moto_repuestos;

-- REGISTRAR REPUESTOS --
DELIMITER //
CREATE PROCEDURE spu_repuestos_create(
IN _idcategoria INT,
IN _idmarca INT,
IN _nombreR VARCHAR(40),
IN _modelo VARCHAR(30),
IN _precio DECIMAL(5,2),
IN _unidad_med VARCHAR(5),
IN _garantia VARCHAR(30),
IN _descripcion	VARCHAR(100)
)
BEGIN
	INSERT INTO REPUESTOS (idcategoria, idmarca, nombreR, modelo, precio,  unidad_med, garantia, descripcion)
			VALUES(_idcategoria, _idmarca, _nombreR, _modelo, _precio,  _unidad_med, _garantia, _descripcion); 

END // 
DELIMITER ;

-- ACTUALIZAR REPUESTOS -- 
DELIMITER // 
CREATE PROCEDURE spu_repuestos_update(
IN _idrepuesto INT,
IN _idcategoria INT,
IN _idmarca INT,
IN _nombreR VARCHAR(40),
IN _modelo VARCHAR(30),
IN _precio DECIMAL(5,2),
IN _unidad_med VARCHAR(5),
IN _garantia VARCHAR(30),
IN _descripcion	VARCHAR(100)
)
BEGIN 
	UPDATE REPUESTOS 
    SET idcategoria = _idcategoria,
		idmarca = _idmarca,
        nombreR = _nombreR,
        modelo = _modelo,
        precio = _precio,
        unidad_med = _unidad_med,
        garantia = _garantia,
        descripcion = _descripcion
	WHERE idrepuesto = _idrepuesto;

END //
DELIMITER ;






