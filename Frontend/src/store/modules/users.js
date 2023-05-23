import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);
const baseURL = "http://localhost:8080/api/";

export default {
  state: {
    userName: "",
    userID: null,
    userPassword: "",
    userDOB: null,
    userGender: null,
    userAddress: {
      userStreet: "",
      userCity: "",
      userCountry: "",
    },
    userPhone: null,
    userEmail: "",
    userImage: null,
    userEvents: [
      {
        eventId: null,
        eventName: "",
        regId: null,
      },
    ],
  },
  getters: {
    UserData: (state) => state,
    UserID: (state) => state.userID,
  },
  actions: {
    async UserProfile({ commit, state }) {
      const response = await axios.get(
        baseURL + "student/getProfile?id=" + state.userID
      );

      commit("USER_PROFILE", response.data);
    },

    Login: ({ commit }, payload) => {
      //Trying out the Promise way  (Can also be done through await async)

      return new Promise((resolve, reject) => {
        axios
          .post(baseURL + "student/login", payload)
          .then(({ data, status }) => {
            if (status === 200) {
              commit("LOGIN", data);
              resolve(true);
            }
          })
          .catch((err) => {
            console.log(err);
            reject(err);
          });
      });
    },
    UpdateUserProfile: async ({ commit }, payload) => {
      console.log(payload);
      const res = await axios.post(
        baseURL + "student/editUserProfile",
        payload
      );

    },
    async getStudentRegistrations({ commit, state }) {
      const response = await axios.get(
        baseURL + "registration/getEventsByStudentId?id=" + state.userID
      );

      commit("STUDENT_EVENTS", response.data);
    },
  },
  mutations: {
    USER_PROFILE: function (
      state,
      { name, email, password, dob, phone, address }
    ) {
      state.userName = name;
      state.userEmail = email;
      state.userPassword = password;
      state.userDOB = dob;
      state.userPhone = phone;
      state.userAddress.userStreet = address.street;
      state.userAddress.userCity = address.city;
      state.userAddress.userCountry = address.country;
    },
    LOGIN: function (state, { id }) {
      state.userID = id;
    },
    STUDENT_EVENTS: function (state, payload) {
      state.userEvents = payload;
    },
  },
};
