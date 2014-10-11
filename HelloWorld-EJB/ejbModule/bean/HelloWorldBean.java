package bean;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean {

	public HelloWorldBean() {
	}

	public String sayHello() {
		return "Hello, World!";
	}

}
