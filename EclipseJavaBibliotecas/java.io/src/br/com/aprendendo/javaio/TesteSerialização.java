package br.com.aprendendo.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerialização {

	public static void main(String[] args) throws Exception {
		
		String nome = "Matheus";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/mrrobot/Desktop/objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/mrrobot/Desktop/objeto.bin"));
		Object nome2 = ois.readObject();
		
		System.out.println(nome2.toString());
		ois.close();
		
	}

}
