import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClientTest {
    Client first = new Client("first", "20", "Male", "first@ucu.edu.ua");
    Client second = new Client("second", "21", "Female", "second@ucu.edu.ua");
    Client third = new Client("third", "17", "Female", "third@ucu.edu.ua");

    @Test
    void getId() {
        assertEquals(first.getId(), 1);
        assertEquals(second.getId(), 2);
        assertEquals(third.getName(), "third");
    }

}