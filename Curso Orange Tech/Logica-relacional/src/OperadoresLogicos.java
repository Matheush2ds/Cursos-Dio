public class OperadoresLogicos {
    public static void main(String[] args) {
       
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("------------------------");

        System.out.println("b2 || b3 " + (b2 || b3) );
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("------------------------");

        System.out.println("b1 ^ b3 " +(b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));
        System.out.println("------------------------");

        System.out.println(!b1);
        System.out.println(!b2);

        // Operador Auxilior

        double salarioMensal = 1500.90d;
        double mediaSalario = 1300d;

        int quantidadeDependente = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependente >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependente == mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe Auxilio " + recebeAuxilio);

    }
}
