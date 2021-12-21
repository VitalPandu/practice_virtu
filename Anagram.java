import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(anagram(input1,input2));
    }

    private static String anagram(String input1, String input2){
        input1 = input1.trim();
        input2 = input2.trim();

        char[] charArr1 = input1.toCharArray();
        char[] charArr2 = input2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(Arrays.equals(charArr1,charArr2)){
            return "yes";
        }
        return "no";
    }
}
