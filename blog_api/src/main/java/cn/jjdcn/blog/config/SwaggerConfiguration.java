/**
 * 版权：（版权〉
 * 描述：〈描述〉
 * 修改人：姓名(工号)
 * 修改时间：YYYY-MM-DD
 * 需求单号：〈需求单号〉
 * 修改内容：〈修改内容〉
 */
package cn.jjdcn.blog.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * (一句话功能简述)
 * (功能详细描述，使用注意事项)
 *
 * @author [作者，有修改时追加，逗号分隔]
 * @version [版本号, YYYY-MM-DD。有修改时更新版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket docket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select().apis(RequestHandlerSelectors.basePackage("cn.jjdcn.blog.controller")).build();
	}

	private ApiInfo apiInfo(){
		Contact concat = new Contact("菜鸟","http://blog.jjdcn.cn","shzu_csy@163.com");
		return new ApiInfo(
				"进击的菜鸟的博客",
				"进击的菜鸟",
				"v0.1",
				"http://jjdcn.cn",
				concat,
				"Apache 2.0",
				"Apache 2.0",
				new ArrayList()
		);
	}
}
