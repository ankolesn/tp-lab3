package matrix;

import exception.MyException;

public final class MagicMatrix extends Matrix{
    public MagicMatrix(int row1, int column1, int n) {
        super(row1, 1);
        for (int i = 0; i < this.row; ++i) {
            for (int j = 0; j < this.column; ++j){
                this.matrix[i][j] = n - j - 1;
            }
        }
        column = column1;
    }

    public void setElement(int row, int column, int value) {
        if (column > 0) {
            throw new MyException("Сolumn out of bounds");
        }
        else {
            this.matrix[row][column] = value;
        }
    }

    public int getElement(int i, int j) {

        return matrix[i][0] - j - 1;
    }
}
