
var appPrueba = angular.module('appPrueba', ['ngMaterial']);


appPrueba.config(["$mdThemingProvider", config]);

function config($mdThemingProvider) {

  // Se configura el tema para angular material, color primario azul, secundario, Naranja
    $mdThemingProvider.theme('docs-dark', 'default').primaryPalette('blue').accentPalette('orange');

  //$mdThemingProvider.theme('docs-dark', 'default').primaryPalette('blue').accentPalette('orange');
 // $mdThemingProvider.theme('docs-dark', 'default').primaryPalette('yellow').dark();

}


appPrueba.controller("PruebaController", ['$scope', '$mdDialog', pruebaController]);

function pruebaController($scope, $mdDialog) {

   $scope.user = {
        title: 'Developer',
        email: 'ipsum@lorem.com',
        firstName: '',
        lastName: '' ,
        company: 'Google' ,
        address: '1600 Amphitheatre Pkwy' ,
        city: 'Mountain View' ,
        state: 'CA' ,
        biography: 'Loves kittens, snowboarding, and can type at 130 WPM.\n\nAnd rumor has it she bouldered up Castle Craig!',
        postalCode : '94043'
    };


    // Seccion botones
  $scope.title1 = 'Button';
  $scope.title4 = 'Warn';
  $scope.isDisabled = true;
  $scope.googleUrl = 'http://google.com';


    // Seccion Dialogoe Show Dialog

  $scope.alert = '';
  $scope.showAlert = function(ev) {
    // Appending dialog to document.body to cover sidenav in docs app
    // Modal dialogs should fully cover application
    // to prevent interaction outside of dialog
    $mdDialog.show(
      $mdDialog.alert()
        .parent(angular.element(document.body))
        .title('Titulo del cuadro de dialogo')
        .content('Descripcion Adicional')
        .ariaLabel('Alert Dialog Demo')
        .ok('Confirmar')
        .targetEvent(ev)
    );
  };


  $scope.showConfirm = function(ev) {
    // Appending dialog to document.body to cover sidenav in docs app
    var confirm = $mdDialog.confirm()
      .parent(angular.element(document.body))
      .title('Esta seguro de eliminar el registro ?')
      .content('Texto Adicional en caso de Ser Necesario')
      .ariaLabel('Lucky day')
      .ok('Aceptar')
      .cancel('Cancelar')
      .targetEvent(ev);

    $mdDialog.show(confirm).then(function() {
      $scope.alert = 'Seleccionaste la opcion Aceptar';
    }, function() {
      $scope.alert = 'Seleccionaste la opcion Cancelar';
    });

  };



} // Se cierra el controller
