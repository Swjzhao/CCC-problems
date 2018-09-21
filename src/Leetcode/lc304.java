package Leetcode;

public class lc304 {

	public static void main(String[] args) {
		int[][] matrix ={{3, 0, 1, 4, 2},
		                            {5, 6, 3, 2, 1},
		                            {1, 2, 0, 1, 5},
		                            {4, 1, 0, 1, 7},
		                            {1, 0, 3, 0, 5}};
		
		NumMatrix nm = new NumMatrix(matrix);
		
		System.out.println(nm.sumRegion(2, 1, 4, 3));

	}

}
class NumMatrix {
    
    int[][] matrix;
    int[][] table;
    boolean b = true;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        if(matrix.length == 0){
            b = false;
        }else{
        table = new int[matrix.length + 1][matrix[0].length + 1];
        for(int i = 1; i < matrix.length + 1 ; i++){
            for(int j = 1; j < matrix[0].length + 1; j++){
                table[i][j] = matrix[i-1][j-1] + table[i][j-1] + table[i-1][j] - table[i-1][j-1];
            }
        }
        }
        
        for(int i = 0; i < matrix.length+1; i++){
        	for(int j = 0; j< matrix[0].length +1; j++){
        		System.out.print(table[i][j] + " ");
        	}
        	System.out.println();
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(b)
        return table[row2+1][col2+1] - table[row1][col2+1]-table[row2+1][col1] + table[row1][col1];  
        else
        return 0;
    }
}
