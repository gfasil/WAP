//filter the long words using filter method
function filterLong(arr,len)

{
    // function to check if each elements in the array have same length as len
    function b(input){
        return input.length==len;
        
        }
// accepts the function b and filters the elements based on that condition
 return arr.filter(b);

 
}

alert(filterLong(['fasil','fa','sa'],2));
