import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String caractereProcurado;
        String opcaoNovaExecucao = "s";
        String quantidadeCaracteres;
        String stringOndeProcurar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de caracteres (1 a 20): ");
        quantidadeCaracteres = sc.next();
        Validadores.validarQuantidadeCarateres(quantidadeCaracteres);

        System.out.println("Cadeia de caracteres com " + quantidadeCaracteres + ": ");
        stringOndeProcurar = sc.next();
        Validadores.validarCadeiaCaracteres(quantidadeCaracteres,stringOndeProcurar);

        while(opcaoNovaExecucao.equals("s")) {

            System.out.println("Caractere que deseja procurar: ");
            caractereProcurado = sc.next();
            Validadores.validarCaractereProcurado(caractereProcurado);

            String resultado = Validadores.validarCaractereEncontrado(caractereProcurado, stringOndeProcurar);

            System.out.println(resultado);

            System.out.println("Deseja procurar um novo caractere?");

            opcaoNovaExecucao = sc.next();
            Validadores.validarNovaExecucao(opcaoNovaExecucao);

        }

    }
}




