/**
 * 版权：（版权〉
 * 描述：〈描述〉
 * 修改人：姓名(工号)
 * 修改时间：YYYY-MM-DD
 * 需求单号：〈需求单号〉
 * 修改内容：〈修改内容〉
 */
package cn.jjdcn.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (一句话功能简述)
 * (功能详细描述，使用注意事项)
 *
 * @author [作者，有修改时追加，逗号分隔]
 * @version [版本号, YYYY-MM-DD。有修改时更新版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@RestController
public class HelloController {

	@RequestMapping("hello")
	public String hello(){
		return "hello";
	}
}
