public class Endereco {
    private String rua;
    private String bairro;
    private int numero;

    public Endereco(){
        this(null, 0, null);
    }

    public Endereco(String rua,int numero,String bairro){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

   @Override
    public String toString(){
        return String.format("Endereco[Rua:%s, Numero:%d, Bairro:%s]", getRua(), getNumero(), getBairro());
    }


    //getts e setts
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return this.rua;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return this.bairro;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
}
