let button2;
button2=document.getElementById('add');

function print1(){

   
    alert("product number=" + document.getElementById('pnum').value + "\n" +
            "product name=" + document.getElementById('pname').value + "\n" +
            "product Quantity=" + document.getElementById('qty').value + "\n" +
            "product Price=" + document.getElementById('price').value + "\n" +
            "product Supplier=" + document.getElementById('supplier').value + "\n" +
            "product Date Supplied=" + document.getElementById('date').value + "\n"
    
    );
   }

   button2.addEventListener("click", function() {
    print1();
       });

