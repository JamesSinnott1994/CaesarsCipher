package ie.sinnott.sdlc;

public class CaesarsCipher {

    /*
    Project is about Caesar Cipher, which is an Encryption Technique. You take the alphabet and you shift it down a
    number of letters and that is how you write your message. We will code up the ability to take a message and throw it
    into our code and our code is going to spit out the encrypted message using Caesar Cipher.

    Need:
        - The alphabet
        - Shift/Offset implementor
        - Message off-setter

     Assume every letter in the message is lower case
     */

    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';
    private static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int offset) {
        offset %= ALPHABET_SIZE; // Avoids overflowing over 25, as we don't want offset to be greater than that

        // Below is the same as above
        // offset = offset % ALPHABET_SIZE;

        // Stores string characters in an array of characters
        char[] character = message.toCharArray();
        offsetBy(character, offset); // Alters the each character in the array

        return new String(character);
    }

    private void offsetBy(char[] character, int offset) {
        /*
        Offsets our message to how we want it
         */
        for (int i = 0; i < character.length; ++i) {
            if (character[i] != ' ') {
                character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
            }
        }
    }

    private char offsetChar(char c, int offset, char letterA, char letterZ) {
        c += offset;

        // Left rotation
        if (c < letterA) {
            return (char) (c + ALPHABET_SIZE);
        }
        // Right rotation
        if (c > letterZ) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }

}
