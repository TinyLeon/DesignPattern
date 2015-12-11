public class StateMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;

	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quater");
		} else if (state == SOLD_OUT) {
			System.out
					.println("You can't insert a quater, the machine is sold out");
		} else if (state == SOLD) {
			System.out
					.println("Please wait, we are already giving you a gumball");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		}
	}
}
