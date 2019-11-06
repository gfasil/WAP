
// reversing a string using recurssion
function reverse(input){

//this is out base case, when input becomes '' the function will stop executing
if(input=='') return '';
//each time the function is called, the last character is assigned to x
let x=input.charAt(input.length-1);

// call reverse recursively and concatinate its result with x.
return x+ reverse(input.substring(0,input.length-1)) 

}

alert(reverse('input')); // output= tupni