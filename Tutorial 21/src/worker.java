
public class worker implements Runnable {

	public worker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<2000; i++)
		{
			Main.increaseNumber();
		}
	}

}
