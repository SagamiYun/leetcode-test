package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/6
 * <p>@ClassName MaxProfit</p>
 * <p>@Description minPrice表示遍历到当前位置时的最低价格，
 * maxProfit表示当前最大利润。遍历过程中，如果当前价格比最低价格更低，
 * 就更新最低价格；如果当前价格减去最低价格的差值大于最大利润，
 * 就更新最大利润。最后返回最大利润即可。 </p>
 * <p>121. 买卖股票的最佳时机</p>
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
