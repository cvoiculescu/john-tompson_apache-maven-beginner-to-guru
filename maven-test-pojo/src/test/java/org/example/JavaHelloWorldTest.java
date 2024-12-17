package org.example;

public class JavaHelloWorldTest {

    public void testGetHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        assert(helloWorld.getHello().equals("hello"));
    }

}