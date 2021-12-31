import java.util.ArrayList;
import java.util.Scanner;

public class BracesMissing {
    static String isBalanced(String s)
    {
        String result = "NO";
        ArrayList<String> curlyOpenList = new ArrayList<String>();
        ArrayList<String> curlyCloseList = new ArrayList<String>();
        ArrayList<String> parenthesisOpenList = new ArrayList<String>();
        ArrayList<String> parenthesisCloseList = new ArrayList<String>();
        ArrayList<String> squareOpenList = new ArrayList<String>();
        ArrayList<String> squareCloseList = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '{'){
                curlyOpenList.add(Character.toString(s.charAt(i)));
            } else if(s.charAt(i) == '(') {
                parenthesisOpenList.add(Character.toString(s.charAt(i)));
            }else if(s.charAt(i)== '[') {
                squareOpenList.add(Character.toString(s.charAt(i)));
            }else if(s.charAt(i) == '}') {
                curlyCloseList.add(Character.toString(s.charAt(i)));
            }else if(s.charAt(i) == ')'){
                parenthesisCloseList.add((Character.toString(s.charAt(i))));
            }else if(s.charAt(i) == ']') {
                squareCloseList.add(Character.toString(s.charAt(i)));
            }
        }
        if((curlyOpenList.size()!=curlyCloseList.size()) ||
                (parenthesisOpenList.size() != parenthesisCloseList.size()) ||
                (squareOpenList.size() != squareCloseList.size()))
        {
            return result ;
        }
        return result="YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }
}
