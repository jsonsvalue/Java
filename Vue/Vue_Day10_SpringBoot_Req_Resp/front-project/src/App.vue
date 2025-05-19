<template>
  <div>
    <h2>Main</h2>

    <HeaderNav></HeaderNav>
    <router-view></router-view>
  </div>
</template>



<script setup>
  import HeaderNav from '@/components/common/HeaderNav.vue';
  
</script>



<style scoped>

</style>