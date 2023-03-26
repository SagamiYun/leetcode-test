package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/26
 * <p>@ClassName CanWinNim</p>
 * <p>@Description TODO </p>
 * <p>292. Nim 游戏</p>
 */
public class CanWinNim {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
