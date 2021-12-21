public class MaxcuuranceOfCharacter {

    static String getMaxOccuringChar(String input1)
    {

        int count[] = new int[256];
        int len = input1.length();
        for (int i=0; i<len; i++) {
            count[input1.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[input1.charAt(i)]) {
                max = count[input1.charAt(i)];
                result = input1.charAt(i);
            }
        }
        return Character.toString(result);
    }

    // Driver Method
    public static void main(String[] args)
    {
        String str = "sample string";
        System.out.println("Max occurring character is " +
                getMaxOccuringChar(str));
    }
}
