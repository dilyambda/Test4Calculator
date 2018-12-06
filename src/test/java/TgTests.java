import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TgTests {
    private double valueA;
    private double expected;

    public TgTests(double valueA, double expected) {
        this.valueA = valueA;

        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE TG CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE TG TEST =========");
    }

    @Test
    public void tgDoubleNumbers() {
        assertEquals(expected, new Calculator().tg(valueA), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{-1, -1.557407724654902});
        parameters.add(new Object[]{1, 0});
        parameters.add(new Object[]{-0.75, -0.9315964599440724});
        parameters.add(new Object[]{0.5, 0.5463024898437905});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER TG TEST =========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER TG CLASS=========");
    }
}
