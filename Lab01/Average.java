/**
 * Average example
 * @author Aarthi
 */
public class Average {

        /**
         * Returns the average of an array of numbers
         * @param the array of integer numbers
         * @return the average of the numbers
         */
        static float computeAverage(int[] nums) {
            float result = 0;
            // Add your code
            // nums is an 1d array contains only integers
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }
            // now sum contains the sum of all the integers
            result = sum / (nums.length);
            return result;
        }

        public static void main(String[] args) {
            // Add your code
            int[] nums = new int[] {1,2,3,4,5};
            System.out.println("Average of the numbers is: " + computeAverage(nums));
        }
}
