USE moto_repuestos;

-- BUSCAR PRODUCTOS PARA ORDEN DE COMPRA
DELIMITER //
CREATE PROCEDURE spu_product_buscar(IN _search VARCHAR(100))
BEGIN 
	SELECT idrepuesto, nombreR, MA.marca, modelo, CA.categoria, unidad_med
    FROM REPUESTOS RE
    INNER JOIN MARCAS MA ON RE.idmarca = MA.idmarca
    INNER JOIN CATEGORIAS CA ON RE.idcategoria = CA.idcategoria
    WHERE RE.inactive_at = 1 AND  nombreR LIKE CONCAT('%',_search, '%');
END //
DELIMITER ;

CALL spu_product_buscar('KENDA');

-- BUSCAR REPUESTO POR ID 
DELIMITER //
CREATE PROCEDURE spu_getRepuesto(IN _idrepuesto INT)
BEGIN 
	SELECT idrepuesto, nombreR, MA.marca, modelo, CA.categoria, unidad_med
    FROM REPUESTOS RE
    INNER JOIN MARCAS MA ON RE.idmarca = MA.idmarca
    INNER JOIN CATEGORIAS CA ON RE.idcategoria = CA.idcategoria
    WHERE idrepuesto = _idrepuesto;
END // 
DELIMITER ;

CALL spu_getRepuesto(1);


-- REGISTRAR ORDEN DE COMPRA 
DELIMITER //
CREATE PROCEDURE spu_ordenC_register(
IN _idprovedor INT,
IN _num_ordenC  SMALLINT,
IN _total_costos VARCHAR(40),
IN _subtotal DECIMAL(6,2)
)
BEGIN
	DECLARE idOrden INT;

	INSERT INTO ORDEN_COMPRAS (idprovedor, num_ordenC, total_costos, subtotal) VALUES
						(_idprovedor, _num_ordenC, _total_costos, _subtotal);
	SET idOrden = LAST_INSERT_ID();
    
    SELECT idOrden;
    
END // 
DELIMITER ;

-- REGISTRO DE DETALLE DE ORDEN 
DELIMITER //
CREATE PROCEDURE spu_detalleOrden_register(
IN _idrepuesto INT,
IN _idordencompra INT,
IN _cantidad SMALLINT,
IN _precio_unitario DECIMAL(6,2)
)
BEGIN
	INSERT INTO DETALLE_ORDENC (idrepuesto, idordencompra, cantidad, precio_unitario) VALUES
					(_idrepuesto, _idordencompra, _cantidad, _precio_unitario);

END //
DELIMITER ;

CALL spu_detalleOrden_register (1, 1, 12, 20);

-- LISTAR ORDENES PENDIENTES 
DELIMITER //
CREATE PROCEDURE spu_ordenes_listar()
BEGIN

	SELECT PRO.razon_social, num_ordenC, estado , subtotal, total_costos, create_at
	FROM ORDEN_COMPRAS OC
	INNER JOIN PROVEEDORES PRO ON OC.idprovedor = PRO.idprovedor
	WHERE estado = "PENDIENTE";

END //
DELIMITER ;

-- GET DETALLES DE ORDEN COMPRA 
DELIMITER //
CREATE PROCEDURE spu_getDetalleOc(IN ordenC VARCHAR(5))
BEGIN 
	SELECT idordencompra,num_ordenC, total_costos, subtotal, estado, 
			PRO.razon_social	
    FROM ORDEN_COMPRAS OC
    INNER JOIN PROVEEDORES PRO ON OC.idprovedor = PRO.idprovedor;
END //
DELIMITER ;

select * 
from DETALLE_ORDENC
WHERE idordencompra = 2;