package so.akira.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping(path = "/hello-world")
  public String helloWorld() {
    return "Hello world";
  }

  @GetMapping(path = "/hello-world-bean")
  public HelloWorldbean helloWorldBean() {
    return new HelloWorldbean("Hello World");
  }

  @GetMapping(path = "/hello-world/{name}")
  public HelloWorldbean helloWorldPatHelloWorldbean(@PathVariable String name) {
    return new HelloWorldbean(String.format("Hello world, %s", name));
  }
}
