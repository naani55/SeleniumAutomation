package singleton;

public class Singleton {

	public static Singleton sc1;
	public static Singleton sc2;

	private Singleton(){};

	public static String get() {
		return "test";
	}

	public static Singleton getInstance() 
	{
		if (sc1 == null)
		{
			synchronized (Singleton.class) 
			{
				if (sc1 == null) {
					
					sc1 = new Singleton();
					return sc1;
				}
			}
		}
		return sc1;

	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Singleton s1 = Singleton.getInstance();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.get());

			}
		});

		t1.start();
		t2.start();

	}

}
