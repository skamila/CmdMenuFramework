package skamila;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void metoda() {
        App obiekt = new App();
        assertEquals(1, obiekt.metoda());
    }
}