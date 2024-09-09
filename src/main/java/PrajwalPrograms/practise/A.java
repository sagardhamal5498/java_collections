package PrajwalPrograms.practise;

public class A {

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {//ensuring array is not empty or contains null.
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {//moving start until alphanumeric char found.
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {//moving end for same as above.
                end--;
            }
            //using two-pointer method to find if character at start is equals to end. If not returning false.
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s="race a car";
        boolean status = isPalindrome(s);
        System.out.println(status);

    }
}
