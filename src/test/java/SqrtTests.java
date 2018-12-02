import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SqrtTests {
    private double valueA;
    private double expected;

    public SqrtTests(double valueA, double expected){
        this.valueA = valueA;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE SQRT CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE SQRT TEST=========");
    }

    @Test
    public void sqrtDoubleNumbers() {
        assertEquals(expected, new Calculator().sqrt(valueA), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{64L, 8L});
        parameters.add(new Object[]{121L, 11L});
        parameters.add(new Object[]{4L, 2L});
        parameters.add(new Object[]{16L, 4L});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER SQRT TEST#=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER SQRT CLASS=========");
    }
}
