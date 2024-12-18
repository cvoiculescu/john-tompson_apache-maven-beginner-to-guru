package org.voiculescu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTestIT {

    @Test
    public void testSayHello() {
        var hello = new Hello();
        assertEquals("Hello World!", hello.sayHello());
    }

}