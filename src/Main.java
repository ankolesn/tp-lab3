import matrix.*;
import exception.*;

public class Main{
    public static void main(String[] args) {

        Matrix B = new Matrix(2, 2);
        B.setElement(0, 0, 1);
        B.setElement(0, 1, 2);
        B.setElement(1, 0, 3);
        B.setElement(1, 1, 4);

        SquareMatrix A = new SquareMatrix(5);
        A.setElement(0, 0, 1);
        A.setElement(0, 1, 2);
        A.setElement(1, 0, 1);
        A.setElement(1, 1, 2);

        MagicMatrix C = new MagicMatrix(4, 2, 7);

        C.setElement(3, 0, 8);
        System.out.println(C.getElement(3, 6));

        try {
            System.out.println(C);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
