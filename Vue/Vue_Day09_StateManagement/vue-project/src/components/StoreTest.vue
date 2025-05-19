<template>
  <div>
    <h2>Store test</h2>
    <!--State에 저장 돼 있는 count를 출력해보자-->
    <p> State: {{ store.count }} </p>
    <!--Getters-->
    <p> getters: {{ store.doubleCount }}</p>

    <!--Action-->
    <div>
      <button @click="store.increment">+1</button>
      <button @click="increment2">+1</button>
    </div>


  </div>
</template>

<script setup>
  // useCounterStore를 정의해줘야 한다. 
  // useCounterStore내에 있는 ref, function 등을 이용할 수 있다.
  import {useCounterStore} from "./stores/counter";

  const store = useCounterStore();

  console.log(store.doubleCount);  

  const increment2 = function(){
    store.increment();
  }

</script>

<style lang="scss" scoped>

</style>