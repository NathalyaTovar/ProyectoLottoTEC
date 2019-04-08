package Sorteo;
import tiquete.*;

import Estructuras.*;

import java.util.Date;

public class  Sorteo {
    
    //Atributos
    private String nombreSorteo;
    private String codigoSorteo;
    private Enum tipoSorteo;
    private int emisionSorteo;
    private int var1;
    private Date Fecha;
    ListaDoble <Tiquete> tiquetes;
    //Constructor
    public Sorteo(String nombreSorteo, String codigoSorteo,int var1, int emisionSorteo, Date Fecha) {
        this.nombreSorteo = nombreSorteo;
        this.codigoSorteo = codigoSorteo;
        this.var1=var1;
        Enum(var1);
        this.emisionSorteo = emisionSorteo;
        this.Fecha=Fecha;
        tiquetes= new ListaDoble<>();//Aca se guardaran los tiquetes de cada sorteo
    }
    //Metodos TIQUETES
    public void addTiquete(Tiquete tiquete){
        this.tiquetes.append(tiquete);
    }
    public Tiquete getTiquete(int var1){
        this.tiquetes.gotopos(var1);
        return this.tiquetes.getElemento();
    }
    public ListaDoble getTiqueteLista(){
        return this.tiquetes;
    }
    //METODOS SORTEO
    public String getNombreSorteo() {
        return nombreSorteo;
    }
    public String getCodigoSorteo() {
        return codigoSorteo;
    }
    public int getTipoSorteo() {
        return var1;
    }
    public Date getDate(){
       return this.Fecha;
    }
    public int getEmisionSorteo() {
        return emisionSorteo;
    }
    public void setEnum(int var){
        Enum(var);
    }
    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }
    public void setCodigoSorteo(String codigoSorteo) {
        this.codigoSorteo = codigoSorteo;
    }
    public void setTipoSorteo(Enum tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }
    public void setEmisionSorteo(int emisionSorteo) {
        this.emisionSorteo = emisionSorteo;
    }
    public void setDate(Date Fecha){
        this.Fecha=Fecha;
    }
    @Override
    public String toString() {
        return "Sorteo{" + "nombreSorteo=" + nombreSorteo + ", codigoSorteo=" + codigoSorteo + ", tipoSorteo=" + tipoSorteo + ", emisionSorteo=" + emisionSorteo + '}';
    }
    private void Enum(int var1) {
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