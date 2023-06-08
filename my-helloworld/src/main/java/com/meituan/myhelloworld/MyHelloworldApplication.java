package com.meituan.myhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHelloworldApplication.class, args);
	}

    @GetMapping("/hello")
    public String sayHello(String param) {
        return String.format("Hello, it's me, %s", param);
    }

}
