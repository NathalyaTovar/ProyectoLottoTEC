package Sorteo;

public enum Enum {
    LOTERIA(0),LOTTO(1),BINGO(2),TIEMPOS(3);
    
    private String tipoSorteo;
    private int num;
    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }
   
   private Enum(int num){
        this.num=num;
        //this.tipoSorteo=tipoSorteo;
        
    }
}