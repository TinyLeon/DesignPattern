public class SoldOutState implements IState {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out
				.println("You can't insert a quater, the machine is sold out");
	}

	public void ejectQuarter() {
		System.out
				.println("You can't eject, you haven't inserted a quarter yet");
	}

	public void turnCrank() {
		System.out.println("Oops,the machine is sold out");
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}
