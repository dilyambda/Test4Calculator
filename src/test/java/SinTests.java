import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SinTests {
    private double valueA;
    private double expected;

    public SinTests(double valueA, double expected) {
        this.valueA = valueA;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE SIN CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE SIN TEST=========");
    }

    @Test
    public void sqrtDoubleNumbers() {
        assertEquals(expected, new Calculator().sin(valueA), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{0, 0});
        parameters.add(new Object[]{1, 0.8414709848078965});
        parameters.add(new Object[]{0.75, 0.6816387600233341});
        parameters.add(new Object[]{-0.3, -0.29552020666133955});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER SIN TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER SIN CLASS=========");
    }
}