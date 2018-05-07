import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arceus6666 on 07/05/2018.
 */
public class TestNotaFinal {
    @Test
    public void verificar_getStatus1(){
        String expected = "Nota: 80";
        String actual = Main.getStatus(30,30,20);

        Assert.assertEquals("El resultado falla", expected,actual);

    }

    @Test
    public void verificar_getStatus2(){
        String expected = "Nota: nota1 es incorrecta";
        String actual = Main.getStatus(40,30,40);

        Assert.assertEquals("Nota 1 falla", expected, actual);
    }
}
