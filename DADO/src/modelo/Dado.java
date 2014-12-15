package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1; // +1
		return cara;
	}
	
	
	public int [] getTestAleatorio() {
		return testAleatorio;
	}

	public void setTestAleatorio(int [] testAleatorio) {
		this.testAleatorio = testAleatorio;
	}
	
	
	public void realizarTest(int [] numerotiradas){
		System.out.println();
		numerotiradas= new int [7];
		numerotiradas[0] = cara;
		numerotiradas[1] = cara;
		numerotiradas[2] = cara;
		numerotiradas[3] = cara;
		numerotiradas[4] = cara;
		numerotiradas[5] = cara;
		numerotiradas[6] = cara;
		
		System.out.println("Cara 1 Ha salido: " +numerotiradas[1]);
		System.out.println("Cara 2 Ha salido: " +numerotiradas[2]);
		System.out.println("Cara 3 Ha salido: " +numerotiradas[3]);
		System.out.println("Cara 4 Ha salido: " +numerotiradas[4]);
		System.out.println("Cara 5 Ha salido: " +numerotiradas[5]);
		System.out.println("Cara 6 Ha salido: " +numerotiradas[6]);
		
	}
	

}
