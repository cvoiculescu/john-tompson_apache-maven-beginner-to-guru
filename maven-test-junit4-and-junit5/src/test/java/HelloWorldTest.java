import org.junit.Test;
import org.voiculescu.HelloWorld;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.sayHello());
    }
}