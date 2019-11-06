'use strict'

// sum function
function sum(x)
{
    //initial value/ identity of sum
    let sum=0;
    //loop through the array and add them
    for(let i=0;i<x.length;i++)
    {
        sum+=x[i];

    }
    return sum;
}

//multiplaction function
function multiply(x)
{
      //initial value/ identity of mult
    let mul=1;
      //loop through the array and multiply them
    for(let i=0;i<x.length;i++)
    {
        mul*=x[i];

    }
    return mul;
}

let input=[1,2,3,4];
//output= sum=10 product=24
alert('sum='+ sum(input)+" "+ 'product='+multiply(input));