function fibo(a,b,n)
{
      if(n==1) return a;
      let count=2;
      let arr=[a,b];

     

            for(let i=0;i<arr.length-1;i++){
                  if(arr.length!=n){
            arr.push(arr[i]+arr[i+1]);}
            else break;
            }
      return arr;
}

alert(fibo(0,1,3));
