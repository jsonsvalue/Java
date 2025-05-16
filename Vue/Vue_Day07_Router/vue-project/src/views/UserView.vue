<template>
  <div>
    <h1>User Vue</h1>

    <h2>{{ $route.params.id }}의 User 페이지 /비권장</h2>
    <h2>{{ userId }}의 User 페이지 /권장</h2>
    <h2>{{ userId2 }}</h2>

    <button @click = "goToHome">홈으로</button>
  </div>
</template>

<script setup>
  import {ref, watch} from 'vue';
  import {useRoute, useRouter, onBeforeRouteLeave, onBeforeRouteUpdate} from 'vue-router';

  //route에 있는 id를 userId에 담아서 쓴다.
  const route = useRoute()
  const userId = ref(route.params.id)
  const userId2 = ref(route.params.id)

  watch(()=>route.params.id, (newId)=>{
    userId.value = newId;
  })

  const router = useRouter();
  
  const goToHome = function(){
    // router.push('/home');
    
    // 하단의 형식을 더 추천한다.
    // 다른 페이지로 이동하면서, history stack에 주소를 push한다.
    //router.push({name:'home'});

    // 단순히 다른 페이지로 이동한다.
    router.replace({name:'home'})
  }

  onBeforeRouteLeave(()=>{
    // 페이지 안 나가기 누르면, 그대로 해당 페이지에 남아 있게 한다.
    const rtn = confirm("페이지 나갈거임?")
    // if(!rtn)
    //   return false;

    return rtn;

  })

  onBeforeRouteUpdate((to)=>{
    console.log(to)
    userId2.value = to.params.id;

  })


</script>

<style lang="scss" scoped>

</style>