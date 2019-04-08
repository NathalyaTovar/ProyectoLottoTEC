package Sorteo;

public class Lotto {
    private int acumulado;
    private int fechaSorteo;
    private int numeroGanador;

    //Contructor
    public Lotto(int acumulado, int fechaSorteo, int numeroGanador) {
        this.acumulado = acumulado;
        this.fechaSorteo = fechaSorteo;
        this.numeroGanador = numeroGanador;
    }

    //Metodos Getters and Setters
    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

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
