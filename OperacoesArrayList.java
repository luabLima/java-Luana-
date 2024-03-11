import java.util.ArrayList;

public class OperacoesArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> listaDeNomes = new ArrayList<>();
        
        listaDeNomes.add("Erica");
        listaDeNomes.add("Eduardo");
        listaDeNomes.add("Luana");
        
        listaDeNomes.remove(1);

        listaDeNomes.add("Jimmy");

        System.out.println("Conteúdo final da lista:");
        for (String nome : listaDeNomes) {    //for each(looping estudado)
            System.out.println(nome);
        }
    }
}
