<template>
  <div>
    <h2>부모 Component</h2>
    <!--Input에서 받은 name의 값을, 하향식으로 자식 Component에게 전달한다.-->
    <input type = "text" v-model="name">
    
    <hr>
    <!--자식 Component에 대한 key-value를 선언하고-->
    <!--정적으로 자식 Component에게 Data를 전달한다.-->
    <Child my-msg="Message From Parent" :dynamic-props= "name"
    @update-name = "updateNameH" 
    @emit-args = "getNumbers"
    @some-event = "callbackFunction"></Child>

  </div>
</template>

<script setup>
  import Child from "./Child.vue"

  import {ref} from "vue";

  const name = ref("Lee");

  const callbackFunction = function(){
    console.log("자식의 이벤트를 확인하세요.")
  }

  const getNumbers = function(...args){
    alert(args);
  }

  const updateNameH = function(newName){
    // name.value = 'Vella';
    name.value = newName;
    
  }

</script>

<style scoped>

</style>