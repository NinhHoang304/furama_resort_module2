package common.exception;

public class NotFoundInDatabase extends Exception{

    public NotFoundInDatabase() {
        super("Not found in database");
    }
}
