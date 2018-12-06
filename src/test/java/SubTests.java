import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubTests {
    private long valueA;
    private long valueB;
    private long expected;

    public SubTests(long valueA, long valueB, long expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE SUM CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE SUM TEST=========");
    }

    @Test
    public void subLongNumbers() {
        assertEquals(expected, new Calculator().sub(valueA, valueB));
    }

    @Test
    public void subDoubleNumbers() {
        assertEquals(expected, new Calculator().sub(valueA, valueB), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{55L, 2L, 53L});
        parameters.add(new Object[]{10L, 2L, 8L});
        parameters.add(new Object[]{2L, 2L, 0});
        parameters.add(new Object[]{16L, 2L, 14L});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER SUB TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER SUB CLASS=========");
    }
}
