'use strict'
function longestWord(input)
{

let len=input[0].length;

for(let x=1;x<input.length;x++)
{

    if(input[x].length>len) len=input[x].length;
}
return len;
}
alert(longestWord(['arsenal','liverpool','united','city']));
