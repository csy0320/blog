/**
 * 版权：（版权〉
 * 描述：〈描述〉
 * 修改人：姓名(工号)
 * 修改时间：YYYY-MM-DD
 * 需求单号：〈需求单号〉
 * 修改内容：〈修改内容〉
 */
package cn.jjdcn.blog.vo;

import cn.jjdcn.blog.common.ResponseCode;
import cn.jjdcn.blog.common.ResponseMessage;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * (一句话功能简述)
 * (功能详细描述，使用注意事项)
 *
 * @author [作者，有修改时追加，逗号分隔]
 * @version [版本号, YYYY-MM-DD。有修改时更新版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Data
public class Result {

	private Boolean success;
	private Integer code;
	private String message;
	private Map data;

	private Result(Boolean success, Integer code, String message, Map<String, Object> data) {
		this.success = success;
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public static Result ok(){

		return new Result(true, ResponseCode.OK.getCode(), ResponseMessage.OK.getMessage(),new HashMap<>());
	}

	public static Result error(){
		return new Result(false, ResponseCode.ERROR.getCode(), ResponseMessage.ERROR.getMessage(),new HashMap<>());
	}

	public Result success(Boolean success){
		this.success = success;
		return this;
	}
	public Result code(Integer code){
		this.code = code;
		return this;
	}
	public Result message(String message){
		this.message = message;
		return this;
	}
	public Result data(Map data){
		this.data = data;
		return this;
	}

}
