<template>
    <div>
        <!--todo.isDone에 따라서, 완료 처리를 한다. -->
        <span class = "click-cursor" 
            :class = "{ 'is-done' : todo.isDone}"
            @click = "store.updateTodo(todo.id)"
        >
            {{ todo.text }}
        </span>
        <button @click = "store.deleteTodo(todo.id)">Delete</button>
    </div>

</template>

<script setup>
    import {useTodosStore} from '@/stores/todos';
    const store = useTodosStore();

    defineProps({
        todo:Object,
    });    

</script>



<style scoped>
    .is-done{
        text-decoration: line-through;
    }

    .click-cursor{
        cursor:pointer;
    }
</style>