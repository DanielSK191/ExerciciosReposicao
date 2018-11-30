package view;

import controller.ThreadMat;

public class Principal {
	public static void main(String[] args){
		for(int i = 0; i < 3; i ++){
			Thread tMat = new ThreadMat(i);
			tMat.start();
		}
	}
}
