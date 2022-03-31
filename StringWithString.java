import java.util.Arrays;

public class StringWithString {
    public static void main(String[] args) {
        System.out.println(stringWithString("abab","baaa"));
    }
    static String stringWithString(String input1, String input2){
        //logic start
        if( input1.contains(input2)){
            return "yes";
        }return "no";
        //logic end
    }
}
