package com.p3c.oop;

public class SpiltTest {
	
	public static void main(String[] args) {
		// Ԥ�ڴ���3��ʵ����3������ȡֵʱ��ע���ж�Խ��
//		String testStr = "a, b, c ,,";
//		String[] strArray = testStr.split(",");
//		System.out.println(strArray);
		
		// ��չ
		String line = "hello,,world,,,";
        String res1[] = line.split(",");
        String res2[] = line.split(",", -1);
        int i=1;
        for(String r: res1) {
        	System.out.println(i+++r);
        }
        
        System.out.println("========================");
        i=1;
        for(String r: res2) {
        	System.out.println(i+++r);
        }
            
	}
}
