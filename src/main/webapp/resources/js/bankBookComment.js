const commentAdd = document.querySelector("#commentAdd")
const writer = document.querySelector("#writer")
const contents = document.querySelector("#contents");
const commentList = document.querySelector("#commentList");
const more = document.querySelector("#more");
//page 담는 변수
let page=1;
const bookNum = commentAdd.getAttribute("data-bookNum")
getCommentList(page, bookNum);


commentAdd.addEventListener("click", function(){
    
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
           
            
            if(result.result == 1){
                alert("댓글 성공");

                if(commentList.children.length != 0){
                    for(let i=0; i<commentList.children.length;){

                        commentList.children[0].remove();
                    }
                }
                page=1;
                getCommentList(page, bookNum);        
            } else{
                alert("실패");
            }
        }
    }
}) // click Event


function getCommentList(p,bn){
    //1. XMLhttprequest 생성
    const xhttp = new XMLHttpRequest();

    //2. Method , URL
    xhttp.open("GET","./commentList?page="+p+"&bookNum="+bn)

    //3. 요청 전송
    xhttp.send();

    //4. 응답처리
    xhttp.addEventListener("readystatechange",function(){
        if(xhttp.readyState==4 && xhttp.status==200){
           
            // 1. jsp 사용한 결과물
            // commentList.innerHTML = xhttp.responseText;

            //2. JSON 결과물
            let result = JSON.parse(xhttp.responseText.trim());

            // const table = document.createElement("table");
            // const table_class = document.createAttribute("class");
            // const border = document.createAttribute("border");

            // border.value = "1";



            // table_class.value = "table table-warning table-striped";

            // table.setAttributeNode(border);
            // table.setAttributeNode(table_class);

            let pager = result.pager; // Map commentPager
            let ar = result.list;       // Map List

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
                
                const td4 = document.createElement("td");
                const tdText1 = document.createTextNode("수정");
                td4.appendChild(tdText1);
                let tdAttr1 = document.createAttribute("class");
                tdAttr1.value = "update";
                td4.setAttributeNode(tdAttr1);
                tr.appendChild(td4)

                let td5 = document.createElement("td");
                const tdText2= document.createTextNode("삭제");
                td5.appendChild(tdText2);
                let tdAttr2 = document.createAttribute("class");
                tdAttr2.value = "delete";
                td5.setAttributeNode(tdAttr2);
                tr.appendChild(td5);

                let tdAttr = document.createAttribute("data-comment-num");
                tdAttr.value=ar[i].num;
                td5.setAttributeNode(tdAttr);


                tr.appendChild(td5);

                commentList.append(tr);

                if(page >= pager.totalPage){
                    more.classList.add('disabled');
                } else{
                    more.classList.remove('disabled');
                }
            }
            // commentList.removeChild();
           

            // let t = commentList.children;

            // if(t.length !=0){
            //     commentList.children[0].remove();
            // }
            
            
            // try {
            //     console.log(commentList.children());
            //     throw new Error("에러 메시지");
            // } catch (exception) {
                
            // } finally{

            // }
            // // commentList.append(table);
            // console.log(commentList.firstChild);
            // commentList.children[0].remove();
        }
    })
}

more.addEventListener("click",function(){
    page++; 
    console.log(bookNum);

    getCommentList(page, bookNum);
})


//--------------------수정, 삭제 Event 위임
commentList.addEventListener("click",function(event){

    console.log(event);



    if(event.target.className=="delete"){
        let check = window.confirm("삭제 하시겠습니까?");
        if(check){
            let number = event.target.getAttribute("data-comment-num");
            
            const xhttp = new XMLHttpRequest;

            console.log(number);
              // 2. url 준비
            xhttp.open("POST","./commentDelete");

            //3. Enctype
            // 요청 hearder 정보
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

            // 4. post 파라미터 전송
            xhttp.send("num="+number);

            xhttp.onreadystatechange=function(){
                 if(this.readyState==4 && this.status==200){
                    let result1 = xhttp.responseText.trim();
                    console.log(result1);
                        if(result1==1){

                            if(commentList.children.length != 0){
                               for(let i=0; i<commentList.children.length;){
        
                                   commentList.children[0].remove();
                                }
                            }

                         page=1;
                          getCommentList(page,bookNum);
                    
                        } else{
                            console.log("삭제실패");
                        }
                    } 
                 }
         }
    } else if (event.target.className="update"){
        let check = window.confirm("수정 하시겠습니까?");
        if(check){
            // let number1 = event.target.previousSibling.previousSibling.previousSibling;
            // let v = contents.innerHTML;
            // number1.innerHTML="<textarea>"+v+"</textarea>"
            
        
            document.querySelector("#up").click();

            // const xhttp = new XMLHttpRequest;
              // 2. url 준비
            // xhttp.open("POST","./commentUpdate");

            // //3. Enctype
            // // 요청 hearder 정보
            // xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

            // // 4. post 파라미터 전송
            // xhttp.send("num="+number1);

            // xhttp.onreadystatechange=function(){
            //      if(this.readyState==4 && this.status==200){
            //         let result1 = xhttp.responseText.trim();
            //         console.log(result1);
            //             if(result1==1){

            //                 if(commentList.children.length != 0){
            //                    for(let i=0; i<commentList.children.length;){
        
            //                        commentList.children[0].remove();
            //                     }
            //                 }

            //              page=1;
            //               getCommentList(page,bookNum);
                    
            //             } else{
            //                 console.log("수정실패");
            //             }
            //         } 
            //      }
         }
    } else {

    }
})

