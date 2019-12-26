package com.p3c.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    private static final int THREAD_COUNT_NUM = 7;
    private static CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT_NUM);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= THREAD_COUNT_NUM; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    System.out.println("��" + index + "���������ռ�����");
                    //ģ���ռ���i������,���ģ�ⲻͬ��Ѱ��ʱ��
                    Thread.sleep(new Random().nextInt(3000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //ÿ�ռ���һ������,��Ҫ�ȴ��Ŀ�����1
                countDownLatch.countDown();
            }).start();
        }
        //�ȴ���飬������7���߳�ִ�����֮��ִ��await��ߵĴ���
        countDownLatch.await();
        System.out.println("�����߿����飡�ٻ�������");
    }
}
