const slide = document.getElementById("my-work")
const back = document.getElementById("back-work")


function workAppear(){
    slide.classList.toggle("slide-in");
    back.classList.toggle("slide-in");
}

function workDisappear(){
    slide.classList.remove("slide-in");
    back.classList.remove("slide-in");
}

function sentSuccesful(){
    alert("Thank you for feedback;)")
}
