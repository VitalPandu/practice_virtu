public class Duplicates {
    static int[] removeDuplicates(int input1[], int input2)
    {
        int[] temp = new int[input2];
        int j = 0;
        for (int i=0; i<input2-1; i++)
            if (input1[i] != input1[i+1])
                temp[j++] = input1[i];
        temp[j++] = input1[input2-1];


        for (int i=0; i<j; i++)
            input1[i] = temp[i];

        int[] tempArr =new int[j];
        for (int i=0; i<j; i++)
            tempArr[i]=input1[i];

        return tempArr;
    }
}
