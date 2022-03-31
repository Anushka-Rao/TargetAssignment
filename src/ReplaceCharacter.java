public class ReplaceCharacter {
    public static void main(String[] args)
    {
        String str = "I am always ready to learn although I do not always like being taught";

        String new_str = str.replace('a', '$');

        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
