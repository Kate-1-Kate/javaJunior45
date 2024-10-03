package lesson4;

public class Main3 {

    public static void main(String[] args) {
        // Есть 2-мерный массив 5 на 5
        // заполним цифрами его самостоятельно
        // вывести на консоль цифры по главной диагонали
        // а все остальные цифры заменить пустыми местами

        int [][] nums = {{2, 3, 4, 5, 6},
                         {1, 2, 3, 4, 5},
                         {0, 1, 2, 3, 4},
                         {3, 4, 5, 6, 7},
                         {4, 5, 6, 7, 8}};

        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(i == j){
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }System.out.println();
        }




    }

}
