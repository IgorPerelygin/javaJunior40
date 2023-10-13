package Test;

import junit.framework.TestCase;
import lesson13.HomeWork.Matrix;
import org.junit.Test;

public class MatrixTest extends TestCase {
    @Test
    public void determinantTest1(){

        double[][] forMatrix = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};

        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);
    }
    @Test
    public void determinantTest2(){

        double[][] forMatrix = {{-1,-2,-3},
                                {-4,-5,-6},
                                {-7,-8,-9}};

        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);
    }
}
