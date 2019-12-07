/**
 * 版权：（版权〉
 * 描述：〈描述〉
 * 修改人：姓名(工号)
 * 修改时间：YYYY-MM-DD
 * 需求单号：〈需求单号〉
 * 修改内容：〈修改内容〉
 */
package cn.jjdcn.blog.advice;

import cn.jjdcn.blog.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * (一句话功能简述)
 * (功能详细描述，使用注意事项)
 *
 * @author [作者，有修改时追加，逗号分隔]
 * @version [版本号, YYYY-MM-DD。有修改时更新版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RestControllerAdvice(basePackages = "cn.jjdcn.blog.controller")
public class BaseControllerAdvice {

	@ExceptionHandler(Exception.class)
	public Result handlerControllerException(Exception e) {
		return Result.error().message(e.getMessage());
	}
}
