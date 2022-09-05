const d1 = document.querySelector("#d1");
const check = document.querySelector("#check");
const result = document.querySelector("#result");
// 비동기방식

d1.addEventListener("click",function(){

    // 1. ajax 로 요청하는 객체생성
    let xhttp = new XMLHttpRequest();

    // 2. 요청 정보
    xhttp.open("GET","https://jsonplaceholder.typicode.com/posts/"+check.value)

    // 3. 요청 발생
    xhttp.send();

    // 4. 응답 결과 처리

    xhttp.onreadystatechange =function(){
        // this 는 http 객체
        // console.log(this.status); 
        // console.log(this.readyState);
        // console.log("--------------------");   
        if(this.readyState==4 && this.status==200){

            // console.log(this.responseText);
            
            let response = this.responseText.trim();
            response = JSON.parse(response);

            console.log(response.userId)
            console.log(response.id);
            console.log(response.title)
            console.log(response.body);

            let userid = document.createElement("h3");
            let userid_text = document.createTextNode(response.userId);

            let id = document.createElement("h3");
            let id_text = document.createTextNode(response.id);

            let title = document.createElement("h3");
            let title_text = document.createTextNode(response.title)

            let body = document.createElement("h3");
            let body_text = document.createTextNode(response.body);


            userid.append(userid_text)
            id.append(id_text)
            title.append(title_text);
            body.append(body_text);


            result.appendChild(userid)
            result.appendChild(id)
            result.appendChild(title)
            result.appendChild(body)
            

        } 

        
        
    }


    



    console.log("Ajax 발생");
});