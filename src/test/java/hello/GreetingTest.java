package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GreetingTest {


    @Test
    public void testGetIdAndGetContent() {

        long id = 2;
        String content = "Hello, World";

        Greeting greeting = new Greeting(id, content);
        assertEquals(greeting.getId(), id);
        assertEquals(greeting.getContent(), content);

    }

}