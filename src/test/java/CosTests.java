import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CosTests {
    private double valueA;
    private double expected;

    public CosTests(double  valueA, double  expected){
        this.valueA = valueA;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE COS CLASS!=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE COS TEST=========");
    }

    @Test
    public void cosDoubleNumbers() {
        assertEquals(expected, new Calculator().cos(valueA), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{0, 1});
        parameters.add(new Object[]{0.5, 0.8775825618903728});
        parameters.add(new Object[]{0.75, 0.7316888688738209});
        parameters.add(new Object[]{1, 0.5403023058681398});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER COS TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER COS CLASS=========");
    }
}

