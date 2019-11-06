function fibo(a,b,n)
{

      let count=2;
      let arr=[a,b];

     

            for(let i=0;i<arr.length-1;i++){
                  if(arr.length!=n){
            arr.push(arr[i]+arr[i+1]);}
            else break;
            }
}

alert(fibo(0,1,3));
