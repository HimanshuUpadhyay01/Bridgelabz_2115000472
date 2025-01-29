public class Replace {
    public static void main(String[] args) {
        String sentence = "I love programming in Java.";
        String wordToReplace = "Java";
        String replacementWord = "Python";

        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + replaceWord(sentence, wordToReplace, replacementWord));
    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replace(wordToReplace, replacementWord);
    }
}