
// Se registra un controlador con la variable conttollers que se creo en el archivo "app.js"
controllers.controller("MenuIzquierdaController", ['$mdSidenav', '$mdUtil', menuIzquierdaController]);

function menuIzquierdaController($mdSidenav, $mdUtil) {


	this.toggle = function toggle() {

		//$mdSidenav("menuLeftId").toggle();
 		var debounceFn =  $mdUtil.debounce(function(){
            $mdSidenav("menuLeftId")
              .toggle()
              .then(function () {
                
              });
          },300);
      return debounceFn;

	}
}