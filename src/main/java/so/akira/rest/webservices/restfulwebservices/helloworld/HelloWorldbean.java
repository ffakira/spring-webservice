package so.akira.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldbean {
  private String message;

  public HelloWorldbean(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return String.format("HelloWorldBean [message=%s]", message);
  }
}
