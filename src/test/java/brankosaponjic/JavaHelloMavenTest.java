package brankosaponjic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloMavenTest {

    @Test
    void getHello() {
        JavaHelloMaven javaHelloMaven = new JavaHelloMaven();

        assertEquals("Hello Maven", javaHelloMaven.getHello());
    }
}