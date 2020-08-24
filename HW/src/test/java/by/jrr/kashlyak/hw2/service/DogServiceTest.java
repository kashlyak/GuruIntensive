package by.jrr.kashlyak.hw2.service;


import junit.framework.TestCase;


public class DogServiceTest extends TestCase {

    public void testVoice() {
        DogService dogService = new DogService();
        String expected = "HAU";
        String actual = dogService.voice();
        assertEquals(expected, actual);

    }

    public void testEat() {

        DogService dogService = new DogService();
        String expected = "NYAM";
        String actual = dogService.eat();
        assertEquals(expected, actual);
    }

    public void testSleep() {

        DogService dogService = new DogService();
        String expected = "DOG IS SLEEP";
        String actual = dogService.sleep();
        assertEquals(expected, actual);
    }
}