
import Vuex from "vuex";
import Vue from "vue";
import { state, getters, actions, mutations } from "./modules/Users/users.js";
import createPersistedState from 'vuex-persistedstate'

Vue.use(Vuex);

export default new Vuex.Store({
    plugins: [createPersistedState({
        storage: window.sessionStorage,
    })],
    state,
    mutations,
    actions,
    getters

});