package Gestiones;

import Sorteo.*;
import Estructuras.*;
import java.util.Date;
import tiquete.Tiquete;

public class GestionPrincipal {
    private ListaDoble <Sorteo> sorteos = new ListaDoble<>();
    private ListaDoble <Usuario> usuarios= new ListaDoble<>();
    private static final GestionPrincipal instance;
    
    public static GestionPrincipal getInstance(){
    return instance;
    }
    
    ////////////////METODOS DE GESTION DE SORTEOS ////////////////////////////
    public void crearSorteo(Sorteo sorteo){    
        sorteos.append(sorteo);
    }
    public void modificarSorteo(int pos, String Nombre, String Codigo, int enumE, int emisiones, Date fecha){
        sorteos.gotopos(pos);//Se dirige a la posicion que se quiere modificar
        Sorteo aux=sorteos.getElemento();//Obtiene el objeto de sorteos
        aux.setCodigoSorteo(Codigo);//Modifica todos los parametros
        aux.setEmisionSorteo(emisiones);
        aux.setNombreSorteo(Nombre);
        aux.setEnum(enumE);
        aux.setDate(fecha);
        NodoDoble var= new NodoDoble(aux, sorteos.current.getPrevNodo(), sorteos.current.getNextNodo());//Crea un nuevo nodo que reemplaza al original
    }
    public void eliminarSorteo(int var){
        sorteos.gotopos(var);
        sorteos.remove();
    }
    public void eliminarSorteo2(String Nombre){
        sorteos.gotostart();
        while (sorteos.next()!=false){
            if (sorteos.getElemento().getNombreSorteo()==Nombre){
            sorteos.remove();
            break;
            }
            sorteos.next();
        }
    }
    public void Consultar(){}
    ////////////////////METODOS DE GESTION DE TIQUETES///////////////
    public void crearTiquete(int var,Tiquete tiquete){
    sorteos.gotopos(var);
    Sorteo aux=sorteos.getElemento();
    aux.addTiquete(tiquete);
    //NodoDoble var= new NodoDoble(aux, sorteos.current.getPrevNodo(), sorteos.current.getNextNodo());//Crea un nuevo nodo que reemplaza al original
    }
    public void eliminarTiquete(int var, int var2){
        this.sorteos.gotopos(var);
        ListaDoble r;
        r = this.sorteos.getElemento().getTiqueteLista();
        r.gotopos(var2);
        r.remove();
    }
    public void modificarTiquete(){
    }
    public void consultarTiquete(){
    }
    public ListaDoble getTiquetes(){
    return this.sorteos.getElemento().getTiqueteLista();
    }
    /////////////////METODOS DE USUARIOS//////////////////
    public void registrarUsuario(Usuario usuario){
        usuarios.append(usuario);
    }
    public void eliminarUsuario(int var){
    usuarios.gotopos(var);
    usuarios.remove();
    }
    public ListaDoble returnUsuarios(){
    return usuarios;
    }
    @Override
    public String toString() {
        return "GestionSorteo{" + "sorteos=" + sorteos + '}';
    }
    public ListaDoble devolver() {
        return sorteos;
    }
    static{
        instance= new GestionPrincipal();
        //long var= Date.parse("19/3/2017");
        Date var=new Date();
        var.setDate(12);
        var.setMonth(2-1);
        var.setYear(13+100);
        
        Date var2=new Date();
        var2.setDate(22);
        var2.setMonth(9-1);
        
        Date var3=new Date();
        var3.setDate(27);
        var3.setMonth(11-1);
       // var.setYear(19);
        instance.crearSorteo(new Sorteo("Dia de las Madres","89", 0, 6, var));
        instance.crearSorteo(new Sorteo("Gordo Navideno","78", 3, 7, var2));
        instance.crearSorteo(new Sorteo("Dia del Arbol","65", 2, 9, var3));
        instance.crearTiquete(0, new Tiquete("Hola", "adios", 4,4,4));
        instance.crearTiquete(1, new Tiquete("Cristofer", ">v", 4,4,4));
        instance.registrarUsuario(new Usuario(117540853,new Date(5/5/19), "Cristofer","Puntarenas",87275463,"cris.gomez22@hotmail.com"));
    }
public static void main(String args[]) {  ////UTILIZAR SI SE QUIRE PROBAR LOS METODOS
GestionPrincipal t=new GestionPrincipal();

Sorteo o= new Sorteo("3","3", 0,3, new Date(27/8/19));
//Sorteo o2= new Sorteo("32","3", 0,3);
//Sorteo o3= new Sorteo("37","3", 0,3);

t.crearSorteo(o);
//t.crearSorteo(o2);
//t.crearSorteo(o3);
//t.eliminarSorteo(0);

t.modificarSorteo(0, "Hola", "452s", 1, 12, new Date(11/1/19));
ListaDoble r=t.devolver();
r.gotopos(0);
Sorteo p=(Sorteo) r.getElemento();

System.out.println(p.getTipoSorteo());
}
}
