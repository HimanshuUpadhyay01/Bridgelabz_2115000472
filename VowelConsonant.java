public class VowelConsonant {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = 0;
        int consonantCount = 0;
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}