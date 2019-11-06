'use strict'
//create array of all vowels
var vowels=['a','e','i','o','u','A','E','I','O','U'];

//function to check if a char is a value
function isVowels( s){
 
//initialize our flag as false 
 let flag=false;
 
 //use foreach loop to loop through the array and check if we can find the input char
 vowels.forEach((vow)=>{ 
     
    // changr flag to true if char s is found
    if (vow===s) x= true
    });

return flag; // return flag
}

alert(isVowels('e'));// true
alert(isVowels('E')); // true
alert(isVowels('z')); // false