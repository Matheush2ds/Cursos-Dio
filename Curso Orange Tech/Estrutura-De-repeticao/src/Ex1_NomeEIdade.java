import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, o
 * primeiro representando o nome do aluno e o segundo representando a sua idade
 * (pare o programa inserindo o valor 8 no campo nome)
 */
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals ("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continue aqui...");
    }
}