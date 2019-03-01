
public class Detector {
	
	public static final int THRESHOLD_SIZE = 0;
	public static final int GRID_X_SIZE = 4;
	public static final int GRID_Y_SIZE = 4;
	
	// Function to check if the Pacman is out of boundary (Input type in String)
	public boolean isOffGrid(String inputXCoord, String inputYCoord) {
		
		int xCoord = Integer.parseInt(inputXCoord);
		int yCoord = Integer.parseInt(inputYCoord);
		
		if ((THRESHOLD_SIZE < xCoord) || 
				(xCoord < GRID_X_SIZE) ||
				(THRESHOLD_SIZE < yCoord) || 
				(yCoord < GRID_Y_SIZE)
				) {
			return false;
		}
		
		return true;
	}

	// If the input type is already in int
	public boolean isOffGrid(int xCoord, int yCoord) {
		if ((THRESHOLD_SIZE <= xCoord) && 
				(xCoord <= GRID_X_SIZE) &&
				(THRESHOLD_SIZE <= yCoord) &&
				(yCoord <= GRID_Y_SIZE)
				) {
			return false;
		}
		
		return true;
	}

}
