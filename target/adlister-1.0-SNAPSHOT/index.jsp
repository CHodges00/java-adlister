<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h2>Hello, Welcome to the home page</h2>

<h1 id="gotoAds" >Visit AdLister</h1>

<p>${sessionScope}</p>

<script>

    document.getElementById("gotoAds").onclick = function (){
        document.location = "http://localhost:8081/ads"
    }

</script>

</body>
</html>
