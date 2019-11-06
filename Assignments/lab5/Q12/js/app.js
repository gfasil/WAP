
setInterval(function(){
  var d = new Date();
  document.getElementById("date").innerHTML = d.getFullYear()+"-"+(("0"+(d.getMonth()+1)).slice(-2))+"-"+(("0"+d.getDate()).slice(-2))+" "+(("0"+d.getHours()).slice(-2))+":"+(("0"+d.getMinutes()).slice(-2))+":"+(("0"+d.getSeconds()).slice(-2));
  
  },1);
  