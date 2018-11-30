package controller;

public class ThreadController extends Thread{
	private int idThread;
	private static int chegada = 0;
	
	public ThreadController(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		corrida();
	}

	private void corrida() {
		boolean chegou = false;
		int maxPulo = 100;
		int maxPercurso = 1000;
		int pulo = 0;
		int distSapo = 0;
		while(chegou == false){
			if (distSapo >= maxPercurso){
				chegou = true;
			}else{
				pulo = (int) (Math.random() * maxPulo);
				distSapo += pulo;
				System.out.println("Sapo #" + idThread + " pulou " + pulo + " Metros, Percorreu " +
						distSapo + " Metros.");
			}
		}
		chegada++;
		System.out.println("Sapo #" +idThread+ " chegou em " +chegada+ "° " +"percorreu " +
		distSapo+ " metros.");
	}
}
