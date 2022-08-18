//Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»

public class Hello {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[i]);
                }
            }
        }
    }
}