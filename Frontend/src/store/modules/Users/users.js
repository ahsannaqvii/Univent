import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);

const state = {
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
  userLoggedIn: false,
};

const getters = {
  getUserName: (state) => state.userName,
  getUserPassword: (state) => state.userPassword,
  getUserDOB: (state) => state.userDOB,
  getUserGender: (state) => state.userGender,
  getUserAddress: (state) => state.userAddress,
  getUserPhone: (state) => state.userPhone,
  getUserEmail: (state) => state.userEmail,
  getUserImage: (state) => state.userImage,
  getUserLoggedIn: (state) => state.userLoggedIn,
  getStudentID:(state)=>state.userID,
};

const actions = {
  async UserProfile({ commit }) {
    
    const response = await axios.get("http://localhost:8080/student/getstudentbyId?id=" +state.userID);
    console.log(response.data);
    // commit("GET_PROFILE", response.data);
  },

  Login: ({ commit }, payload) => {
    //Trying out the Promise way  (Can also be done through await async)
    return new Promise((resolve, reject) => {
      axios
        .post("http://localhost:8080/student/login", payload)
        .then(({ data, status }) => {
          if (status === 200) {
            commit("LOGIN", data);
            resolve(true);
          }
        })
        .catch((err) => {
          reject(err);
        });
    });


  },
};

const mutations = {
  GET_PROFILE: function (state, studentData) {
    state.userName = studentData;
  },
  LOGIN: function (state, {id}) {
    state.userID=id;
  },

};
export { state, getters, actions, mutations };
