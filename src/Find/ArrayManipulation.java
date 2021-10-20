package Find;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 0, 0, 5 };
        // result array = {4,5,6,5,6,0,7,8,0}

        int newlegth = array.length;
        System.out.println("length is " + array.length);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                newlegth--;
            }
        }
        System.out.println("new legth is " + newlegth);

        int[] newArray = new int[newlegth];
        int newIndexOne = 0;
        int newIndexTwo = newIndexOne + 1;
        for (int k = 0; k < array.length - 1; k++) {
            if (array[k] != 0 && array[k + 1] != 0) {
                newArray[newIndexOne] = array[k];
                newArray[newIndexTwo] = array[k + 1];
                newIndexOne++;
            }
        }
        for (int j = 0; j< newArray.length; j++) System.out.println(newArray[j]);
    }
}


