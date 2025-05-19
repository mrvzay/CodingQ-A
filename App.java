public class App {

    public static void main(String[] args) {

        // Write a Java Program to reverse a string without using String inbuilt function ?

        // Solution 1
        System.out.println(reverseString("hello"));

        // Solution 2
        String input = "cool are strings!";
        char[] characters = input.toCharArray();
        String reversed = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }

        System.out.println(reversed);
    }

    public static String reverseString(String input) {

        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
