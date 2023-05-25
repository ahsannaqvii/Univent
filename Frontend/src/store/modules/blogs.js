import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);
const baseURL = "https://univent-rest-api.herokuapp.com/blog/";

import { extractDate, getMonthName } from "./../../utils/eventsUtil";
export default {
  state: {
    blogs: [
      {
        author: "",
        category: "",
        content: "",
        title: "",
        blogMonth: "",
        blogDay: null,
        blogYear: "",
        id: null,
        date: null,
        blogComments: [
          {
            comment: "",
            sname: "",
            id: null,
          },
        ],
      },
    ],
  },

  getters: {
    // Get all blogs
    GetBlogs: (state) => state.blogs,
    // get specific blog by id
    GetBlog: (state) => {
      return (blogId) => {
        return state.blogs.find((blog) => blog.id === blogId);
      };
    },
  },
  actions: {
    async Blogs({ commit }) {
      const response = await axios.get(baseURL + "getAllBlogs");

      //Extract date into day month year format.
      response.data.forEach((element) => {
        element.date = extractDate(element.date);
      });

      commit("BLOGS", response.data);
    },
    async AddBlog({ commit }, payload) {
      const response = await axios.post(baseURL + "addBlog", payload);
    },
    async AddComment({ commit }, payload) {
      console.log(payload);
      const response = await axios.post(baseURL + "postComment", payload);
      console.log(response.data);
    },
  },

  mutations: {
    BLOGS: function (state, payload) {
      payload.forEach((element) => {
        element.blogMonth = getMonthName(element.date.split("-")[1]);
        element.blogDay = element.date.split("-")[2];
        element.blogYear = element.date.split("-")[0];
      });
      state.blogs = payload;
    },
  },
};
