package com.p3c.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
	
	static final String FILE_PATH = "c:/msb/dog.txt";
	
	public static void main(String[] args) {
		try {
			// �޸���dog�İ汾�ţ��ٷ����л���
//			serializeDog();
			Dog d = deserializeFlyPig();
			System.out.println(d.getColor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
     * ���л�
     */
    private static void serializeDog() throws IOException {
        Dog dog = new Dog();
        dog.setColor("black");
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(FILE_PATH)));
        oos.writeObject(dog);
        System.out.println("dog �������л��ɹ���");
        oos.close();
    }
 
    /**
     * �����л�
     */
    private static Dog deserializeFlyPig() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(FILE_PATH)));
        Dog dog = (Dog) ois.readObject();
        System.out.println("dog �������л��ɹ���");
        return dog;
    }
}


