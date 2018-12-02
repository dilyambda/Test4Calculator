import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SumTests {
    private long valueA;
    private long valueB;
    private long expected;

    public SumTests(long valueA, long valueB, long expected){
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE SUM TEST=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE SUM CLASS=========");
    }

    public void sumLongNumbers() {
        assertEquals(expected, new Calculator().sum(valueA, valueB));
    }

    @Test
    public void sumDoubleNumbers() {
        assertEquals(expected, new Calculator().sum(valueA, valueB), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{55L, 2L, 57L});
        parameters.add(new Object[]{10L, 2L, 12L});
        parameters.add(new Object[]{2L, 2L, 4L});
        parameters.add(new Object[]{4L, 0L, 4L});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER SUM TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER SUM CLASS=========");
    }
}
