package Find_Greatest_Common_Divisor_of_Array;

class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        return mdc(max, min);

        
    }

    //Euclides Algorithm
    public int mdc(int a, int b) {
            while(b != 0) {
                int resto = a % b;
                a = b;
                b = resto;
            }
            return a;
        }
}
