<template>
  <div>
    <h2>자식 Component</h2>
    <p> 자식 : {{ myMsg }}</p>
    <p> 동적 Prop:{{ dynamicProps }} </p>

    <button @click = "$emit('someEvent')">Click</button>
    <button @click = "buttonClick">NEW click</button>
    <button @click = "emitArgs">추가인자전달</button>

    <hr>
    <!--부모에게서 받은 메시지를 자손으로 보낸다.-->
    <!--그래서 부모의 Data가 바뀌면, 동적으로 알아서 자손의 Data도 바뀐다.-->
    <Grandchild :my-msg = "myMsg"
      @update-name="updateNameM"
    ></Grandchild>

  </div>
</template>

<script setup>
  import Grandchild from "./Grandchild.vue";

  // 왜 Pascal Case이지?
  // defineProps(["myMsg"])

  const props = defineProps({
    myMsg: String,
    dynamicProps:String,
  })

  console.log(props);
  console.log(props.myMsg);

  // 자식이 부모에게 알림을 보낼 때, Emit을 따로 정의한다. 
  const emit = defineEmits(['someEvent', 'emitArgs', 'updateName'])

  const buttonClick = function(){
    emit("someEvent");
  }

  const emitArgs = function(){
    emit("emitArgs", 1, 2, 3);
  }

  const updateNameM = function(name){
    emit('updateName', name);
  }

</script>
  
<style scoped>

</style>