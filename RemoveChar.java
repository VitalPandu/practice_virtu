public class RemoveChar {
    static String removeChar(String input1, String input2)
    {

        int j, count = 0, n = input1.length();
        char []t = input1.toCharArray();
        char[] a = input2.trim().toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != a[0])
                t[j++] = t[i];
            else
                count++;
        }
        while(count > 0) {
            t[j++] = '\0';
            count--;
        }
        return new String(t);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String s = "Welcome to mettl";
        System.out.println(removeChar(s, "l"));
    }
}
