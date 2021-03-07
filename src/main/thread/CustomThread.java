package main.thread;

public class CustomThread extends Thread{
	private int[] row;
	private int total =0;
	private int number;
	
	public CustomThread(int[] row,int number) {
		this.row = row;
		this.number = number;
	}
	@Override
	public void run() {
		calculate();
		System.out.println("A soma da linha "+number+" ="+total);
		this.interrupt();
	}
	
	private void calculate() {
		for(int x =0;x<5;x++) {
			total +=row[x];
		}
	}
}
