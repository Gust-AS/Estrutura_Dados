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
}