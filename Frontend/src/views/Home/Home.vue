<template>
  <div>
    <section class="section main-banner" id="top" data-section="section1">
      <video autoplay muted loop id="bg-video">
        <source src="../../assets/course-video.mp4" type="video/mp4" />
      </video>

      <div class="video-overlay header-text">
        <div class="container">
          <div class="row">
            <div class="col-lg-12">
              <div class="caption">
                <h6>Hello Students</h6>
                <h2>Welcome to Univent</h2>
                <p>
                  This is a centralized platform to cater all the students of
                  University of China to signup for events, enroll in it, and
                  play an exciting role in it!
                </p>
                <div class="main-button-red">
                  <div class="scroll-to-section">
                    <a href="#contact">REGISTER Now</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- ***** Main Banner Area End ***** -->
    <section class="services">
      <div class="container">
        <div class="row">
          <div class="col-lg-12">
            <b-carousel
              id="carousel-fade"
              style="text-shadow: 0px 0px 2px #000"
              fade
              indicators
              img-width="1024"
              img-height="480"
            >
              <b-carousel-slide class="item">
                <template #img>
                  <b-img
                    class="icon"
                    fluid-grow
                    src="https://i.ibb.co/Tgf6kb7/service-icon-01.png"
                    alt="Random image"
                  ></b-img>
                  <div class="down-content">
                    <h4>Best Students</h4>
                    <p>Our university offers the best teachers</p>
                  </div>
                </template>
              </b-carousel-slide>

              <b-carousel-slide class="item">
                <template #img>
                  <b-img
                    class="icon"
                    fluid-grow
                    src="https://i.ibb.co/4gb7KNt/service-icon-03.png"
                    alt="Random image"
                  ></b-img>
                  <div class="down-content">
                    <h4>Best Teachers</h4>
                    <p>Our university offers the best teachers</p>
                  </div>
                </template>
              </b-carousel-slide>
            </b-carousel>
          </div>
        </div>
      </div>
    </section>

    <event-info
      :eventInfo="this.GetEventData.eventData"
      :GetUniqueEventTypes="this.GetUniqueEventTypes"
    ></event-info>
  </div>
</template>

<script>
import { mapActions, mapGetters } from "vuex";
import EventInfo from "../../components/Events/EventInfo/EventInfo.vue";
export default {
  components: { EventInfo },
  name: "Home",
  data() {
    return {
      slide: 0,
      sliding: null,
    };
  },
  methods: {
    ...mapActions(["EventData"]), //This would set all events in the Events state by hitting /api/GetAllEvents.
  },
  mounted() {
    this.EventData();
  },
  computed: mapGetters([
    "GetEventData",
    "GetUniqueEventTypes",
    "SplitDate",
    "GetEventImage",
  ]),
};
</script>
<style>
ul,
li {
  padding: 0;
  margin: 0;
  list-style: none;
}

html,
body {
  font-family: "Poppins", sans-serif;
  font-weight: 400;
  background-color: #fff;
  font-size: 16px;
}

a {
  text-decoration: none !important;
  color: orange;
}

a:hover {
  color: #fc3;
}

h1,
h2,
h3,
h4,
h5,
h6 {
  margin-top: 0px;
  margin-bottom: 0px;
}

ul {
  margin-bottom: 0px;
}

p {
  font-size: 14px;
  line-height: 25px;
  color: #2a2a2a;
}

img {
  width: 100%;
  overflow: hidden;
}

/* 
---------------------------------------------
global styles
--------------------------------------------- 
*/
html,
body {
  background: #fff;
  font-family: "Poppins", sans-serif;
}

.main-button-red a {
  font-size: 15px;
  color: #fff;
  background-color: #a12c2f;
  padding: 12px 30px;
  display: inline-block;
  border-radius: 22px;
  font-weight: 800;
  text-transform: uppercase;
  transition: all 0.3s;
}

.main-button-red a:hover {
  opacity: 0.9;
}

.main-button-yellow a {
  font-size: 13px;
  color: #fff;
  background-color: #f5a425;
  padding: 12px 30px;
  display: inline-block;
  border-radius: 22px;
  font-weight: 500;
  text-transform: uppercase;
  transition: all 0.3s;
}

.main-button-yellow a:hover {
  opacity: 0.9;
}

.section-heading h2 {
  line-height: 40px;
  margin-top: 0px;
  margin-bottom: 50px;
  padding-bottom: 20px;
  border-bottom: 1px solid rgba(250, 250, 250, 0.15);
  font-size: 22px;
  font-weight: 700;
  text-transform: uppercase;
  color: #fff;
}

/* 
---------------------------------------------
banner
--------------------------------------------- 
*/

.main-banner {
  position: relative;
  max-height: 100%;
  overflow: hidden;
  margin-bottom: -7px;
}

#bg-video {
  min-width: 100%;
  min-height: 100vh;
  max-width: 100%;
  max-height: 100vh;
  object-fit: cover;
  z-index: -1;
}


.video-overlay {
  position: absolute;
  background-color: rgba(31, 39, 43, 0.75);
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  width: 100%;
}

.main-banner .caption {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
  left: 15%;
}

.main-banner .caption h6 {
  margin-top: 0px;
  font-size: 15px;
  text-transform: uppercase;
  font-weight: 600;
  color: #fff;
  letter-spacing: 1px;
}

.main-banner .caption h2 {
  margin-top: 20px;
  margin-bottom: 20px;
  font-size: 40px;
  text-transform: uppercase;
  font-weight: bold;
  color: #fff;
  letter-spacing: 1px;
}

.main-banner .caption h2 em {
  font-style: normal;
  color: #f5a425;
  font-weight: 900;
}

.main-banner .caption p {
  color: #fff;
  font-size: 14px;
  max-width: 570px;
}

.main-banner .caption .main-button-red {
  margin-top: 30px;
}

@media screen and (max-width: 767px) {
  .main-banner .caption h6 {
    font-weight: 500;
  }

  .main-banner .caption h2 {
    font-size: 36px;
  }
}

/* CAROUSEL CSS  */
.services {
  margin-top: -180px;
  position: absolute;
  width: 100%;
}
.services .container {
  position: relative;
  margin: auto;
  max-width: 30%;
}
.services .item {
  background-image: url(https://i.ibb.co/vX2MxJf/service-item-bg.jpg);

  background-repeat: no-repeat;
  background-size: cover;
  background-position: center center;
  border-radius: 20px;
  text-align: center;
  color: #fff;
  padding: 40px;
}

.services .item .icon {
  max-width: 60px;
  margin: 0 auto;
}

.services .item h4 {
  margin-top: 25px;
  margin-bottom: 15px;
  font-size: 18px;
  font-weight: 600;
}

.services .item p {
  color: #fff;
  font-size: 13px;
}
</style>;
<!-- //    <div class="col-lg-6">