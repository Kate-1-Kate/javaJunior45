package lesson10;


public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows()) {
            System.out.println(" Неверный индекс строки! ");
            return -1;
        }
        if (colIndex >= getColumns()) {
            System.out.println(" Неверный индекс колонки! ");
            return -1;
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows()) {
            System.out.println(" Неверный индекс строки! ");
            return;
        }
        if (colIndex >= getColumns()) {
            System.out.println(" Неверный индекс колонки! ");
            return;
        }
        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы складывать нельзя!!! Количество строк не совпадает!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы складывать нельзя!!! Количество колонок не совпадает!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы вычитать нельзя!!! Количество строк не совпадает!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы вычитать нельзя!!! Количество колонок не совпадает!");
            return null;
        }
        Matrix result1 = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result1.getRows(); i++) {
            for (int j = 0; j < result1.getColumns(); j++) {
                result1.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }

        return result1;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.err.println("Эти матрицы нельзя перемножить");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++){
                for (int k = 0; k < this.getColumns(); k++) {

                   result.setValueAt(i, j, this.getValueAt(i,k) * otherMatrix.getValueAt(k, j));

                }
            }

        } return result;
    }



    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(),this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }

        }
        return result;
    }

    @Override
    public IMatrix transpose(double [][] nums) {
        Matrix matrix = new Matrix(getRows(),getColumns());
        for(int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(j,i,nums[i][j]);
            }
        }  return  matrix;

    }

    @Override
    public void fillMatrix(double value) {
        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getRows(); j++){
                matrix.setValueAt(i, j, value);
            }
        }
        matrix.printToConsole();


    }

    public static double[][] reduce(int row , int column , double[][] mat){
        int n=mat.length;
        double[][] res = new double[n- 1][n- 1];
        int r=0,c=0;
        for (int i = 0; i < n; i++) {
            c=0;
            if(i==row)
                continue;
            for (int j = 0; j < n; j++) {
                if(j==column)
                    continue;
                res[r][c] = mat[i][j];

                c++;
            }
            r++;
        }
        return res;
    }
    @Override
    public double determinant(double mat[][]) {
        int n = mat.length;
        if(n==1)
            return mat[0][0];
        if(n==2)
            return mat[0][0]*mat[1][1] - (mat[0][1]*mat[1][0]);

        double[][] m11 = reduce(0,0,mat);
        double[][] m1n = reduce(0,n-1,mat);
        double[][] mn1 = reduce(n-1 , 0 , mat);
        double[][] mnn = reduce(n-1,n-1,mat);
        double[][] m11nn = reduce(0,0,reduce(n-1,n-1,mat));
        return (determinant(m11)*determinant(mnn) - determinant(m1n)*determinant(mn1))/determinant(m11nn);


    }

    @Override
    public boolean isNullMatrix() {
        Matrix matrix = new Matrix(getRows(),getColumns());
        for (int i = 0; i < matrix.getRows(); i ++){
            for (int j = 0; j < matrix.getColumns(); j ++){
                if (i == 0 && j == 0){
                    return true;
                }

            }
        }
        return false;

    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(i == j && i == 1 && j == 1){
                    return true;
                }
            }

        }


      return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (getRows() == getColumns()){
            return true;
        } else
      return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < getRows(); i ++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }


    }

}



