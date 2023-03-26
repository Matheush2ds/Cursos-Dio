/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {9, 6, 1, -4, 20, -1};

        System.out.println("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.println(vetor[i] + " ");

        }
    }
}