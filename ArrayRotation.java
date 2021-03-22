public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = new int[10];

        int d = 5;
        for(int m = 0 ;m <10;m++){
            array[m] = m;
        }

        for(int i = 0 ; i< d;i++){
            int temp = array[0];
            for (int j = 0 ; j < array.length-1;j++){
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
        }
    }
}
