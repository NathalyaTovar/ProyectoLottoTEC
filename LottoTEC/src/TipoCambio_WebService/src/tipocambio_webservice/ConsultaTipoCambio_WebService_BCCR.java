
package tipocambio_webservice;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//Clase que extrae la información del banco central para obtener el tipo de cambio en tiempo real 
public class ConsultaTipoCambio_WebService_BCCR {
	
	private String dir = "https://gee.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx";
	private String nombre = "Nathalya"; // Nombre de quien consulta
	private String subNiveles = "S";
	
	// Realiza la consulta al servicio del Banco Central de Costa Rica por codigo del indicador económico y dos fechas
	public String consultar(int codigo, String fechaInicio, String fechaFinal) {
		String consulta = generarConsulta(codigo, fechaInicio, fechaFinal);
		String respuesta = "";
		try {
			// Abrir y configurar conexion con el servicio
			URL url = new URL(dir);
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("POST");
			conexion.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
			conexion.setDoOutput(true);
			
			// Consulta
			DataOutputStream streamDatos = new DataOutputStream(conexion.getOutputStream());
			streamDatos.writeBytes(consulta);
			streamDatos.flush();
			streamDatos.close();
			
			// Chequear estatus
			/*
			String responseStatus = conexion.getResponseMessage();
			System.out.println(responseStatus);
			*/
			
			// Lectura de la respuesta
			BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String inputLine;
			while ((inputLine = reader.readLine()) != null) {
				respuesta += inputLine + "\n";
			}
			reader.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			respuesta = "Error: \n" + e;
		}
		
		return respuesta;
	}

	// Genera un string con la consulta en xml tomando los datos de codigo de marcardor y dos fechas
	public String generarConsulta(int codigo,  String fechaInicio, String fechaFinal) {
		String consulta = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">"
				+ "<soap12:Body>"
				+ "<ObtenerIndicadoresEconomicosXML xmlns=\"http://ws.sdde.bccr.fi.cr\">"
				+ "<tcIndicador>" + codigo + "</tcIndicador>"
				+ "<tcFechaInicio>" + fechaInicio + "</tcFechaInicio>"
				+ "<tcFechaFinal>" + fechaFinal + "</tcFechaFinal>"
				+ "<tcNombre>" + nombre + "</tcNombre>"
				+ "<tnSubNiveles>" + subNiveles + "</tnSubNiveles>"
				+ "</ObtenerIndicadoresEconomicosXML>"
				+ "</soap12:Body>"
				+ "</soap12:Envelope>";
		return consulta;
	}
}

