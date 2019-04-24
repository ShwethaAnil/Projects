
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>

<html>
   <head>
      <title>JSTL fmt:message Tag</title>
   </head>

   <body>
     <fmt:bundle basename = "com.mphasis.training.bundles.Example_En">
         <fmt:message key = "count.one"/><br/>
         <fmt:message key = "count.two"/><br/>
         <fmt:message key = "count.three"/><br/>
      </fmt:bundle>
   
   
   
   
      <fmt:requestEncoding value = "UTF-8" />
      <fmt:setLocale value = "es_ES"/>
      <fmt:setBundle basename = "com.mphasis.training.bundles.Example" var = "lang"/>

      <fmt:message key = "count.one" bundle = "${lang}"/><br/>
      <fmt:message key = "count.two" bundle = "${lang}"/><br/>
      <fmt:message key = "count.three" bundle = "${lang}"/><br/>

   </body>
</html>