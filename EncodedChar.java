public class EncodedChar {

    static String encodedChar(String input1, int input2)
    {
        int i, j, n = input1.length();
        int length,number, frequency;
        char[] str = input1.toCharArray();
        i = 0;
        while (i < n) {
            j = i; length = 0; frequency = 0;
            while (j < n && Character.isAlphabetic(str[j])){
                j++;
                length++;
            }
            while (j < n && Character.isDigit(str[j])){
                frequency = frequency * 10 + (str[j] - '0');
                j++;
            }
            number = frequency * length;
            if (input2 > number){
                input2 -= number;
                i = j;
            }else{
                input2--;
                input2 %= length;
                return Character.toString(str[i + input2]);
            }
        }
        return Character.toString(str[input2 - 1]);
    }
}
