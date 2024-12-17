package org.voiculescu;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.sayHello());
    }
}