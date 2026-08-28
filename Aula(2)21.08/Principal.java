public class Principal{
    public static void main(String[] args) {
        //Lista de Alunos
        Lista<String> lista = new Lista<String>("Alunos");

        /* 
        lista.imprimeLista();
        lista.addInicio("Jhin");
        lista.imprimeLista();
        lista.addInicio("Leona");
        lista.imprimeLista();
        lista.addInicio("Ahri");
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeInicio();
        */

        lista.addInicio("Jhin");
        lista.addInicio("Leona");
        lista.addInicio("Gragas");
        lista.addFinal ("Fidlestricks");
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
        
    }
}