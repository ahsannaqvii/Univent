import Vuex from "vuex";
import Vue from "vue";
import User from "./modules/users.js";
import Event from "./modules/events.js";

// import createPersistedState from 'vuex-persistedstate'

Vue.use(Vuex);

export default new Vuex.Store({
  // plugins: [createPersistedState({
  //     storage: window.sessionStorage,
  // })],

  modules: {
    user: User,
    event: Event,
  },
});
