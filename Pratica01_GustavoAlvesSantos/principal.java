
public class principal{
    public static void main(String[] args) {
        pilha<String> Linguagens = new pilha<>("Linguagens");

        System.out.println("Primeira etapa:");
        Linguagens.push("JAVA");
        Linguagens.push("PYTHON");
        Linguagens.push("C++");
        Linguagens.imprimePilha();
        System.out.println();
        System.out.println("Segunda etapa:");
        System.out.println( "Dado:" + Linguagens.pop() + " removido!");
        System.out.println();
        System.out.println("Terceira etapa:");
        Linguagens.push("C#");
        Linguagens.push("React");
        Linguagens.imprimePilha();

    
    
    
    
    
    
    
    
    
    
    }
}