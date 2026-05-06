document.writeln("JavaScript Variables");



var age = 40;  // Number
const myName = "Niti" // String
var isTrue = true ; // boolean

console.log(typeof(age));
console.log(typeof(myName));
console.log(typeof(isTrue));

// Conversion -- Internal conversion is preferable

let score = "787";  //client is entering the score as string but we need to convert it to number for calculation

//let average1 = score /5 ; // here it not a type safety issue because of internal conversion but it is not a good practice to rely on internal conversion as it can lead to unexpected results in some cases.

let toIntScore = Number(score); // if user enters STRING by mistake then we have to take care of it and do the typeconversion explicitly to avoid any issues in our code.

let average = toIntScore/5;
console.log("Average is : " + average);

// suppose you are creating a user registration form for a website, the form should
//capture the username , age and isSubscribed or not and you need to check whether
//the provided data matches the expected types 
