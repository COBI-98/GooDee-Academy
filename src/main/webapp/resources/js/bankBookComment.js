const commentAdd = document.querySelector("#commentAdd")
const writer = document.querySelector("#writer")
const contents = document.querySelector("#contents");
const commentList = document.querySelector("#commentList");
getCommentList();


commentAdd.addEventListener("click", function(){
    
    let bookNum = commentAdd.getAttribute("data-bookNum");
    let wv = writer.value;
    let cv = contents.value;



    // ajax----------------------------------------
    // XMLhttprequest 생성
    const xhttp = new XMLHttpRequest;

    // 2. url 준비
    xhttp.open("POST","./commentAdd");


    //3. Enctype
    // 요청 hearder 정보
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    // 4. post 파라미터 전송
    xhttp.send("bookNum="+bookNum+"&writer="+wv+"&contents="+cv)

    // 5. 응답 처리

    xhttp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200){
            let result = xhttp.responseText.trim();
            console.log(result);
            result = JSON.parse(result);
            let a = writer.value="";
            let b = contents.value ="";
            
            if(result.result == 1){
                alert("댓글 성공");
                getCommentList();
                
            } else{
                alert("실패");
            }
        }
    }
}) // click Event


function getCommentList(){
    //1. XMLhttprequest 생성
    const xhttp = new XMLHttpRequest();

    //2. Method , URL
    xhttp.open("GET","./commentList?page=1&bookNum=10")

    //3. 요청 전송
    xhttp.send();

    //4. 응답처리
    xhttp.addEventListener("readystatechange",function(){
        if(xhttp.readyState==4 && xhttp.status==200){
           
            // 1. jsp 사용한 결과물
            // commentList.innerHTML = xhttp.responseText;

            //2. JSON 결과물
            let ar = JSON.parse(xhttp.responseText.trim());

            const table = document.createElement("table");
            const table_class = document.createAttribute("class");
            const border = document.createAttribute("border");

            border.value = "1";



            table_class.value = "table table-warning table-striped";

            table.setAttributeNode(border);
            table.setAttributeNode(table_class);


            for(let i =0; i<ar.length; i++){
                
                const tr = document.createElement("tr");
                const td1 = document.createElement("td");
                const td2 = document.createElement("td");
                const td3 = document.createElement("td");
                const td_contents = document.createTextNode(ar[i].contents);
                const td_writer = document.createTextNode(ar[i].writer);
                const td_regdate = document.createTextNode(ar[i].regDate);
           

                
                td1.appendChild(td_contents);
                tr.appendChild(td1);
                td2.appendChild(td_writer);
                tr.appendChild(td2);
                td3.appendChild(td_regdate);
                  tr.appendChild(td3);

                  table.appendChild(tr);
            }
            

            commentList.append(table);
        }
    })
}