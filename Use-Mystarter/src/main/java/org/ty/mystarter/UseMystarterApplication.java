package org.ty.mystarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ty.HelloService;

@RestController
@SpringBootApplication
public class UseMystarterApplication {
	//测试 cherry-pick
	@Autowired
	private HelloService helloService;

	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}
	public static void main(String[] args) {
		SpringApplication.run(UseMystarterApplication.class, args);
	}
}
