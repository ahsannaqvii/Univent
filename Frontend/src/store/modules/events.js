import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);
const baseURL = "http://localhost:8080/api/";

import {
  clearData,
  UniqueEventType,
  extractDate,
  getMonthName,
  extractCurrentEvents,
} from "./../../utils/eventsUtil";
export default {
  state: {
    eventData: [
      {
        eventName: "",
        eventID: null,
        eventGuestName: "",
        eventImage: "",
        eventDate: null,
        eventMonth: null,
        eventDay: null,
        eventTime: null,
        eventVenue: "",
        eventMeetLink: "",
        eventType: "",
        eventRegDeadline: null,
      },
    ],
    registrationID: null,
  },

  getters: {
    GetEventData: (state) => state,

    GetUniqueEventTypes: (state) => {
      return UniqueEventType(state.eventData);
    },

    GetCurrentEvents: (state) => {
      return extractCurrentEvents(state);
    },
  },
  actions: {
    async EventData({ commit }) {
      const response = await axios.get(baseURL + "event/getAllEvents");
      let updatedData = clearData(response.data);
      updatedData = extractDate(updatedData);
      commit("EVENT_DATA", updatedData);
    },

    async EventRegistration({ commit }, payload) {
      console.log(payload);
      const response = await axios.post(
        baseURL + "registration/addRegistration",
        payload
      );
      commit("EVENT_REGISTER", response.data);
    },
  },

  mutations: {
    EVENT_DATA: function (state, payload) {
      payload.forEach((element) => {
        element.eventMonth = getMonthName(element.eventDate.split("-")[1]);
        element.eventDay = element.eventDate.split("-")[2];
      });
      state.eventData = payload;
    },
    EVENT_REGISTER: function (state, payload) {
      state.registrationID = payload;
    },
  },
};
// const res = axios.get(
//   "http://localhost:8080/api/student/getImage?id=1120",
//   {
//     responseType: "blob",
//     headers: {
//       "content-type": "image/jpeg",
//       accept: "image/jpeg",
//     },
//   }
// ).then((res) => {
//   const urlCreator = window.URL || window.webkitURL
//   let tempData = urlCreator.createObjectURL(res.data)
//   commit("EVENT_IMG", tempData)
// }).catch((err) => {
//   console.log(err);
// });

//mutation
// EVENT_IMG: function (state, payload) {
//   console.log(payload);
//   state.eventImg = payload;
// },
