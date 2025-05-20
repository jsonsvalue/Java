import { ref, computed } from "vue";
import { defineStore } from "pinia";
import axios from "axios";
import router from "@/router";

const REST_API_URL = `http://localhost:8080/api-user`;

export const useUserStore = defineStore("user", () => {
  const loginUser = ref(null);
  const userLogin = function(id, password){
    axios.post(`${REST_API_URL}/login`,{
      id,
      password
    })
    //response를 받게 되면, boardList로 이동한다.
    .then((response)=>{
      console.log(response.data);
      //session storage에 access-token이라는 이름으로 설정하겠다.
      const token = response.data["access-token"].split(".")
      console.log(token);

      const name = JSON.parse(atob(token[1]))
      console.log(name);  

      sessionStorage.setItem("access-token", response.data["access-token"]);
      router.push({name:"boardList"})
    })
    // 실패하면 home으로 간다.
    .catch((err)=>{
      console.log(err)
      router.push({name: "home"});
    })

  }

  return { loginUser, userLogin };
});
