public class ArraySort {
    public static void main(String[] args) {
        int[] array = {-1, 2, 0, 85, 10, 8};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {

                if (array[j] > array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        char[] text = {'a', ' ', 'b', 'a', 'r', ' ', 'e', 'v', 'a', ' ', 'v','a','b',' '};


        int start = 0;
        int end = text.length;

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                start++;
                break;
            }
        }
        for (int i = text.length - 1; i > 0; i--) {
            if (text[i] != ' ') {
                end--;
                break;
            }
        }


        for (int j = start; j < end; j++) {
            System.out.print(text[j]);
        }


    }
}
