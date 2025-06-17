let name = "Parth";
const age = 22 ;

//arrow function
const greet = name => `Hello , ${name}`;
console.log(greet(name));

//templete literals
console.log(`Welcome , ${name}, to ${age}`);

//destructuring
const user ={ name: "parth" , company :"KPIT"};
const {company} = user;
console.log(company);


//spread
const skills=["js" , "React"];
const allSkills = [...skills ,"ARM"];
console.log(allSkills);

//Rest
const add = (...nums) => nums.reduce((a,b)=> a+b);
console.log(add(1,2,3));

// let randomno: Number = 22;
// let isDev: boolean = true;

// function add(a: Number, b: Number): Number {
//   return a + b;
// }
