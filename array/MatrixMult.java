import java.util.Scanner;
class MatrixMult{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the first matrix:");
        int r1= sc.nextInt();
	System.out.println("Enter number of columns of cols for the first matrix:");
        int c1= sc.nextInt();
        System.out.println("Enter the number of rows for the second matrix:");
        int r2= sc.nextInt();
	System.out.println("Enter number of columns for the second matrix:");
        int c2= sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
System.out.println("matrix 1 is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }
    
	int[][] matrix2 = new int[r2][c2];
  	System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
System.out.println("second matrix is:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }
 int[][] resultMatrix = new int[r1][c2]; 
        System.out.println("product is:"); 
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) { 
                for (int k = 0; k < c1; k++) { 
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j]; 

                } 
                System.out.print(resultMatrix[i][j] + " "); 
            } 
            System.out.println();
}
}
}

    