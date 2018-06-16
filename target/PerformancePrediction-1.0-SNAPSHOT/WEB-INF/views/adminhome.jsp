<%@include file="../common/header.jspf"%>
<%@include file="../common/navigationbar.jspf"%>
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
        
<%@include file="../common/footer.jspf"%>