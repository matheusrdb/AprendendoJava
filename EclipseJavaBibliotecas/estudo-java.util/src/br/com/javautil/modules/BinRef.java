package br.com.javautil.modules;
/**
 * Classe para armazenar referências em uma array genérica do tipo objeto.
 * 
 * @author mrrobot
 *
 */
public class BinRef {
	/**
	 * bin = armazenamento de referências.
	 * currentPointer = usado para determinar quantas referências foram armazenadas.
	 */
	private Object[] bin;
	private int currentPointer;
	
	/**
	 * Construtor que define a quantidade de referências que poderão ser armazenadas.
	 */
	public BinRef() {
		 bin = new Object[100];
		 currentPointer = 0;
	}
	
	/**
	 * Este método verifica se o array está cheio.
	 */
	public void verifyBin() {
		if(currentPointer == 99);
			System.out.println("Array out of ");
			return;
	}
	/**
	 * Método principal que irá ser utilizado para guardar as referẽncias.
	 * @param refs
	 */
	public void keepGenericRef(Object refs) {
		verifyBin();
		this.bin[currentPointer] = refs;
		currentPointer++;
		
	}	
	public void removeRef(int index) {
		this.bin[index] = null;
		currentPointer--;
	}
	
	public Object getObject(int index) {
		return this.bin[index];
	}
	
	public void getAmount() {
		System.out.print("Quantidade de Referências Armazenadas:" + this.currentPointer);
	}
	

}
