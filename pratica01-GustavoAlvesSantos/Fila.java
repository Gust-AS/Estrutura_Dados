public class Fila<T>{
    private String nomeFila;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }


    public void enfilerar(T dado){
        No<T> novoNo = new No<T>(dado);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void imprimeFila(){
        if (primeiroNo == null) {
            System.out.println("Fila Vazia!!");
        }else{
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getNextNo();
            }
        }
    }

    public T desenfilerar(){
        if (primeiroNo == null) {
            System.out.println("Fila Vazia");
            return  null;
        }
        T dado = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();

        if (primeiroNo == null) {
            ultimoNo = primeiroNo;
        }

        return dado;
    }

    
    //gets e sets
    public String getNomeFila() {
        return nomeFila;
    }

    public void setNomeFila(String nomeFila) {
        this.nomeFila = nomeFila;
    }

    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }
    //gets e sets

    


}
