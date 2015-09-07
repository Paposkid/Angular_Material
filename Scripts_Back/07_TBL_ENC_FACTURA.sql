
CREATE TABLE TBL_ENC_FACTURA
(
  CODIGO 		  		INTEGER  PRIMARY KEY DEFAULT NEXTVAL('SEQ_TBL_ENC_FACTURA'),
  NRO_FACTURA 			CHARACTER VARYING(60),
  FECHA_FACTURA			TIMESTAMP WITHOUT TIME ZONE,
  CODIGO_CLIENTE      	INTEGER,
  VALOR_TOTAL			NUMERIC(20,2)
 );

 ALTER TABLE TBL_ENC_FACTURA ADD CONSTRAINT FK_TBL_ENC_FACTURA FOREIGN KEY (CODIGO_CLIENTE) REFERENCES TBL_CLIENTE (CODIGO);