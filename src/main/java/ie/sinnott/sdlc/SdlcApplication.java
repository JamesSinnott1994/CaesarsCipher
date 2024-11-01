package ie.sinnott.sdlc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SdlcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdlcApplication.class, args);

		String message = "how are you doing today";
		int offset = 12;

		CaesarsCipher caesarsCipher = new CaesarsCipher(); // Representation of our class
		String cipheredMessage = caesarsCipher.cipher(message, offset);

		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);

	}

}
