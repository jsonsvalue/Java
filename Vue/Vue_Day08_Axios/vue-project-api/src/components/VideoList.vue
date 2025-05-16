<template>
    <div>
        <h4> 검색된 비디오 목록 </h4>

        <ul>
            <VideoListItem 
            v-for = "video in videoList" :key = "video.id.videoId"
            :video = "video"
            
            @click = "clickVideo"
            />
            <span></span>

        </ul>

    </div>


</template>

<script setup>
    import VideoListItem from "./VideoListItem.vue";

    defineProps({
        videoList:{
            type:Array,
        },
    });

    const emit = defineEmits(["click"])

    const clickVideo = function(video){
        // console.log(video);
        emit("click", video);

    }



</script>

<style scoped>

</style>