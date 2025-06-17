let name="parth";
const a = 90;
var IsStudent = true;

console.log(name, a , IsStudent);

console.log(`hello , I'm ${name} and I'm ${a} year old` );

// arrays

let skills = ["HTMl" , "CSS"];
skills.push("js");
console.log(skills);

function great(user){
    console.log(name);
    return `hello, ${user}`;

}

console.log(great("Parth"));

const square = (n) => n*n;
const addition = (m) => m+m;

console.log(square(2) ,addition(3));

if(a > 0){
    console.log("pass");
}else{
    console.log("fail");
}

console.log(a<=0 ? "pass" : "fail");

