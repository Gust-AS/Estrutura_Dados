public class  NoDuplo<T> {
    private  T dado;
    private  NoDuplo<T> anteriorNo;
    private  NoDuplo<T> proximoNo;
    private int indice;

    public  NoDuplo(T dado){
        this.dado = dado;
        this.indice = 0;
        this.anteriorNo = null;
        this.proximoNo = null;
    }


    //getts e setts --------------------------------------------------------------
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoDuplo<T> getAnteriorNo() {
        return anteriorNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo) {
        this.anteriorNo = anteriorNo;
    }

    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    //getts e setts --------------------------------------------------------------
    
    @Override 
    public String toString(){
        return "{ indice: " + getIndice() + "| Dado: " + getDado() + "}";
    }    


}
