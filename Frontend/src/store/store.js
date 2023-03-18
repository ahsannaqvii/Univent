
import Vuex from "vuex";
import Vue from "vue";
import { state, getters, actions, mutations } from "./modules/Users/users.js";
Vue.use(Vuex);

export default new Vuex.Store({
    state,
    mutations,
    actions,
    getters

});