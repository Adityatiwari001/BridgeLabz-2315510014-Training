package FullStack;

public class Copy2Dto1D {
    public static void main(String[] args) {
    
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = twoDArray.length;
        int cols = twoDArray[0].length;

      
        int[] oneDArray = new int[rows * cols];

       
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }

       
        System.out.println("1D Array elements:");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }
    }
}

