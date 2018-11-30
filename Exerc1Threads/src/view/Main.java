package view;

import controller.ThreadPrint;

public class Main {
	public static void main(String[] args){
		for(int i = 1; i <= 5; i ++){
			Thread tPrint = new ThreadPrint();
			tPrint.start();
		}
	}
}
