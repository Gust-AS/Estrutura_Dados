public class Principal3 {
    public static void main(String[] args) {
        ListaDupla<Produto> produtos = new ListaDupla<Produto>("Produtos");
        
        System.out.println("Primeira etapa:");
        produtos.addInicio(new Produto("caixa de feijao", 40));
        produtos.addFinal(new Produto("caixa de arroz", 30));
        produtos.addMeio(new Produto("caixa de peixes", 30),1);
        produtos.imprimeLista();
        
        System.out.println();
        System.out.println("Segunda Etapa:");
        System.out.println("Produto: " + produtos.removeMeio(1) + " Removido!");
        
        System.out.println();
        System.out.println("Terceira Etapa:");
        produtos.addInicio(new Produto("caixa de lapis", 20));
        produtos.addFinal(new Produto("caixa de canetas", 10));
        produtos.imprimeLista();
    }
}