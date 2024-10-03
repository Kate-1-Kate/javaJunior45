package lesson3;

public class HW_2Part_2 {

    public static void main(String[] args) {

        int[] nums = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);


            }


        }



    }
}