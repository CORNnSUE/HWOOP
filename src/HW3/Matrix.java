import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];

        System.out.println("Input matrix A (3x3)");
        matrixA = createMatrix(matrixA, scanner);
        System.out.println("Input matrix B (3x3)");
        matrixB = createMatrix(matrixB, scanner);

        printMatrix(matrixA);
        printMatrix(matrixB);

        System.out.println(isSameDimension(matrixA, matrixB));

        int sumMatrix[][] = add(matrixA, matrixB);
        int subtractMatrix[][] = subtract(matrixA, matrixB);
        int multipleMatrix[][] = multiply(matrixA, matrixB);

        System.out.println("Sum: ");
        printMatrix(sumMatrix);

        System.out.println("Subtract: ");
        printMatrix(subtractMatrix);

        System.out.println("Multiply: ");
        printMatrix(multipleMatrix);
    }

    //createMatrix
    public static int[][] createMatrix(int matrix[][], Scanner scanner) {
        if (matrix == null) {
            System.out.println("Invalid matrix");
            return null;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    //printMatrix
    public static void printMatrix(int matrix[][]) {

        if (matrix == null) {
            System.out.println("Invalid matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double matrix[][]) {

        if (matrix == null) {
            System.out.println("Invalid matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //dimension
    public static boolean isSameDimension(int matrixA[][], int matrixB[][]) {

        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            return true;
        }

        return false;
    }

    public static boolean isSameDimension(double matrixA[][], double matrixB[][]) {

        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            return true;
        }
        return false;
    }


    public static int[][] add(int matrixA[][], int matrixB[][]) {

        if (!isSameDimension(matrixA, matrixB)) {
            return null;
        }

        int sum[][] = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return sum;
    }

    //sum
    public static double[][] add(double matrixA[][], double matrixB[][]) {

        if (!isSameDimension(matrixA, matrixB)) {
            return null;
        }

        double sum[][] = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return sum;
    }

    public static int[][] subtract(int matrixA[][], int matrixB[][]) {

        if (!isSameDimension(matrixA, matrixB)) {
            return null;
        }

        int subtraction[][] = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < subtraction.length; i++) {
            for (int j = 0; j < subtraction[0].length; j++) {
                subtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return subtraction;
    }

    //subtract
    public static double[][] subtract(double matrixA[][], double matrixB[][]) {

        if (!isSameDimension(matrixA, matrixB)) {
            return null;
        }

        double subtraction[][] = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < subtraction.length; i++) {
            for (int j = 0; j < subtraction[0].length; j++) {
                subtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return subtraction;
    }

    public static int[][] multiply(int matrixA[][], int matrixB[][]) {

        if (matrixA[0].length != matrixB.length) {
            return null;
        }

        int product[][] = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
    }

    public static double[][] multiply(double matrixA[][], double matrixB[][]) {

        if (matrixA[0].length != matrixB.length) {
            return null;
        }

        double product[][] = new double[matrixA.length][matrixB[0].length];

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
    }

}
