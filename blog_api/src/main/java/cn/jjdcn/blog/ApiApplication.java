package cn.jjdcn.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("cn.jjdcn.blog.dao")
public class ApiApplication {
	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);
	}
}
