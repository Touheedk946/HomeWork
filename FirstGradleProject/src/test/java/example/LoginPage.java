package example;

public class LoginPage {

    public void openLoginPage() {
        System.out.println("Opening login page...");
    }

    public void enterUsername(String username) {
        System.out.println("Entering username: " + username);
    }

    public void enterPassword(String password) {
        System.out.println("Entering password: " + password);
    }

    public void clickLoginButton() {
        System.out.println("Clicking login button...");
    }

    public boolean isUserOnDashboard() {
        System.out.println("User is now on dashboard");
        return true; // Simulated result
    }
}
