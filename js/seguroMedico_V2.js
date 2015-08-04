
var app = angular.module("app", ['ngRoute']);
 

 /* se hace uso del "$rootScope" que es una variable global, para almacenar la url de la imagen del logo
    y esta pueda ser utilizada por todos los controllers */
app.value("urlLogo","http://www.cursoangularjs.es/lib/exe/fetch.php?cache=&media=unidades:04_masdirectivas:medical14.png");
app.run(["$rootScope","urlLogo",function($rootScope,urlLogo) {
    $rootScope.urlLogo=urlLogo;
}]);


 // Al constructor de la clase le pasamos el servicio $http y la URL Base desde la que pedir los datos.}
 // Ahora la función tiene un nuevo parámetro con el servicio $q.
function RemoteResource($http,$q, baseUrl) {

  //Es el único método público llamado "get" y como ya hemos dicho acepta dos funciones como parámetros.
  this.get=function(idSeguro) {
  //  Creamos el objeto defered
    var defered = $q.defer();
    // Creamos la promesa que retornará la función
    var promise = defered.promise;

    $http({
            method: 'GET', 
            //La URL que se usará se calcula en función del parámetro baseUrl.
              url: baseUrl + 'datos' + idSeguro + '.json'
    }).success(function(data, status, headers, config) {
    /* Ya no llamamos a la función de callback de OK sino que resolvemos la promesa. */
      defered.resolve(data);
    }).error(function(data, status, headers, config) {
      /* Ya no llamamos a la función de callback de error sino que rechazamos la promesa. 
         Como sólo se permite un único parámetro solamente pasamos el status ya que era lo único que se usaba. */
        defered.reject(status);
    });

    return promise;
}



  /* se añade el método list. La única diferencia por ahora con el método get es que el fichero que obtiene 
  se llama listado_seguros. */

  this.list = function() {

      var defered=$q.defer();
      var promise=defered.promise; 

        $http({
              method: 'GET', 
              url: baseUrl+'listado_seguros.json'
        }).success(function(data, status, headers, config) {
            
            // Ya no llamamos a la función de callback de OK sino que resolvemos la promesa.
           defered.resolve(data);

        }).error(function(data, status, headers, config) {
      /* Ya no llamamos a la función de callback de error sino que rechazamos la promesa. 
         Como sólo se permite un único parámetro solamente pasamos el status ya que era lo único que se usaba. */
            defered.reject(status);

        });

         return promise;
    }

}

 
//Definimos el constructor de la clase RemoteResourceProvider
function RemoteResourceProvider() {
  var _baseUrl;
  // Un método público llamado "setBaseUrl" para configurar el servicio. Éste es el método que hemos llamado desde el bloque config.
  this.setBaseUrl=function(baseUrl) {
    _baseUrl = baseUrl;
  }
  //El método $get, que es el factory-provider con la función de factoría a la que se le inyecta el servicio de $http.
  //  Inyectamos el servicio de promesas llamado $q
  this.$get=['$http', '$q', function($http, $q) {

    /*Ahora la función de factoría crea el nuevo objeto de la clase RemoteResource, siendo esta clase realmente la que hace 
    todo el trabajo y la que se usará desde el controlador. En el constructor además de pasarle el $http que necesita, 
    también se le pasa la URL Base para configurar el servicio. */
    // Al crear el objeto le pasamos también el servicio de $q.
    return new RemoteResource($http, $q, _baseUrl);
  }];
}



 // Finalmente se registra el provider.
app.provider("remoteResource",RemoteResourceProvider);
 
 
 /* La constante tiene el valor ”../../json” porque los datos a bajar están en esa ruta. si estuvieran en la misma ruta
  ruta que nuestra página web, el valor sería "." */
app.constant("baseUrl", "../../json/");


app.config(['baseUrl', 'remoteResourceProvider',function(baseUrl, remoteResourceProvider) {
    remoteResourceProvider.setBaseUrl(baseUrl);
}]);
 



