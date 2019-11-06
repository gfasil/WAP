function sum(arr){

let x=arr.reduce((x,y)=>x+y,0)
return x;
}
function multiply(arr){

    let x=arr.reduce((x,y)=>x*y,1)
    return x;
    }
    let input=[1,2,3,4];
alert('sum='+ sum(input)+" "+ 'product='+multiply(input));