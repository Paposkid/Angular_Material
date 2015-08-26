// Se registra un factory con la variable factories que se creo en el archivo "app.js"
factories.factory("PersonaFactory", ['$resource', 'CONSTANTES_GLOBALES', personaFactory]);

function personaFactory($resource, CONSTANTES_GLOBALES) {

	return $resource (
						// url
						CONSTANTES_GLOBALES.REST_PERSONAS + ':action',
						// paramDefaults, 
						{},
						// Actions
						{
							listarTodos: {
										// se manda un objeto json con la configuracion
										method: 'POST',
										isArray: true, // esto se coloca true, porque va a recibir un array
										params: {
													action: 'findAll' //Este es el nombre del metodo que esta en el servidor

												}
							},
							
							guardar: {
									// se manda un objeto json con la configuracion
									method: 'POST',
									params: {
												action: 'save' //Este es el nombre del metodo que esta en el servidor

											}
							}


						}
					);
	
}

// Factory para el manejo de los mensajes
// Se registra un factory con la variable factories que se creo en el archivo "app.js"
factories.factory("MensajesFactory", ['$mdDialog', mensajesFactory]);

function mensajesFactory($mdDialog) {

	var factory = {};

	factory.info = function(strMmensaje) {

		$mdDialog.show(
	      $mdDialog.alert()
	        .clickOutsideToClose(true)
	        .title('Informacion')
	        .content(strMmensaje)
	        .ariaLabel('Alert Dialog Demo')
	        .ok('Cerrar')
	        //.targetEvent(ev)
	    );
	} 


	factory.error = function(strMmensaje) {

		$mdDialog.show(
	      $mdDialog.alert()
	        .clickOutsideToClose(true)
	        .title('ERROR')
	        .content(strMmensaje)
	        .ariaLabel('Alert Dialog Demo')
	        .ok('Cerrar')
	        //.targetEvent(ev)
	    );
	} 

	return factory;

}