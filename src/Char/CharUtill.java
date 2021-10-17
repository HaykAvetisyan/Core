package Char;

public class CharUtill {
    public static void main(String[] args) {


        char[] bolola = {'b', 'o', 'l', 'b', 'l', 'b'};
        char c = 'o';
        int countOFc = 0;
        for (char aBolola : bolola) {
            if (aBolola == c) {
                countOFc++;
            }
        }
        System.out.println("Count of o is " + countOFc);
        System.out.println("-------------------------");


        System.out.println(bolola[bolola.length / 2]);
        System.out.println(bolola[bolola.length / 2 - 1]);
        System.out.println("-------------------------");
        Boolean findLy = false;
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            findLy = true;
        }
        System.out.println(findLy);
        System.out.println("-------------------------");

        Boolean bobishere = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                bobishere = true;
            }
        }
        System.out.println(" " + bobishere);

        System.out.println("-------------------------");


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', 'a', ' '};
        int withoutBrace = 0;

        for (char aText : text) {
            if (aText != ' ') {
                withoutBrace++;
            }
        }
        char[] newText = new char[withoutBrace];
        int index = -1;

        for (char aText : text) {
            if (aText != ' ') {
                index++;
                newText[index] = aText;
            }
        }
        System.out.println("new text is  ");
        for (char aNewText : newText) {

            System.out.print(aNewText);
        }
    }


}

