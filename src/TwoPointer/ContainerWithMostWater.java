package TwoPointer;

public class ContainerWithMostWater {

        public static int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int max = 0;

            while (left < right) {

                int width = right - left;
                int currMax= Math.min(height[left], height[right]);
                int area = width * currMax;


                max = Math.max(max, area);


                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println(maxArea(height));
        }

}
