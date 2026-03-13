package cv_rest_ms.domain.exception;

public abstract class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }
}