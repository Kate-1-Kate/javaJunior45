package lesson10;

public class Main {

    public static void main(String[] args) {
        double [][] forA = {{2,2,2},
                            {2,4,32},
                            {2,4,2}};
       double [][] forB =  {{3,3,3},
                            {3,5,37},
                            {3,5,3}};
        double [][] forC =  {{0,0,0},
                             {0,0,0},
                             {0,0,0}};
        double [][] forD =  {{1,0,0},
                             {0,1,0},
                             {0,0,1}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);
        Matrix c = new Matrix(forC);
        Matrix d = new Matrix(forD);

        System.out.println("-------------------------");
        System.out.println("Сложение матриц : ");
        System.out.println("-------------------------");

        IMatrix result = a.add(b);
        result.printToConsole();


        System.out.println("-------------------------");
        System.out.println("Вычитание матриц : ");
        System.out.println("-------------------------");

        IMatrix result1 = a.sub(b);
        result1.printToConsole();


        System.out.println("-------------------------");
        System.out.println("Умножение матриц : ");
        System.out.println("-------------------------");

        IMatrix result2 = a.mul(b);
        result2.printToConsole();


        System.out.println("-------------------------");
        System.out.println("Умножение матрицы на заданное число : ");
        System.out.println("-------------------------");

        IMatrix result3 = a.mul(4);
        result3.printToConsole();


        System.out.println("-------------------------");
        System.out.println("Транспонирование матрицы : ");
        System.out.println("-------------------------");

        IMatrix result4 = b.transpose(forB);
        result4.printToConsole();


        System.out.println("-------------------------");
        System.out.println("Заполнение матрицы заданным числом : ");
        System.out.println("-------------------------");

        a.fillMatrix(3);


        System.out.println("-------------------------");
        System.out.println("Определитель матрицы : ");
        System.out.println("-------------------------");

         double determinant = a.determinant(forA);
         System.out.println(determinant);


        System.out.println("-------------------------");
        System.out.println("Является ли матрица нулевой : ");
        System.out.println("-------------------------");

        System.out.println(c.isNullMatrix());


        System.out.println("-------------------------");
        System.out.println("Является ли матрица единичной : ");
        System.out.println("-------------------------");

         System.out.println(d.isIdentityMatrix());


         System.out.println("-------------------------");
        System.out.println("Является ли матрица квадратной : ");
        System.out.println("-------------------------");

        System.out.println(b.isSquareMatrix());




    }



}
