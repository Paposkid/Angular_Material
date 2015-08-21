
-- INSERTS CIUDADES

INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('CHANGUINOLA');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('ALCALDEDIAZ');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('PUERTO ARMUELLES');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('LA CABIMA');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('AGUADULCE');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('LA CONCEPCION');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('PEDREGAL');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('VERACRUZ');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('CHEPO');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('ANTON');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('SABANITAS');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('PENONOME');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('PUERTO ESCONDIDO');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('EL COCO');
INSERT INTO TBL_CIUDAD(NOMBRE) VALUES ('LAS LOMAS');


-- INSERTS PERSONAS

INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('YURY MARCELA', 'GRAJALES CANO', 111111, 'cra 25 # 54 86', '5635395', '3125469875', 'yury@dominio.com', 'INC', to_timestamp('01/03/2014', 'dd/mm/yyyy'), 'CC', 'N', '', false, false, to_timestamp('02/05/2014', 'dd/mm/yyyy'), true, true, 'F', 101010, 'admin', 'admin', '2568695', 'MARCELA', 'CANO', 1, to_date('02/05/1988', 'dd/mm/yyyy'), 2);
INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('DUVAN ARTURO', 'PUERTA RESTREPO', 222222, 'cll 25 # 78-96', '7458965', '3214567895', 'duvan@dominio.com', 'PROP', to_timestamp('01/03/2014', 'dd/mm/yyyy'), 'CC', 'N', '', true, false, to_timestamp('03/05/2014', 'dd/mm/yyyy'), false, true, 'M', 202020, 'admin', 'admin', '7853695', 'ARTURO', 'RESTREPO', 2, to_date('03/09/1991', 'dd/mm/yyyy'), 6);
INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('ANGELA MARIA', 'LONDOÑO CAÑAS', 333333, 'cll 12S # 45-63', '3245168', '3152269988', 'angela@dominio.com', 'PROP', to_timestamp('02/03/2014', 'dd/mm/yyyy'), 'CC', 'N', '', true, false, to_timestamp('02/05/2015', 'dd/mm/yyyy'), false, true, 'F', 303030, 'admin', 'admin', '5255696', 'MARIA', 'CAÑAS', 6, to_date('12/12/1983', 'dd/mm/yyyy'), 5);
INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('RAUL GERMAN', 'HERRERA ROMAN', 444444, 'cra 63 # 85-96', '7459638', '3184568723', 'raul@dominio.com', 'PROP', to_timestamp('01/03/2015', 'dd/mm/yyyy'), 'CC', 'N', '', true, false, to_timestamp('03/05/2015', 'dd/mm/yyyy'), false, true, 'M', 404040, 'admin', 'admin', '9635874', 'GERMAN', 'ROMAN', 5, to_date('05/05/1992', 'dd/mm/yyyy'), 4);
INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('ANCED', 'ARISLEILA BARRAGAN', 555555, 'transv 12 # 45-63', '2365987', '3256987411', 'anced@dominio.com', 'INC', to_timestamp('02/03/2015', 'dd/mm/yyyy'), 'CC', 'N', '', false, true, to_timestamp('02/05/2016', 'dd/mm/yyyy'), true, true, 'M', 505050, 'admin', 'admin', '2521512', '', 'BARRAGAN', 4, to_date('31/01/1999', 'dd/mm/yyyy'), 3);
INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('JHEFREY', 'MOLINA RESTREPO', 666666, 'diag 45 # 32-54', '9635842', '3142017887', 'jhefrey@dominio.com', 'INC', to_timestamp('01/03/2016', 'dd/mm/yyyy'), 'CC', 'J', '9', false, true, to_timestamp('03/05/2016', 'dd/mm/yyyy'), true, true, 'M', 606060, 'admin', 'admin', '3313245', '', 'RESTREPO', 3, to_date('07/08/1998', 'dd/mm/yyyy'), 4);
INSERT INTO TBL_PERSONA(strnombres,strapellidos,nmdocumento,strdireccion,strtelefono1,strcelular,stremail,dtype,feproceso,strtipodocumento,strnaturaleza,strdigitoverificacion,propietario,tercero,femodifica,inquilino,empleado,genero,cuentacobro,usuarioingreso,usuariomodifica,teloficina,segundonombre,segundoapellido,ciudad_expedicion_dcto,fechanacimiento,ciudadnacimiento) VALUES ('PAULA ANDREA', 'ROMAN CORTES', 777777, 'cra 32 # 65-96', '1459746', '3116965432', 'paula@dominio.com', 'INC', to_timestamp('02/03/2016', 'dd/mm/yyyy'), 'CC', 'J', '9', false, false, to_timestamp('02/05/2017', 'dd/mm/yyyy'), true, true, 'F', 707070, 'admin', 'admin', '8566354', 'ANDREA', 'CORTES', 4, to_date('01/01/1996', 'dd/mm/yyyy'), 1);

