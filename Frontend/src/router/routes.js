import Home from "../views/Home/Home.vue";
import Login from "../views/Login/Login.vue";
import UserProfile from "@/components/UserProfile/UserProfile.vue";
import Event from "@/components/Events/EventHome/EventHome.vue";
import Registration from "@/components/Events/RegisterEvent/Registration.vue";
import AddEvent from "@/components/Events/AddEvent/AddEvent.vue";

import Union from "@/components/Unions/UnionHome/UnionHome.vue";
import EventAttendance from "@/components/Attendance/EventAttendance.vue";
import Blogs from "@/components/Blogs/BlogsHome/AllBlogs.vue";
import Blog from "@/components/Blogs/Blog/Blog.vue";

import Unauthorized from "@/views/Unauthorized/Unauthorized.vue";
import AddBlog from "./../components/Blogs/AddBlog/AddBlog.vue";
export default [
  {
    name: "Home",
    path: "/",
    component: Home,
  },
  {
    //This is our protected page.
    name: "EventAttendance",
    path: "/EventAttendance",
    component: EventAttendance,
    meta: {
      authRequired: "true",
    },
  },
  {
    name: "Unauthorized",
    path: "/Unauthorized",
    component: Unauthorized,
    meta: {
      authRequired: "false",
    },
  },
  {
    name: "event-registration",
    path: "/event-registration/:eventId",
    component: Registration,
  },

  {
    name: "UserProfile",
    path: "/UserProfile",
    component: UserProfile,
  },
  {
    name: "Login",
    path: "/Login",
    component: Login,
    meta: {
      hideNavbar: true,
    },
  },
  {
    name: "Event",
    path: "/Event",
    component: Event,
  },
  {
    name: "Union",
    path: "/Union",
    component: Union,
  },
  {
    name: "Blogs",
    path: "/Blogs",
    component: Blogs,
  },
  {
    name: "Blog",
    path: "/Blog/:blogId",
    component: Blog,
  },
  {
    name: "AddEvent",
    path: "/AddEvent",
    component: AddEvent,
  },
  {
    name: "AddBlog",
    path: "/AddBlog",
    component: AddBlog,
  },
];
