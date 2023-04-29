import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);
const baseURL = "http://localhost:8080/api/registration/";

export default {
  state: {
    registrationData: [
      {
        regId: null,
        eventId: null,
        name: "",
        studentId: "",
      },
    ],
  },

  getters: {
    getRegistrationData: (state) => state.registrationData,
  },
  actions: {
    async AllEventRegistrations({ commit }) {
      const response = await axios.get(baseURL + "getAllRegistrations");
      commit("EVENT_REGISTRATIONS", response.data);
    },
  },

  mutations: {
    EVENT_REGISTRATIONS: function (state, payload) {
      state.registrationData = payload;
    },
  },
};
