import java.util.InputMismatchException;

public class Validadores {
    public static void validarQuantidadeCarateres(String quantidadeCaracteres) {
        int quantidade;

        try {
            quantidade = Integer.parseInt(quantidadeCaracteres);
        }catch (Exception e){
            throw new InputMismatchException("Quantidade de caracteres invalida");
        }

        if (quantidade < 1 || quantidade > 20) {
            throw new InputMismatchException("Quantidade de caracteres invalida");
        }
    }

    public static void validarCadeiaCaracteres(String quantidadeCaracteres, String stringOndeProcurar) {
        int quantidade = Integer.parseInt(quantidadeCaracteres);

        if(stringOndeProcurar.length() != quantidade){
            throw new InputMismatchException("Cadeia invalida");
        }
    }

    public static void validarCaractereProcurado(String caractereProcurado) {
        if (caractereProcurado.length() != 1 ) {
            throw new InputMismatchException("Caractere invalido");
        }
    }

    public static String validarCaractereEncontrado(String caractereProcurado, String stringOndeProcurar) {
        if (stringOndeProcurar.indexOf(caractereProcurado) != -1) {
            return "Posicao " + stringOndeProcurar.indexOf(caractereProcurado);
        }
        else {
            return "Caractere nao encontrado";
        }
    }


    public static void validarNovaExecucao(String opcaoNovaExecucao) {
        if (!opcaoNovaExecucao.equals("s")  && !opcaoNovaExecucao.equals("n")){
            throw new InputMismatchException("Opcao invalida");
        }
    }
}
