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