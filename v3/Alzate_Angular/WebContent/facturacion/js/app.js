var facturacionApp = angular.module('facturacionApp', ['ngMaterial', 'ngRoute', 'ngResource', 'facturacion.controllers', 'facturacion.factories']);

// Se crea la variable controller, para registrar todos los controllers que se vayan a utilizar
var controllers = angular.module('facturacion.controllers', []);

// Se crea la variable factories, con la cual se utilizaran para accesos al servidor y utilidades. es Singleton
var factories = angular.module('facturacion.factories', []);



/* Se reemplazo la funcion de esta forma 

	facturacionApp.config([function () {
		
	}])

para que quede asi:

*/

//  para la configuracion de Angular Material se usa $mdThemingProvider
facturacionApp.config(["$mdThemingProvider", "$routeProvider", config]);

function config($mdThemingProvider, $routeProvider) {

	// Se configura el tema para angular material, color primario azul, secundario, Naranja
	$mdThemingProvider.theme('default').primaryPalette('blue').accentPalette('orange');


	// Se configura la ruta para el Home
	$routeProvider.when('/', {
		templateUrl: 'facturacion/home.html',
		controller: 'HomeController'
	})

}

