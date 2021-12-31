public class EncodedString {
    static String encodedChar(String input1,int input2)
    {

        String expand = "";
        String temp = "";
        int freq = 0;
        for (int i=0; i < input1.length() ; )
        {
            temp = "";
            freq = 0;
            while (i < input1.length() && input1.charAt(i)>='a'
                    && input1.charAt(i)<='z')
            {

                temp += input1.charAt(i);
                i++;
            }
            while (i < input1.length() && input1.charAt(i)>='1'
                    && input1.charAt(i)<='9')
            {

                freq = freq*10 + input1.charAt(i) - '0';
                i++;
            }
            for (int j=1; j<=freq; j++)
                expand += temp;
        }
        if (freq==0)
            expand += temp;
        try{
            return String.valueOf(expand.charAt(input2-1));
        }catch(Exception e){
            return "-1";      }


    }

    public static void main(String[] args) {
        System.out.println(encodedChar("a1b1c3",5));
    }
}
