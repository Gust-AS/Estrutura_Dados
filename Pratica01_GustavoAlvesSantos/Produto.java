public class Produto {
    private String produtoNome;
    private double produtoPreco;

    public Produto(String produtoNome, double produtoPreco) {
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
    }

    @Override
    public String toString() {
        return "Produto{nome='" + produtoNome + "', preco=R$ " + produtoPreco + "}";
    }
}