import axios from 'axios';
import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

const REST_API_URL = `http://localhost:8080/api-board/board`;

export const useBoardStore = defineStore('board', () => {
  // 게시물 목록 관리
  const boardList = ref([]);

  const getBoardList = function(){

    axios.get(REST_API_URL).then((response)=>{
      // console.log(response.data);
      boardList.value = response.data;
    }).catch(()=>{

    })  
  };
  
  // searchInfo를 REST_API_URL에 넘겨서, 
  // boardList.value = response.data에 넣는다.
  const searchBoardList = function(searchInfo){
    axios.get(REST_API_URL, {
      params:searchInfo,
    })
    .then((response)=>{
      boardList.value = response.data;
    });

  }
  
  const createBoard = function(board){
    axios({
      url:REST_API_URL,
      method: "POST",
      data:board,
    })
    .then(()=>{
      console.log("게시글 등록 완료!")
      return "Finished";
    })
    .catch(()=>{
      console.log("게시글 등록 실패");
    })
  }

  return { boardList, getBoardList, searchBoardList, createBoard};

})
