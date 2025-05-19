import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useTodosStore = defineStore("todos", () => {
  //State(변수)
  let id = 0;
  
  const todos = ref([
    {
      id:id++,
      text:"등산하기 : 이재석",
      isDone:false,
    },
    {
      id:id++,
      text:"잠자기 : 이승민",
      isDone:false,
    },
    {
      id:id++,
      text:"클라이밍 : 이솔빈",
      isDone:false,
    },
  ]);

  const updateTodo = function(id){
    // todo.id와 동일한 id의 todo를 반환한다.
    const findTodo = todos.value.find((todo)=> todo.id === id)
    if(findTodo){
      findTodo.isDone = !findTodo.isDone;
      console.log(findTodo.text);
    }

    // console.log(id);
  }

  const deleteTodo = function(id){
    const idx = todos.value.findIndex((todo)=>{
      return todo.id === id;
    })

    // console.log(idx);
    // 해당 인덱스에서 1개를 지우고 싶다.
    // 그러니까 해당 인덱스의 todo를 지우고 싶다는 말이다.
    todos.value.splice(idx, 1);
  }

  const addTodo = function(text){
    todos.value.push({
      id: id++,
      text: text,
      isDone: false,
    })

    console.log(text);
  }
  
  const doneTodoCount = computed(()=>{
    return todos.value.filter((todo)=> todo.isDone).length;
  })


  return {todos,updateTodo, deleteTodo, addTodo, doneTodoCount};
  
}, 
{persist:true}
);
