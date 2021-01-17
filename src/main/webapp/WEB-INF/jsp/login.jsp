 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" href="/css/custom.css">
 <html style="background-color:f3f3f3;">
 
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
  <table style="background-color: #115E67; border: 1px solid #ccc; width: 400px; height: 200px">
<tr>
<td style="color: white;">User Name </td><td><input type="text"></td>
</tr>
<tr>
<td>Password</td><td><input type="password"></td></tr>
<tr>
<td ></td><td align="left">
<input type="button" value="  Login  " >
</td>
</tr>
   
 
</table>
</div>
 </body>
 </html>
