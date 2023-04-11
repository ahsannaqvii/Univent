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
    // eventImg: null,
  },

  getters: {
    GetEventData: (state) => state,

    GetUniqueEventTypes: (state) => {
      return UniqueEventType(state.eventData);
    },
    GetEventImage: (state) => state.eventImg,
  },
  actions: {
    async EventData({ commit }) {
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
      
      const response = await axios.get(baseURL + "event/getAllEvents");
      let updatedData = clearData(response.data);
      updatedData = extractDate(updatedData);
      commit("EVENT_DATA", updatedData);
    },
  },

  mutations: {
    EVENT_DATA: function (state, payload) {
      // console.log(payload);
      payload.forEach((element) => {
        element.eventMonth = getMonthName(element.eventDate.split("-")[1]);
        element.eventDay = element.eventDate.split("-")[2];
      });
      state.eventData = payload;
    },
    // EVENT_IMG: function (state, payload) {
    //   console.log(payload);
    //   state.eventImg = payload;
    // },
  },
};
