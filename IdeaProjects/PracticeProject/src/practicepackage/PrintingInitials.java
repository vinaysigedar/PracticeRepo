package practicepackage;

public class PrintingInitials {
    public static void main(String[] args) {
        String s = "Vinay Pandurang Sigedar";
        int len = s.length();
        s = s.trim();
        String t = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                t = t + ch;
            } else {
                System.out.print(Character.toUpperCase(t.charAt(0)) + ". ");
                t = "";
            }
        }
        String temp = "";
        for (int j = 0; j < t.length(); j++) {
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }
        System.out.println(temp);
    }
}
