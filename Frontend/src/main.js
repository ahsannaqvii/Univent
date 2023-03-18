import Vue from 'vue'
import App from './App.vue'
import Routes from './router/routes.js'
import VueRouter from "vue-router";
import store from './store/store';



// Catering Font Awesome Icons 
import { library } from '@fortawesome/fontawesome-svg-core'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { fab } from '@fortawesome/free-brands-svg-icons'

import { fas } from "@fortawesome/free-solid-svg-icons";
import { far } from "@fortawesome/free-regular-svg-icons";
import vuetify from './plugins/vuetify'


Vue.config.productionTip = false
Vue.use(VueRouter)
/* add icons to the library */
library.add(fas,fab,far)

/* add font awesome icon component */
Vue.component('font-awesome-icon', FontAwesomeIcon)


const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes:Routes,
})

new Vue({
  vuetify,
  router : router,
  store,
  render: h => h(App),

}).$mount('#app')
