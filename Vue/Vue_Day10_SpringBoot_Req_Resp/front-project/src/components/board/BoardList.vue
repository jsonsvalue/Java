<template>
    <div>
        <h4>게시글 목록</h4>
        <hr>

        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>글쓴이</th>
                    <th>조회수</th>
                    <th>등록일</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for = "board in store.boardList" :key = "board.id">
                    <td>{{ board.id }}</td>
                    <td>{{ board.title }}</td>
                    <td>{{ board.writer }}</td>
                    <td>{{ board.viewCnt }}</td>
                    <td>{{ board.regDate }}</td>
                </tr>

            </tbody>

        </table>
        <BoardSearchInput></BoardSearchInput>
    </div>
</template>

<script setup>
    import BoardSearchInput from "./BoardSearchInput.vue";
    import {useBoardStore} from "@/stores/board";
    import {onMounted} from 'vue';

    const store = useBoardStore();

    onMounted(()=>{
        store.getBoardList();
    })

</script>

<style scoped></style>
