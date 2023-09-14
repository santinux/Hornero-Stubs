<?php
class Resolucion
{
        // Colocar aquí el token del torneo
        public $tokenTorneo = '$2b$04$4CFXt2M8SMW4c7mRehqiYeA7';
        
        // Colocar aquí el número de problema
        public $numeroProblema = '1';

        // Desarrolle aquí su resolución al problema
        // `$parametrosProblema` es un array de tipo string.
        // `$miRespuesta` debe ser de tipo string.
        public function miResolucion($parametrosProblema)
        {
                // Obtenemos los parámetros necesarios para el problema
                $numero1 = $parametrosProblema[0];
                $numero2 = $parametrosProblema[1];

                // Ejemplo: solución al problema de la suma de dos números
                $suma = $numero1 + $numero2;
                
                // Asignamos lo computado y devolvemos la respuesta
                $miRespuesta = $suma;
                return ($miRespuesta);
        }
}
?>