app.controller("MainController", ['$scope', function($scope) {
 

}]);


 
 /* Se añadió el parametro $log, para consumir el servicio que viene en angular para scribir en el log.
   Lo mismo ocurre con $http  */
 /* Ahora en el controlador en vez de inyectar el servicio $http se inyecta el servicio remoteResource.
app.controller("DetalleSeguroController", ['$scope', 'remoteResource',function($scope, remoteResource) { */
/* Ahora en el controlador ya no es necesario que llamemos a remoteResource.get() sino que sólo hay 
que inyectar seguro y ya tendremos los datos. */
app.controller("DetalleSeguroController", ['$scope', 'seguro',function($scope, seguro) {
    
  var formController = $scope.miFormulario;

    $scope.seguro = {
      nif: "",
      nombre: "",
      ape1: "",
      edad: undefined,
      sexo: "",
      casado: false,
      numHijos: undefined,
      embarazada: false,
      coberturas: {
        oftalmologia: false,
        dental: false,
        fecundacionInVitro: false
      },
      enfermedades: {
        corazon: false,
        estomacal: false,
        rinyones: false,
        alergia: false,
        nombreAlergia: ""
      },
    }

 /*
    // Se llama al método get del servicio remoteResource usando las promesas con las 2 funciones
    remoteResource.get().then(function(seguro) {
      // Si todo va bien , se pasan los datos a la propiedad seguro del $scope.
      $scope.seguro = seguro;
      //Es la segunda función anónima que se llama si hay algún error.
    }, function(status) {
      // Si falla algo se ejecuta el alert.
      alert("Ha fallado la petición. Estado HTTP:" + status);
    });

    */


    /* En el tag <select> vamos a usar la directiva ng-options. Lo primero es incluir 
       en el $scope la propidad sexos con los posibles valores del <select> */
  $scope.sexos= [
    {
      codSexo:"H",
      descripcion:"Hombre"
    },
    {
      codSexo:"M",
      descripcion:"Mujer"
    }
  ];

   // Ahora simplemente los guardamos en el $scope y se mostrarán en el formulario HTML.
   $scope.seguro = seguro;


  $scope.enviar=function() {
    if ($scope.miFormulario.$valid) {
      alert("Los datos aqui se habrían enviado al servidor  y estarían validados en la parte cliente");
    }else {
      alert("Hay datos inválidos");
    }
  }



 
}]); // se cierra el controller



/* Ahora en el controlador ya no es necesario que llamemos a remoteResource.list() 
sino que solamente hay que inyectar seguros y ya tendremos los datos. */
app.controller("ListadoSeguroController", ['$scope', 'seguros',  function($scope, seguros) {
     // $scope.seguros = [];
   
    $scope.seguros = seguros;

}]); // se cierra el controller


/* **********************************************************************************************
******************************************** RUTAS **********************************************
************************************************************************************************ */



/*
Ahora vamos a añadir las rutas para poder navegar a las 3 páginas:

  - main.html
  - listado.html
  - detalle.html

*/

app.config(['$routeProvider',function($routeProvider) {
  
    $routeProvider.when('/', {
      templateUrl: "main.html",
      controller: "MainController"
    }); 
    

 /* Para evitar que al aparecer la página de listado un instante después aparezca la tabla con los datos, 
    vamos a obtener los datos en el resolve de la ruta. */
    $routeProvider.when('/seguro/listado', {
      templateUrl: "listado.html",
      controller: "ListadoSeguroController",
      resolve: {
          seguros:['remoteResource',function(remoteResource) {

              return remoteResource.list();
          }]
      }
    });


   /* Para evitar que al aparecer la página de listado un instante después aparezca la tabla con los datos, 
    vamos a obtener los datos en el resolve de la ruta. */
   /*  se inyecta el servicio de $route para poder obtener el valor del parámetro idSeguro ya que lo necesitamos 
    ahora para poder obtener únicamente el seguro indicado en idSeguro.  */
    $routeProvider.when('/seguro/edit/:idSeguro', {
      templateUrl: "detalle.html",
      controller: "DetalleSeguroController",
      resolve: {
        seguro:['remoteResource','$route',function(remoteResource, $route) {
          return remoteResource.get($route.current.params.idSeguro);
        }]
      }
    });
  
}]);