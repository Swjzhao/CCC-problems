public class SudokuSolver {
    public static final int DIMENSION = 9;
    public static final int NUM_CELLS = DIMENSION*DIMENSION;
    
    public static boolean isFinished = false;
    // inner class
    class Point     //x y coordinate of point
    {
        public int x = -1;
        public int y = -1; 
    }
    class BoardType
    {
        public int[][] m = new int[DIMENSION+1][DIMENSION+1];   //matrix of board contents  //never use 0
        public int freeCount;                                   //how many empty cells remain?
        Point[] move = new Point[NUM_CELLS+1];                  //track how did we fill the cells //never use 0
    }
    
    
    /**
     * @param a combinatorial search solution vector
     * @param k size of the solution
     * @param board the current sudoku board
     */
    public static void backtrack(int[] a, int k, BoardType board)
    {
        int[] c = new int[DIMENSION+1];  //candidates for the next positions
        int nCandidates = 0; //number of candidates

        if(isASolution(a, k, board))
        {
            processSolution(a, k, board);
        }
        else 
        {
            k++;
            //fast
            nCandidates = constructCandidatesAdvanced(a, k, board, c);
            
            //slow
            //nCandidates = constructCandidatesSimple(a, k, board, c);
            for(int i = 0; i<nCandidates; ++i)
            {
                a[k] = c[i];
                makeMove(a, k, board);
                
                //print solving steps
                System.out.println("move " + k);
                printBoard(board);
                
                backtrack(a, k, board);
                unmakeMove(a, k, board);
                if(isFinished) return;
            }
        }
    }
    
    //advanced version to construct candidates
    /**
     * @param a combinatorial search solution vector
     * @param k size of the solution
     * @param board the current sudoku board
     * @param c the candidates for next position (output)
     * @return the number of candidates
     */
    public static int constructCandidatesAdvanced(int[] a, int k, BoardType board, int[] c)
    {
        int nCandidates = 0;
        
        int[] nextCellXY = new int[2];
        nextCellWithMostConstraints(board,nextCellXY); //get next possible cell with fewest possibilites
        if(nextCellXY[0]<0&&nextCellXY[1]<0) return nCandidates; //no move possible, error
        
        board.move[k].x = nextCellXY[0];     //store our choice of next position
        board.move[k].y = nextCellXY[1];
        
        boolean[] possible =  new boolean[DIMENSION+1];
        possibleValueLocal(nextCellXY, board, possible);
        
        for(int i = 0; i<=DIMENSION; ++i)
        {
            if(possible[i]==true)
            {
                c[nCandidates] = i;
                ++nCandidates;
            }
        }
        return nCandidates;
    }
    //pick the first empty cell in the board
    private static void nextCellWithMostConstraints(BoardType board, int[] nextCellXY) {
        int minNumOfPossible = DIMENSION+1;
        int minX = -1; int minY = -1;
        for(int i=1; i<=DIMENSION; ++i)
        {
            for(int j=1; j<=DIMENSION; ++j)
            {
                if(board.m[i][j]<1||board.m[i][j]>DIMENSION)
                {
                   nextCellXY[0] = i;
                   nextCellXY[1] = j;
                   int numOfPossible = numOfPossibleValueLocal(nextCellXY, board);
                   if(numOfPossible == 1) return;   //only one choice
                   else if(minNumOfPossible>numOfPossible)   
                   {
                       //many choice, pick the fewest possibilities
                       minX = nextCellXY[0]; minY = nextCellXY[1];
                       minNumOfPossible = numOfPossible;
                   }
                }
            }
        }
        nextCellXY[0] = minX;
        nextCellXY[1] = minY;
    }
    private static int numOfPossibleValueLocal(int[] nextCellXY, BoardType board) {
        //assume 1-9 all possible
        boolean[] possible =  new boolean[DIMENSION+1];
        for(int i=1; i<=DIMENSION; ++i)
        {
            possible[i] = true;
        }
        //check row
        for(int i=1; i<=DIMENSION; ++i)
        {
            if(board.m[nextCellXY[0]][i] != 0)
            {
                possible[board.m[nextCellXY[0]][i]] = false;
            }
        }
        //check column
        for(int i=1; i<=DIMENSION; ++i)
        {
            if(board.m[i][nextCellXY[1]] != 0)
            {
                possible[board.m[i][nextCellXY[1]]] = false;
            }
        }
        //check sector
        //find which sector nextCellXY belongs to
        int r = ((nextCellXY[0]-1)/3)*3+1;
        int c = ((nextCellXY[1]-1)/3)*3+1;
        for(int i=r; i<r+3; ++i)
        {
            for(int j=c; j<c+3; ++j)
            {
                if(board.m[i][j] != 0)
                {
                    possible[board.m[i][j]] = false;
                }
            }
        }
        int numOfPossible = 0;
        for(int i=1; i<=DIMENSION; ++i)
        {
            if(possible[i] == true) numOfPossible++;
        }
        return numOfPossible;
    }
    
    //simple version to construct candidates
    /**
     * @param a combinatorial search solution vector
     * @param k size of the solution
     * @param board the current sudoku board
     * @param c the candidates for next position (output)
     * @return the number of candidates
     */
    public static int constructCandidatesSimple(int[] a, int k, BoardType board, int[] c)
    {
        int nCandidates = 0;
        
        int[] nextCellXY = new int[2];
        nextCellArbitrary(board,nextCellXY); //get next possible cell to be filled
        if(nextCellXY[0]<0&&nextCellXY[1]<0) return nCandidates; //no move possible, error
        
        board.move[k].x = nextCellXY[0];     //store our choice of next position
        board.move[k].y = nextCellXY[1];
        
        boolean[] possible =  new boolean[DIMENSION+1];
        possibleValueLocal(nextCellXY, board, possible);
        
        for(int i = 1; i<=DIMENSION; ++i)
        {
            if(possible[i]==true)
            {
                c[nCandidates] = i;
                ++nCandidates;
            }
        }
        return nCandidates;			 
    }
    
    //pick the first empty cell in the board
    private static void nextCellArbitrary(BoardType board, int[] nextCellXY) {
        for(int i=1; i<=DIMENSION; ++i)
        {
            for(int j=1; j<=DIMENSION; ++j)
            {
                if(board.m[i][j]<1||board.m[i][j]>DIMENSION)
                {
                   nextCellXY[0] = i;
                   nextCellXY[1] = j;
                    return ;
                }
            }
        }
    }
    private static void possibleValueLocal(int[] nextCellXY, BoardType board, boolean[] possible) {
        //assume 1-9 all possible
        for(int i=1; i<=DIMENSION; ++i)
        {
            possible[i] = true;
        }
        //check row
        for(int i=1; i<=DIMENSION; ++i)
        {
            if(board.m[nextCellXY[0]][i] != 0)
            {
                possible[board.m[nextCellXY[0]][i]] = false;
            }
        }
        //check column
        for(int i=1; i<=DIMENSION; ++i)
        {
            if(board.m[i][nextCellXY[1]] != 0)
            {
                possible[board.m[i][nextCellXY[1]]] = false;
            }
        }
        //check sector
        //find which sector nextCellXY belongs to
        int r = ((nextCellXY[0]-1)/3)*3+1;
        int c = ((nextCellXY[1]-1)/3)*3+1;
        for(int i=r; i<r+3; ++i)
        {
            for(int j=c; j<c+3; ++j)
            {
                if(board.m[i][j] != 0)
                {
                    possible[board.m[i][j]] = false;
                }
            }
        }
        return;
    }

    
    
    private static void makeMove(int[] a, int k, BoardType board) {
        fillCell(board.move[k].x, board.move[k].y, a[k], board);
    }
    private static void fillCell(int x, int y, int i, BoardType board) {
        board.m[x][y] = i;
        board.freeCount--;
    }
    
    private static void unmakeMove(int[] a, int k, BoardType board) {
        freeCell(board.move[k].x, board.move[k].y, a[k], board);
        board.freeCount++;
    }
    private static void freeCell(int x, int y, int i, BoardType board) {
        board.m[x][y] = 0;
    }
    private static boolean isASolution(int[] a, int k, BoardType board) {
        if(board.freeCount == 0)
            return true;
        else return false;
    }
    private static void processSolution(int[] a, int k, BoardType board) {
        System.out.println("SOLUTION " );
        printBoard(board);
        isFinished = true;
    }
    private static void printBoard(BoardType board) {
        System.out.println("-----------------------");
        for(int i=1; i<=DIMENSION; ++i)
        {
            for(int j=1; j<=DIMENSION; ++j)
            {
                System.out.print(board.m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
    
    //http://www.sudoku-solutions.com/
    private static void generateTestCaseSimple(BoardType board)
    {
        board.m[1][4] = 3;
        board.m[1][6] = 5;
        board.m[1][8] = 6;
        
        board.m[2][1] = 9;
        board.m[2][2] = 4;
        board.m[2][3] = 3;
        board.m[2][4] = 1;
        board.m[2][5] = 8;
        board.m[2][7] = 2;
        
        board.m[3][2] = 6;
        board.m[3][5] = 4;
        
        board.m[4][5] = 1;
        
        board.m[5][1] = 8;
        board.m[5][3] = 6;
        
        board.m[6][2] = 9;
        board.m[6][3] = 5;
        board.m[6][5] = 2;
        board.m[6][6] = 8;
        board.m[6][7] = 3;
        
        
        board.m[8][1] = 2;
        board.m[8][2] = 8;
        board.m[8][6] = 3;
        board.m[8][9] = 9;
        
        board.m[9][2] = 3;
        board.m[9][4] = 4;
        board.m[9][5] = 9;
        
        board.freeCount = 81-26;
        
        SudokuSolver sudokuSolver = new SudokuSolver();
        for(int i = 0; i < board.move.length; ++i)
        {
            board.move[i] = sudokuSolver.new Point();
        }
    }
    
    private static void generateTestCaseHard(BoardType board)
    {
        board.m[1][6] = 8;
        board.m[1][8] = 1;
        
        board.m[2][1] = 8;
        board.m[2][4] = 9;
        board.m[2][8] = 4;
        
        board.m[3][1] = 3;
        board.m[3][2] = 5;
        board.m[3][3] = 1;
        board.m[3][4] = 2;
        board.m[3][5] = 6;
        board.m[3][6] = 4;
        board.m[3][8] = 8;
        
        board.m[4][1] = 9;
        board.m[4][2] = 1;
        board.m[4][3] = 8;
        board.m[4][6] = 6;
        
        board.m[5][3] = 7;
        board.m[5][4] = 8;
        board.m[5][5] = 5;
        
        board.m[6][1] = 6;
        board.m[6][3] = 5;
        board.m[6][5] = 9;
        
        board.m[7][1] = 7;
        board.m[7][7] = 2;
        
        board.m[8][1] = 5;
        board.m[8][6] = 3;
        board.m[8][8] = 7;
        
        board.m[9][1] = 1;
        board.m[9][5] = 4;
        board.m[9][7] = 3;
        
        board.freeCount = 81-30;
        
        SudokuSolver sudokuSolver = new SudokuSolver();
        for(int i = 0; i < board.move.length; ++i)
        {
            board.move[i] = sudokuSolver.new Point();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SudokuSolver sudokuSolver = new SudokuSolver();
        SudokuSolver.BoardType board = sudokuSolver.new BoardType();
        //generateTestCaseSimple(board);
        generateTestCaseHard(board);
        System.out.println("original board:");
        printBoard(board);
        
        double timeElapse = System.currentTimeMillis();
        
        int[] a = new int[NUM_CELLS];
        int k = 0;
        backtrack(a, k, board);
        timeElapse = System.currentTimeMillis() - timeElapse;
        System.out.println("take "+timeElapse+"ms");
    }
}
