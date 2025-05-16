<template>
  <div>
    <h2>자손 Component</h2>
    <p>자손: {{ myMsg }}</p>
    <input type = "text" v-model = "name" @keyup.enter = "updateNameL">
    <button @click = "updateNameL"> 부모에게 이름 변경 요청</button>

  </div>
</template>

<script setup>
  // 왜 Pascal Case이지?
  // defineProps(["myMsg"])

  import {ref} from "vue";

  const props = defineProps({
    myMsg: String,
  })

  const name = ref("")

  const emit = defineEmits(["updateName"])

  const updateNameL = function(){
    emit("updateName", name.value);
    name.value = "";
  }

</script>
  
<style scoped>

</style>