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
//    @Test
//    public void Promedio() {
//        ListaNumeros prueba = new ListaNumeros();
//        prueba.AñadirNumerosAlAzar(3/*Tamaño*/, 1/*Mínimo*/, 3/*Máximo*/);
//        int result = prueba.Promedio();
//        assertEquals(2,result);
//    }
    
//    @Test
//    public void Maximo() {
//        ListaNumeros prueba = new ListaNumeros();
//        prueba.AñadirNumerosAlAzar(10/*Tamaño*/, 1/*Mínimo*/, 10/*Máximo*/);
//        int result = prueba.Maximo();
//        assertEquals(10,result);
//    }
//    
//    @Test
//    public void Existe() {
//        ListaNumeros prueba = new ListaNumeros();
//        prueba.AñadirNumerosAlAzar(1, 1, 1);
//        boolean result = prueba.Existe(1);
//        assertTrue(result);
//    }
    
    @Test
    public void Test1() {
        ListaNumeros prueba = new ListaNumeros();
        prueba.AñadirNumerosAlAzar(2, 1, 2);
        assertNotNull(prueba);
    }
}