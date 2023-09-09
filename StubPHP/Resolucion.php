<?php
class Resolucion
{
        // Colocar aquí el token del torneo
        public $tokenTorneo = '$2b$04$4CFXt2M8SMW4c7mRehqiYeA7';
        
        // Colocar aquí el número de problema
        public $numeroProblema = '1';

        // Desarrolle aquí su resolución al problema
        public function miResolucion(string $parametro1, string $parametro2)
        {
                // Ejemplo: solución al problema de la suma de dos números
                $respuesta = $parametro1 + $parametro2;
                return ($respuesta);
        }
}
?>
