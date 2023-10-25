package lesson14;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixTest extends TestCase {


    // метод GetValueAt. Проверка на выброс исключения
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueAt_ThrowIndexOutOfBounds() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(22, 22);
    }


    // метод GetValueAt. Проверка на валидных данных
    public void testGetValueAt_ReturnCorrectResult() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(1, 1);
        double resultWait = 5.0;
        assertEquals(resultWait, resultFact);
    }

    // метод GetValueAt. Проверка на валидных данных (отрицательные и нули)
    public void testGetValueAtNegativeNum_ReturnCorrectResult() {
        double[][] forMatrix = {{0, 0, 0}, {-4, -5, -6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(1, 2);
        double resultWait = -6.0;
        assertEquals(resultWait, resultFact);
    }

    //метод setValueAt. Проверка на выброс исключения
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueAt_ThrowIndexOutOfBounds() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.setValueAt(22, 22, 4.0);
    }

    //метод setValueAt. Проверка на валидные данные
    public void testSetValueAtBigNum_ReturnCorrectResult() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.setValueAt(0, 1, 1234555456);
        double resultFact = matrix.getValueAt(0, 1);
        double resultWait = 1234555456;
        assertEquals(resultWait, resultFact);
    }

    //метод setValueAt. Проверка на валидные данные
    @Test
    public void testSetValueAt_valid_SetCorrectValue() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);

        matrix.setValueAt(0, 1, 10.0);
        Assert.assertEquals(10.0, matrix.getValueAt(0, 1), 0);

        matrix.setValueAt(2, 0, -20.0);
        Assert.assertEquals(-20.0, matrix.getValueAt(2, 0), 0);
    }

    //метод sub. Проверка на выброс исключения
    @Test(expected = NullPointerException.class)
    public void testSubWithNullMatrix_ThrowNullPointerException() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.sub(null);
    }

    //метод sub. Проверка на валидных данных
    public void testSubWithMatrix_ReturnCorrectResult() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 8}};
        double[][] forExpectedResult = {{10, 10, 10}, {10, 10, 10}, {10, 10, 11}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        Matrix expectedResult = new Matrix(forExpectedResult);

        IMatrix resultMatrix = matrix1.sub(matrix2);
        for (int i = 0; i < expectedResult.getRows(); i++) {
            for (int j = 0; j < expectedResult.getColumns(); j++) {
                assertEquals(expectedResult.getValueAt(i, j), resultMatrix.getValueAt(i, j), 0.001);
            }
        }
    }

    //метод sub. Проверка на выброс исключения
    @Test(expected = IllegalArgumentException.class)
    public void testSubWithDifferentSize_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.sub(matrix2);
    }

    //метод add. Валидные данные

    @Test
    public void testAdd_sameSizeMatrices_ReturnCorrectResult() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        IMatrix result = matrix1.add(matrix2);

        Assert.assertEquals(12.0, result.getValueAt(0, 0), 0);
        Assert.assertEquals(14.0, result.getValueAt(0, 1), 0);
        Assert.assertEquals(16.0, result.getValueAt(0, 2), 0);
        Assert.assertEquals(18.0, result.getValueAt(1, 0), 0);
        Assert.assertEquals(20.0, result.getValueAt(1, 1), 0);
        Assert.assertEquals(22.0, result.getValueAt(1, 2), 0);
        Assert.assertEquals(24.0, result.getValueAt(2, 0), 0);
        Assert.assertEquals(26.0, result.getValueAt(2, 1), 0);
        Assert.assertEquals(28.0, result.getValueAt(2, 2), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_differentSizeMatrices_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.add(matrix2);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullMatrix_ThrowNullPointerException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        Matrix matrix1 = new Matrix(forMatrix1);
        matrix1.add(null);
    }

    public void testDeterminant_ReturnCorrectResult() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantNegativeNum_ReturnCorrectResult() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    @Test
    public void testTransposeNegativeNums_ReturnCorrectResult() {
        Matrix matrix = new Matrix(new double[][]{{-1, -2, 0}, {-4, -5, -6}, {-7, -8, -9}});
        IMatrix result = matrix.transpose();
        assertEquals(-1, result.getValueAt(0, 0), 0);
        assertEquals(-4, result.getValueAt(0, 1), 0);
        assertEquals(-7, result.getValueAt(0, 2), 0);
        assertEquals(-2, result.getValueAt(1, 0), 0);
        assertEquals(-5, result.getValueAt(1, 1), 0);
        assertEquals(-8, result.getValueAt(1, 2), 0);
        assertEquals(0, result.getValueAt(2, 0), 0);
        assertEquals(-6, result.getValueAt(2, 1), 0);
        assertEquals(-9, result.getValueAt(2, 2), 0);
    }

    public void testTranspose_ReturnCorrectResult() {
        Matrix matrix = new Matrix(new double[][]{{1, 2}, {3, 4}});
        IMatrix result = matrix.transpose();
        assertEquals(1, result.getValueAt(0, 0), 0);
        assertEquals(3, result.getValueAt(0, 1), 0);
        assertEquals(2, result.getValueAt(1, 0), 0);
        assertEquals(4, result.getValueAt(1, 1), 0);
    }


    //    метод mul. Валидные данные
    public void testMul_ReturnCorrectResult() {
        Matrix matrix = new Matrix(new double[][]{{1, 2}, {3, 4}});
        IMatrix result = matrix.mul(22);
        assertEquals(22, result.getValueAt(0, 0), 0);
        assertEquals(44, result.getValueAt(0, 1), 0);
        assertEquals(66, result.getValueAt(1, 0), 0);
        assertEquals(88, result.getValueAt(1, 1), 0);
    }


    @Test(expected = NullPointerException.class)
    public void testMul_ThrowNullPointerException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = null;
        matrix1.mul(matrix2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMul_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.mul(matrix2);
    }
    public void testDeterminantTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest2() {

        double[][] forMatrix = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest3() {

        double[][] forMatrix = {{64564855, 3483832, 24565646},
                {89679636, 7896796, 67679678},
                {87678678, 45637988, 86486355}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 1.0850885456305839;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest4() {

        double[][] forMatrix = {{-6456485, -3483832, -2456564},
                {-8967963, -7896796, -6767967},
                {-8767868, -4563798, -86486355}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 108508850728346450000.0;
        assertEquals(resultFact, resultWant);

    }

    public void testDeterminantTest5() {

        double[][] forMatrix = {{-1, -2, -3},
                {4, 5, 6},
                {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testAddTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    @Test(expected = NullPointerException.class)
    public void testAddTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {2, 5, 6}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testAddTest4() {

        double[][] forMatrixA = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixB = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixC = {{199999998, 199999998, 199999998},
                {199999998, 199999998, 199999998},
                {199999998, 199999998, 199999998}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testAddTest5() {

        double[][] forMatrixA = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixB = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixC = {{-19999998, -19999998, -19999998},
                {-19999998, -19999998, -19999998},
                {-19999998, -19999998, -19999998}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testAddTest6() {

        double[][] forMatrixA = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testSubTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixC = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }

    @Test(expected = NullPointerException.class)
    public void testSubTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSubTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testSubTest4() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}};
        double[][] forMatrixC = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testSubTest5() {
        double[][] forMatrixA = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixB = {{99999998, 99999998, 99999998},
                {99999998, 99999998, 99999998},
                {99999998, 99999998, 99999998}};
        double[][] forMatrixC = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testSubTest6() {

        double[][] forMatrixA = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};
        double[][] forMatrixB = {{-2, -3, -4},
                {-5, -6, -7},
                {-8, -9, -10}};
        double[][] forMatrixC = {{3, 5, 7},
                {9, 11, 13},
                {15, 17, 19}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{-2, -3, -4},
                {-5, -6, -7},
                {-8, -9, -10}};
        double[][] forMatrixC = {{-36, -42, -48},
                {-81, -96, -111},
                {-126, -150, -174}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    @Test(expected = NullPointerException.class)
    public void testMulTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMulTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {2, 5, 6}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest4() {
        double[][] forMatrixA = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixB = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixC = {{299999994, 299999994, 299999994},
                {299999994, 299999994, 299999994},
                {299999994, 299999994, 299999994}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest5() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest6() {

        double[][] forMatrixA = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixB = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixC = {{299999940, 299999940, 299999940},
                {299999940, 299999940, 299999940},
                {299999940, 299999940, 299999940}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = 1;
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = -1;
        double[][] forMatrixB = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = 99999999;
        double[][] forMatrixB = {{99999999, 199999998, 299999997},
                {399999996, 499999995, 599999994},
                {699999993, 799999992, 899999991}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest4() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = -99999999;
        double[][] forMatrixB = {{-99999999, -199999998, -299999997},
                {-399999996, -499999995, -599999994},
                {-699999993, -799999992, -899999991}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest5() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = 0;
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] MatrixResult = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest2() {

        double[][] forMatrix = {{-9999999, -9999999, -9999999},
                {9999999, 9999999, 9999999},
                {9999999, 9999999, 9999999}};
        double[][] MatrixResult = {{-9999999, 9999999, 9999999},
                {-9999999, 9999999, 9999999},
                {-9999999, 9999999, 9999999}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest3() {

        double[][] forMatrix = {{1, 2, 3},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] MatrixResult = {{1, 0, 0},
                {2, 0, 0},
                {3, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest4() {

        double[][] forMatrix = {{1, 0, 0},
                {2, 0, 0},
                {3, 0, 0}};
        double[][] MatrixResult = {{1, 2, 3},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest5() {

        double[][] forMatrix = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] MatrixResult = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testDeterminantTest01() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest02() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testGetRows1() {
        double[][] forTestGetRows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 3;
        assertEquals(resultFact, resultWant);
    }

    public void testGetRows2() {
        double[][] forTestGetRows = new double[5][6];
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 5;
        assertEquals(resultFact, resultWant);
    }


    public void testGetColumns1() {
        double[][] forTestGetColums = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetColums);
        int resultFact = matrix.getColumns();
        int resultWant = 4;
        assertEquals(resultFact, resultWant);
    }

    public void testGetColumns2() {
        double[][] forTestGetColums = new double[3][2];
        Matrix matrix = new Matrix(forTestGetColums);
        int resultFact = matrix.getColumns();
        int resultWant = 2;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt1() {
        double[][] forTestGetValueAt = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(2, 2);
        double resultWant = 9.0;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt2() {
        double[][] forTestGetValueAt = new double[3][3];
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(1, 1);
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAtThrowsException() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestGetValueAt = new double[3][3];
            Matrix matrix = new Matrix(forTestGetValueAt);
            double resultFact = matrix.getValueAt(3, 1);
            double resultWant = 0.0;
        } catch (IndexOutOfBoundsException iO) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testSetValueAt1() {
        double[][] forTestSetValueAt = new double[4][4];
        Matrix matrix = new Matrix(forTestSetValueAt);
        double resultFact = matrix.setValueAt(1, 3, 4);
        double resultWant = 4.0;
        assertEquals(resultFact, resultWant);
    }

    public void testSetValueAt2() {
        double[][] forTestSetValueAt = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestSetValueAt);
        double resultFact = matrix.setValueAt(1, 3, 3);
        double resultWant = 3.0;
        assertEquals(resultFact, resultWant);
    }

    public void testSetValueAtThrowsException() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestSetValueAt = new double[3][3];
            Matrix matrix = new Matrix(forTestSetValueAt);
            double resultFact = matrix.setValueAt(4, 2, 4);
            double resultWant = 4.0;
        } catch (IndexOutOfBoundsException iO) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testAddMatrix1() {
        double[][] forTestAddMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestAddMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{2, 4, 6, 4}, {8, 10, 12, 9}, {14, 16, 18, 14}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix2() {
        double[][] forTestAddMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestAddMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{-2, -4, -6, -4}, {-8, -10, -12, -9}, {-14, -16, -18, -14}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix3() {
        double[][] forTestAddMatrixT = new double[5][5];
        double[][] forTestAddMatrixO = new double[5][5];
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrixThrowsException1() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestAddMatrixT = new double[3][4];
            double[][] forTestAddMatrixO = new double[3][3];
            Matrix matrixT = new Matrix(forTestAddMatrixT);
            Matrix matrixO = new Matrix(forTestAddMatrixO);
            IMatrix resFact = matrixT.add(matrixO);
        } catch (IllegalArgumentException i) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }


    public void testAddMatrixThrowsException2() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestAddMatrixT = new double[3][4];
            double[][] forTestAddMatrixO = null;
            Matrix matrixT = new Matrix(forTestAddMatrixT);
            Matrix matrixO = new Matrix(forTestAddMatrixO);
            IMatrix resFact = matrixT.add(matrixO);
        } catch (NullPointerException n) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testSubMatrix1() {
        double[][] forTestSubMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestSubMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0, -2}, {0, 0, 0, -3}, {0, 0, 0, -4}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);

    }

    public void testSubMatrix2() {
        double[][] forTestSubMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestSubMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0, 2}, {0, 0, 0, 3}, {0, 0, 0, 4}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testSubMatrix3() {
        double[][] forTestSubMatrixT = new double[3][3];
        double[][] forTestSubMatrixO = new double[3][3];
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testSubMatrixThrowsException1() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestSubMatrixT = new double[4][5];
            double[][] forTestSubMatrixO = new double[3][5];
            Matrix matrixT = new Matrix(forTestSubMatrixT);
            Matrix matrixO = new Matrix(forTestSubMatrixO);
            IMatrix resFact = matrixT.sub(matrixO);
        } catch (IllegalArgumentException i) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testSubMatrixThrowsException2() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestSubMatrixT = new double[4][5];
            double[][] forTestSubMatrixO = null;
            Matrix matrixT = new Matrix(forTestSubMatrixT);
            Matrix matrixO = new Matrix(forTestSubMatrixO);
            IMatrix resFact = matrixT.sub(matrixO);
        } catch (NullPointerException n) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testMulMatrix1() {
        double[][] forTestMulMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestMulMatrixO = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4, 5, 7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix2() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}, {-4, -5, -7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix3() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix4() {
        double[][] forTestMulMatrixT = new double[3][4];
        double[][] forTestMulMatrixO = new double[4][3];
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrixThrowsException1() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestMulMatrixT = new double[4][5];
            double[][] forTestMulMatrixO = new double[4][4];
            Matrix matrixT = new Matrix(forTestMulMatrixT);
            Matrix matrixO = new Matrix(forTestMulMatrixO);
            IMatrix resFact = matrixT.mul(matrixO);
        } catch (IllegalArgumentException i) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testMulMatrixThrowsException2() {
        boolean exceptionTrown = false;
        try {
            double[][] forTestMulMatrixT = new double[4][5];
            double[][] forTestMulMatrixO = null;
            Matrix matrixT = new Matrix(forTestMulMatrixT);
            Matrix matrixO = new Matrix(forTestMulMatrixO);
            IMatrix resFact = matrixT.mul(matrixO);
        } catch (NullPointerException n) {
            exceptionTrown = true;
        }
        assertTrue(exceptionTrown);
    }

    public void testMulonNumMatrix1() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(5);
        double[][] arrayWant = {{-5, -10, -15, -5}, {-20, -25, -30, -15}, {-35, -40, -45, -25}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulonNumMatrix2() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(-5);
        double[][] arrayWant = {{5, 10, 15, 5}, {20, 25, 30, 15}, {35, 40, 45, 25}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulonNumMatrix3() {
        double[][] forTestMulonNumMatrix = {{1, 2, 3, 4}, {5, 6, 7, 9}, {11, 32, 11, 25}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(0);
        double[][] arrayWant = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testFillMatrix() {
        double[][] forTestFillMatrix = new double[3][3];
        Matrix matrix = new Matrix(forTestFillMatrix);
        matrix.fillMatrix(3);
        IMatrix resultFact = matrix;
        double[][] arrayWant = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testFillMatrixbyBycicle() {
        double[][] forTestFillMatrix = new double[3][3];
        double[][] resultWant = {{-4, -4, -4}, {-4, -4, -4}, {-4, -4, -4}};
        Matrix factMatrix = new Matrix(forTestFillMatrix);
        factMatrix.fillMatrix(-4);
        double[][] resultFact = new double[factMatrix.getRows()][factMatrix.getColumns()];
        for (int i = 0; i < factMatrix.getRows(); i++) {
            for (int j = 0; j < factMatrix.getColumns(); j++) {
                resultFact[i][j] = factMatrix.getValueAt(i, j);
            }
        }
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueAtThrowsException2() {
        double[][] forTestSetValueAt = new double[3][3];
        Matrix matrix = new Matrix(forTestSetValueAt);
        double resultFact = matrix.setValueAt(3, 2, 4);
    }
}
