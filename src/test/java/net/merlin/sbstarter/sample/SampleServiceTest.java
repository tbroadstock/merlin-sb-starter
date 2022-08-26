package net.merlin.sbstarter.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.merlin.sbstarter.services.SampleService;

class SampleServiceTest {
    
    /**
     * Test of sayHello method, of class SampleService.
     */
    @Test
    void testSayHello() {
        SampleService instance = new SampleService();
        String expResult = "Hello, Bob!";
        String result = instance.sayHello("Bob").getGreeting();
        assertEquals(expResult, result);
    }
}
