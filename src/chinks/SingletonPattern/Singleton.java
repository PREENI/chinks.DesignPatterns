
public class Singleton {

	public static Singleton obj;
	private Singleton() {
		System.out.println("instance created");
	}
	public static Singleton getInstance() {
		
		if(obj == null) {
			synchronized (Singleton.class) {
				if(obj == null) {
					obj=new Singleton();
				}
			}
		} 
		return obj;
	}
	

	public static void main(String[] args) throws InterruptedException {
				
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Singleton obj= Singleton.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Singleton obj2= Singleton.getInstance();
			}
		});
		t1.start();
		Thread.sleep(10);
		t2.start();
	}

}


