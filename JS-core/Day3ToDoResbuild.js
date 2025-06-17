const input = document.getElementById("taskInput");
const button = document.getElementById("addTask");
const list = document.getElementById("tasklist");
const delBtn = document.createElement("button");
button.addEventListener("click" , ()=>{
    const task = input.value.trim();
    if(!task) return;

    const li = document.createElement("li");
    li.textContent = task;
    list.appendChild(li);
    input.value="";

    delBtn.textContent = "❌";
    delBtn.onclick = () => list.removeChild(li);
    li.onclick = () => li.style.textDecoration = "line-through";
    li.appendChild(delBtn);
});
