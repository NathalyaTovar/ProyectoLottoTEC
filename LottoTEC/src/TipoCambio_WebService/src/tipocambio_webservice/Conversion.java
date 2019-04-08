package tipocambio_webservice;


public class Conversion {
    //Se instancia la calse "ConsultaTipoCambio_WebService_BCCR" para poder accider a sus metodos
    ConsultaTipoCambio_WebService_BCCR resultados = new ConsultaTipoCambio_WebService_BCCR();
    
    //Método que extrae solamente el precio del dolar 
    public String sacarTipoCambio() {
        //Variable donde se guardara el monto 
        String cambioDolar = ""; 
        
        //Varieble de la que se extraera el monto 
        String x = resultados.consultar(318, "08/04/2019", "08/04/2019");
        
        //Guarda desde la posición 568 y la 580 del string anteriormente obtenido. En estas posiciones es donde se encuentra el monto que se necesita
        cambioDolar += x.substring(568, 580);
        
        //Retorna el monto que se guardo en la variable de tipo String
        return cambioDolar;

    }

    //Método que hara la conversión de colones a dolares 
    public double hacerConversion(double colones) {
        //Variable que guardara la conversion
        double conversion = 0;
        //Variable que guarda el monto de tipo string obtenido en el metodo anterior
        String dolarString = sacarTipoCambio();
        //Convierte el monto de tipo string en uno tipo double para poder hacer la conversion de colones a dolares 
        double dolarDouble = Double.parseDouble(dolarString);
        
        //Hace la operación para obtener la conversion 
        conversion+=colones/dolarDouble;
        
        //Retorna el precio en dolares 
        return conversion;
    }
}
