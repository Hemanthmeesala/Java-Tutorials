public class Array {
    public static void main(String[] args) {
        // int nums[] = {1,2,3,4};
        // System.out.println(nums[0]);

        // int nums[] = new int[4];
        // nums[0] = 1;
        // nums[1] = 2;
        // nums[2] = 3;
        // nums[3] = 4;
        
        // for(int i  = 0; i < 4; i++) {
        //     System.out.println(nums[i]);
        // }

        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = i + j;
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
