package lesson14;

public class Main1 {
    //
    public static void main(String[] args) {
        double[][] forA = {{2, 4, 3, 5},
                {1, 4, 9, 2},
                {9, 8, 5, 0}};

        double[][] forB = {{5, 0, 4, 1},
                {1, 1, 0, 1},
                {2, 3, 5, 0}};

        double[][] forC = {{5, 0, 4},
                {1, 1, 0},
                {2, 3, 5},
                {1, 2, 6}};

        double[][] forE = {{5, 0, 4},
                {1, 1, 0},
                {1, 2, 6}};

        double[][] forF = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};


        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);
        Matrix c = new Matrix(forC);
        Matrix e = new Matrix(forE);
        Matrix f = new Matrix(forF);


        double resultGet = c.getValueAt(20, 0);
        System.out.println("Индекс = " + resultGet);
        System.out.println("get--------------");

        c.setValueAt(1, 20, 6.0);
        c.printToConsole();
        System.out.println("set--------------");

        IMatrix resultSub = a.sub(f);
        resultSub.printToConsole();
        System.out.println("sub--------------");

        IMatrix resultAdd = a.add(a);
        resultAdd.printToConsole();
        System.out.println("add--------------");

        IMatrix resultMul = a.mul(c);
        resultMul.printToConsole();
        System.out.println("--------------");

        IMatrix resultTrans = a.transpose();
        resultTrans.printToConsole();
        System.out.println("tr--------------");

        IMatrix resultMulOnValue = a.mul(2);
        resultMulOnValue.printToConsole();
        System.out.println("--------------");

        Matrix d = new Matrix(3, 3);
        d.fillMatrix(4);
        d.printToConsole();
        System.out.println("--------------");

        double resultDeterminate = e.determinant();
        System.out.println("Детерминант матрицы: " + resultDeterminate);

        boolean resultIsNullMatrix = f.isNullMatrix();
        System.out.println("Матрица нулевая? " + resultIsNullMatrix);

        boolean res = f.isIdentityMatrix();
        System.out.println("Является ли матрица идентичной: " + res);

        boolean squareMatrix = a.isSquareMatrix();
        System.out.println("Является ли матрица квадратной: " + squareMatrix);

        a.printToConsole();

    }
}
