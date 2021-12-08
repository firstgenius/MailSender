import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    public Client client;
    public MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        client = new Client("fourth", "24", "Male", "fourth@ucu.edu.ua");
        mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
    }

    @Test
    void getClientText() {
        assertEquals(mailInfo.getClientText(), "fourth! Happy birthday!\n");
    }

    @Test
    void getClientEmail() {
        assertEquals(mailInfo.getClientEmail(), "fourth@ucu.edu.ua");
    }
}