import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TgTests.class,
                CtgTests.class,
                SinTests.class,
                CosTests.class})

public class TrigonometryTests {

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE TRIGONOMETRY SUITE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE TRIGONOMETRY SUITE TEST=========");
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER TRIGONOMETRY SUITE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER TRIGONOMETRY SUITE CLASS=========");
    }
}


