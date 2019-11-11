
// wrapping everything inside an iife which returns the list of students
//the iife will execute and return the updated list of students
var result=(function(){
    // creating   object notation/ jason
    let stds={Student:[  { "studentId": "000-98-0001", "firstName": "James" },
    { "studentId": "000-98-0002", "firstName": "Anna" },
    { "studentId": "000-98-0003", "firstName": "Jeffrey" }]};

    //get the unorderd list element
    var lstudents= document.querySelector(".list-group");

    // function to create list item and display the new items
    var createlist=function(sid1,stuname1){

         // create list item
         var litem=document.createElement("li");
         //give list item class name
             litem.className="list-group-item";
         //inserts the name and id to the newly created list item    
             litem.innerHTML=sid1+"-"+stuname1;
         //appends the list item to the parent/unordered list    
             lstudents.appendChild(litem);
    }
    
    // a function to insert new student data to the existing array and diplays it in the page
    let insert=function(stuname,sid){
    
         // receives name and id and pushes it to the array
        stds.Student.push({ "studentId":sid, "firstName":stuname})  ;
        // clears the input field after insertion
        document.getElementById("sid").value='';
        document.getElementById("sname").value='';
       
        // call create list function
      createlist(sid,stuname);
    
    }

    // handler for the submit button
    submit.addEventListener("click",function(event){  
        
        // hold the two values we get from id and name
        var stid= document.getElementById("sid").value ;
        var stname=document.getElementById("sname").value;
        // call the insert function and pass name and id 
        insert(stname,stid);
        
     });
    
     // popultes the list with the default data when the page loads
      window.onload=  (function() { 

        // iterate through each array element
        stds.Student.forEach(function(std){

            //call the create list for each student data in the array
            createlist(std.studentId,std.firstName);
         
        });
      // Add the newely created table containing json data 
    })(); // window onload is iife too

    // when everything is done we return the list
return stds;})();




 
  

  
