package Estructuras;

public class NodoSimple {
    //Atributos
    private Object element;
    private NodoSimple next;

    //Constructores
    public NodoSimple() {
        this.element = null;
        this.next = null;
    }

    public NodoSimple(Object element) {
        this.element = element;
        this.next = null;
    }

    public NodoSimple(Object element, NodoSimple next) {
        this.element = element;
        this.next = next;
    }
    
    //Métodos
    public Object getElement() {
        return this.element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public NodoSimple getNext() {
        return this.next;
    }

    public void setNext(NodoSimple next) {
        this.next = next;
    }
}
