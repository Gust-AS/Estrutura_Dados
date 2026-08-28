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

    
}
