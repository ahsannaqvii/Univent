import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);
const baseURL = "https://univent-rest-api.herokuapp.com/api/union/";
export default {
  state: {
    UnionData: {
      unionId: null,
      name: "",
      annoucement: "",
      unionImage: "",
      president: "",
      vicePresident: "",
      secretary: "",
      headITDept: "",

      Events: [
        {
          id: "",
          name: "",
          description: "",
          eventType: "",
          guestName: " ",
          venue: "",
          meetLink: "",
          regDeadline: "",
          eventDate: "",
          eventTime: "",
          eventImage: "",
        },
      ],
    },
  },
  getters: {
    GetUnionEvents: (state) => state.UnionData.Events,
    GetUnionAnnoucement: (state) => state.UnionData.annoucement,
    GetUnionImage: (state) => state.UnionData.unionImage,
    GetUnionData: (state) => state.UnionData,
  },
  actions: {
    Unions: async ({ commit }) => {
      const res = await axios.get(baseURL + "getUnion?name=ISU");
      console.log(res.data);
      commit("UNION", res.data);
    },
  },
  mutations: {
    UNION: (
      state,
      {
        event,
        unionImage,
        name,
        unionId,
        announcement,
        president,
        secretary,
        vicePresident,
        headITDept,
      }
    ) => {
      state.UnionData.Events = event;
      state.UnionData.unionImage = unionImage;
      state.UnionData.name = name;
      state.UnionData.unionId = unionId;
      state.UnionData.annoucement = announcement;
      state.UnionData.president = president;
      state.UnionData.secretary = secretary;
      state.UnionData.vicePresident = vicePresident;
      state.UnionData.headITDept = headITDept;
    },
  },
};
