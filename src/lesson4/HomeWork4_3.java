package lesson4;

public class HomeWork4_3 {

    public static void main(String[] args) {

        int[][] nums = new int[6][6];

        for(int i = 0; i < nums.length ; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(j == 2 || j == 3) {
                    System.out.print(nums[i][j] + " ");
                } else if (i == 2 || i == 3){
                    System.out.print(nums[i][j] + " ");
                } else if (i * j != 0 && i * j != 5 && i * j < 20){
                    System.out.print(nums[i][j] + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            } System.out.println();

    }
    }
}
