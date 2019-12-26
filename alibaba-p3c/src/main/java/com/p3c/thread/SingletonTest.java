package com.p3c.thread;
/**
 * dcl˫��У����
 * 	���ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
 * @author yueyi2019
 *
 */
public class SingletonTest {
	private volatile static SingletonTest singleton;

	private SingletonTest() {
	}

	public static SingletonTest getSingleton() {
		if (singleton == null) {
			synchronized (SingletonTest.class) {
				if (singleton == null) {
					singleton = new SingletonTest();
				}
			}
		}
		return singleton;
	}
}