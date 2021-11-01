public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor) 
	{
		this.dest_Floor=dest_floor;
	if(dest_floor<0|| dest_floor>10) {
		System.out.println("Wrong floor");
	}
	else {
		
	
	
	System.out.println("*** Destination floor is: "+ dest_Floor);
	if(dest_floor>current_Floor) {
		while(current_Floor<dest_floor) {
			System.out.println("*** "+State.Moving_up);
			current_Floor++;
			System.out.println("*** Current Floor "+current_Floor);
		}
		
	}
	else if (dest_floor<current_Floor) {
		while(current_Floor>dest_floor) {
			System.out.println("*** "+State.Moving_down);
			current_Floor--;
			
			System.out.println("*** Current Floor "+current_Floor);
		}
		
	}
	arrive_atFloor();	
	}
	


	}

	private void arrive_atFloor() {
		System.out.println("*** You have reached the: "+ dest_Floor+"th floor");
	}

	
}
