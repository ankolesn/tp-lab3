package matrix;

public final class SquareMatrix extends Matrix {
    public SquareMatrix(int row) {
        super(row, row);
        for (int i = 0; i < this.row; ++i) {
            this.matrix[i][i] = 1;
        }
    }

    public SquareMatrix sum(SquareMatrix add) {
        if (this.row == add.row) {
            SquareMatrix Sum = new SquareMatrix(this.row);
            for (int i = 0; i < this.row; ++i)
                for (int j = 0; j < this.column; ++j)
                    Sum.matrix[i][j] = this.matrix[i][j] + add.matrix[i][j];
            return Sum;
        }
        else
            return this;
    }
}