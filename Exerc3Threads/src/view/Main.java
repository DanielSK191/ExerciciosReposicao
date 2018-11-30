package view;

import controller.ThreadController;

public class Main {

	public static void main(String[] args) {
		for(int i =0; i <= 4; i++){
			Thread tCorre = new ThreadController(i);
			tCorre.start();
		}
	}

}
