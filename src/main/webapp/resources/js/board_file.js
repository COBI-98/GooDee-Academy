const addFiles = document.getElementById("addFiles");
const fileadd = document.getElementById("fileadd");

let count = 0;

fileadd.addEventListener("click", function(){
    count++;

    if(count<6){
    let div1 = document.createElement("div");
    let div_class = document.createAttribute("class");
    let label = document.createElement("label");
    let label_class = document.createAttribute("class");
    let label_for = document.createAttribute("for");
    let input = document.createElement("input");
    let input_type = document.createAttribute("type");
    let input_name = document.createAttribute("name");
    let input_class = document.createAttribute("class");
    let input_id = document.createAttribute("id");

    div_class.value = "form-group";
    label_class.value = "form-label mt-4";
    label_for.value ="files1";
    
    input_type.value = "file";
    input_name.value = "files";
    input_class.value = "form-control is-valid";
    input_id.value = "files"+count;
    
    console.log(input_id);


    div1.setAttributeNode(div_class);
    label.setAttributeNode(label_class);
    label.setAttributeNode(label_for);
    input.setAttributeNode(input_type);
    input.setAttributeNode(input_name);
    input.setAttributeNode(input_class);
    input.setAttributeNode(input_id);

    label.innerHTML ="Photo"+count;
    
    
    div1.appendChild(label);
    div1.appendChild(input);
    addFiles.appendChild(div1);
    } else{
        alert("최대 5개");
    }
})