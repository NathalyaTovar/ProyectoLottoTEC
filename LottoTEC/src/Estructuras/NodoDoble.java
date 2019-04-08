package Estructuras;

public class NodoDoble<X> {
    //Atributos
    public X elemento;
    public NodoDoble <X> nextNodo;
    public NodoDoble <X> prevNodo;
    //Constructores
    public NodoDoble(X elemento){
        this.elemento= elemento;
        this.nextNodo=null;
        this.prevNodo=null;
    }
    public NodoDoble(){
        this.elemento=null;
        this.elemento=null;
        this.prevNodo=null;
    }
    public NodoDoble(X elemento,NodoDoble previous, NodoDoble nextNodo){
        this.elemento=elemento;
        this.nextNodo=nextNodo;
        this.prevNodo=previous;
        
    }
    
    public X getElement() {
        return elemento;
    }

    public NodoDoble<X> getNextNodo() {
        return nextNodo;
    }

    public NodoDoble<X> getPrevNodo() {
        return prevNodo;
    }

    public void setElement(X elemento) {
        this.elemento = elemento;
    }

    public void setNextNodo(NodoDoble<X> nextNodo) {
        this.nextNodo = nextNodo;
    }

    public void setPrevNodo(NodoDoble<X> prevNodo) {
        this.prevNodo = prevNodo;
    }
    
    
    @Override
    public String toString() {
        return "Nodo>>> {" + "element= " + elemento +"}";
    }
    
}
