package ie.gmit.week09;

public class AMainClass {

	public static void main(String[] args) {
		System.out .println("thread id "+Thread. currentThread().getId());
		for(int i=10; i>0 ;i--){
			System.out.println("i is "+i);
			if (i == 4) System.out.println("start ignition");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("blast off");

	}

}
