package tiquete;
import Sorteo.Enum;
public class Tiquete {
    //Atributos 
    private String nombreEmisor;
    private String nombreCliente;
    private Enum tipoSorteo;
    private int numeroCombinacion;
    public double precioTiquete;
    private int tipoTiquete;
    //Constructor
    public Tiquete(String nombreEmisor, String nombreCliente, int tipoTiquete, int numeroCombinacion, double precioTiquete) {
        this.nombreEmisor = nombreEmisor;
        this.nombreCliente = nombreCliente;
        SetEnum(tipoTiquete);
        this.numeroCombinacion = numeroCombinacion;
        this.precioTiquete = precioTiquete;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Tiquete{" + "nombreEmisor=" + nombreEmisor + ", nombreCliente=" + nombreCliente + 
                ", tipoTiquete=" + tipoSorteo + ", numeroCombinacion=" + numeroCombinacion + ", precoTiquete=" + precioTiquete + '}';
    }
    public String getNombreEmisor() {
        return nombreEmisor;
    }
    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getipoTiquete(){
    return tipoTiquete;
    }
    public int getNumeroCombinacion() {
        return numeroCombinacion;
    }
    public void setNumeroCombinacion(int numeroCombinacion) {
        this.numeroCombinacion = numeroCombinacion;
    }
    public double getPrecioTiquete() {
        return precioTiquete;
    }
    public void setPrecioTiquete(double precioTiquete) {
        this.precioTiquete = precioTiquete;
    }
    private void SetEnum(int var1) {
        if (var1==0){
        this.tipoSorteo=Enum.LOTERIA;
        }
        else if (var1==1){
        this.tipoSorteo=Enum.LOTTO;   
        }
        else if(var1==2){
         this.tipoSorteo=Enum.BINGO;    
        }
        else if (var1==3){
         this.tipoSorteo=Enum.TIEMPOS;
        }
    }
}
