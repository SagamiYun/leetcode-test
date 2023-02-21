package easy;

/**
 * @author SagamiYun
 * @version 2023/2/13
 * <p>@ClassName RemoveElement</p>
 * <p>@Description 可以使用双指针的方法来解决该问题。
 * 首先，定义一个指针i和一个指针j，初始时i指向数组的起始位置，j指向数组的末尾位置。
 * 然后，当nums[i]等于给定的值val时，将nums[i]和nums[j]交换，同时将指针j向前移动一位。
 * 这样做的目的是将值为val的元素移到数组的末尾。重复这个过程，直到i大于等于j。 </p>
 * <p>27. 移除元素</p>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }

}
