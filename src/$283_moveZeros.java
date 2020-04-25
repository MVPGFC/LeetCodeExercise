import java.util.Arrays;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/4/25 8:27 下午
 */
/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class $283_moveZeros {

    public static void moveZeroes(int[] nums) {
        int cor = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, cor++, i);
            }
        }

    }

    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a]= arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }

}
