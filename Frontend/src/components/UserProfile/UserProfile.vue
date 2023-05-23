<template>
  <body>
    <Modal v-show="isModalVisible" @close="closeModal" />

    <span class="main_bg"></span>

    <div class="container">
      <header>
        <div class="brandLogo">
          <figure>
            <img
              src="https://i.ibb.co/W05f0NB/bg.png"
              alt="logo"
              width="40px"
              height="40px"
            />
          </figure>
          <span>South China University of Technology </span>
        </div>
      </header>
      <section class="userProfile card">
        <div class="profile">
          <figure>
            <img
              src="https://i.ibb.co/ScNRVz7/images-q-tbn-ANd9-Gc-REWa-Lm-Zv1-4kx-Bl-I3-Fq-Of25-N0-V2-H7ok-Fo-Z2-Y-q-P5058vo-U8as-N833j-G90-N6-Gp.jpg"
              alt="profile"
              width="100px"
              height="100px"
            />
          </figure>
        </div>
      </section>

      <section class="work_skills card">
        <div class="work">
          <h1 class="heading">ADDRESS</h1>
          <div class="primary">
            <h1>
              {{ UserData.userAddress.userCity }} ,
              {{ UserData.userAddress.userCountry }}
            </h1>
            <span>Primary</span>
            <p>
              {{ UserData.userAddress.userStreet }} <br />
              {{ UserData.userAddress.userCity }} ,
              {{ UserData.userAddress.userCountry }} 10038-212-315-51
            </p>
          </div>
        </div>

        <!-- ===== ===== Skills Contaienr ===== ===== -->
        <div class="skills">
          <h1 class="heading">Events Attended</h1>
          <ul v-for="event in UserData.userEvents">
            <li class="work__details">{{ event.eventName }}</li>
          </ul>
        </div>
      </section>

      <!-- ===== ===== User Details Sections ===== ===== -->
      <section class="userDetails card">
        <div class="userName">
          <h1 class="name">{{ UserData.userName }}</h1>
          <div class="map">
            <font-awesome-icon
              :icon="['fas', 'location-pin']"
              style="margin-right: 10px"
            />
            <span>
              {{ UserData.userAddress.userCity }} ,
              {{ UserData.userAddress.userCountry }}</span
            >
          </div>
          <p>Student ({{ UserData.userID }}) </p>
        </div>

        <div class="btns">
          <ul>
            <li class="sendMsg">
              <font-awesome-icon
                :icon="['fas', 'message']"
                style="margin-right: 10px"
              />

              <a href="#">Send Message</a>
            </li>
            <li class="sendMsg active">
              <font-awesome-icon
                :icon="['fas', 'phone']"
                style="margin-right: 10px"
              />

              <a href="#">Contacts</a>
            </li>

            <li class="sendMsg">
              <a href="#">Report User</a>
            </li>
          </ul>
        </div>
      </section>

      <!-- ===== ===== Timeline & About Sections ===== ===== -->
      <section class="timeline_about card">
        <div class="tabs">
          <ul>
            <li class="timeline active">
              <font-awesome-icon
                :icon="['fas', 'eye']"
                style="margin-right: 10px"
              />
              <span>Timeline</span>
            </li>

            <li class="about">
              <font-awesome-icon
                :icon="['far', 'address-card']"
                style="margin-right: 10px"
              />
              <span>About</span>
            </li>

            <li class="edit_profile">
              <button class="edit_profile_btn" @click="showModal">
                <font-awesome-icon
                  :icon="['fas', 'user-pen']"
                  style="margin-right: 10px"
                />
                <span>Edit Profile</span>
              </button>
            </li>
          </ul>
        </div>

        <div class="contact_info">
          <h1 class="heading">Contact Information</h1>
          <ul>
            <li class="phone">
              <h1 class="label">Phone:</h1>
              <span class="info">{{ UserData.userPhone }}</span>
            </li>

            <li class="address">
              <h1 class="label">Address:</h1>
              <span class="info"
                >{{ UserData.userAddress.userStreet }} <br />
                {{ UserData.userAddress.userCity }}
                {{ UserData.userAddress.userCountry }}</span
              >
            </li>

            <li class="email">
              <h1 class="label">E-mail:</h1>
              <span class="info">{{ UserData.userEmail }}</span>
            </li>

            <li class="site">
              <h1 class="label">Password:</h1>
              <span class="info">{{ UserData.userPassword }}</span>
            </li>
          </ul>
        </div>

        <div class="basic_info">
          <h1 class="heading">Basic Information</h1>
          <ul>
            <li class="birthday">
              <h1 class="label">Birthday:</h1>
              <span class="info">{{ UserData.userDOB }}</span>
            </li>

            <li class="sex">
              <h1 class="label">Gender:</h1>
              <span class="info">Male</span>
            </li>
          </ul>
        </div>
      </section>
    </div>
    <!-- Modal  -->
  </body>
