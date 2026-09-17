public class Principal2{
    public static void main(String[] args){
        Fila<String> nomeAlunos = new Fila<>("NomeAlunos");

        System.out.println("Primeira etapa: ");
        nomeAlunos.enfilerar("Isac");
        nomeAlunos.enfilerar("Thiago");
        nomeAlunos.enfilerar("Gustavo");
        nomeAlunos.imprimeFila();
        System.out.println();
        System.out.println("Segunda Etapa:");
        System.out.println("Dado:" + nomeAlunos.desenfilerar() + " Removido");
        System.out.println();
        System.out.println("Terceira Etapa:");
        nomeAlunos.enfilerar("Carla");
        nomeAlunos.enfilerar("João");
        nomeAlunos.imprimeFila();
        

    }       
}
