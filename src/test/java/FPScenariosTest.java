import main.java.FPScenarios;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FPScenariosTest {

    private final FPScenarios fpTest = new FPScenarios();
    private final List<String> namesTest = new ArrayList<>(List.of("Adam", "Andrew", "Alice", "Bob", "Brook"));
    private final List<Integer> numbersTest = new ArrayList<>(List.of(1, 3, 5, 2, 4, 6));

    @BeforeAll  //  analogous to JUnit 4’s @BeforeClass
    static void beforeAll() {
        System.out.println("beforeAll @BeforeAll");
    }

    @BeforeEach
        //  analogous to JUnit 4’s @Before
    void setUp() {
        System.out.println("setUp @BeforeEach");
    }

    @Test
    void startsWithFilter() {
        //  assertEquals(expectedResult, actualResult)
        assertEquals(List.of("Adam", "Alice", "Andrew"), fpTest.startsWithFilter(namesTest, "a"));
        assertEquals(List.of("Bob", "Brook"), fpTest.startsWithFilter(namesTest, "b"));
        assertNotEquals(List.of("Bob", "Brook", "Anthony"), fpTest.startsWithFilter(namesTest, "b"));
//        fail("Not implemented yet");  //  explicitly fails the test
    }

    @Test
    @DisplayName("Get even numbers")
    void getEvenNumbers() {
        assertAll(() -> assertEquals(List.of(2, 4, 6), fpTest.getEvenNumbers(numbersTest)),
                () -> assertEquals(List.of(10, 14, 50), fpTest.getEvenNumbers(List.of(10, 50, 35, 23, 14))),
                () -> assertNotEquals(List.of(15, 10, 50), fpTest.getEvenNumbers(List.of(10, 50, 35, 23, 14))));
    }

    @Test
    @DisplayName("Get Odd numbers")
    void getOddNumbers() {
        assertAll(() -> assertEquals(List.of(13, 15, 17), fpTest.getOddNumbers(List.of(17, 13, 12, 16, 90, 15))),
                () -> assertEquals(List.of(11, 15, 23, 55), fpTest.getOddNumbers(List.of(11, 50, 55, 23, 15))),
                () -> assertNotEquals(List.of(14, 10, 50), fpTest.getOddNumbers(List.of(10, 50, 35, 23, 14))));
    }

    @Test
    void sumOfEvens() {
        assertEquals(12, fpTest.sumOfEvens(numbersTest));
        assertNotEquals(14, fpTest.sumOfEvens(numbersTest), "Check actual list");
//        assertArrayEquals();
    }

    @Test
    void sumOfOdds() {
        assertEquals(9, fpTest.sumOfOdds(numbersTest));
    }

    @Test
    void primeNumbers() {
        assertEquals(List.of(2, 3, 5), fpTest.primeNumbers(numbersTest));
    }

    @Test
    void sum() {
        assertEquals(21, fpTest.sum(numbersTest));
    }

    @Test
    @DisplayName("Squared")
    void squared() {
        assertAll(() -> assertEquals(List.of(4, 9, 16), fpTest.squared(List.of(2, 3, 4))),
                () -> assertEquals(List.of(4, 9, 16), fpTest.squared(List.of(3, 2, 4))),
                () -> assertEquals(List.of(4, 9), fpTest.squared(List.of(3, 2, 2))),
                () -> assertNotEquals(List.of(9, 4), fpTest.squared(List.of(3, 2))));
    }

    @Test
    @DisplayName("First Ten Squared")
    void firstTenSquared() {
        assertAll(() -> assertEquals(List.of(1, 4, 9, 16, 25, 36, 49, 64, 81, 100), fpTest.firstTenSquared()),
                () -> assertNotEquals(List.of(16, 9, 25), fpTest.firstTenSquared()));
    }

    @Test
    @DisplayName("Range Squared")
    void rangeSquared() {
        assertAll(() -> assertEquals(List.of(25, 36, 49), fpTest.rangeSquared(5, 7)),
                () -> assertNotEquals(List.of(36, 25, 49), fpTest.rangeSquared(5, 7)));
    }

    @AfterEach
        //  analogous to JUnit 4’s @After
    void tearDown() {
        System.out.println("tearDown @AfterEach");
    }

    @AfterAll   //  analogous to JUnit 4’s @AfterClass
    static void afterAll() {
        System.out.println("afterAll @AfterAll");
    }
}
