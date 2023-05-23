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
    getEventRegistrationData: (state) => state.registrationData,
  },
  actions: {
    async GetEventAttendance({ commit }, eventId) {
      const response = await axios.get(
        baseURL + "getAttendance?eventId=" + eventId
      );
      commit("EVENT_REGISTRATION", response.data);
    },
    // Function designed to mark attendance of specific students in an event
    async MarkAttendance({ commit }, payload) {
      const response = await axios.post(baseURL + "addAttendance", payload);
      console.log(response);
    },
   
  },

  mutations: {
    EVENT_REGISTRATION: function (state, payload) {
      state.registrationData = payload;
    },
  },
};
