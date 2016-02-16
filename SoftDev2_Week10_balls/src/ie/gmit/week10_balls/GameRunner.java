package ie.gmit.week10_balls;

public class GameRunner  implements Runnable{
	GameBoard gameBoard; 

	public GameRunner(GameBoard theGameBoard){
		this.gameBoard = theGameBoard;
	}

	@Override
	public void run() {
		int waitTime = 1000/60;
		
		try {
			while (true){
				gameBoard.moveAll();
				Thread.sleep(waitTime);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
