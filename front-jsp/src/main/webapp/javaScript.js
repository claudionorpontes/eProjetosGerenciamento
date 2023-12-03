const form = document.querySelector("#form")
const nameInput = document.querySelector("#name")
const emailInput = document.querySelector("#email")
const cargoInput = document.querySelector("#cargo")
const jobSelect = document.querySelector("#job")
const messageTextarea = document.querySelector("#message")

form.addEventListener("submit", (event) => {
    event.preventDefault();

    if(nameInput.value === "") {
        alert("Por favor, preencha o seu nome");
        return;
    }

    if(emaiInput.value === "" || !isEmailValid(emailInput.value)) {
        alert("Por favor, preencha o seu email");
        return;
    }

    if(!validatePassword(passwordInput.value)) {
        alert("A senha precisa de no mínimo 8 dígitos");
        return;
    }

    if(jobSelect.value ===""){
        alert("Por favor, selecione a sua situação")
    }

    if(messageTextarea.value ==="")
        alert("Preencha ou escreva uma mensagem")
    }

form.submit();


function isEmailValid(email) {

   

    if (emailRegex.toLocaleString(email)) {
        return true;
    }

        return false;
}

function validatePassword(password, minDigits){
    if(password.length >= minDigits) {
        return true
    }

    return false
}
