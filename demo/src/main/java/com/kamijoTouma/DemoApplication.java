package com.kamijoTouma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kamijoTouma.controllers.ConstructorInjectedController;
import com.kamijoTouma.controllers.GetterInjectedController;
import com.kamijoTouma.controllers.MyController;
import com.kamijoTouma.controllers.PropertyInjectedController;
import com.kamijoTouma.controllers.TestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(TestController.class).doTest());
	}
}
