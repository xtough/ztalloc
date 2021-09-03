package com.github.xtough.gc.ztalloc;

public class ZtAllocSolver {
	
	private int a=0;
	private int b=0;
	private int c=0;

	public static void main(String[] args) {
		ZtAllocSolver solver = new ZtAllocSolver();
		solver.start();

	}

	private void start() {
		printStation(0);
		a = 130;
		b = 7;
		c = 0;
		this.station1();
	}

	private void station1() {
		printStation(1);
		c = c+1;
		int x = 3;
		if (odd(b)) {
			b = (b*x)+1;
			station2();
		} else {
			b = b/(x-1);
			station3();
		}
	}

	private void station2() {
		printStation(2);
		c = c+1;
		int y = 2;
		b= b/y;
		station3();
	}

	private void station3() {
		printStation(3);
		c = c+1;
		if (odd(b)) {
			b=(b*3)+1;
			station1();
		} else {
			b = b/2;
			station4();
		}
	}

	private void station4() {
		printStation(4);
		c = c+1;
		if (b==1) {
			int distance = 16*c + 9;
			int angle = 11*c +1;
			System.out.println("Distance: "+distance+" Angle: "+angle);
			return;
		} else {
			if (odd(b)) {
				b= b*3 +1;
				station1();
			} else {
				b=b/2;
				station3();
			}
		}
	}

	private void printStation(int i) {
		System.out.println("Station: "+i);
		System.out.println("\tA="+a+"\tB="+b+"\tC="+c);		
	}

	private boolean odd(int x) {
		return ((x % 2) != 0 );
	}

}
