package controller;

public class ThreadPrint extends Thread {

		private long idThread;
		
		public ThreadPrint() {
			
		}
		
		private void setId() {
			idThread = getId();
			System.out.println(idThread);
		}
		
		@Override
		public void run() {
			setId();
		}

	}
