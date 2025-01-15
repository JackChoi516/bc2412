public class LoginManager {
  private String username;
  private String password;

  public LoginManager(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Approach 2:
  public static class BusinessRuntimeException extends RuntimeException {
    // Runtime - spelling mistake
    // "Invalid User Name"
    // "Invalid Password"

    public static BusinessRuntimeException of(SysError sysErr){
      return new BusinessRuntimeException(sysErr);
    }

    private BusinessRuntimeException(SysError sysErr){ // Best Design!!!
      super(sysErr.getDesc());
    }
  }

  public static class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
      super(message);
    }
  }

  public static class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
      super(message);
    }
  }

  // !!!
  public void validateUsername2() {
    if (this.username == null || this.username.isEmpty()) {
      throw BusinessRuntimeException.of(SysError.INVALID_USERNAME);
    }
  }

  // !!!
  public void validatePassword2() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw BusinessRuntimeException.of(SysError.INVALID_PASSWORD);
    }
  }

  // !!
  public void validateUsername() {
    if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUsernameException("Username is invalid: " + this.username);
    }
  }

  // !!
  public void validatePassword() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw new InvalidPasswordException("Password is invalid: " + this.password);
    }
  }

  public static void main(String[] args) {
    LoginManager loginManager = new LoginManager("jackwong", "abcd123!");
    // 1. We can customize
    // Approach 1:
    try {
      loginManager.validateUsername();
      loginManager.validatePassword();
      System.out.println("Login success.");
    } catch (InvalidUsernameException e) {
      System.out.println(e.getMessage());
    } catch (InvalidPasswordException e) {
      System.out.println(e.getMessage());
    }

    // Approach 2:
    LoginManager loginManager2 = new LoginManager("jackwong", "abcd123");

    try {
      loginManager2.validateUsername2();
      loginManager2.validatePassword2();
      System.out.println("Login success.");
    } catch (BusinessRuntimeException e) {
      System.out.println(e.getMessage());
    }

  }

}
