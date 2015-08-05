var facturacionApp = angular.module('facturacionApp', ['ngMaterial']);


/* Se reemplazo la funcion de esta forma 

	facturacionApp.config([function () {
		
	}])

para que quede asi:

*/

//  para la configuracion de Angular Material se usa $mdThemingProvider
facturacionApp.config(["$mdThemingProvider", config]);

function config($mdThemingProvider) {

	// Se configura el tema para angular material, color primario azul, secundario, Naranja
	$mdThemingProvider.theme('default').primaryPalette('blue').accentPalette('orange');

}


