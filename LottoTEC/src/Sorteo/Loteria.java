package Sorteo;

public class Loteria {  
    private int fechaSorteo;
    private int numeroGanador;
    
    //Constructor
    public Loteria(int fechaSorteo, int numeroGanador) {
        this.fechaSorteo = fechaSorteo;
        this.numeroGanador = numeroGanador;
    }
    
    //Metodos Getters and Setters
    public int getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(int fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }      
}
