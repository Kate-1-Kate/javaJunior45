package lesson3;

public class Main4 {

    public static void main(String[] args) {

        //Есть массив чисел
        // Сами его заполняем, вывести на консоль сумму четных чисел в массиве

        int[] nums = {23,5,6,7,84,5,6,7,95,54};

        int summ = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0) {
                summ = summ + nums[i];
            }
        }
        System.out.println(summ);



    }

}
