<template>
  <div>
    <h1>To do Test</h1>
    <p>전체 To do 개수: {{ store.todos.length }}</p>
    <p>완료된 To do의 개수: {{ store.doneTodoCount }} </p>
    <p>미완료된 To do의 개수: {{ store.todos.length - store.doneTodoCount }}</p>
  </div>

  <TodoForm></TodoForm>
  <TodoList></TodoList>

</template>

<script setup>
  import TodoForm from "./components/TodoForm.vue";
  import TodoList from './components/TodoList.vue';

  import {useTodosStore} from "./stores/todos";
  const store = useTodosStore();
</script>

<style scoped>

</style>