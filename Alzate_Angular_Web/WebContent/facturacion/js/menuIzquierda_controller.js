

// Se registra un controlador con la variable conttollers que se creo en el archivo "app.js"

controllers.controller("MenuIzquierdaController", ['$scope', '$mdSidenav', '$mdUtil', menuIzquierdaController]);

function menuIzquierdaController($scope, $mdSidenav, $mdUtil) {

$scope.toggle = buildToggler('left');

    function buildToggler(navID) {
      var debounceFn =  $mdUtil.debounce(function(){
            $mdSidenav(navID)
              .toggle()
              .then(function () {
                
              });
          },300);
      return debounceFn;
    }	
}
