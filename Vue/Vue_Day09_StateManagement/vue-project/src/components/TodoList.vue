<template>
    <div>
        <h2>Todo List</h2>

        <TodoListItem v-for="todo in store.todos" :key="todo.id" :todo="todo"></TodoListItem>
    </div>
</template>

<script setup>
    import TodoListItem from "./TodoListItem.vue";

    import {useTodosStore} from "@/stores/todos";

    const store = useTodosStore();
    console.log("TodoList");
    console.log(store.todos);

</script>

<style scoped>

</style>