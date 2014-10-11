package de.java.web;

import bean.HelloWorldBean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import java.io.Serializable;

@ManagedBean
@ViewScoped
public class HelloWorld implements Serializable {
    private static final long serialVersionUID = 1L;

	@EJB
    private HelloWorldBean helloWorldBean;
	
    public String getHello(){
    	return helloWorldBean.sayHello();
    }
}