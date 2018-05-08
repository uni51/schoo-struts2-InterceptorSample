<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Java入門</title>
  </head>
  <body>
  	<h1>Exceptionが発生しました！</h1>
  	<s:property value="%{exceptionStack}"/>
  </body>
</html>