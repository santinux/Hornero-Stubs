<?php
require_once './Resolucion.php';
require_once './config/Hornero.php';

// Instanciamos la clase `Resolución`
$laResolucion = new Resolucion();

// Obtenemos el token del torneo y el número de problema
$token = $laResolucion->tokenTorneo;
$problema = $laResolucion->numeroProblema;

// Instanciamos la clase `Hornero`
$hornero = new Hornero($problema, $token);

// Recuperamos los parámetros proporcionados por el servidor
$parametros = $hornero->solicitud();

// Ejecutamos la resolución desarrollada por el jugador con los parámetros
$laRespuesta = $laResolucion->miResolucion($parametros[0], $parametros[1]);

// Enviamos la respuesta al servidor hornero
$respuesta = $hornero->respuesta($laRespuesta);

// Mostramos el resultado de la solución del problema
echo("\n================================\n");
foreach ($respuesta as $clave => $valor) {
        echo("- " . $clave . ": " . $valor . "\n");
}
echo("================================\n");
?>
