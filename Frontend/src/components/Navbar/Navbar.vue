<template>
  <header>
    <div class="university_icon">
      <h2 style="color: white">
        <router-link to="/" style="text-transform: uppercase"
          >South China University of Technology</router-link
        >
      </h2>
    </div>
    <nav>
      <ul class="nav__links">
        <li><router-link to="/Union">UNION</router-link></li>
        <li><router-link to="/Event">EVENTS</router-link></li>

        <li><router-link to="/Blogs">BLOGS</router-link></li>
        <li v-if="isAuth">
          <router-link :to="{ name: 'EventAttendance', params: { id: UserID } }"
            >ATTENDANCE</router-link
          >
        </li>
        <li><router-link to="/UserProfile"  v-if="!isAuth">USER PROFILE</router-link></li>

      </ul>
    </nav>
    <router-link to="/Login" class="signoutbtn">SIGN OUT</router-link>
  </header>
</template>
  
  <script>
import user from "./../../user.json";
import { mapGetters } from "vuex";
export default {
  name: "Navbar",
  data() {
    return {
      user: user,
      isAuth: false,
    };
  },
  computed: {
    ...mapGetters(["UserID"]),
  },
  async created() {
    if (
      //if user is admin
      user.role.id === "admin" &&
      this.UserID === "admin"
    ) {
      this.isAuth = true;
    }
  },
};
</script>
  
<style scoped >
* {
  font-family: "Montserrat", sans-serif;
  font-weight:400;

}

header {
  box-sizing: border-box;
  margin: 0;
  background-color: #192836;
  display: flex;
  height: 60px;
  justify-content: space-between;
  align-items: center;
}

li,
a {
  font-size: 16px;
  color: #edf0f1;
  text-decoration: none;
}
nav {
  margin-right: 7%;
}

.logo {
  cursor: pointer;
}
.nav__links {
  margin-bottom: 0px;
  list-style: none;
}
.nav__links li {
  display: inline-block;
  margin: 0 20px;
}
.university_icon {
  display: flex;
  /* padding-bottom: 15px; */
  margin-left: 5%;
}
.nav__links li a {
  transition: all 0.3s ease 0s;
}
.nav__links li a {
  color: #ffff;
}
.nav__links li a:hover {
  color: orange;
}
.signoutbtn {
  background-color: white;
  border: none;
  color: black;
  margin-right: 8%;

  padding: 5px 25px;
  border-radius: 50px;
  cursor: pointer;
  transition: all 0.3s ease 0s;
}
.signoutbtn:hover {
  background-color: orange;
}
</style>
  