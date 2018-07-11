<html>

	<body>
	Hello World!
	<!-- index.jsp is automatically called when the web app is run on the tomcat server owing to the fact that there is a list of 
	web pages in the server's web.xml(Open the folder structure of servers and then check the web.xml) which are directed to be opened first in
	each web application. index.jsp is one of them. If you need your home page to pop up when the application is called, enlist your home page's name into
	the web.xml of the server. 
	This Page is a simple page, which consists of a form, and a submit button, the action of the form is responsible for making up the url
	and the post method directs which http method will be called to handle the action.-->
	
	<form action="start" method="post">
	<table>	
		<tr><td>Name</td><td><input type="text" name="name"></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="go"></td></tr>
		</table>
	</form><form action="begin" method="post">
	<table>	
		<tr><td>Name</td><td><input type="text" name="name"></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="go3.0"></td></tr>
		</table>
	</form></body>
	<!-- Once this form is submitted the url is a appeneded with a /start and the request is passed on to the web.xml,
	 where it searches for an appropriate servlet to map the request-->
</html>
