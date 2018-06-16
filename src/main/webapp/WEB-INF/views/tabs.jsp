<%-- 
    Document   : tabs
    Created on : Jun 12, 2018, 9:10:53 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/tabs.css" rel="stylesheet" type="text/css">       
        
    </head>
    <body>
        <p>Click on the buttons inside the tabbed menu:</p>

        <div class="tab">    
          <button class="tablinks" onclick="openCity(event, 'London')" id="defaultOpen">London</button>
          <button class="tablinks" onclick="openCity(event, 'Paris')">Paris</button>
          <button class="tablinks" onclick="openCity(event, 'Tokyo')">Tokyo</button>
          <button class="tablinks" onclick="openCity(event, 'china')">china</button>
          
        </div>

        <div id="London" class="tabcontent">
          <h3>London</h3>
          <p>London is the capital city of England.</p>
        </div>

        <div id="Paris" class="tabcontent">
          <h3>Paris</h3>
          <p>Paris is the capital of France.</p> 
        </div>

        <div id="Tokyo" class="tabcontent">
          <h3>Tokyo</h3>
          <p>Tokyo is the capital of Japan.</p>
        </div>     
        
        <div id="china" class="tabcontent">
          <h3>china</h3>
          <p>china is in asia</p>
          
        </div>
        
        <script src="js/tabe.js" type="text/javascript"></script>
    </body>
</html>
