import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {PowerTests.class,
                SqrtTests.class})

public class PowerAndSqrtTests {

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE POWER AND SQRT SUITE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE POWER AND SQRT SUITE TEST=========");
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER POWER AND SQRT SUITE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER POWER AND SQRT SUITE CLASS=========");
    }
}