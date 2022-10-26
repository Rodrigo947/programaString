
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;


class ValidadoresTest {

    @Test
    void deveRetornarQuantidadeCarateresInvalidaLetra() {
        try {
            Validadores.validarQuantidadeCarateres("s");
            Assertions.fail();
        }catch (InputMismatchException e){
            Assertions.assertEquals("Quantidade de caracteres invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarQuantidadeCarateresInvalidaForaDoRange() {
        try {
            Validadores.validarQuantidadeCarateres("0");
            Assertions.fail();
        }catch (InputMismatchException e){
            Assertions.assertEquals("Quantidade de caracteres invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarCadeiaCaracteresInvalida() {
        try {
            Validadores.validarCadeiaCaracteres("1", "abc");
            Assertions.fail();
        }catch (InputMismatchException e){
            Assertions.assertEquals("Cadeia invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarCaractereProcuradoInvalida() {
        try {
            Validadores.validarCaractereProcurado("asc");
            Assertions.fail();
        }catch (InputMismatchException e){
            Assertions.assertEquals("Caractere invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPosicaoDoCaratereProcurado() {
        String resultado = Validadores.validarCaractereEncontrado("c", "acd");
        Assertions.assertEquals("Posicao 1", resultado);
    }

    @Test
    void deveRetornarCaractereNaoEncontrado() {
        String resultado = Validadores.validarCaractereEncontrado("v", "acd");
        Assertions.assertEquals("Caractere nao encontrado", resultado);
    }

    @Test
    void deveRetornarOpcaoNovaExecucaoInvalida() {
        try {
            Validadores.validarNovaExecucao("1");
            Assertions.fail();
        }
        catch (InputMismatchException e){
            Assertions.assertEquals("Opcao invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarTodosInputsValidos(){
        try{
            Validadores.validarQuantidadeCarateres("1");
            Validadores.validarCadeiaCaracteres("5", "asdfg");
            Validadores.validarCaractereProcurado("a");
            Validadores.validarNovaExecucao("s");
        }
        catch (Exception e){
            Assertions.fail();
        }
    }
}