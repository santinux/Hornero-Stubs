package homero.java;
public class Resolucion {
        // Colocar aquí el token del torneo
        public String tokenTorneo = "$2b$04$4CFXt2M8SMW4c7mRehqiYeA7";
        
        // Colocar aquí el número de problema
        public String numeroProblema = "1";

        // Desarrolle aquí su resolución al problema, los parámetros son de
        // tipo String y la respuesta debe ser de tipo String
        public String miResolucion(String parametro1, String parametro2)
        {
                // Ejemplo: solución al problema de la suma de dos números.
                // En este caso, es necesario primero convertir String a int,
                // realizar la suma y luego devolver un String

                int suma = Integer.parseInt(parametro1) + Integer.parseInt(parametro2);

                String respuesta = String.valueOf(suma);
                
                return (respuesta);
        }
}
