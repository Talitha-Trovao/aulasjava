const form = document.querySelector("#form-create-task");
const tbodyTasks = document.querySelector("#tbody-tasks");
const KEY_TASKS_LOCAL_STORAGE = "tasks";
const tasks = []; //inicia com lista vazia

form.addEventListener("submit", (event) => {
      event.preventDefault();//registra após clicar em submit e nao atualiza a pagina

    const formValues = event.target;
    const {title, description} = formValues; //coloca o conteudo dos itens na lista
    tasks.push({
        title: title.value,
        description: description.value
    });
   
    title.value = "";
    description.value = "";

    updateViewTable(tasks);
    saveTasksLocalStorage(); //salva os itens mesmo se atualizar a pg
});

function updateViewTable(list){
    tbodyTasks.innerHTML = ''; //limpa a tabela antes de inserir uma info nova para nao duplicar linhas
    list.forEach((item, index) => {
        const trelement = document.createElement("tr");
        trelement.innerHTML = `
            <td>${index+1}</td> 
            <td>${item.title}</td> 
            <td>${item.description}</td> 
            <td>acoes</td> 
        `;
        tbodyTasks.appendChild(trelement)//acumula o que for inserido na tabela
    });
}

function saveTasksLocalStorage(){
    const listtasksstring = JSON.stringify(tasks);
    localStorage.setItem(KEY_TASKS_LOCAL_STORAGE,listtasksstring);
}

