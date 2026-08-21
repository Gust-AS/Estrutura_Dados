public class Principal {
    public static void main(String[] args) {
        
        No<String> obj1 = new No<String>("Gustavo");
        No<Pessoa> objP = new No<Pessoa>(new Pessoa("Wilson", 100));
        
        obj1.setNextNo(new No<String>("Mycol"));
        obj1.getNextNo().setNextNo(new No<String>("Jason"));
        //System.out.println(obj1.getDado());
        //System.out.println(obj1.getNextNo().getDado());
        //System.out.println(obj1.getNextNo().getNextNo().getDado());

        No aux = obj1;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
          
        }

    }
}
