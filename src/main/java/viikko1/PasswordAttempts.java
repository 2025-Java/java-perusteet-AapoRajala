package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correctPassword = "java123";

        // Tarkistetaan enintään kolme ensimmäistä yritystä
        for (int i = 0; i < tries.length && i < 3; i++) {
            if (tries[i].equals(correctPassword)) {
                return "Tervetuloa!";
            }
        }

        // Jos yksikään yritys ei ollut oikein
        return "Liian monta virheellistä yritystä.";
    }
}
