public class PalindromeCountInSentence {

        static int countPalindrome(String input1) {
            input1 = input1 + " ";
            String word = "";
            int count = 0;
            for (int i = 0; i < input1.length(); i++)
            {
                char ch = input1.charAt(i);
                if (ch != ' ')
                    word = word + ch;
                else {
                    if (checkPalindrome(word))
                        count++;
                    word = "";
                }
            }

            return count;
        }
    static boolean checkPalindrome(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--)
            if (word.charAt(i) != word.charAt(n - 1))
                return false;
        return true;
    }

        // Driver code
        public static void main(String args[])
        {
            System.out.println(countPalindrome("hello world"));
//
//            System.out.println(countPalindrome("Nitin "
//                    + "speaks malayalam"));
        }
}

