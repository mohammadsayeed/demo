 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" href="/css/custom.css">
 <html style="background-color:powderblue;">
 
<img src="<c:url value='/images/logo.png'/>" alt="Automation world" id="pic" />
  
 <style>
.content {
  max-width: 500px;
  margin: auto;
}
</style>
 <body>
 <div class="content">
 
  <h1>${massage}</h1>
  <table border="2">
<tr>
<td>Name </td><td><input type="text"></td>
</tr>
<tr>
<td>Password</td><td><input type="password"></td></tr>
<tr>
<td><input type="button" value="Login"><td>
</tr>
   <tr>
<td><input type="button" value="reset"><td>
</tr>
</table>
</div>
 </body>
 </html>
