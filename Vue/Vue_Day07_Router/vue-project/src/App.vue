<template>
  <div>
    <h2>App Vue</h2>

    <RouterLink to="/" >Home</RouterLink> ||
    <RouterLink to="/about" >About</RouterLink> ||
    <br>
    <RouterLink :to="{name:'home'}" >HomeName</RouterLink> ||
    <RouterLink :to="{name:'about'}" >About</RouterLink> ||

    <br>
    <!--parameter로 json, yang을 전달한다.-->
    <RouterLink :to="{name:'user', params:{id:'json'}}">이재석</RouterLink> ||
    <RouterLink :to="{name:'user', params:{id:'yang'}}">양명균</RouterLink> ||

    <br>
    <!--Login Component-->
    <RouterLink :to="{name:'login'}" >Login</RouterLink>

    <br>
    <!--Board Component-->
    <RouterLink :to="{name:'board'}" >Board</RouterLink>

    <RouterView></RouterView>
  </div>
</template>

<script setup>
  //import {RouterLink, RouterView} from 'vue-router';
</script>

<style lang="scss" scoped>

</style>