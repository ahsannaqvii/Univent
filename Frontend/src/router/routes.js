import Home from "../views/Home/Home.vue";
import Login from "../views/Login/Login.vue";
import UserProfile from "@/components/UserProfile/UserProfile.vue";
export default [
  {
    name: "Home",
    path: "/",
    component: Home,
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
];
