import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OnNegativeTests {
    private long  valueA;
    private boolean expected;

    public OnNegativeTests(long valueA, boolean expected){
        this.valueA = valueA;
        this.expected = expected;
    }

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE ON NEGATIVE CLASS!=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE ON NEGATIVE TEST!!!!=========");
    }

    @Test
    public void sqrtDoubleNumbers() {
        assertEquals(expected, new Calculator().isNegative(valueA));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Collection<Object[]> parameters = new ArrayList<Object[]>();
        parameters.add(new Object[]{-2L, true});
        parameters.add(new Object[]{8L, false});
        parameters.add(new Object[]{13L, false});
        parameters.add(new Object[]{-15L, true});
        return parameters;
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER ON NEGATIVE TEST!!!!=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER ON NEGATIVE CLASS!!!!=========");
    }
}