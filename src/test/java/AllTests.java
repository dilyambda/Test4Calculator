import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {SumAndSubsTests.class,
                MultiplyAndDivideTests.class,
                PowerAndSqrtTests.class,
                TrigonometryTests.class,
                IsPositiveOrNegativeTests.class})

public class AllTests {

    Calculator clc;

    @BeforeClass
    public static void init() {
        System.out.println("BEFORE ALL TESTS SUITE CLASS!!!!");
    }

    @Before
    public void setUp() {
        System.out.println("BEFORE ALL TESTS SUITE TEST!!!!");
        clc = new Calculator();
    }

    @After
    public void CleanUp() {
        System.out.println("AFTER ALL TESTS SUITE TEST!!!!");
        clc = null;
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("AFTER ALL TESTS CLASS!!!!");
    }
}