import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes = ingredientes.split(";");
        for(String i : listaIngredientes){
            System.out.println(i);
        }
    }
}