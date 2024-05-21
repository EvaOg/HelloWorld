package string;

public class Substring {
    public static void main(String[] args) {
        String str = "";
        System.out.println(findLastWord(str));

    }

    public static int findLastWord(String s){
        int count = 0;
        if(s.isEmpty()) {
            return count;
        }
        if(s.length() == 1 && s.equals(" ")) {
            return count;
        }



        for(int i=s.length()-1; i>=0; i--){
            while(s.charAt(i) == ' '){
                i--;
            }
            while(s.charAt(i) != ' '){
                count++;
                i--;
            }
            break;
        }

        return count;
    }
}
