package homero.java;
public class Resolucion {
        // Colocar aquí el token del torneo
        public String tokenTorneo = "$2b$04$4CFXt2M8SMW4c7mRehqiYeA7";
        
        // Colocar aquí el número de problema
        public String numeroProblema = "1";

        // Desarrolle aquí su resolución al problema
        // `parametrosProblema` es un array de tipo String.
        // `miRespuesta` debe ser de tipo String.
        public String miResolucion(String[] parametrosProblema)
        {
                // Obtenemos los parámetros necesarios para el problema
                int numero1 = Integer.parseInt(parametrosProblema[0]);
                int numero2 = Integer.parseInt(parametrosProblema[1]);

                // Ejemplo: solución al problema de la suma de dos números.
                // En este caso, arriba convertimos String a int, ahora
                // computamos la suma y luego devolvemos un String
                int suma = numero1 + numero2;

                // Convertimos la suma a String y devolvemos la respuesta
                String miRespuesta = String.valueOf(suma);
                return (miRespuesta);
        }
}
