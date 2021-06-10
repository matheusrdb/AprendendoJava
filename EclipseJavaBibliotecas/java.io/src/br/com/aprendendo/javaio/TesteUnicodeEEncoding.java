package br.com.aprendendo.javaio;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "C";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		
		System.out.println(charset.displayName());
		
		Charset utf8 = StandardCharsets.UTF_8;
		
		String frase = "13º Órgão Oficial";
		byte[] fraseB = frase.getBytes(utf8);
		String fraseUtf = new String(fraseB, utf8);
		System.out.println(fraseUtf);
		
		byte[] bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + ", UTF-8");
		String sNovo = new String(bytes);
		System.out.println(sNovo);
		
		byte[] bytes2 = s.getBytes("UTF-16");
		System.out.println(bytes2.length + ", UTF-16");
		String sNovo2 = new String(bytes2, "UTF-16");
		System.out.println(sNovo2);
		
		byte[] bytes3 = s.getBytes("windows-1252");
		System.out.println(bytes3.length + ", windows-1252");
		String sNovo3 = new String(bytes3);
		System.out.println(sNovo3);
		
		byte[] bytes4 = s.getBytes("ASCII");
		System.out.println(bytes4.length + ", ASCII");
		String sNovo4 = new String(bytes4);
		System.out.println(sNovo4);
		
	}

}
