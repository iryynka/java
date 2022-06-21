package startKmet.lesson6;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < i; j++) {
                    char letter = (char) (65 + j);
                    System.out.print(letter + " ");
                }
            } else {
                for (int k = 0; k < i; k++) {
                    char number = (char) (49 + k);
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }


    }
}
/*
A
2 1
C B A
4 3 2 1
E D C B A
6 5 4 3 2 1
G F E D C B A
8 7 6 5 4 3 2 1
I H G F E D C B A
 */