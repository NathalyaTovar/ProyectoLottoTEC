package Sorteo;

public class Bingo {
    private int fechaSorteo;
    private int numeroGanador;
    
    //Constructor
    public Bingo(int fechaSorteo, int numeroGanador) {
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