</template>
  
<script>
import { mapActions, mapGetters } from "vuex";
import Modal from "../Modal/Modal.vue";
export default {
  data() {
    return {
      isModalVisible: false,
    };
  },
  name: "UserProfile",

  computed: mapGetters(["UserData"]),
  components: {
    Modal,
  },

  mounted() {
    this.$store.dispatch("UserProfile");
    this.getStudentRegistrations();
  },

  methods: {
    ...mapActions(["getStudentRegistrations"]),
    showModal() {
      this.isModalVisible = true;
    },
    closeModal() {
      this.isModalVisible = false;
    },
  },
};
</script>




<style scoped>
* {
  padding: 0;
  margin: 0;
  list-style: none;
  text-decoration: none;
  /* font-family: "Poppins", sans-serif; */
  font-size: 12px;
}

/* ===== =====>>  Body Css  <<===== =====  */
body {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
}

/* ===== =====>>  Body Main-Background Css  <<===== =====  */
.main_bg {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  /* background: url("https://i.ibb.co/bK0MYnH/bg.png"); */

  background-position: left;
  z-index: -1;
  filter: blur(10px);
}

/* ===== =====>>  Main-Container Css  <<===== =====  */
.container {
  position: relative;
  display: grid;
  grid-template-columns: 1fr 2fr;
  grid-template-areas:
    "header header"
    "userProfile userDetails"
    "work_skills timeline_about"
    "work_skills timeline_about";
  width: 85%;
  height: 90vh;
  background: linear-gradient(
    to right bottom,
    rgba(255, 255, 255, 0.5),
    rgba(255, 255, 255, 0.3)
  );
  padding: 1.5rem;
  box-shadow: 0 0 5px rgba(255, 255, 255, 0.5), 0 0 25px rgba(0, 0, 0, 0.08);
}

/* ===== =====>>  Container Cards Grid-Area Css Start  <<===== =====  */
header {
  grid-area: header;
}

.userProfile {
  grid-area: userProfile;
}

.work_skills {
  grid-area: work_skills;
}

.userDetails {
  grid-area: userDetails;
}

.timeline_about {
  grid-area: timeline_about;
}

/* ===== =====>>  Container Cards Css  <<===== =====  */
.container .card {
  background: linear-gradient(
    to right bottom,
    rgba(255, 255, 255, 0.5),
    rgba(255, 255, 255, 0.3)
  );
  backdrop-filter: blur(3rem);
  border-radius: 0.5rem;
  box-shadow: 0 0 25px rgba(0, 0, 0, 0.05);
  padding: 1.5rem;
}

/* ===== =====>>  Container Header/Navbar Css  <<===== =====  */
.container header {
  padding: 0 2.5rem;
}

.container header .brandLogo {
  display: flex;
  align-items: center;
}

.container header .brandLogo figure img {
  width: 3.5rem;
  height: 3.5rem;
}

.container header .brandLogo span {
  font-size: 1.6rem;
  font-weight: 700;
  margin-left: 0.5rem;
}

/* ===== =====>>  User Main-Profile Css Start  <<===== ===== */
.container .userProfile {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 0;
  background: none;
  backdrop-filter: none;
  box-shadow: none;
}

.container .userProfile .profile figure img {
  width: 10rem;
  height: 10rem;
  border-radius: 50%;
}

/* ===== =====>>  Work & Skills Css Start  <<===== ===== */
.container .work_skills {
  padding: 1.5rem;
}

.work_skills .work .heading,
.work_skills .skills .heading {
  position: relative;
  font-size: 1.5rem;
  color: rgba(0, 0, 0, 0.6);
  text-transform: uppercase;
  margin-bottom: 2rem;
}

.work_skills .work .heading::before,
.work_skills .skills .heading::before {
  content: "";
  position: absolute;
  bottom: 0;
  right: 0;
  height: 0.1rem;
  width: 100%;
  background: rgba(0, 0, 0, 0.4);
}

