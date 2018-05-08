<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Java入門</title>
  </head>
  <body>
  	<h1>ボタンを押してください。</h1>
  	<s:form action="exception">
  		<s:submit value="押すな！"/>
  	</s:form>
  </body>
</html>