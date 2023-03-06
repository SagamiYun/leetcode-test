package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SagamiYun
 * @version 2023/3/5
 * <p>@ClassName Generate</p>
 * <p>@Description 通过遍历得出对应的行数的杨辉三角 </p>
 * <p>118. 杨辉三角</p>
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        // 第一行为1
        triangle.add(Collections.singletonList(1));
        for (int i = 1; i < numRows; i++) {
            // 上一行
            List<Integer> preList = triangle.get(i - 1);
            // 当前行
            List<Integer> curList = new ArrayList<>();
            // 当前行第一个数为1
            curList.add(1);
            // 计算中间的数值
            for (int j = 1; j < i; j++) {
                curList.add(preList.get(j - 1) + preList.get(j));
            }
            // 当前行最后一个数为1
            curList.add(1);
            triangle.add(curList);
        }
        return triangle;
    }
}
