<template>
    <h3>
        검색
    </h3>
    <input type = "text" v-model = "keyword" @keydown.enter = "search">
    <button @click = "search"> 검색 </button>
</template>

<script setup>
    import axios from "axios";
    import {ref} from "vue";
    
    const keyword = ref("");
    const emit = defineEmits(["search"]);
    
    const search = function(){
        console.log("Search");

        const youtube_api = "https://www.googleapis.com/youtube/v3/search";

        // 주어진 youtube API에 keyword를 넘겨서 값을 받는다.
        axios({
            url:youtube_api,
            method:"get",
            params:{
                part:"snippet",
                maxResults: 10,
                q: keyword.value,
                type: "video",
                key: import.meta.env.VITE_YOUTUBE_API_KEY,
            }
        }).then((response)=>{
            // console.log(response.data);
            // console.log(response.data.items);
            
            emit("search", response.data.items);

        })




    }

</script>

<style scoped>

</style>