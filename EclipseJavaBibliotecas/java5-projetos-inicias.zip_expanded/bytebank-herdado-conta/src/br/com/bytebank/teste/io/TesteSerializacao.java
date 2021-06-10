package br.com.bytebank.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("44444444444");
		cliente.setNome("MATHEUS");
		cliente.setProfissao("Dev");
		
		ContaCorrente cc = new ContaCorrente(33, 33);
		cc.setTitular(cliente);
		cc.deposita(200.0);
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
//		oos.writeObject(cc);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc_deserializable = (ContaCorrente) ois.readObject();
		System.out.println(cc_deserializable.getTitular().getNome());
		System.out.println(cc_deserializable.getSaldo());
		

	}

}
