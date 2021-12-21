import java.util.ArrayList;
import java.util.Scanner;

public class BracesMissing {
    static String isBalanced(String s)
    {
        String result = "NO";
        ArrayList<String> al = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                al.add(Character.toString(s.charAt(i)));
            } else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(al.size() != 0 && al.get(al.size()-1).equals("(") && s.charAt(i) == ')')
                {
                    al.remove(al.size()-1);
                }
                else if(al.size() != 0 && al.get(al.size()-1).equals("{") && s.charAt(i) == '}')
                {
                    al.remove(al.size()-1);
                }
                else if(al.size() != 0 && al.get(al.size()-1).equals("[") && s.charAt(i) == ']')
                {
                    al.remove(al.size()-1);
                }
                else
                {
                    return result = "NO";
                }
            }

        }
        if(al.isEmpty() == true)
        {
            return result = "YES";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isBalanced(s));
    }
}
