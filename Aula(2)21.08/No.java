public class No<T>{
    private T dado;
    private No<T> nextNo;

    public No(){
        this(null);
    }

    public No(T dado){
        this.dado = dado;
        this.nextNo = null;
    }

    //getts e setts
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getNextNo() {
        return nextNo;
    }

    public void setNextNo(No<T> nextNo) {
        this.nextNo = nextNo;
    }

    
}