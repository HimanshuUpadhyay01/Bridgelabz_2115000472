public class Duplicate {
    public static void main(String[] args) {
        String input = "Programming";
        StringBuilder uniqueChars = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (uniqueChars.indexOf(String.valueOf(c)) == -1) {
                uniqueChars.append(c);
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + uniqueChars.toString());
    }
}