package com.p3c.control;

import java.time.Instant;

public class SwitchString {
	public static void main(String[] args) {
		method(null);
		
	}

	public static void method(String param) {
		switch (param) {
		// �϶����ǽ�������
		case "sth":
			System.out.println("it's sth");
			break;
			// Ҳ���ǽ�������
		case "null":
			System.out.println("it's null");
			break;
			// Ҳ���ǽ�������
		default:
			System.out.println("default");
		}
	}
}