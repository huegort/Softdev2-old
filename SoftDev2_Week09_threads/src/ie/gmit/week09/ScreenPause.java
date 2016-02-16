package ie.gmit.week09;

public class ScreenPause  implements Runnable{
	BallGameBoard ballGameBoard;
	
	public ScreenPause(BallGameBoard ballGameBoardA){
		this.ballGameBoard = ballGameBoardA;
	}
	@Override
	public void run() {
		System.out .println("thread id "+Thread. currentThread().getId());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (true){
			ballGameBoard.moveBall();
			ballGameBoard.repaint();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
