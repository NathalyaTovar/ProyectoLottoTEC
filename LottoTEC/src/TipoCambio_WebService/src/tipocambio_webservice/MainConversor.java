package tipocambio_webservice;

public class MainConversor {

    public static void main(String[] args) {
        //Se instancia la clase "Conversion" para poder acceder a sus metodos
        Conversion cantidad = new Conversion();

        //Muestra en pantalla el resultado de la conversion
        System.out.println("El precio en moneda dolar es>>> " + cantidad.hacerConversion(10000));

        //ConsultaTipoCambio_WebService_BCCR resultados = new ConsultaTipoCambio_WebService_BCCR();
        //System.out.println(">>> "+resultados.consultar(318, "08/04/2019", "08/04/2019"));
    }

}
