package test05_user_exception;

public class FruitNotFoundRuntimeException extends RuntimeException {
	public FruitNotFoundRuntimeException(String name) {
		super(name + "그런 과일은 없습니다만");
	}
}
