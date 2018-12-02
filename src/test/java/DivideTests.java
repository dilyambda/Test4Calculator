import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class DivideTests {
    private long valueA;
    private long valueB;
    private long expected;

    public DivideTests(long valueA, long valueB, long expected){
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE DIVIDE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE DIVIDE TEST=========");
    }

    @Test
    public void divideLongNumbers() throws NumberFormatException {
        try {
        assertEquals(expected, new Calculator().div(valueA, valueB));
        }
        catch (NumberFormatException e){
            System.out.println("Expected exception due deleting on zero!");
        }
    }

    @Test
    public void divideDoubleNumbers() throws NumberFormatException {
        try {
            assertEquals(expected, new Calculator().div(valueA, valueB), 0);
        }
        catch (NumberFormatException e){
            System.out.println("Expected exception due deleting on zero!");
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{6L, 2L, 3L});
        parameters.add(new Object[]{10L, 2L, 5L});
        parameters.add(new Object[]{2L, 2L, 1L});
        parameters.add(new Object[]{4L, 0L, 0L});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER DIVIDE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER DIVIDE CLASS=========");
    }
}
