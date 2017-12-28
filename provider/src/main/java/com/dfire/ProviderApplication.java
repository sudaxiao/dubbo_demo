package com.dfire;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@EnableAutoConfiguration
@ImportResource(locations ="classpath:dubbo/dubbo-provider.xml")
@SpringBootApplication(scanBasePackages = "com.dfire")
@MapperScan("com.dfire")
public class ProviderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
