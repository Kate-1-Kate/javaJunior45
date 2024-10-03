package lesson3;

public class HW_2Part_3 {

    public static void main(String[] args) {

        int[] nums = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for( int i = 0; i < nums.length; i++){
            if (nums[i] > 10){
                System.out.println(nums[i]);
            } else {
                System.out.println("-");
            }

        }

    }
}
