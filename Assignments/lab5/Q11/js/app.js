let button;
button=document.getElementById('submit');


  function print()
  {
    event.preventDefault();
    console.log(document.getElementById('exampleInputEmail1').value );
    console.log(document.getElementById('exampleInputUrl1').value );
    console.log(document.getElementById('exampleInputPassword1').value );

   


  }
  button.addEventListener("click", function() {
    print();
       });

     