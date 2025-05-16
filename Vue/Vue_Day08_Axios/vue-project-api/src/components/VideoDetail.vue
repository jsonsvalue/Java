<template>
    <div>
        <h4>영상 자세히 보기</h4>
    </div>
    <!-- <iframe width="560" height="315" 
    :src="videoURL" 
    title="YouTube video player" frameborder="0" 
    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" 
    referrerpolicy="strict-origin-when-cross-origin" allowfullscreen>
    </iframe> -->

</template>

<script setup>
    import {computed} from "vue";
    const props = defineProps({
        video:{
            type:Object,
        }
    })

    // console.log("영상 자세히 보기")
    // console.log(props.video.id.videoId);

    const videoURL = computed(()=>{
        const videoId = props.video.value.id.videoId;
        return `https://www.youtube.com/embed/${videoId}`
    })


</script>

<style scoped>

</style>