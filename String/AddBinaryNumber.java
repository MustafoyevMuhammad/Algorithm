package String;

public class AddBinaryNumber {
    public static String solve(String a, String b) {
        StringBuilder st = new StringBuilder();
        String longer = a.length() > b.length() ? a : b;
        String shorter = a.length() > b.length() ? b : a;
        boolean f = false;
        int number = 0;
        for (int i = 0; i < longer.length(); i++) {
            if (i < shorter.length()) {
                number = longer.charAt(longer.length() - i - 1) + shorter.charAt(shorter.length() - i - 1) - 96
                        + (f ? 1 : 0);
                if(number >= 2){
                    f = true;
                }
                else
                    f = false;
                st.append(number%2);
            }
            else{
                number = longer.charAt(longer.length() - i - 1) + (f ? 1 : 0) - 48;
                if(number >= 2){
                    f = true;
                }
                else
                    f = false;
                st.append(number%2);
            }

        }
        if(number >= 2)
            st.append(1);
        return st.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("1", "11"));
        char a = '1';
        System.out.println((int) a);
    }
}
