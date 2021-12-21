public class findMajority {
    static int findMajority(int input1, int[] input2)
    {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < input1; i++) {
            int count = 0;
            for (int j = 0; j < input1; j++) {
                if (input2[i] == input2[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > input1 / 2)
            return input2[index];
        return -1;
    }
}
