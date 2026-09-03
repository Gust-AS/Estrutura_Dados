public class Principal{
    public static void main(String[] args) {
        pilha<String> pilha = new pilha<>("Letras");
    
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");
        
        pilha.imprimePilha();

        System.out.println( "Topo:" + pilha.peek());

        System.out.println( "Dado:" + pilha.pop() + " removido!");

    
    
    
    
    
    
    
    
    
    }
}