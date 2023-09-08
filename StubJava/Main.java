package StubJava;
import config.Conexion;
import config.Torneo;
/**
 * Esta es la clase que debe editar con la implementacion de su problema
 * La resolución de su problema debe estar en el módulo/método:
 *      `resolucion()`
 */
public class Main {
        public Main() {
                // Constructor sin parámetros
        }
	/**
	 * Este es el módulo/método en el que tiene que resolver el problema
	 * En este caso los parámetros son 2 y la operación es la suma (OPERACION = 1)
	 */
	public static String miResolucion(String[] losparametros) {
		System.err.println("Los parametros obtenidos son: "
                                + losparametros[0] + "," + losparametros[1]);
		String miRespuesta = "";
		int solucion = Integer.parseInt(losparametros[0]) +Integer.parseInt(losparametros[1]) ;
		miRespuesta = String.valueOf(solucion);
		return (miRespuesta);	
	}
	public static void main(String[] args) {
		// Editar!: con el valor del token 
		String elTokenTorneo = "$2b$04$4CFXt2M8SMW4c7mRehqiYeA7";
		
		// Editar!: con el valor del problema
		String elNumeroProblema ="1";
		
		Torneo elTorneo = new Torneo(elTokenTorneo,elNumeroProblema);

		// Se recuperan los parametros para la implementacion
		String[] losParametros  = elTorneo.recuperarParametrosProblema();
		
		// Se invoca a la implementacion que debe realizar para el torneo
		String resultado = Main.miResolucion(losParametros);
		
		System.err.println("Resultado de la implementacion:"+ resultado);
		
		// La respuesta obtenida de su implementacion se envia al torneo
		String rta = elTorneo.recuperarRespuestaImplementacion(resultado);
		
		// Se visualizan los resultados de la solucion
		System.err.println("La respuesta del torneo es:"+ rta);
	}
}
