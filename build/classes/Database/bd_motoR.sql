CREATE DATABASE moto_repuestos;
USE moto_repuestos;

CREATE TABLE PERSONAS (
	idpersona 	INT AUTO_INCREMENT PRIMARY KEY,
	nombres 	VARCHAR(30) NOT NULL,
	apellidos 	VARCHAR(30) NOT NULL,
	dni 		CHAR(8) NOT NULL,
	fechaNac	DATE NULL,
	telefono	CHAR(9) NULL,
	create_at 	DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT uk_dni_per UNIQUE (dni)
);	


CREATE TABLE USUARIOS(
	idusuario		INT AUTO_INCREMENT PRIMARY KEY,
    idpersona		INT NOT NULL,
    username		VARCHAR(30) NOT NULL,
    clave_acceso	VARCHAR(100) NOT NULL,
    nivel_acceso	CHAR(1) NOT NULL, -- ADMNISTRADOR(A) , INVITADO(I) 
    estado 			BIT	 NOT NULL DEFAULT 1,
    create_at		DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_idp_usu FOREIGN KEY (idpersona) REFERENCES PERSONAS (idpersona),
    CONSTRAINT uk_use_usu UNIQUE (username),
    CONSTRAINT ck_niv_usu CHECK (nivel_acceso IN ('A', 'I'))
);


CREATE TABLE CLIENTES(
	idcliente 	INT AUTO_INCREMENT PRIMARY KEY,
    idpersona	INT NOT NULL,
    estado 		VARCHAR(20) NOT NULL DEFAULT 'ACTIVO',
    create_at	DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_idp_cli FOREIGN KEY (idpersona) REFERENCES PERSONAS (idpersona) 
);


CREATE TABLE CATEGORIAS(
	idcategoria 	INT AUTO_INCREMENT PRIMARY KEY,
    categoria 		VARCHAR(40) NOT NULL,
    descripcion 	VARCHAR(100) NULL,
    estado 			BIT NOT NULL DEFAULT 1,
    CONSTRAINT uk_cat_cat UNIQUE(categoria)
);	

CREATE TABLE MARCAS(
	idmarca			INT AUTO_INCREMENT PRIMARY KEY,
	marca			VARCHAR(30) NOT NULL,
    estado 			BIT NOT NULL DEFAULT 1,
    CONSTRAINT uk_mar_mar UNIQUE(marca)
);	

CREATE TABLE REPUESTOS (
	idrepuesto 	INT AUTO_INCREMENT PRIMARY KEY,
    idcategoria INT NOT NULL,
    idmarca 	INT NOT NULL,
    nombreR 	VARCHAR(40) NOT NULL,
    modelo		VARCHAR(30) NOT NULL,
    precio 		DECIMAL(5,2) NOT NULL,
    stock 		SMALLINT NOT NULL DEFAULT 0,
    unidad_med	VARCHAR(5) NOT NULL,
    garantia	VARCHAR(30) NOT NULL,
    descripcion	VARCHAR(100) NULL,
    estado 		VARCHAR(20) NOT NULL DEFAULT 'AGOTADO',
    create_at	DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_idc_rep FOREIGN KEY (idcategoria) REFERENCES CATEGORIAS (idcategoria),
	CONSTRAINT fk_idm_rep FOREIGN KEY (idmarca) REFERENCES MARCAS (idmarca),
    CONSTRAINT ck_pre_rep CHECK(precio > 0)
);
  

CREATE TABLE VENTAS (
	idventa		INT AUTO_INCREMENT PRIMARY KEY,
	idusuario	INT NOT NULL,
    idcliente	INT NOT NULL,
    comprobante VARCHAR(30) NOT NULL,
    numventa	VARCHAR(50) NOT NULL,
    create_at	DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_idu_ven FOREIGN KEY (idusuario) REFERENCES USUARIOS (idusuario),
    CONSTRAINT fk_idc_ven FOREIGN KEY (idcliente) REFERENCES CLIENTES (idcliente)
);

CREATE TABLE DETALLE_VENTAS(
	iddetalleV 		INT AUTO_INCREMENT PRIMARY KEY,
    idrepuesto		INT NOT NULL,
    idventa			INT NOT NULL,
    cantidad		TINYINT NOT NULL,
    precio_venta	DECIMAL(6,2) NOT NULL,
    CONSTRAINT fk_idr_det FOREIGN KEY (idrepuesto) REFERENCES REPUESTOS (idrepuesto),
    CONSTRAINT fk_idv_det FOREIGN KEY (idventa) REFERENCES VENTAS (idventa),
    CONSTRAINT ck_can_det CHECK (cantidad > 0) 
);


CREATE TABLE PAGOS(
	idpago		INT AUTO_INCREMENT PRIMARY KEY,
    idventa		INT NOT NULL,
    tipopago	VARCHAR(30) NOT NULL,
    monto_total		DECIMAL(6,2) NOT NULL,
    create_at	DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_idv_pag FOREIGN KEY (idventa) REFERENCES VENTAS (idventa),
    CONSTRAINT ck_mon_pag CHECK(monto_total > 0)
);

CREATE TABLE PROVEEDORES(
	idprovedor		INT AUTO_INCREMENT PRIMARY KEY,
    razon_social	VARCHAR(40) NOT NULL,
    direccion		VARCHAR(50) NULL,
    telefono 		CHAR(9) NOT NULL,
    CONSTRAINT uk_raz_pro UNIQUE(razon_social)
);

CREATE TABLE COMPRAS (
	idcompra 		INT AUTO_INCREMENT PRIMARY KEY,
    idprovedor		INT NOT NULL,
    num_factura		VARCHAR(50) NOT NULL,
    comprobante		VARCHAR(40) NOT NULL,
    create_at		DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_idp_com FOREIGN KEY (idprovedor) REFERENCES PROVEEDORES (idprovedor)
);

CREATE TABLE DETALLE_COMPRAS(
	iddetalle_compra	INT AUTO_INCREMENT PRIMARY KEY,
    idrepuesto			INT NOT NULL,
    idcompra			INT NOT NULL,
    cantidad			SMALLINT NOT NULL,
    precio_compra		DECIMAL(6,2) NOT NULL,
    CONSTRAINT fk_idr_detc FOREIGN KEY (idrepuesto) REFERENCES REPUESTOS (idrepuesto),
    CONSTRAINT fk_idc_detc FOREIGN KEY (idcompra) REFERENCES COMPRAS (idcompra),
    CONSTRAINT ck_can_detc CHECK (cantidad > 0) 
);



