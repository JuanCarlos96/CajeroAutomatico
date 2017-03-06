import java.util.ArrayList;
import newpackage.ListaNumeros;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewJUnitTest {
    
    public NewJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Promedio() {
        ListaNumeros prueba = new ListaNumeros();
        prueba.AñadirNumerosAlAzar(1, 1, 1);
        int result = prueba.Promedio();
        assertEquals(1,result);
    }
}