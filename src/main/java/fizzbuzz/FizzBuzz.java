package fizzbuzz;

public class FizzBuzz {
	public String say(int number) {
		if (isFizz(number) && isBuzz(number)) {
			return "FizzBuzz";
		}
		if (isFizz(number)) {
			return "Fizz";
		}
		if (isBuzz(number)) {
			return "Buzz";
		}
		return "" + number;

	}

	private boolean isBuzz(int n) {
		return n % 5 == 0;
	}
	
	private boolean isFizz(int n) {
		return n % 3 == 0;
	}
}
