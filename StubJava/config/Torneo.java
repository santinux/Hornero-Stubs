package config;
import org.json.JSONObject;
public class Torneo {
	private String host = "hornero2.fi.uncoma.edu.ar";
	private String tokenTorneo = "";
	private String numeroProblema = "";
	private String tokenRespuesta ="";
	private Conexion conexionHTTP =null; 
        /**
         * Constructor Torneo
         */
	public Torneo(String tokenTorneo,String numeroProblema) {
		this.tokenTorneo = tokenTorneo;
		this.numeroProblema = numeroProblema;
		this.conexionHTTP =  new Conexion();
	}
        /**
         * Recupera los parámetros del problema desde el servidor
         */
	public String[] recuperarParametrosProblema(){
                // Old:
                // String url = "http://"+this.host+"/index.php?r=juego/solicitud&token="
                // + this.tokenTorneo + "&problema=" + this.numeroProblema;
                String url = "http://" + this.host + "/api/jugar/solicitud?token="
                        + this.tokenTorneo + "&problema=" + this.numeroProblema;
                System.out.println(url);
		String[] rs = null;
		try {
			String respuesta = this.conexionHTTP.sendGet(url);
			JSONObject jsonObject = new JSONObject(respuesta);
			String parametros = jsonObject.getString("parametrosEntrada");
			this.tokenRespuesta=jsonObject.getString("token");
			// System.out.println("Primer parámetro: "
                        // + losParametros.toString().split(",")[0]
                        // + "\nSegundo parámetro: "
                        // + losParametros.toString().split(",")[1]);
			rs = parametros.split(",");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return rs;
	}
        /**
         * Recupera la implementación -resolucion- desde el host
         */
	public String recuperarRespuestaImplementacion(String laSolucion){
                // Old:
                // String url = "http://" + this.host
                // + "/index.php?r=juego/respuesta&&tokenSolicitud="
                // + this.tokenRespuesta + "&solucion=" + laSolucion;
		String url = "http://" + this.host
                        + "/api/jugar/respuesta?tokenSolicitud="
                        + this.tokenRespuesta + "&solucion=" + laSolucion;
		String respuesta = "";
		String mensajeRta = "";
		try {
			System.out.println(url);
			respuesta = this.conexionHTTP.sendGet(url);
			System.out.println(respuesta);
			JSONObject jsonObject = new JSONObject(respuesta);

			mensajeRta = jsonObject.getString("estado");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (mensajeRta);
	}
}
