const registBtn = document.querySelector("#regist")
const inputTag = document.querySelector("#todo-value")
const ulTag = document.querySelector("#todo-list")

let todoList;

const registTodo = () => {
  const content = inputTag.value
  if (!content.trim()) {
    //입력된게 없다.!
    alert("입력 해줘잉~!")
  } else {
    const todoItem = {
      todo: content,
      done: false
    }

    createTodoItem(todoItem)


    inputTag.value = '' //벨류 초기화
    inputTag.focus()

    todoList.push(todoItem)
    localStorage.setItem('todoList', JSON.stringify(todoList))
  }
}

const createTodoItem = (todoItem) => {
  const liTag = document.createElement("li")
  const spanTag = document.createElement("span")
  spanTag.innerText = todoItem.todo;

  spanTag.addEventListener('click', ()=> {
    updateTodo(todoItem.todo)
  })

  liTag.appendChild(spanTag)

  //삭제버튼
  const delBtn = document.createElement('button')
  delBtn.innerText='X'
  delBtn.addEventListener('click', ()=>{
    removeTodo(todoItem.todo)
  })

  liTag.appendChild(delBtn)
  ulTag.appendChild(liTag)
}

const updateTodo = (todo)=>{
  event.target.classList.toggle('done')
  //현재 내가 관리하고 있는 todoList를 localStorage에 반영해야한다...

}
const removeTodo = (todo)=>{
  event.target.parentElement.remove()
  //로컬스토리지에 반영을 해야한다!
}











//초기 세팅
window.addEventListener('load', function () {
  todoList = localStorage.getItem('todoList')
  if (todoList != null) {
    todoList = JSON.parse(todoList) //배열로 다시 원복
    for (let i = 0; i < todoList.length; i++) {
      createTodoItem(todoList[i])
    }
  } else {
    todoList = [];
  }
})





//기능완성 권장을 한다.








registBtn.addEventListener('click', registTodo)
