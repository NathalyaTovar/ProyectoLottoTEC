package Estructuras;
public class ListaDoble<Q> {
    public NodoDoble head, tail, current ;//Punteros de inicio y fin
    public int pos, size;
    public ListaDoble(){
        this.head=new NodoDoble();
        this.current=this.head;
        this.tail=this.head;
        this.size=0;
        this.pos=-1;
    }
    public ListaDoble(ListaDoble L){
        this.head=new NodoDoble();
        this.current= L.head;
        this.tail=L.tail;
        this.size=L.size;
        this.pos=-1;
    }
    //
    
    //METODOS//
    //Para insertar elemento en cualquier lado
    public void insert(Q elemento){
    NodoDoble newNodo=new NodoDoble(elemento,this.current, this.current.getNextNodo());
    this.current.setNextNodo(newNodo);
    if (this.current!=this.tail){
        this.current.getNextNodo().setPrevNodo(newNodo);
        this.current.setNextNodo(newNodo);
    }
    if (this.current==this.tail){
        this.tail=tail.getNextNodo();
    }
    this.size++;
    }
    ///////////////////
    
    //Append
    public void append(Q elemento){
    NodoDoble newNodo=new NodoDoble(elemento, this.tail, null);
    this.tail.setNextNodo(newNodo);
    this.tail=newNodo;
    this.size++;
    }
    ///////////////////////
    
    //Remove
    public void remove(){
    //Verifica que la lista no este vacia
    if ((this.head==this.current)&&(this.head==this.tail)){
    System.out.println("Lista vacia");
    return;
    }
     if (this.head == this.current){
            System.out.println("Nodo especial no se puede borrar");
            return;
        }

        //último nodo
        if(this.current == this.tail){
            this.current.getPrevNodo().setNextNodo(null);
            this.pos--;
            this.tail = this.current.getPrevNodo();
        } else {
            this.current.getNextNodo().setPrevNodo(this.current.getPrevNodo());
            this.current.getPrevNodo().setNextNodo(this.current.getNextNodo());

        }
        this.current = this.current.getPrevNodo();
        this.size--;
    }
    //
    
    //Vaciar lista
    public void clear(){
    this.head=this.tail=this.current=new NodoDoble();
    this.pos=-1;
    this.size=0;
    }
    //Obtener dato de lista
    public Q getElemento(){
    return (Q) this.current.getElement();
    }
    //
    
    public int getSize(){
        return this.size;
    }
    
    //Mueve el current a la posicion siguiente
    public boolean next(){
        if (this.current==this.tail){
        System.out.println("Se encuentra en el ultimo nodo");
        return false;
        }
        this.current=this.current.getNextNodo();
        this.pos++;
        return true;   
    }
    
    public boolean previous(){
        if (this.current ==this.head){
        System.out.println("Se encuentra en el primer nodo");
        return false;
        }
        this.current=this.current.getPrevNodo();
        this.pos--;
        return true;
    }
    
 
    public int getPos(){
    return this.pos;
    }
    
    public void gotostart(){
    this.current=this.head;
    this.pos=-1;
    }
    
    public void gotoend(){
    this.current=this.tail;
    this.pos=this.size-1;
    }
    
    public void gotopos(int posi){
    if (posi<0|| posi>=this.size){
        System.out.println("Posicion Invalida");
        return;
    }
    if (posi>this.pos){
    while (posi>this.pos){
        this.next();
        }
    }
    else if (posi<this.pos){
        while (posi<this.pos){
            this.previous();
        }
    }
    }

    public int getposElemento(Q Ele){
        NodoDoble tempnodo=this.head;
        int pos=-1;
        while (tempnodo!=null){
            if (tempnodo.getElement()!=null&&tempnodo.getElement().equals(Ele)){
            return pos;
            }
            tempnodo=tempnodo.getNextNodo();
            pos++;
        }
    return -1;
    }
    public String toString() {
        NodoDoble currentNode = this.head.getNextNodo();

        StringBuffer result = new StringBuffer();

        for (int i = 0; currentNode != null; i++)
        {
            if (i > 0)
            {
                result.append(",");
            }
            Object element = currentNode.getElement();

            result.append(element == null ? "" : element);
            currentNode = currentNode.getNextNodo();
        }
        return result.toString();
    }

    }