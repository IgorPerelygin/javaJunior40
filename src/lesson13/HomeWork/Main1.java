package lesson13.HomeWork;

public class Main1 {
    public static void main(String[] args) {
        double[][] forA = {{1, 1, 1},
                            {2, 2, 2}};
        double[][] forB = {{4, 1, 2},
                           {3, 0, 2}};
        double[][] forC = {{1, 2}, // матрица для умножения
                           {1, 2},
                           {1, 2}};
        double[][] forD = {{1, 3}, // матрица для детерминанта
                           {2, 4}};


        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);
        Matrix c = new Matrix(forC);
        Matrix d = new Matrix(forD);

        IMatrix resultAdd = a.add(b);
        IMatrix resultSub = a.sub(b);
        IMatrix resultMul = a.mul(c);
        IMatrix resultMul2 = a.mul(3);
        IMatrix ressultTransponse = a.transpose();
        //void resultFillmatrix = a.fillMatrix();
        double resultDeterminate = d.determinant();
        boolean resultIsNullMatrix = d.isNullMatrix();
        boolean resultIsIdentity = d.isIdentityMatrix();

        System.out.println(resultAdd);



    }
}
