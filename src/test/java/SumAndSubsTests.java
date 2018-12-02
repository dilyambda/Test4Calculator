import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {SumTests.class,
                SubTests.class})

public class SumAndSubsTests {

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE SUM&SUB SUITE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE SUM&SUB SUITE TEST=========");
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER SUM&SUB SUITE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER SUM&SUB SUITE CLASS=========");
    }
}

