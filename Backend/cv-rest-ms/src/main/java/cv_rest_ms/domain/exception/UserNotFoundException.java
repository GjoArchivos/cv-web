package cv_rest_ms.domain.exception;

public class UserNotFoundException extends DomainException {

    public UserNotFoundException(Long userId) {
        super("User with ID " + userId + " not found");
    }
}