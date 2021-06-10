package br.com.aprendendo.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializaçãoCliente {

	public static void main(String[] args) throws Exception {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Matheus");
//		cliente.setProfissao("Dev Java");
//		cliente.setCpf("44444444444");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/mrrobot/Desktop/cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("/home/mrrobot/Desktop/cliente.bin"));
		Cliente novo = (Cliente) ios.readObject();
		System.out.println(novo.getNome());
		System.out.println(novo.getCpf());
		System.out.println(novo.getProfissao());
		ios.close();
		
		
		
	}

}
