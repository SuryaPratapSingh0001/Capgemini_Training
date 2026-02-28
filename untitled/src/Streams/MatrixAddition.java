package Streams;

class RowAdder implements Runnable {

    private int[][] mat1;
    private int[][] mat2;
    private int[][] result;
    private int row;

    public RowAdder(int[][] mat1, int[][] mat2, int[][] result, int row) {
        this.mat1 = mat1;
        this.mat2 = mat2;
        this.result = result;
        this.row = row;
    }

    @Override
    public void run() {
        for (int col = 0; col < mat1[row].length; col++) {
            result[row][col] = mat1[row][col] + mat2[row][col];
        }
        System.out.println("Row " + row + " added by " + Thread.currentThread().getName());
    }
}

public class MatrixAddition {

    public static void main(String[] args) throws InterruptedException {

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 1, 1},
                {2, 2, 2}
        };

        int[][] mat2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        int[][] result = new int[5][3];

        Thread[] threads = new Thread[5];

        // Create 5 threads (one per row)
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new RowAdder(mat1, mat2, result, i));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }

        // Print Result Matrix
        System.out.println("\nResult Matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
