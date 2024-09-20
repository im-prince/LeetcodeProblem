package String;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
    }
}

