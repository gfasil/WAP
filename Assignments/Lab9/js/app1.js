$(function(){

  const studentdata=[];


  const insertStudent=function(student){
    addToList(student);
    addStudentToArrayData(student);
    addStudentToLocal(student);
  }

  const addToList=function(student){
        let list= $("#liststudents");

        let newitem="<li class='list-group-item'>" + student.studentId +" | " + student.firstName + "</li>";

        list.append(newitem);      


  }
  const addStudentToArrayData = function(student) {
    studentdata.push(student);
}

const addStudentToLocal=function(student){
          const index=localStorage.length;
          localStorage.setItem(index,student.studentId + " | " + student.firstName);
         


}

$("#submit").on("click",function(e){
e.preventDefault();
const sname=$("#sname").val();
const sid=$("#sid").val();
const objstudent={
 "studentId":sid,"firstName":sname
};

insertStudent(objstudent);
$("#sname").val("");
$("#stid").val("");
$("#stid").focus();

});

if(localStorage.length>0)
{
  let list= $("#liststudents");
for(let i=0;i<localStorage.length;i++)
{

const item=localStorage.getItem(i);
let newitem="<li class='list-group-item'>" + item + "</li>";

list.append(newitem);  
}

}
else{
$.ajax({
  url: "http://127.0.0.1:5500/Assignments/Lab8/Data/students.json",
  type: "GET",
  dataType: "json"
}).done(function(studentdata) {
studentdata.forEach((stdobj) => {
             insertStudent(stdobj);
  });
}).fail(function(xhr, status, err) {
  alert("Error: " + status + " - " + err);
}).always(function(xhr, status) {
  //alert( "The request is complete!" );
}); 
}


});




