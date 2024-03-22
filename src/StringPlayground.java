public class StringPlayground {

    public static int experiment1 (String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') { count++; }
            else if (c == ')') { count--; }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "((3 + 7 * 2)";
        int evenedParanthesis = experiment1(s);

        if (evenedParanthesis == 0) {
            System.out.println("There's an equal amount of \"(\" and \")\".");
        } else if (evenedParanthesis < 0) {
            System.out.println("There's more \")\" in this equation!");
        } else {
            System.out.println("There's more \"(\" in this equation!");
        }
    }
}