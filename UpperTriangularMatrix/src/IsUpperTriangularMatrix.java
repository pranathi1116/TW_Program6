import java.util.*;
public class IsUpperTriangularMatrix {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputMatrix[][];
        int isUpper = 0;
        int rowSize = scanner.nextInt();
        int columnSize = scanner.nextInt();
        if (rowSize != columnSize)
            System.out.println("no");
        else {
            inputMatrix = new int[rowSize][columnSize];
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < columnSize; j++) {
                    inputMatrix[i][j] = scanner.nextInt();
                    if (i > j && inputMatrix[i][j] == 0)
                        isUpper = 1;
                }
            }
            if (isUpper == 1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}


