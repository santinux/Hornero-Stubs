<?php
class Hornero {
        public $token;
        public $problema;
        public $tokenSolicitud;
        public $host = 'hornero.fi.uncoma.edu.ar'; // Pide los parámetros al servidor
        //public $host = 'localhost/yii/hornero'; // Para test local
        public function __construct($problema,$token) {
                $this->problema = $problema;
                $this->token=$token;
        }
        public function solicitud() {
                $urlsolicitud = "http://" . $this->host
                        . "/api/jugar/solicitud?token=" . $this->token
                        . "&problema=" . $this->problema;
                echo("\n================================\n");
                echo("URL Solicitud:\n" . $urlsolicitud);
                $handle = fopen($urlsolicitud, 'r');
                $json = fgets($handle);
                $solicitud = json_decode($json);
                //echo '<pre>';  print_r($solicitud);
                echo("\n================================\n");
                foreach ($solicitud as $clave => $valor) {
                        echo("- " . $clave . ": " . $valor . "\n");
                }
                $this->tokenSolicitud = $solicitud->token;
                $parametros = explode(',', $solicitud->parametrosEntrada);
                return ($parametros);
        }
        public function respuesta($respuesta) {
                $urlrespuesta = "http://" . $this->host
                        . "/api/jugar/respuesta?tokenSolicitud=" . $this->tokenSolicitud
                        . "&solucion=$respuesta";
                echo("\n================================\n");
                echo("URL Respuesta:\n" . $urlrespuesta);
                $handle = fopen($urlrespuesta, 'r');
                $json = fgets($handle);
                $respuesta = json_decode($json);
                return ($respuesta);
        }
}
?>
