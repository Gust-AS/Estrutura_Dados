public class No<T> {
    private T dado;
    private No nextNo;

    public No(){
        this(null,null);
    }

    public No(T dado){
        this(dado,null);
    }

    public No(T dado, No<T> nextNo){
        this.dado = dado;
        this.nextNo = nextNo;
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
    
    
   // @Override
   // public No toString(){
   //     return No.format("Pessoa[Nome: %s, Idade: %d, %s]",getNome(),getIdade(), end.toString());
   // }

    
}
