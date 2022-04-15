package matrix;
import exception.MyException;

public class Matrix {
    protected int[][] matrix;
    protected int row;
    protected int column;

    public Matrix(int row1, int column1) {
        row = row1;
        column = column1;
        this.matrix = new int[row][column];

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < column; ++j)
                this.matrix[i][j] = 0;
    }

    public Matrix sum(Matrix matrix1) {
        if ((this.row == matrix1.row) && (this.column == matrix1.column)) {
            Matrix m = new Matrix(row, column);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    int tmp = matrix1.getElement(i, j) + this.getElement(i, j);
                    m.setElement(i, j, tmp);
                }
            }
            return m;
        }
        else {
            throw new MyException("Matrix sizes are different");
        }
    }

    public Matrix product(Matrix add) {
        if (this.column == add.row) {

            Matrix Product = new Matrix(this.row, add.column);

            for (int i = 0; i < Product.row; ++i)
                for (int j = 0; j < Product.column; ++j)
                    for (int k = 0; k < this.column; ++k)
                        Product.setElement(i,j, Product.getElement(i,j) + this.getElement(i, k) * add.getElement(k, j));
            return Product;
        }
        else {
            throw new MyException("Matrix sizes are different");
        }
    }

    public void setElement(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        return this.matrix[row][column];
    }

    public boolean equals(Matrix matrix1) {
        if ((matrix1.row == this.row) && (matrix1.column == this.column)) {
            for (int i = 0; i < row; ++i)
                for (int j = 0; j < column; ++j)
                    if (this.matrix[i][j] != matrix1.matrix[i][j])
                        return false;
            return true;
        }
        else
            return false;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < row; i++) {
            String str1 = new String();
            for (int j = 0; j < column; j++) {
                str1 += this.getElement(i,j) + " ";
            }
            str.append(str1 + "\n");
        }
        return str + "";
    }
}
