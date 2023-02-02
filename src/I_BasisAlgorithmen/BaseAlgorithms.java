package I_BasisAlgorithmen;
public class BaseAlgorithms {

    public static void main(String[] args) {
        int[] intArray = {2,4,2,7,2,5,5};
        int[] RevArray = revert(intArray);
        int maxNumber = getMax(intArray);
        int minNumber = getMin(intArray);
        printArray(RevArray);
        printNumber(maxNumber);
        printNumber(minNumber);
    }

    public static int[] revert(int[] data){
        int[] array = new int[data.length];
        int temp = 0;

        for (int i = data.length- 1; i >= 0; i--) {
            array[temp] = data[i];
            temp++;
        }
        return array;
    }

    public static int getMax(int[] data){
        int temp = data[0];
        for (int datum : data) {
            if (temp < datum) {
                temp = datum;
            }
        }
        return temp;
    }

    public static int getMin(int[] data){
        int temp = data[0];
        for (int datum : data) {
            if (temp > datum) {
                temp = datum;
            }
        }
        return temp;
    }

    public static void printArray(int[] data){
        for (int datum : data) {
            System.out.print(datum + "  ");

        }
        System.out.println();
        System.out.println();
    }

    public static void printNumber(int number){
        System.out.println(number);
        System.out.println();
    }
}

