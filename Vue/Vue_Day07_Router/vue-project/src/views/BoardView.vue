<template>
  <div>
    <h2>Board Vue</h2>

    <RouterLink to = "/board">게시글 목록</RouterLink> ||
    <RouterLink to = "/board/create">게시글 등록</RouterLink>
    <br>
    
    <!--router 내 index 파일에 설정한 이름으로 페이지를 조회한다.-->
    <RouterLink :to = "{name:'boardList'}">게시글 목록 Name</RouterLink> ||
    <RouterLink :to = "{name:'boardCreate'}">게시글 등록 Name</RouterLink>


    <RouterView/>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>

</style>