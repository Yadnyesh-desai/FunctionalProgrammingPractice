import main.java.FPScenarios;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FPScenariosTest {

    private final FPScenarios fpScenariosTest = new FPScenarios();
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
        assertEquals(List.of("Adam", "Alice", "Andrew"), fpScenariosTest.startsWithFilter(namesTest, "a"));
//        fail("Not implemented yet");  //  explicitly fails the test
    }

    @Test
    @DisplayName("Get even numbers")
    void getEvenNumbers() {
        assertAll(() -> assertEquals(List.of(2, 4, 6), fpScenariosTest.getEvenNumbers(numbersTest)),
                () -> assertEquals(List.of(10, 14, 50), fpScenariosTest.getEvenNumbers(List.of(10, 50, 35, 23, 14))),
                () -> assertNotEquals(List.of(14, 10, 50), fpScenariosTest.getEvenNumbers(List.of(10, 50, 35, 23, 14))));
    }

    @Test
    @DisplayName("Get Odd numbers")
    void getOddNumbers() {
        assertAll(() -> assertEquals(List.of(13, 15, 17), fpScenariosTest.getOddNumbers(List.of(17, 13, 12, 16, 90, 15))),
                () -> assertEquals(List.of(11, 15, 23, 55), fpScenariosTest.getOddNumbers(List.of(11, 50, 55, 23, 15))),
                () -> assertNotEquals(List.of(14, 10, 50), fpScenariosTest.getOddNumbers(List.of(10, 50, 35, 23, 14))));
    }

    @Test
    void sumOfEvens() {
        assertEquals(12, fpScenariosTest.sumOfEvens(numbersTest));
    }

    @Test
    void sumOfOdds() {
        assertEquals(9, fpScenariosTest.sumOfOdds(numbersTest));
    }

    @Test
    void primeNumbers() {
        assertEquals(List.of(2, 3, 5), fpScenariosTest.primeNumbers(numbersTest));
    }

    @Test
    void sum() {
        assertEquals(21, fpScenariosTest.sum(numbersTest));
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
