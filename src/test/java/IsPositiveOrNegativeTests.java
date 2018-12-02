import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {OnPositiveTests.class,
                OnNegativeTests.class})

public class IsPositiveOrNegativeTests {

    @BeforeClass
    public static void init() {
        System.out.println("=========BEFORE POSITIVE/NEGATIVE SUITE CLASS=========");
    }

    @Before
    public void setUp() {
        System.out.println("=========BEFORE POSITIVE/NEGATIVE SUITE TEST=========");
    }

    @After
    public void CleanUp() {
        System.out.println("=========AFTER POSITIVE/NEGATIVE SUITE TEST=========");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("=========AFTER POSITIVE/NEGATIVE SUITE CLASS=========");
    }
}