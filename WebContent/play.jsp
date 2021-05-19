<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>じゃんけんゲーム</title>
<script type="text/javascript">
<!--
	function check(){
	if(document.game.hand.value==""){
		window.alert("手を選んでください。");
		return false;
	}
}
//-->
</script>
<style>
<!--
.red{font-size:40px;}
@media screen and (max-width:1024px){
body{font-size:4.5vw;}
.red{font-size:9.5vw;}
}
-->
</style>
</head>
<body>
<center>
<h1>じゃんけんゲーム</h1>
<p>下のボタンから出したい手を選んでください。</p>
<form id="game" name="game" action="Judge" method="post" onsubmit="return check();">
<table>
<tr>
<td><input type="radio" name="hand" value="0"/>グー</td>
<td><input type="radio" name="hand" value="1"/>チョキ</td>
<td><input type="radio" name="hand" value="2"/>パー</td>
</tr>
</table>
<input type="submit" value="結果表示"/>
</form>
<jsp:useBean id="result" class="resource.Hand" scope="request"/>
<%if(result.getYourhandstr()!=null){ %>
<br/>
<h1>結果</h1>
<p>あなたの手は<jsp:getProperty name="result" property="yourhandstr"/></p>
<p>コンピュータの手は<jsp:getProperty name="result" property="cpuhandstr"/></p>
<%if(result.getResult()=="あなたの勝ちです"){ %>
<p class="red"><font color="red"><jsp:getProperty name="result" property="result"/></font></p>
<%}else if(result.getResult()=="あなたの負けです"){ %>
<p><font color="blue"><jsp:getProperty name="result" property="result"/></font></p>
<% }else{ %>
<p><jsp:getProperty name="result" property="result"/></p>
<% } %>
<% } %>
</center>
</body>
</html>