<template>
    <li @click = "clickVideo">
        <!-- <h4>{{ video.snippet.title }}</h4> -->
        <h4>{{ videoTitle }}</h4>
        
        <img :src = "video.snippet.thumbnails.default.url">
        <div>{{ video.snippet.description }}</div>
    </li>
</template>

<script setup>
import _ from "lodash";
import {computed} from "vue";

const props = defineProps({
    video:{
        type:Object,
    }

})

const videoTitle = computed(()=>{
    return _.unescape(props.video.snippet.title)
})

const emit = defineEmits(["click"]);
const clickVideo = function(){
    emit("click", props.video);
}


</script>

<style scoped>

</style>