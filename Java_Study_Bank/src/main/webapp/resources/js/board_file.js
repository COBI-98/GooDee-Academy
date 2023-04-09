const addFiles = document.getElementById("addFiles");
const fileadd = document.getElementById("fileadd");
const fileDelete = document.querySelectorAll(".fileDelete") // foreach 가능
// const fileDelete = document.getElementById("fileDelete") // foreach 불가능
    
let count = 0;
let idx = 0;

//---------------------------------- update file Delete------------------

function setCount(c){
    if(c>=0){
        count=c;
    }
}

try{
    fileDelete.forEach(function(f){
        f.addEventListener("click",function(){

            let check = window.confirm("삭제를 하면 되돌릴 수 없다")

            console.log(f.parentNode);

            if(!check){
                return;
            }
            
            const fileNum = f.getAttribute("data-file-num");            
            
            const xhttp = new XMLHttpRequest();

            xhttp.open("POST","./fileDelete");

            //요청 header 정보
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

            xhttp.send("fileNum="+fileNum)

            xhttp.onreadystatechange=function(){
                if(xhttp.readyState==4 && xhttp.status==200){
                    let result = xhttp.responseText.trim();

                    if(result==1){
                        f.parentNode.remove();
                        console.log("삭제성공")
                        count--;

                    }else{
                        console.log("실패");
                    }

                }
            }
            


        })
    });
}catch(e){
    console.log(f.parentNode);
}



//------------------------------------fill add
try{

    fileadd.addEventListener("click", function(){
        
        count++;
        
        if(count<6){
        let div = document.createElement("div");
        let div_class = document.createAttribute("class");
        let label = document.createElement("label");
        let label_class = document.createAttribute("class");
        let label_for = document.createAttribute("for");
        let input = document.createElement("input");
        let input_type = document.createAttribute("type");
        let input_name = document.createAttribute("name");
        let input_class = document.createAttribute("class");
        let input_id = document.createAttribute("id");

        let button = document.createElement("button");
        let button_type = document.createAttribute("type");
        let button_class = document.createAttribute("class");

        let c = document.createAttribute("id");
        
        buttonAttr = document.createAttribute("title");

        buttonAttr.value = idx;

        c.value="file"+idx;

        div.setAttributeNode(c);


        div_class.value = "form-group";
        label_class.value = "form-label mt-4";
        label_for.value ="files1";
        
        input_type.value = "file";
        input_name.value = "files";
        input_class.value = "form-control is-valid";
        input_id.value = "files"+count;
        
    

        button_type.value="button";
        button_class.value="del btn btn-danger";
        button.innerHTML="삭제";

        button.setAttributeNode(buttonAttr);



        div.setAttributeNode(div_class);
        label.setAttributeNode(label_class);
        label.setAttributeNode(label_for);
        input.setAttributeNode(input_type);
        input.setAttributeNode(input_name);
        input.setAttributeNode(input_class);
        input.setAttributeNode(input_id);
        button.setAttributeNode(button_type);
        button.setAttributeNode(button_class);


        label.innerHTML ="Photo"+count;
        
        
        div.appendChild(label);
        div.appendChild(input);
        div.appendChild(button);
        addFiles.appendChild(div);
        idx++;
        
        } else{
            alert("최대 5개");
        }
        
    })



    addFiles.addEventListener("click",function(event){

        let button = event.target

        if(event.target.classList[0] == "del"){
            
            console.log(event.target.title);
            console.log(button.title);
            console.log(count);
            document.getElementById("file"+button.title).remove();
            count--;
        
        }
    })

}catch(e){

}