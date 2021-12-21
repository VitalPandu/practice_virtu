public class PushZerosToEnd {

        static void pushZerosToEnd(int input1[], int input2)
        {
            int count = 0;

            for (int i = 0; i < input2; i++) {
                if (input1[i] != 0) {
                    input1[count++] = input1[i];
                }
            }
            while (count < input2)
                input1[count++] = 0;
        }

        public static void main (String[] args)
        {
            int arr[] = {5,0,7,0,6};
            int n = arr.length;
            pushZerosToEnd(arr, n);
            System.out.println("Array after pushing zeros to the back: ");
            for (int i=0; i<n; i++)
                System.out.print(arr[i]+" ");
        }
    }

