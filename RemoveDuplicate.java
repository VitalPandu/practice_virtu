import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
            System.out.println(removeDuplicate("geeksforgeeks"));
        }
        static String removeDuplicate(String input1)
        {
            int index = 0;
            char[] str = input1.trim().toCharArray();

            for (int i = 0; i < input1.length(); i++)
            {

                int j;
                for (j = 0; j < i; j++)
                {
                    if (str[i] == str[j])
                    {
                        break;
                    }
                }
                if (j == i)
                {
                    str[index++] = str[i];
                }
            }
            return String.valueOf(Arrays.copyOf(str, index));
    }

}
