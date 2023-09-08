<?php
require_once './config/Hornero.php';
/** -- PASO 1 -- **************************************************************
 * Modificar el token que le corresponde al equipo para el torneo
 * y el número de problema a trabajar
 */

$token = '$2b$04$4CFXt2M8SMW4c7mRehqiYeA7'; // <-- ¡Editar Token!
$problema = 1; // <-- ¡Editar Problema!

/** -- FIN PASO 1 -- *********************************************************/

$hornero = new Hornero($problema, $token);
$hornero->host = 'hornero.fi.uncoma.edu.ar';
$parametros = $hornero->solicitud();

/** -- PASO 2 -- **************************************************************
 * Resolver el ejercicio en el módulo/método `miResolucion()` utilizando los 
 * parámetros del array `$parametros[]`
 * y asignar la respuesta a la variable `$respuesta`
 * Por defecto los parámetros son de tipo string, por lo que si el ejercicio
 * lo requiere, se debe hacer la conversión a int, double, o dejar el string
 */

//$x = $parametros[0]; // Tipo string
//$y = $parametros[1]; // Tipo string
$x = (int)$parametros[0]; // Tipo int
$y = (int)$parametros[1]; // Tipo int

function miResolucion(int $numero1, int $numero2)
{
        $suma = $numero1 + $numero2;
        return ($suma);
}

$respuesta = miResolucion($x, $y);

/** -- FIN PASO 2 -- *********************************************************/
/******************************************************************************
 * Se envía la respuesta al servidor hornero NO TOCAR!!!!
 *****************************************************************************/
$respuesta = $hornero->respuesta($respuesta);
//print_r($respuesta);
echo("\n================================\n");
foreach ($respuesta as $clave => $valor) {
        echo("- " . $clave . ": " . $valor . "\n");
}
echo("\n================================\n");
?>
