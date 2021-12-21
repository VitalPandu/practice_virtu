import java.util.Arrays;

public class StringWithString {
    public static void main(String[] args) {

    }
    static String stringWithString(String input1, String input2){
        char[] a = input1.trim().toCharArray();
        char[] b = input2.trim().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return "yes";
        }return "no";
    }
}
