import main.java.FPScenarios;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void getEvenNumbers() {
        assertEquals(List.of(2, 4, 6), fpScenariosTest.getEvenNumbers(numbersTest));
    }

    @Test
    void getOddNumbers() {
        assertEquals(List.of(13, 15, 17), fpScenariosTest.getOddNumbers(List.of(17, 13, 12, 16, 90, 15)));
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
    void sum() {
    	assertEquals(21, fpScenariosTest.sum(numbersTest));
    }

    @Test
    void primeNumbers() {
        assertEquals(List.of(2, 3, 5), fpScenariosTest.primeNumbers(numbersTest));
    }
    
    @Test
    void sum() {
        assertEquals(21, fpScenariosTest.sumOfOdds(numbersTest));
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
