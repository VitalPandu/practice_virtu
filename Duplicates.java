import java.util.Arrays;

public class Duplicates {
    static int[] removeDuplicates(int input1[], int input2)
    {
      return Arrays.stream(input1).distinct().toArray();
//        int[] temp = new int[input2];
//        int j = 0;
//        for (int i=0; i<input2-1; i++)
//            if (input1[i] != input1[i+1])
//                temp[j++] = input1[i];
//        temp[j++] = input1[input2-1];
//
//
//        for (int i=0; i<j; i++)
//            input1[i] = temp[i];
//
//        int[] tempArr =new int[j];
//        for (int i=0; i<j; i++)
//            tempArr[i]=input1[i];
//
//        return tempArr;
    }

    public static void main(String[] args) {
      int[] a =  removeDuplicates(new int[]{1,2,3,4,5,5,1,2,4,7,3,5},12);
        Arrays.stream(a).forEach(System.out::println);
    }
}
