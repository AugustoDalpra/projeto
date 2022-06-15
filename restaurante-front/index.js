

const formulario = document.querySelector("form");

var sabor = document.querySelector(".sabor");
var valor = document.querySelector(".valor");
var tamanho = document.querySelector(".tamanho");


function cadastrar(){

    fetch("http://localhost:8080/pizzas/cadastrar",{

    headers:{
        'append': 'application.json',
        'Content-Type': 'application/json'
    },
    method: "POST",
    body: JSON.stringify({
        sabor: sabor.value,
        valor: valor.value,
        tamanho: tamanho.value
    })
    })
    .then(function(res) { console.log(res)})
    .catch(function(res) { console.log(res)})

}


function listar(){

   return fetch("http://localhost:8080/listar",{

        headers:{
            'append': 'application.json',
            'Content-Type': 'application/json'
        },
        method: "GET",
        })
        .then(function(res) { console.log(res)})
        .catch(function(res) { console.log(res)})
    






}

function limpar(){

    sabor.value = "";
    valor.value = 0;
    tamanho.value = "";

}




formulario.addEventListener('submit', function(event){
event.preventDefault();

    const pizza = {
        sabor: sabor.value,
        valor: valor.value,
        tamanho: tamanho.value
    }

    console.log(pizza);

    cadastrar();
    limpar();



});