.work_skills .work .primary,
.work_skills .work .secondary {
  position: relative;
}

.work_skills .work .primary h1,
.work_skills .work .secondary h1 {
  font-size: 1.2rem;
  color: rgba(0, 0, 0, 0.8);
  margin-bottom: 0.6rem;
}

.work_skills .work .primary span,
.work_skills .work .secondary span {
  position: absolute;
  top: 0;
  right: 3rem;
  font-weight: 700;
  font-size: 0.8rem;
  color: #0099cc;
  background: #e6f2ff;
  padding: 0.4rem 1rem;
  border-radius: 0.4rem;
}

.work_skills .work .primary p,
.work_skills .work .secondary p {
  margin-bottom: 1.8rem;
  font-size: 1.1rem;
  color: rgba(0, 0, 0, 0.6);
  line-height: 1.6rem;
}

/* =====>>  Skills Bars Css  <<===== */
.work_skills .skills ul li {
  position: relative;
  font-size: 1.0rem;
  line-height: 1.8rem;
  margin: 0.5rem;
  color: #000;
  font-weight: 500;
}





/* ===== =====>>  User Details Css Start  <<===== ===== */
.userDetails {
  position: relative;
  padding: 1.5rem 2.5rem;
}

.userDetails .userName h1 {
  font-size: 2rem;
}

.userDetails .userName .map {
  position: absolute;
  top: 2.5rem;
  left: 18.5rem;
  display: flex;
  justify-content: center;
  align-items: center;
}

.userDetails .userName .map span {
  font-size: 1rem;
  color: (rgba(0, 0, 0, 0.8));
  font-weight: 700;
}

.userDetails .userName p {
  font-size: 1rem;
  font-weight: 700;
  color: #0099cc;
  margin-bottom: 1.8rem;
}

.userDetails .btns ul,
.userDetails .btns ul li {
  display: flex;
  align-items: center;
}


.userDetails .btns ul li {
  margin-right: 2.5rem;
  border-radius: 0.5rem;
}

.userDetails .btns ul li .ri {
  margin-right: 0.5rem;
  font-size: 1.6rem;
}

.userDetails .btns ul li a {
  font-size: 1.1rem;
  color: #000;
  font-weight: 500;
}

.userDetails .btns ul .active {
  background: #e6f2ff;
  padding: 0.5rem 1.5rem;
}

.userDetails .btns ul .active a,
.userDetails .btns ul .active .ri {
  color: #0099cc;
}

/* ===== =====>>  Timeline & About Css Start  <<===== ===== */
.timeline_about {
  padding: 2.5rem;
}

.timeline_about .tabs ul {
  position: relative;
  display: flex;
  align-items: center;
  margin-bottom: 2.5rem;
}

.edit_profile_btn {
  background-color: #e6f2ff;

  border: none;
  color: #0099cc;
  padding: 5px 20px;
  border-radius: 10px;
  cursor: pointer;
  transition: all 0.3s ease 0s;
}

.timeline_about .tabs ul li {
  position: relative;
  display: flex;
  align-items: center;
  justify-content: right;
  margin-right: 2.5rem;
  padding-bottom: 0.8rem;
  cursor: pointer;
}

.timeline_about .tabs ul li span {
  font-size: 1.2rem;
  font-weight: 500;
}

.timeline_about .tabs ul li .ri {
  margin-right: 0.5rem;
}

.timeline_about .tabs ul .active::before {
  content: "";
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 2px;
  background: #0099cc;
}

.timeline_about .contact_info .heading,
.timeline_about .basic_info .heading {
  font-size: 1rem;
  color: grey;
  font-weight: bold;
  text-transform: uppercase;
  margin-bottom: 1.5rem;
}

.timeline_about .contact_info ul,
.timeline_about .basic_info ul {
  margin-bottom: 1.5rem;
}

.timeline_about .contact_info ul li,
.timeline_about .basic_info ul li {
  display: flex;
  margin: 0.5rem 0;
}

.timeline_about .contact_info ul li h1,
.timeline_about .basic_info ul li h1 {
  font-weight: 500;
  font-size: 1rem;
  min-width: 12rem;
}

.timeline_about .contact_info ul li span,
.timeline_about .basic_info ul li span {
  font-size: 1rem;
}

.timeline_about .contact_info ul .phone span,
.timeline_about .contact_info ul .email span,
.timeline_about .contact_info ul .site span {
  color: #0099cc;
}
</style>
  