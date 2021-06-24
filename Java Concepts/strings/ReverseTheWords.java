package strings;

public class ReverseTheWords {
    public static void main(String[] args) {
        String str = "I love Java, the coffee";
        String words[] = str.split(" ");
        int c = words.length - 1;
        for (int i = c; i >= 0; i--) {
          System.out.print(words[i] + " ");
        }
    }
}
