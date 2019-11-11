var count=(function(){
    let counter=10;
    function getcount()
    {return counter;}
    return {
       add: function(){ counter++;},
       reset:function(){counter=0;},
       //one more return value just to check  value of count 
       getcount1:getcount
    }
    })();