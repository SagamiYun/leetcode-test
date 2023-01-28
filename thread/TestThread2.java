package thread;

public class TestThread2 implements Runnable{
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码---" + i);
        }
    }

    public static void main(String[] args) {
        // 创建runnable接口的实现类对象
        TestThread2 testThread2 = new TestThread2();
        // 创建线程对象,通过线程对象来开启我们的线程
        new Thread(testThread2).start();

        // main线程
        for (int i = 0; i <200 ; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}
