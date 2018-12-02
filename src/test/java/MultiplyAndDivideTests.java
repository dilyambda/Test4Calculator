import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {MultiplyTests.class,
                DivideTests.class})

public class MultiplyAndDivideTests {

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE MULTIPLY&DIVIDE SUITE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE MULTIPLY&DIVIDE SUITE TEST=========");
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER MULTIPLY&DIVIDE SUITE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER MULTIPLY&DIVIDE SUITE CLASS=========");
    }
}