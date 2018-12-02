import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PowerTests {
    private long valueA;
    private long valueB;
    private long expected;

    public PowerTests(long valueA, long valueB, long expected){
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE POWER CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE POWER TEST=========");
    }

    @Test
    public void powDoubleNumbers() {
        assertEquals(expected, new Calculator().pow(valueA, valueB), 0);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{2L, 6, 64L});
        parameters.add(new Object[]{11L, 2, 121L});
        parameters.add(new Object[]{2L, 2, 4L});
        parameters.add(new Object[]{4L, 0L, 1});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER POWER TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER POWER CLASS=========");
    }
}

