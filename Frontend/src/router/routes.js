import Home from "../views/Home/Home.vue";
import Login from "../views/Login/Login.vue";
import UserProfile from "@/components/UserProfile/UserProfile.vue";
import Event from "@/components/Events/EventPage/EventPage.vue";
import Registration from "@/components/RegisterEvent/Registration.vue";

export default [
  {
    name: "Home",
    path: "/",
    component: Home,
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
];
