// Se registra un controlador con la variable conttollers que se creo en el archivo "app.js"
controllers.controller("CiudadController", ['$scope', 'CiudadFactory', 'MensajesFactory', ciudadController]);

function ciudadController($scope, CiudadFactory, MensajesFactory) {

	// Se usa una promesa para esperar la respuesta del servidor.
	/* then, es una funcion qeu recibe como paramtros 2 funciones */
	CiudadFactory.listarCiudades().$promise.then (

		// entra por aca, si todo esta OK
		function(responseData) {
			$scope.listaCiudades = responseData;
		}, 
		// entra por aca, si ocurrió algun error
		function(err) {

				
				MensajesFactory.error("OCURRIO UN ERROR Listando las Ciudades");

		});


	// se crea una funcion para seleccionar los registros
	$scope.editarCiudad = function (rowCiudad) {

		/* se valida si el objeto que se selecciono es el mismo, que ya estaba seleccionado,
		 en caso de ser asi, limpielo, en caso contrario, coloque el objeto  */
		if (rowCiudad === $scope.ciudad) {
				
				$scope.ciudad = {};

		} else {

				$scope.ciudad = rowCiudad;
		}
	}


	// se crea una funcion para guardar una ciudad
	$scope.guardarCiudad = function () {

		// Se usa una promesa para esperar la respuesta del servidor.
		/* then, es una funcion qeu recibe como paramtros 2 funciones */
		CiudadFactory.guardar($scope.ciudad).$promise.then (

			// entra por aca, si todo esta OK
			function(responseData) {

				if(!$scope.ciudad.codigo) {

					$scope.listaCiudades.unshift(responseData);
					MensajesFactory.info("Registro ingresado Correctamente");
				
				} else {
					MensajesFactory.info("Registro Modificado Correctamente");
				}
			}, 
			// entra por aca, si ocurrió algun error
			function(err) {

					MensajesFactory.error("OCURRIO UN ERROR Guardando la Ciudad");

			});
	}


}