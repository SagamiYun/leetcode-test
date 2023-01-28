package thread;

public class TestThread1 extends Thread{
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---" + i);
        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();

        // 调用start开启线程
        testThread1.start();

        // main线程
        for (int i = 0; i <20 ; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}