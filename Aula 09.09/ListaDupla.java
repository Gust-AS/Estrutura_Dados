public class ListaDupla<T> {
    private String nomeLista;
    private int tamanho;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    

    public ListaDupla(){
        this("Lista Dupla");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new  NoDuplo<T>(dado);
        if (primeiroNo == null) {
            novoNo = primeiroNo;
            novoNo = ultimoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;


        }
    }
        public void atualizaIndice(){
            NoDuplo<T> aux = primeiroNo;
            int indice = 0;
            while (aux != null) {
                aux.setIndice(indice);
                aux = aux.getProximoNo();
                indice++; 
        
        }    }

        public void addFinal(T dado){
        NoDuplo<T> novoNo = new  NoDuplo<T>(dado);
        if (primeiroNo == null) {
            novoNo = primeiroNo;
            novoNo = ultimoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;


        }
    }
    
}