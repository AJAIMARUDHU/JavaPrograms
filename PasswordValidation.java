import java.util.*;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        char last = ch[ch.length - 1];
        int count = 0;
        int count1 = 0, count2 = 0;
        if (str.length() >= 8 && str.length() <= 28) {
            if (Character.isAlphabetic(ch[0])) {
            if (last == '!' || last == '@' || last == '#' || last == '$' || last == '%' || last == '^'||last == '&' || last == '*' || last == '(' || last == ')') {
                    for (int i = 0; i < ch.length; i++) {
                        if (Character.isUpperCase(ch[i])) {
                            count++;
                        }
                        if (Character.isLowerCase(ch[i])) {
                            count1++;
                        }
                        if (Character.isDigit(ch[i])) {
                            count2++;
                        }
                    }
                    int inval = 0;
                    int val = 0;
                    for (int i = 0; i < str.length() - 2; i++) {
                        String s = str.substring(i, i + 3);
                        int count4 = 0;
                        for (int k = 0; k < s.length(); k++) {
                            if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)
                                    && s.charAt(2) == s.charAt(0)) {
                                count4++;
                            }
                        }
                        if (count4 > 0) {
                            inval++;
                        } else {
                            val++;
                        }
                    }
                    if (count >= 1 && count1 >= 2 && count2 >= 2 && inval == 0 && val > 0) {
                        System.out.println("valid");
                    } else {
                        System.out.println("invalid");
                    }

                } else {
                    System.out.println("invalid");
                }

            } else {
                System.out.println("invalid");

            }

        } else {
            System.out.println("invalid");

        }
    }
}
