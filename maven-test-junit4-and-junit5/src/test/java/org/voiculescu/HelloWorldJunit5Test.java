package org.voiculescu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldJunit5Test {

    @Test
    void sayHello() {
        var hello = new HelloWorld();
        assertEquals("Hello World!", hello.sayHello());
    }
}