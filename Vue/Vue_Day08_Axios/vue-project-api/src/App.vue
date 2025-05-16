<template>
  <div>
    <h2>Youtube View</h2> 
  </div>

  <!--Search에서 받은 video를 VideoList로 보낸다.-->
  <Search @search = "getVideos"></Search>
  <hr>
  <VideoDetail :video="selectedVideo"></VideoDetail>
  <hr>
  <VideoList :videoList = "videoList" @click = "clickVideo"></VideoList>

</template>
  
<script setup>
  import Search from './components/Search.vue';
  import VideoList from './components/VideoList.vue';
  import VideoDetail from './components/VideoDetail.vue';
  import {ref} from "vue";

  const videoList = ref([]);
  const selectedVideo = ref(null);

  const getVideos = function(searchedVideos){
    // console.log(searchedVideos);
    videoList.value = searchedVideos;
    // console.log(videoList.value);
 }


 const clickVideo = function(video){
    console.log("비디오 선택");
    selectedVideo.value = video;
    console.log(selectedVideo.value);
 }

</script>

<style lang="scss" scoped>

</style>