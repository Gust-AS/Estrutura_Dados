import java.util.Scanner;
import java.util.ArrayList;

public class Principal{

    public static void main(String[] args){
        
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        
        Scanner input = new Scanner (System.in);

        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Rafael", 35);
        Pessoa obj3 = new Pessoa();

        System.out.println("Digite o seu nome:");
        //String nome = input.nextLine();
        System.out.println("Digite sua idade:");
        //int idade = input.nextInt();
        
        obj3.setNome(input.nextLine());
        obj3.setIdade(input.nextInt());

        lista.add(obj1);
        lista.add(obj2);
        lista.add(obj3);

        
        /* 
        System.out.println("Nome:" + obj1.getNome());
        System.out.println("Idade:" + obj1.getIdade());

        System.out.println("Nome:" + obj2.getNome());
        System.out.println("Idade:" + obj2.getIdade());
        */


        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        //for(Pessoa auxP : lista){
        //    System.out.println(auxP.toString());
        //}

        lista.get(0).setNome("Jonas");
        lista.get(0).setIdade(2);

        System.out.println(lista.get(0).toString());
        System.out.println(obj1.toString());
        
        input.close();

        /*
        
        javac *.java
        java principal
        
        */
    }
}