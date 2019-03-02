
public interface Movement {
	
	// Initialize the Pacman state
	public Pacman place(String xCoord, String yCoord, String faceDirection);
	
	// Move the Pacman one step to its face direction
	public Pacman move(Pacman thePacman);
	
	// Change the Pacman face direction to its left
	public Pacman turnLeft(Pacman thePacman);
	
	// Change the Pacman face direction to its right
	public Pacman turnRight(Pacman thePacman);
}
