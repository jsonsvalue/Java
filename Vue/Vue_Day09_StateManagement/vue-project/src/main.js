import { createApp } from 'vue'
import { createPinia } from 'pinia'
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'
import App from './App.vue'

const app = createApp(App)

//Local Storage에 데이터를 저장하는 방법이다.
const pinia = createPinia()
pinia.use(piniaPluginPersistedstate)

app.use(pinia)

app.mount('#app')
