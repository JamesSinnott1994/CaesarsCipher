package ie.sinnott.sdlc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCipherTest {

    /*
    Test names have to be very specific so as to avoid confusion
     */

    // Need instance here so it can be used in the tests
    private CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessageWithOffsetOf12() {
        assertEquals(
                "tai mdq kag pauzs fapmk",
                caesarsCipher.cipher("how are you doing today", 12)
        );
    }

    @Test
    void testEmptyString() {
        assertEquals(
                "",
                caesarsCipher.cipher("", 12)
        );
    }

//    @Test
//    void testCipheredMessageWithOffsetOf11() {
//        assertEquals(
//                "tai mdq kag pauzs fapmk",
//                caesarsCipher.cipher("how are you doing today", 11)
//        );
//    }

}