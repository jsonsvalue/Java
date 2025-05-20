<template>
    <div>
        <h4>Login</h4>
        <input type = "text" placeholder = "ID를 입력해주세요." v-model.trim = "id">
        <input type = "password" placeholder = "PW를 입력해주세요." v-model.trim = "password">
        
        <button @click ="login">로그인</button>
    </div>
</template>

<script setup>
    import {ref} from 'vue';
    import {useUserStore} from '@/stores/user';

    const id = ref('')
    const password = ref('')
    
    const store = useUserStore();

    const login = function(){
        store.userLogin(id.value, password.value);
    }


</script>

<style scoped>

</style>