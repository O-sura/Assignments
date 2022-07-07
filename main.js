//Question 01
var flowerName = "Lili";

//Question 02
var x,y,z;
x = 5;
y = 6;
z = x + y;

//Question 03
const price1 = 10;
const price2 = 20;
let total = price1 + price2;

//Question 04
const flowers = ["Sunflower","Rose","Blue-Lotus"];

//Question 05
const person = {
    firstName: "Osura",
    lastName: "Viduranga",
    age: 22,
    eyeColor: "Black"
};

//Question 06
let length = 16; // Integer
let lastname = "smith"; // String
const x = { firstname : "kumara", lastname : "amunapperuma" }; //Object

//Question 07
function fahrenheitToCelcius(temp){
    return (5/9) * (temp-32);
}

//Question 08
console.log(fahrenheitToCelcius(77));

//Question 09
const person = {
    firstName: "kasun",
    lastName: "senarath",
    age: 23,
    eyeColor: "black",
    fullName: function(){ 
        return this.firstName + " " + this.lastName;
    } 
};

console.log(person.fullName());

//Question 10
var currTime = new Date();
if(currTime.getHours() < 10){
    alert("Good Morning");
}else if(currTime.getHours() < 20){
    alert("Good Day");
}
else{
    alert("Good Evening");
}


//Question 11
let fruits = prompt();
switch(fruits.toLowerCase()){
    case "banana":
        alert("Yellow");
        break;
    case "pineapple":
        alert("Orange");
        break;
    case "apple":
        alert("Green");
        break;
}


//Question 12
for(var i = 0;i<10;i++){
    console.log(i);
}


//Question 13
let i = 0;
while(i < 10){
    console.log(i);
    i++;
}

//Question 14
let userString = prompt();
var stringlen = userString.length;
let switchedString = [];
for(var i = 0;i<stringlen;i++){
    if(userString[i] === userString[i].toUpperCase()){
        switchedString.push(userString[i].toLowerCase());
    }
    else if(userString[i] === userString[i].toLowerCase()){
        switchedString.push(userString[i].toUpperCase());
    }else{
        switchedString.push(userString[i].toString());
    }
}
prompt(switchedString.join(''));


//Question 15
const color = ["Blue","Green","Red","Orange","Violet","Indigo","Yellow"];
const o = ["th","st","nd","rd"];
let ordinal;
for(var i = 0;i<color.length;i++){
    if(i<3){
        ordinal = o[i+1];
    }
    else{
        ordinal = o[0];
    }
    console.log(i+1+ordinal+" Choice is " + color[i])
}


//Question 16
function merge_array(arr1,arr2){
    let mergedArr = [];
    for(num of arr1){
        if(mergedArr.includes(num)){
            continue;
        }else{
            mergedArr.push(num);
        }
    }
    for(num of arr2){
        if(mergedArr.includes(num)){
            continue;
        }else{
            mergedArr.push(num);
        }
    }
    return mergedArr;
}

const array1 = [1,2,3];
const array2 = [2,30,1];

console.log(merge_array(array1,array2));

