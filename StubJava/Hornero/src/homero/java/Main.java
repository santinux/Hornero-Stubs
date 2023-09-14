package homero.java;
public class Main {
        public Main() {
                // Constructor sin parámetros
        }
	public static void main(String[] args) {
		// Instanciamos la clase `Resolucion`
                Resolucion laResolucion = new Resolucion();

                // Obtenemos el token del torneo y el número de problem
                String token = laResolucion.tokenTorneo;
                String problema = laResolucion.numeroProblema;
                                
                // Instanciamos la clase `Torneo`
                Torneo elTorneo = new Torneo(token,problema);

                // Recuperamos los parámetros proporcionados por el servidor
                String[] parametros  = elTorneo.recuperarParametrosProblema();
                                
                // Se invoca a la resolución que debe realizar para el torneo
                String respuesta = laResolucion.miResolucion(parametros);
                                
                // Mostramos al jugador el resultado devuelto por su algoritmo
                System.out.println("Resultado de su resolución: " + respuesta);
                                
                // La respuesta obtenida de su implementacion se envia al torneo
                String rta = elTorneo.recuperarRespuestaImplementacion(respuesta);
                                
                // Se visualizan los resultados de la solucion
                System.err.println("La respuesta del torneo es: "+ rta);
        }
}
