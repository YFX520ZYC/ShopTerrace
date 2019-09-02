package com.love.shopterrace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.love.shopterrace.mapper")
@EnableSwagger2
public class ShopterraceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopterraceApplication.class, args);
	}

}
