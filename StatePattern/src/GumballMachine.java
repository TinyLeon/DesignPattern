public class GumballMachine {
	// final static int SOLD_OUT = 0;
	// final static int NO_QUARTER = 1;
	// final static int HAS_QUARTER = 2;
	// final static int SOLD = 3;
	//
	// int state = SOLD_OUT;
	// int count = 0;
	//
	// public GumballMachine(int count) {
	// this.count = count;
	// if (count > 0) {
	// state = NO_QUARTER;
	// }
	// }
	IState soldOutState;
	IState noQuarterState;
	IState hasQuarterState;
	IState soldState;

	IState state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(IState state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	IState getHasQuarterState() {
		return hasQuarterState;
	}

	IState getNoQuarterState() {
		return noQuarterState;
	}

	IState getSoldState() {
		return soldState;
	}

	IState getSoldOutState() {
		return soldOutState;
	}

	// 投币
	// public void insertQuater() {
	// if (state == HAS_QUARTER) {
	// System.out.println("You can't insert another quarter");
	// } else if (state == NO_QUARTER) {
	// state = HAS_QUARTER;
	// System.out.println("You inserted a quarter");
	// } else if (state == SOLD_OUT) {
	// System.out
	// .println("You can't insert a quater, the machine is sold out");
	// } else if (state == SOLD) {
	// System.out.println("Please wait, we're already give you a gumball");
	// }
	// }

	// 退出硬币
	// public void ejectQuarter() {
	// if (state == HAS_QUARTER) {
	// System.out.println("Quarter returned");
	// state = NO_QUARTER;
	// } else if (state == NO_QUARTER) {
	// System.out.println("You haven't inserted a quarter");
	// } else if (state == SOLD) {
	// System.out.println("Sorry, you already turned the crank");
	// } else if (state == SOLD_OUT) {
	// System.out
	// .println("You can't eject, you haven't inserted a quarter yet");
	// }
	// }

	// 转动曲柄
	// public void turnCrank() {
	// if (state == SOLD) {
	// System.out
	// .println("Turning twice doesn't get you another gumball!");
	// } else if (state == NO_QUARTER) {
	// System.out.println("You turned but there's no quarter");
	// } else if (state == HAS_QUARTER) {
	// System.out.println("You turned...");
	// state = SOLD;
	// dispense();
	// }
	// }

	// 发放糖果
	// public void dispense() {
	// if (state == SOLD) {
	// System.out.println("A gumball comes rolling out the slot");
	// count--;
	// if (count == 0) {
	// System.out.println("Oops, out of gumballs!");
	// state = SOLD_OUT;
	// } else {
	// state = NO_QUARTER;
	// }
	// } else if (state == NO_QUARTER) {
	// System.out.println("You need to pay first");
	// } else if (state == SOLD_OUT) {
	// System.out.println("No gumball dispensed");
	// } else if (state == HAS_QUARTER) {
	// System.out.println("No gumball dispensed");
	// }
	// }

	public String toString() {
		if (this.count > 0) {
			return "Inventory: " + this.count + " gumballs";
		} else {
			return "Gumballs has been sold out";
		}

	}

}
