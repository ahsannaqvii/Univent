<template>
  <header>
    <div class="university_icon">
      <!-- <img src="https://i.ibb.co/vYBFTD9/image2vector.png" class="logo" alt="university_logo" /> -->
      <h2 style="color: white; ">UNIVERSITY OF CHINA</h2>
    </div>
    <nav>
      <ul class="nav__links">
        <li><router-link to="">SOCIETIES</router-link></li>
        <li><router-link to="">EVENTS</router-link></li>

        <li><router-link to="/UserProfile">USER PROFILE</router-link></li>
      </ul>
    </nav>
    <router-link to="" class="signoutbtn">SIGN OUT</router-link>
  </header>
</template>
  
  <script>
export default {
  name: "Navbar",
};
</script>
  
<style scoped >
* {
  font-family: "Poppins", sans-serif;
  font-weight: bold;
}
header {
  box-sizing: border-box;
  margin: 0;
  background-color: #001233;
  display: flex;
  height: 45px;
  justify-content: space-between;
  align-items: center;
  /* padding: 0.5em 4em 0em; */
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
  