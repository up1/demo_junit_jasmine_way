import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import com.mscharhag.oleaster.runner.OleasterRunner;

@RunWith(OleasterRunner.class)
public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;
	{
		describe("Fizzbuzz", () -> {

			beforeEach(() -> {
				fizzBuzz = new FizzBuzz();
			});

			describe("Show data", () -> {
				it("1 จะต้องแสดงผล 1", () -> {
					assertEquals("1", fizzBuzz.showData(1));
				});

				it("3 จะต้องแสดงผล Fizz", () -> {
					assertEquals("Fizz", fizzBuzz.showData(3));
				});

				it("5 จะต้องแสดงผล Buzz", () -> {
					assertEquals("Buzz", fizzBuzz.showData(5));
				});

				it("ตัวเลขหาร 3 ลงตัว จะต้องแสดงผล Fizz", () -> {
					assertEquals("Fizz", fizzBuzz.showData(6));
				});

				it("ตัวเลขหาร 5 ลงตัว จะต้องแสดงผล Buzz", () -> {
					assertEquals("Buzz", fizzBuzz.showData(10));
				});

				it("ตัวเลขหาร 3 และ 5 ลงตัว จะต้องแสดงผล โรผผBuzz", () -> {
					assertEquals("FizzBuzz", fizzBuzz.showData(15));
				});
			});
		});
	}

}
