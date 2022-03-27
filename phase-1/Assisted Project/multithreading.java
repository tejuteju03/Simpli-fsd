package out.github.multithreading;

public class multithreading extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+ " "+Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		multithreading t1=new multithreading();
		multithreading t2=new multithreading();

		t1.setName("first");
		t2.setName("Second");
		t1.start();
		t2.start();
	}

}
