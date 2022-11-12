package com.te.factory;

public class IronMan extends Thread implements Avengers{

	@Override
	public void nameOfActor() {
		System.out.println("Robert Downey JR....!!!");
	}


	@Override
	public Thread superpower() {
		Runnable r = () -> {
			for (int i = 1; i < 11; i++) {
               try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("bullet " + i);
			}
		};
		return new Thread(r);
	}
}
