var facturacionApp = angular.module('facturacionApp', ['ngMaterial', 'ngRoute', 'ngResource', 'ngMessages', 'facturacion.controllers', 'facturacion.factories']);

// Se crea la variable controller, para registrar todos los controllers que se vayan a utilizar
var controllers = angular.module('facturacion.controllers', []);

// Se crea la variable factories, con la cual se utilizaran para accesos al servidor y utilidades. es Singleton
var factories = angular.module('facturacion.factories', []);

 
/* se setearan todas las constantes globales que se va a utilizar, las cuales internamente tienen un JSON,
 El nombre es: "CONSTANTES_GLOBALES" */
 facturacionApp.constant("CONSTANTES_GLOBALES", {
 	HOST_REST: "http://192.168.0.14:8089/angular-back/rest/",
 	REST_PERSONAS: "http://192.168.0.14:8089/angular-back/rest/persona/"

 });



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
	});

	// Se configura la ruta para el Home
	$routeProvider.when('/persona', {
		templateUrl: 'facturacion/partials/persona/persona.html'
	});

	// Se configura la ruta para el Home
	$routeProvider.when('/factura', {
		templateUrl: 'facturacion/partials/factura/factura.html'
	});


}

