package struts2;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * Java入門 AOP（Interceptor）確認クラス.<br>
 * Struts2で制御できるInterceptor処理を確認するためのクラス.
 */
@ParentPackage("sample")
public class InterceptorAction {
	
	/**
	 * Interceptor.actionにアクセスした際に実行されるメソッドです.
	 * @return 処理結果
	 * @throws Exception
	 */
	public String execute() throws Exception {
		return "success";
	}
	
	/**
	 * interceptor.jspでボタンがクリックされた時に実行されるメソッドです.</br>
	 * 必ずExceptionが発生します.
	 * @return 処理結果
	 * @throws Exception
	 */
	@Action("/exception")
	public String exception() throws Exception {
		// 以下メソッドを実行してわざとExceptionを発生させる
		doException();
		// Exceptionが発生するのでreturnまで到達しません
		return "success";
	}
	
	/**
	 * 意図的にExceptionを発生させます.
	 * @throws Exception
	 */
	private void doException() throws Exception {
		throw new Exception();
	}
}