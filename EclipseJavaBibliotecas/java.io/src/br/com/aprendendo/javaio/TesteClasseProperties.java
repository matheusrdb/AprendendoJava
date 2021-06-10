package br.com.aprendendo.javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteClasseProperties {
	
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		props.setProperty("login", "alura");
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		props.store(new FileWriter(new File("/home/mrrobot/Desktop/conf.properties")), "algum comentário");
	}
}

class TesteClasse {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("/home/mrrobot/Desktop/conf.properties"));
		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");
		
		System.out.println(login);
		System.out.println(senha);
		System.out.println(endereco);
	}
	
	
}