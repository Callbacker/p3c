package com.p3c.collector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		//��һ�� ��ȷ�Ƴ�
//		list.remove("4");
//		System.out.println(list);
		
		// �쳣 �ڶ��� ��3���λ��� 1��2��4
		for (String string : list) {
			if(string.equals("1")) {
				list.remove(string);
			}
		}
		System.out.println(list);
		
		// ��ȷ���������λ�����
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			if("4".equals(str)) {
//				iterator.remove();
//			}
//			
//		}
//		System.out.println(list);
		
		// ��ȷ�������λ�����
//		for (int i = 0; i < list.size(); i++) {
//			String string = list.get(i);
//			if(string.equals("4")) {
//				list.remove(string);
//			}
//		}
//		System.out.println(list);
		
//		System.out.println(list.toString());
//		GenericsTest.getAnimal();
	}
}
