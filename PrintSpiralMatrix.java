public class PrintSpiralMatrix {

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiralMatrix(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        while(totalElement < r * c){
            //topRow -> leftCol - rightCol
            for(int j = leftCol; j <= rightCol && totalElement < r * c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            //rightCol -> topRow - bottomRow
            for(int i = topRow; i <= bottomRow && totalElement < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            //bottomRow -> rightCol - leftCol
            for(int j = rightCol; j >= leftCol && totalElement < r * c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            //leftCol -> bottomRow - topRow
            for(int i = bottomRow; i >= topRow && totalElement < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args){
        int[][] matrix = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = (int)(Math.random()* 100);
            }
        }
        System.out.println("Given matrix is : ");
        printMatrix(matrix);

        System.out.println("Matrix in spiral order is :");
        printSpiralMatrix(matrix, 4, 4);
    }
}
