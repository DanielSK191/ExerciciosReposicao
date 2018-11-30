package controller;

public class ThreadMat extends Thread {
	private int  mat[][] = new int[3][5];
	private int idThread;
	private int i , j;

	public ThreadMat(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		try {
			soma();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

	private void soma() throws InterruptedException {
		int tempo = (int) ((Math.random() * 2000) + 1000);
		Thread.sleep(tempo);
		int somaLinha = 0;
		for( i = 0; i < mat.length ; i++){
			for( j = 0; j < mat[i].length; j++){
				mat[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for( i = 0; i < mat.length ; i++){
			for( j = 0; j < mat[i].length; j++){
				somaLinha = mat[i][j] + somaLinha;
				System.out.println(mat[i][j]);
            }
			System.out.println("");
			System.out.println("Thread #" + idThread + " linha #" + i + " soma: " + somaLinha);
			somaLinha = 0;
		}
		
		
	}

}
	
	
	
	

