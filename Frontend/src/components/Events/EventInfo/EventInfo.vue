<template>
  <section class="upcoming-events" id="events">
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <div class="section-heading">
            <h2>Upcoming Events</h2>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="categories">
            <h4>Events Categories</h4>
            <ul>
              <li v-for="item in GetUniqueEventTypes">
                <a href="#">{{ item }}</a>
              </li>
            </ul>
            <div class="main-button-red">
              <router-link to="/Event" style="text-transform: uppercase"
                >ALL UPCOMING EVENTS</router-link
              >
            </div>
          </div>
        </div>
        <div class="col-lg-8">
          <div class="row">
            <!-- <div v-for="(eventInfo, index) in eventInfo" class="col-lg-6"> -->

            <div v-for="i in 4" class="col-lg-6">
              <div class="event-item">
                <div class="thumb">
                  <div class="price"></div>
                  <a
                    ><img
                      crossorigin="anonymous"
                      :src="eventInfo[i].eventImage"
                      alt="New Lecturer Events"
                  /></a>
                </div>
                <div class="down-content">
                  <div class="date">
                    <h6>
                      {{ eventInfo[i].eventMonth }}
                      <span>{{ eventInfo[i].eventDay }}</span>
                    </h6>
                  </div>
                  <router-link to="/Event"
                    ><h4>{{ eventInfo[i].name }}</h4></router-link
                  >
                  <div>
                    <div class="container-data">
                      <p>
                        <span>Event Type </span>{{ eventInfo[i].eventType }}
                      </p>

                      <p><span>Venue </span>{{ eventInfo[i].venue }}</p>
                    </div>
                    <div class="container-data">
                      <p>
                        <span>Guest Name </span>{{ eventInfo[i].guestName }}
                      </p>

                      <p><span>Time </span>{{ eventInfo[i].eventTime }}</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>


<script>
export default {
  name: "EventInfo",
  props: {
    eventInfo: Array,
    GetUniqueEventTypes: Array,
  },
};
</script>


<style scoped>
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

/*
---------------------------------------------
upcoming events
---------------------------------------------
*/
a:hover {
  cursor: pointer;
}
section.upcoming-events {
  background-image: url(https://i.ibb.co/0VTtqN2/meetings-bg.jpg);
  background-position: center center;
  background-attachment: fixed;
  background-repeat: no-repeat;
  background-size: cover;
  padding-top: 230px;
  padding-bottom: 110px;
}

section.upcoming-events .section-heading {
  text-align: center;
}

section.upcoming-events .categories {
  background-color: #fff;
  border-radius: 20px;
  padding: 40px;
  margin-right: 45px;
}

section.upcoming-events .categories h4 {
  text-transform: uppercase;
  font-size: 18px;
  font-weight: 600;
  color: #1f272b;
  margin-bottom: 20px;
  padding-bottom: 20px;
  border-bottom: 3px solid #eee;
}

section.upcoming-events .categories ul li {
  display: block;
  margin-bottom: 15px;
}

section.upcoming-events .categories ul li a {
  font-size: 15px;
  color: #1f272b;
  font-weight: 500;
  transition: all 0.3s;
}

section.upcoming-events .categories ul li a:hover {
  color: orange;
}

section.upcoming-events .categories .main-button-red {
  border-top: 1px solid #eee;
  padding-top: 30px;
  margin-top: 15px;
}

section.upcoming-events .categories .main-button-red a {
  width: 100%;
  text-align: center;
}
section.upcoming-events .categories .main-button-red a:hover {
  color: #ffad6c;
}

.event-item {
  margin-bottom: 30px;
}

.event-item .thumb {
  position: relative;
}

.event-item .thumb img {
  border-top-right-radius: 20px;
  border-top-left-radius: 20px;
  height: 15rem;
}

.event-item .thumb .price {
  position: absolute;
  left: 20px;
  top: 20px;
}

.event-item .thumb .price span {
  font-size: 16px;
  color: #1f272b;
  font-weight: 600;
  background-color: rgba(250, 250, 250, 0.9);
  padding: 7px 12px;
  border-radius: 10px;
}

.event-item .down-content {
  background-color: #fff;
  padding: 30px;
  border-bottom-right-radius: 20px;
  border-bottom-left-radius: 20px;
}
.event-item .down-content .container-data {
  display: flex;
}
.event-item .down-content .container-data2 {
  display: flex;
  margin-left: 20px;
}

.event-item .down-content .date {
  float: left;
  text-align: center;
  margin-top: 50px;
  display: inline-block;
}

.event-item .down-content .date h6 {
  font-size: 13px;
  text-transform: uppercase;
  font-weight: bold;
  color: #a12c2f;
}

.event-item .down-content .date span {
  display: block;
  color: #1f272b;
  font-size: 22px;
  font-weight: bold;

  margin-top: 7px;
}

.event-item .down-content h4 {
  text-transform: uppercase;
  font-size: 20px;
  color: #1f272b;
  font-weight: bold;
  text-align: center;

  margin-bottom: 15px;
}

.event-item .down-content p {
  margin-left: 50px;
  color: #1f272b;
  font-size: 14px;
}
.event-item .down-content p span {
  text-transform: uppercase;
  display: block;
  margin-right: 10px;
  color: orange;
  font-size: 14px;
}
</style>