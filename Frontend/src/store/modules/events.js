import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);
const baseURL = "https://univent-rest-api.herokuapp.com/api/";

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
    pastEvents: [
      {
        eventName: "",
        eventID: null,
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
    GetPastEvents: (state) => {
      return state.pastEvents;
    },
  },
  actions: {
    async EventData({ commit }) {
      const response = await axios.get(baseURL + "event/getAllEvents");
      let updatedData = clearData(response.data);

      updatedData.forEach((element) => {
        element.eventDate = extractDate(element.eventDate);
      });
      commit("EVENT_DATA", updatedData);
    },
    async PastEvents({ commit }) {
      const response = await axios.get(baseURL + "event/getPastEvents");
      commit("PAST_EVENTS", response.data);
    },
    async EventRegistration({ commit }, payload) {
      const response = await axios.post(
        baseURL + "registration/addRegistration",
        payload
      );
      commit("EVENT_REGISTER", response.data);
    },
    async AddEvent({ commit }, payload) {
      const response = await axios.post(baseURL + "event/addEvent", payload);
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
    PAST_EVENTS: function (state, payload) {
      state.pastEvents = payload;
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
