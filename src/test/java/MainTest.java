import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;

import static com.github.stefanbirkner.systemlambda.SystemLambda.catchSystemExit;

class MainTest {
    @Test
    void deveSairDoPrograma() throws Exception {
        int statusCode = catchSystemExit(() -> {
            String[] args = null;
            ByteArrayInputStream in = new ByteArrayInputStream("1 1 1 n".getBytes());
            System.setIn(in);
            Main.main(args);
        });

        Assertions.assertEquals(1, statusCode);
    }
    @Test
    void deveContinuarOPrograma() {
        try {
            String[] args = null;
            ByteArrayInputStream in = new ByteArrayInputStream("1 1 1 s 1 1".getBytes());
            System.setIn(in);
            Main.main(args);
            Assertions.fail();
        }
        catch (InputMismatchException erro) {
            Assertions.assertEquals("Opcao invalida", erro.getMessage());
        }


    }
}