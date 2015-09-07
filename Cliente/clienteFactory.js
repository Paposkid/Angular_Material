// Se registra un factory con la variable factories que se creo en el archivo "app.js"
factories.factory("ClienteFactory", ['$resource', 'CONSTANTES_GLOBALES', clienteFactory]);

function clienteFactory($resource, CONSTANTES_GLOBALES) {

	return $resource (
						CONSTANTES_GLOBALES.HOST_REST + CONSTANTES_GLOBALES.REST_CLIENTE + ':action',
						{},
						{
							listarClientes: {
										method: 'POST',
										isArray: true, 
										params: {
													action: 'findAll' 

												}
							},
							
							listarById: {
									method: 'POST',
									params: {
												action: 'find' 
											}
							},

							listarByName: {
									method: 'POST',
									params: {
												action: 'findByName' 
											}
							},


							guardar: {
									method: 'POST',
									params: {
												action: 'save' 
											}
							},

							eliminar: {
									method: 'POST',
									params: {
												action: 'delete' 
											}
							}

						}
					);
}