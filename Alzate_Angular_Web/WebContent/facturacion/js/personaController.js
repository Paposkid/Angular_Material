// Se registra un controlador con la variable conttollers que se creo en el archivo "app.js"
controllers.controller("PersonaController", ['$scope', 'PersonaFactory', 'MensajesFactory', personaController]);

function personaController($scope, PersonaFactory, MensajesFactory) {

	// Se usa una promesa para esperar la respuesta del servidor.
	/* then, es una funcion qeu recibe como paramtros 2 funciones */
	PersonaFactory.listarTodos().$promise.then (

		// entra por aca, si todo esta OK
		function(responseData) {
			$scope.listaPersonas = responseData;
		}, 
		// entra por aca, si ocurrió algun error
		function(err) {

				
				MensajesFactory.error("OCURRIO UN ERROR Listando");

		});


	// se crea una funcion para seleccionar los registros
	$scope.seleccionarRegistro = function (rowPersona) {

		/* se valida si el objeto que se selecciono es el mismo, que ya estaba seleccionado,
		 en caso de ser asi, limpielo, en caso contrario, coloque el objeto  */
		if (rowPersona === $scope.persona) {
				
				$scope.persona = {};

		} else {

				$scope.persona = rowPersona;
		}
	}


	// se crea una funcion para guardar una persona
	$scope.guardarPersona = function () {

		// Se usa una promesa para esperar la respuesta del servidor.
		/* then, es una funcion qeu recibe como paramtros 2 funciones */
		PersonaFactory.guardar($scope.persona).$promise.then (

			// entra por aca, si todo esta OK
			function(responseData) {

				if(!$scope.persona.cdPersona) {

					$scope.listaPersonas.unshift(responseData);
				}

				MensajesFactory.info("Registro ingresado Correctamente");

			}, 
			// entra por aca, si ocurrió algun error
			function(err) {

					MensajesFactory.error("OCURRIO UN ERROR Guardando");

			});
	}


}