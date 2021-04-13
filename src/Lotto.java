public class Lotto {
    private int[] array;
    public Lotto()
    {
        array = new int[3];
       
        for (int i = 0; i <3 ; i++) {
            int number = (int) (Math.random() * (9 - 1)+ 1);
            array[i] = number;
        }

    }
//array
    public int[] getArray() {
        return array;
    }
}
