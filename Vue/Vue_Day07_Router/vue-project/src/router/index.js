import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '@/views/AboutView.vue'
import UserView from '@/views/UserView.vue'
import LoginView from '@/views/LoginView.vue'
import BoardView from '@/views/BoardView.vue'
import BoardList from '@/components/BoardList.vue'
import BoardCreate from '@/components/BoardCreate.vue'

const isAuth = true; // 임시로 로그인했음을 보여주기 위한 변수이다.
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: AboutView,
    },
    {
      path:'/user/:id',
      name:'user',
      component: UserView
    },
    {
      path:'/login',
      name: 'login',
      component: LoginView,
      // 이미 로그인한 상태라면 LoginView로 가지 않고, 
      // HomeView로 이동한다.
      beforeEnter:(to, from)=>{
        if(isAuth){
          console.log("이미 로그인 함")
          return {name:'home'}
        }
      }

    },

    {
      path:'/board',
      name:'board',
      component: BoardView,
      children:[
        {
          // 기본적으로는 게시글 목록이 보인다.
          path:'',
          name: 'boardList',
          component:BoardList
        },
        {
          // 게시글 형성을 누르면 게시글 형성 페이지로 넘어간다.
          path:'create',
          name: 'boardCreate',
          component:BoardCreate
          
        }
      ]
    }
  ],
})

// router.beforeEach( (to, from)=>{
//   console.log(to);
//   console.log(from);

//   // 인증되지 않았고 login 페이지가 아니라면,
//   // 로그인 페이지로 이어지게 만든다.
//   const isAuth = false;
//   if(!isAuth && to.name !== 'login'){
//     // console.log("로그인이 필요합니다.")
//     return {name: 'login'};
//   }

// })






export default router
