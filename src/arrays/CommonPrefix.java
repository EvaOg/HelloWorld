package arrays;

public class CommonPrefix {


    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        System.out.println(findPrefix(words));
    }

    public static String findPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];

        for (int j = 1; j < words.length; j++) {
            while (words[j].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
