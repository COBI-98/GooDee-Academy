
// let kind = '${param.kind}';
// alert(kind);

const cb = document.getElementsByClassName("cb");
const check_all = document.getElementById("check_all");
const btn_check = document.getElementById("btn_check");
const frm = document.getElementById("frm");

check_all.addEventListener("click",function(){

    for(let i=0; i<cb.length;i++){
       
            cb[i].checked = check_all.checked;
    }
   
    
});

btn_check.addEventListener("click",function(){
    let result = true;
    console.log(cb[1].checked)
    for(let i =0; i<cb.length;i++){
        if(!cb[i].checked){
            alert("약관 동의 바람");
            result = false;
            break;
        }
    }

    if(result ==true){
    frm.submit();
    }
});



for(let i=0;cb.length;i++){
    
    // cb[i].addEventListener("click",function(){
    //     check(1);
    // });
    cb[i].addEventListener("click", check);
};

function check(){
    let result = true;
    for(let i=0;i<cb.length;i++){
        if(!cb[i].checked){
            result = false;
            break;
        }
    }
    check_all.checked =result;
}
