import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class firstTest {
    private first first;

    public firstTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        this.first = new first();
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAdd() {
        int result = first.add(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        int result = first.subtraction(10, 5);
        assertEquals(5, result);

    }
}
