const make_adder=(function(val){
        let counter=0;
    return function(){
        counter+=val;

        // just to hold the value of count after incrementing it
        return counter;    
    }
});

let add5=make_adder(5);
add5();
let add10=make_adder(10);
add10();
