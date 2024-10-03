package lesson4;

public class Main2 {

    public static void main(String[] args) {

        //Создать пустой двухмерный масив и положить одно число 5
        // Вывести весь массив на консоль
        // Ниже код/который печатает на консоль любой двухмерный массив

        int[][] nums = new int[4][3];
        nums[1][2] = 5;

        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length ; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }



    }


}
