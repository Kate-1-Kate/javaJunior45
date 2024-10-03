package lesson4;

public class HomeWork4_1 {
    public static void main(String[] args) {
        int[][] nums = new int[6][6];

        for(int i = 0; i < nums.length ; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(i + j >= 5){
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            } System.out.println();
        }
    }
    }
