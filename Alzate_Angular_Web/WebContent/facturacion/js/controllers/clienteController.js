// Se registra un controlador con la variable conttollers que se creo en el archivo "app.js"
controllers.controller("ClienteController", ['$scope', 'ClienteFactory', 'MensajesFactory','$mdDialog', clienteController]);

function clienteController($scope, ClienteFactory, MensajesFactory, $mdDialog) {


	$scope.limpiar = function() {


		$scope.cliente = {};

	}


	//$scope.buscarCliente = function() {


		ClienteFactory.listarClientes().$promise.then (

		function(responseData) {
				$scope.listaClientes = responseData;
			}, 

			function(err) {
					
					MensajesFactory.error("OCURRIO UN ERROR Listando las Clientees");
			});
	//}


	$scope.editarCliente = function(rowCliente) {

		ClienteFactory.listarById(rowCliente.codigo).$promise.then (

			function(responseData) {
				$scope.cliente = responseData;
			}, 

			function(err) {
					
					MensajesFactory.error("OCURRIO un Error Recuperando el Cliente");
			});

	}


	$scope.guardarCliente = function () {

		ClienteFactory.guardar($scope.cliente).$promise.then (

			function(responseData) {

				if(!$scope.cliente.codigo) {

					$scope.listaClientes.unshift(responseData);
					MensajesFactory.info("Registro ingresado Correctamente");
				
				} else {
					MensajesFactory.info("Registro Modificado Correctamente");
				}

				$scope.cliente = {};

			}, 

			function(err) {

					MensajesFactory.error("OCURRIO UN ERROR Guardando la Cliente");

			});
	}



	$scope.borrarCliente = function (ev, pObjCliente) {

		var confirm = $mdDialog.confirm(ev)
			.title('Confirmar Eliminación')
			.content('Está Seguro de Eliminar el Registro?')
			.clickOutsideToClose(false)
			.ok('Aceptar')
			.cancel('Cancelar')
			.targetEvent(ev);

	    $mdDialog.show(confirm).then(function() {
	      
	      // Aceptar
			ClienteFactory.eliminar(pObjCliente).$promise.then (

				function(responseData) {

					MensajesFactory.info("Registro eliminado Correctamente");

				}, 

				function(err) {

					MensajesFactory.error("OCURRIO UN ERROR Eliminando el registro");
				});

	      
	    }, function() {
	      
	      alert("Cancelado");
	    });
	}
}