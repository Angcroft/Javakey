import java.security.SecureRandom;

public class JavaKey {
    public static void main(String[] args) {
        int passwordLength = 16;
        String password = PasswordGenerator.generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
}