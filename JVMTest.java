/**
 * @author SagamiYun
 * @version 2023/1/31
 * <p>@ClassName JVMTest</p>
 * <p>@Description 死循环 </p>
 * <p>@Date 2023/1/31 17:54</p>
 * <p>@param </p>
 * <p>@return </p>
 */
public class JVMTest {
    public static void main(String[] args) {
        int a = 1;
        while (true) {
            System.out.println(a);
        }
    }
}
