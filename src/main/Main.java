package main;

import main.thread.CustomThread;

public class Main {
	public static void main(String[] args) {
		int[][] array = new int[3][5];
		for(int i=0;i<3;i++ ) {
			for(int j=0;j<5;j++) {
				array[i][j] = (int)(Math.random()*100);
			}
		}
		
		CustomThread customThread = new CustomThread(array[0],1);
		CustomThread customThread2 = new CustomThread(array[1],2);
		CustomThread customThread3 = new CustomThread(array[2],3);
		customThread.start();
		customThread2.start();
		customThread3.start();
	}
}
