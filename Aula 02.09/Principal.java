public class Principal{
    public static void main(String[] args){
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.enfilerar(1);
        fila.enfilerar(2);
        fila.enfilerar(3);
         fila.enfilerar(4);

        fila.imprimeFila();

        /*
        System.out.println("Dado:" + fila.desenfilerar() + " Removido");
        */

       Integer total = 1;
       for(int i = 0; i < 4; i++){
        total *= fila.desenfilerar();
       }
       System.out.println("Total:" + total);
    }
}