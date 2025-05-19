import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useCounterStore = defineStore('counter', () => {
  //State(변수)
  const count = ref(20);
  
  //getters(계산된 값)
  const doubleCount = computed(() => count.value * 2)
  
  //actions(함수)
  function increment() {
    count.value++
  }

  

  return { count, doubleCount, increment }
})
