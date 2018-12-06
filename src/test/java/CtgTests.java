import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CtgTests {
    private double valueA;
    private double expected;

    public CtgTests(double valueA, double expected) {
        this.valueA = valueA;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE CTG CLASS!=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE CTG TEST=========");
    }

    @Test
    public void sqrtDoubleNumbers() {
        assertEquals(expected, new Calculator().ctg(valueA), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{-0.6, -0.5370495669980353});
        parameters.add(new Object[]{1, 0.7615941559557649});
        parameters.add(new Object[]{0, 0});
        parameters.add(new Object[]{-0.75, -0.6351489523872873});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER CTG TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER CTG CLASS=========");
    }
}