//additive number
import java.util.ArrayList;
import java.util.List;
class Practise {
    public static boolean isAdditiveNumber(String num) {
        for (int i = 1; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (isValid(num, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(String num, int start, int i, int j) {
        String first = num.substring(start, i);
        String second = num.substring(i, j);
        String sum = add(first, second);
        
        if (!num.startsWith(sum, j)) {
            return false;
        }
        
        int nextStart = j + sum.length();
        if (nextStart == num.length()) {
            return true;
        }
        
        return isValid(num, i, j, nextStart);
    }

    private static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num = "112358";
        System.out.println("Is additive number: " + isAdditiveNumber(num)); // Output: true
    }
}



