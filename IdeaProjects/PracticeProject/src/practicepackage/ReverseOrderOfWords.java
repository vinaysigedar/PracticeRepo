package practicepackage;

public class ReverseOrderOfWords {
    public static void main(String[] args) {
        String s = "Vinay Pandurang Sigedar";
        String str[] = s.split(" ");
        String ans = "";
        for (int i = str.length - 1; i >= 0; i--) {
            ans += str[i] + " ";
        }
        System.out.println(ans);
    }
}
