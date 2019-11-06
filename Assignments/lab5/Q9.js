function secondLarget(input)

{
let max1=input[0];
let max2=input[1];

for(let i=1;i<input.length;i++)

{
if(input[i]>max1){

    max2=max1;
    max1=input[i];
   
}

}
return max2;
}

let input=[1,2,3,4];
alert('second largest='+ secondLarget(input));