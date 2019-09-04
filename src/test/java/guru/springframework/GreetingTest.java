package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("In Before class.......");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In After Each.......");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Gui"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each.......");
    }

    @AfterAll
    static void afterClass(){
        System.out.println("In After class.......");
    }
}