public class CuckooSequence {

    static int cuckooSequence( int input1)
    {
        int value=0,i;
        for(i=1;i<input1;i++){
            value = value+i*(input1-i);
        }
        return value;
    }
}
