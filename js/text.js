const text = document.querySelector(".passion-txt");
const strText = text.textContent;
const splitText = strText.split("");
text.textContent = "";

for (let i=0; i < splitText.length; i++){
  text.innerHTML += "<span>" + splitText[i] + "</span>";
  if(i == 11){
    text.innerHTML += "<br>";
  }
}

let char = 0;
let timer = setInterval(onTick, 100);

function onTick(){
  const span = text.querySelectorAll('span')[char];
  span.classList.add('fade');
  char++
  if(char === splitText.length){
    complete();
    return;
  }
}
function complete(){
  clearInterval(timer);
  timer = null;
}