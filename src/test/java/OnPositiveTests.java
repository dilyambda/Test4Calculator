import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OnPositiveTests {
    private long valueA;
    private boolean expected;

    public OnPositiveTests(long valueA, boolean expected) {
        this.valueA = valueA;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE ON POSITIVE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE ON POSITIVE TEST!=========");
    }

    @Test
    public void sqrtDoubleNumbers() {
        assertEquals(expected, new Calculator().isPositive(valueA));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{2L, true});
        parameters.add(new Object[]{-8L, false});
        parameters.add(new Object[]{13L, true});
        parameters.add(new Object[]{-15L, false});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER ON POSITIVE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER ON POSITIVE CLASS=========");
    }
}
