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
};

const getters = {
  UserData: (state) => state,
};


const baseURL= "http://localhost:8080/api/"


const actions = {
  async UserProfile({ commit }) {
    
    const response = await axios.get(baseURL + "student/getProfile?id=" +state.userID);
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
  UpdateUserProfile : ({commit},payload) => {
    console.log(payload);
  },
};

const mutations = {
  USER_PROFILE: function (state, {id,name,email,password,dob,phone,address}) {
    state.userName = name;
    state.userEmail = email;
    state.userPassword = password;
    state.userDOB = dob;
    state.userPhone = phone;
    state.userAddress.userStreet = address.street;
    state.userAddress.userCity = address.city;
    state.userAddress.userCountry = address.country;
  },
  LOGIN: function (state, {id}) {
    state.userID=id;
  },

};
export { state, getters, actions, mutations };
