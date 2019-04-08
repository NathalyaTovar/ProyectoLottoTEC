package Sorteo;

public abstract class DatosPrincipalesSorteo {
    private int fechaSorteo;
    private int numeroGanador;
    
    //Constructor
    public DatosPrincipalesSorteo(int fechaSorteo, int numeroGanador) {
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
