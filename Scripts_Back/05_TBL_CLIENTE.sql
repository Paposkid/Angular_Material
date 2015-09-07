
CREATE TABLE TBL_CLIENTE
(
  CODIGO 		  		INTEGER  PRIMARY KEY DEFAULT NEXTVAL('SEQ_TBL_CLIENTE'),
  TIPO_DCTO 				CHARACTER VARYING(2),
  NRO_DCTO 				CHARACTER VARYING(12),
  NOMBRE      				CHARACTER VARYING(30),
  APELLIDO 				CHARACTER VARYING(30),
  DIRECCION 				CHARACTER VARYING(50),
  TELEFONO 				CHARACTER VARYING(30),
  CELULAR 		   		CHARACTER VARYING(30),
  EMAIL 			  	CHARACTER VARYING(50)
 );

 ALTER TABLE TBL_CLIENTE ADD CONSTRAINT UK_TBL_CLIENTE UNIQUE(TIPO_DCTO, NRO_DCTO);
