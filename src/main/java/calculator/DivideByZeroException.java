package calculator;

public class DivideByZeroException extends RuntimeException {
	DivideByZeroException(String message){
		super(message);
	}
}
