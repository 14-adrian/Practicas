
import com.mycompany.pruebasunitarias.ImpresoraNumeros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class ImpresoraNumerosTest {
    
    public ImpresoraNumerosTest() {
    }

     @Test
     public void testImprimirNumeros()
     {
         int limite = 0;
         Exception exception = assertThrows(RuntimeException.class, ()  -> {
                 ImpresoraNumeros.imprimirNumeros(limite);
         });
         String respuestaEsperada = "El limite debe de ser >=1";
         String respuestaRecibida = exception.getMessage();
         assertTrue(respuestaEsperada.equals(respuestaRecibida));
     }  
     
     @Test
     public void testImprimirNumeros1()
     {
         int limite = 1;
         int respuesta = 8;
         assertEquals(respuesta, ImpresoraNumeros.imprimirNumeros(limite));
     }
}
