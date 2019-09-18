import java.util.HashSet;
import java.util.Random;

public class ContainsSubstring {
    static boolean hashMethod(String text, String substring) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < text.length() - substring.length() + 1; i++)
            set.add(text.substring(i, i + substring.length()));

        return set.contains(substring);
    }

    static boolean walkMethod(String text, String substring) {
        int substringIndexer = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == substring.charAt(substringIndexer))
                substringIndexer++;
            else
                substringIndexer = 0;

            if (substringIndexer == substring.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String t = randomString(10000);
        String s = randomString(5);
        System.out.println("text: " + t);
        System.out.println("substring: " + s);
        long start = System.nanoTime();
        System.out.println(hashMethod(t, s));
        long end = System.nanoTime();
        System.out.println("hash time: " + (end - start) + " nanoseconds");
        start = System.nanoTime();
        System.out.println(walkMethod(t, s));
        end = System.nanoTime();
        System.out.println("walk time: " + (end - start) + " nanoseconds");
    }

    private static String randomString(int seed) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        int length = Math.abs(rand.nextInt(seed)) + 1;
        for (int i = 0; i < length; i++)
            sb.append(randomChar());
        return sb.toString();
    }

    private static char randomChar(){
        String characters = "1234567890 ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int length = characters.length();
        Random rand = new Random();
        return characters.charAt(rand.nextInt(length));
    }
}
