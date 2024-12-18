package org.voiculescu;

public class HelloTestIT {

    public void testSayHello() {
        var hello = new Hello();
        assert (hello.sayHello().equals("Hello World!"));
    }

}