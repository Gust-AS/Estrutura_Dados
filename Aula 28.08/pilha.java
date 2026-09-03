public class pilha<T> {
    private String nomePilha;
    private No<T> topo;


    //gets e sets -----------------------------------------
    public String getNomePilha() {
        return nomePilha;
    }
    public void setNomePilha(String nomePilha) {
        this.nomePilha = nomePilha;
    }
    public No<T> getTopo() {
        return topo;
    }
    public void setTopo(No<T> topo) {
        this.topo = topo;
    }
    //gets e sets -----------------------------------------

    public pilha(){
        this("");
    }

    public pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;

    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);

        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    /* 
    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        if (topo == null) {
            novoNo = topo;
        }
        else{
            novoNo.setNextNo(topo);
            topo = novoNo;
        }
    }
    */

    public void imprimePilha(){
        No<T> aux = topo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getNextNo();
        }
    }

    public T pop(){
        if (topo == null) {
            System.out.println("Pilha Vazia");
            return null;
        }else{
            T dado = topo.getDado();
            topo = topo.getNextNo();
            return dado;
        }
    }

    public T peek(){
        if (topo == null) {
            System.out.println("Pilha vazia");
            return null;
        }
            return topo.getDado();
    }
}
