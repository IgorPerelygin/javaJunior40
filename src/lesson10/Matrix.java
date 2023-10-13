package lesson10;

public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        if (row < 0 || row > 10 || col < 0 || col > 10) {
            nums = new double[1][1];
        } else {
            nums = new double[row][col];
        }
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
            return -1;
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
            return;
        }
        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // otherMatrix = b
        // this = a
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Матрицы не равны!!!");
        }
        for (int q = 0; q < otherMatrix.getRows(); q++) {
            for (int w = 0; w < otherMatrix.getColumns(); w++) {
                if (otherMatrix.getValueAt(q, w) == 0) {
                    throw new NullPointerException("Второй аргумент null");
                }
            }
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() && this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны!!!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, (this.getValueAt(i, j) - otherMatrix.getValueAt(i, j)));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getColumns()) {
            System.out.println("Матрицы нельзя умножить!!!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getRows(); k++) {
                    result.setValueAt(i, j, (result.getValueAt(i, j) + this.getValueAt(i, k) * otherMatrix.getValueAt(k, j)));
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        int numForMultiplication = 5;
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * numForMultiplication);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < this.getRows(); i++)
            for (int j = 0; j < this.getColumns(); j++)
                result.setValueAt(j, i, this.getValueAt(i, j));
        return result;
    }


    @Override
    public void fillMatrix(double value) {
        double numForFilling = 123;
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, numForFilling);
            }
        }
        return;
    }

    @Override
    public double determinant() {
        if (this.getRows() != this.getColumns()) {
            System.out.println("Матрицы не равны!!!");
            return 0;
        }
        int numDeterminate = 0;
        numDeterminate = ((int) ((this.getValueAt(0, 0) * this.getValueAt(1, 1)) -
                (this.getValueAt(0, 1) * (this.getValueAt(1, 0)))));

        return numDeterminate;
    }


    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                if (i == j && this.getValueAt(i, j) != 1) {
                    return false;

                } else if (i != j && this.getValueAt(i, j) != 0)
                    return false;
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (getRows() == getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
