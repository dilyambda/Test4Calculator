import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultiplyTests {
    private long valueA;
    private long valueB;
    private long expected;


    public MultiplyTests(long valueA, long valueB, long expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE MULTIPLY CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE MULTIPLY TEST=========");
    }

    @Test
    public void multLongNumbers() {
        assertEquals(expected, new Calculator().mult(valueA, valueB));
    }

    @Test
    public void multDoubleNumbers() {
        assertEquals(expected, new Calculator().mult(valueA, valueB), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{1L, 2L, 2L});
        parameters.add(new Object[]{11L, 2L, 22L});
        parameters.add(new Object[]{2L, 2L, 4L});
        parameters.add(new Object[]{4L, 0L, 0L});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER MULTIPLY TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER MULTIPLY CLASS=========");
    }
}
