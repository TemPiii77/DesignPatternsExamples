package org.example.Behavioral.ChainOfResponsibility;

public class UserExistsHandler extends Handler {
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This user does not exist");
            System.out.println("Sign up to our app now!");
            return false;
        }
        return handleNext(username, password);
    }
}
