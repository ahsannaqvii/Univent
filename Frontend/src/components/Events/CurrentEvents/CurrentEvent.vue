<template>
  <v-app>
    <section class="events-section section-bg section-padding" id="section_4">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-12 filter">
            <h2>Upcoming Events</h2>

            <div class="text-center">
              <v-menu offset-y>
                <template v-slot:activator="{ on, attrs }">
                  <v-btn dark v-bind="attrs" v-on="on">
                    Filter Event
                    <font-awesome-icon
                      style="margin-left: 20px"
                      :icon="['fas', 'filter']"
                    />
                  </v-btn>
                </template>
                <v-list>
                  <v-list-item
                    v-for="(item, index) in this.eventCategory"
                    :key="index"
                    @click="SelectEventCategory(item)"
                  >
                    <v-list-item-title>{{ item }}</v-list-item-title>
                  </v-list-item>
                </v-list>
              </v-menu>
            </div>
          </div>

          <div
            v-for="(currentEventInfo, index) in filteredEvents"
            class="row custom-block mb-3"
            :class="classObject"
          >
            <div class="col-lg-2 col-md-4 col-12 order-2 order-md-0 order-lg-0">
              <div
                class="custom-block-date-wrap d-flex d-lg-block d-md-block align-items-center mt-3 mt-lg-0 mt-md-0"
              >
                <h6 class="custom-block-date mb-lg-1 mb-0 me-3 me-lg-0 me-md-0">
                  {{ currentEventInfo.eventDay }}
                </h6>

                <strong class="text-white">
                  {{ currentEventInfo.eventMonth }} 2023
                </strong>
              </div>
            </div>

            <div class="col-lg-4 col-md-8 col-12 order-1 order-lg-0">
              <div class="custom-block-image-wrap">
                <a href="event-detail.html">
                  <img
                    src="./../../../assets/current-events/professional-golf-player.jpg"
                    class="custom-block-image img-fluid"
                    alt=""
                  />

                  <i class="custom-block-icon bi-link"></i>
                </a>
              </div>
            </div>

            <div class="col-lg-6 col-12 order-3 order-lg-0">
              <div class="custom-block-info mt-2 mt-lg-0">
                <a class="events-title mb-3" style="color: black">{{
                  currentEventInfo.name
                }}</a>
                <p class="event-type">
                  {{ currentEventInfo.eventType }}
                </p>

                <p class="mb-0">
                  {{ currentEventInfo.desc }}
                </p>

                <div class="d-flex flex-wrap border-top mt-4 pt-3">
                  <div class="mb-4 mb-lg-0">
                    <div class="d-flex flex-wrap align-items-center mb-1">
                      <span class="custom-block-span">Location:</span>

                      <p class="mb-0">{{ currentEventInfo.venue }}</p>
                    </div>

                    <div class="d-flex flex-wrap align-items-center">
                      <span class="custom-block-span">Guest Name:</span>

                      <p class="mb-0">{{ currentEventInfo.guestName }}</p>
                    </div>
                  </div>

                  <div class="d-flex align-items-center ms-lg-auto">
                    <router-link
                      :to="'/event-registration/' + currentEventInfo.id"
                      class="btn custom-btn"
                      >Register Now</router-link
                    >
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </v-app>
</template>


<script>
import { mapGetters } from "vuex";

export default {
  name: "CurrentEvent",
  props: {
    currentEvent: Array,
  },
  data: () => ({
    isActive: true,
    eventCategory: ["All Events"],
    selectedEvent: null,
  }),
  methods: {
    SelectEventCategory(item) {
      this.selectedEvent = item;
    },
  },
  computed: {
    filteredEvents() {
      if (this.selectedEvent === "All Events") {
        return this.currentEvent;
      }
      if (this.selectedEvent != null) {
        let filteredEventData = [];
        filteredEventData = this.currentEvent.filter((event) => {
          return event.eventType === this.selectedEvent;
        });
        return filteredEventData;
      }
      return this.currentEvent;
    },

    // FUNCTION DESIGN TO CATER CSS CLASS
    classObject: function () {
      this.isActive = !this.isActive;
      return {
        "custom-block-bg": !this.isActive,
      };
    },
    ...mapGetters(["GetUniqueEventTypes"]),
  },
  mounted() {
    this.eventCategory.push(...this.GetUniqueEventTypes);
  },
};
</script>

<style scoped>
/*---------------------------------------
  EVENTS SECTION            
-----------------------------------------*/
h2,
h3,
h4,
h5,
h6 {
  color: #000000;
}

h1,
h2,
h3,
h4,
h5,
h6 {
  font-weight: 500;
  letter-spacing: -1px;
}

h1 {
  font-size: 42px;
  font-weight: 700;
}

h2 {
  font-size: 36px;
  font-weight: 700;
}

h3 {
  font-size: 28px;
}

h4 {
  font-size: 24px;
}

h5 {
  font-size: 22px;
}

h6 {
  font-size: 20px;
}

p {
  color: #717275;
  font-size: 18px;
  font-weight: 300;
}

.flex-wrap {
  flex-wrap: wrap !important;
}
ul li {
  color: #717275;
  font-weight: 300;
}

a,
button {
  touch-action: manipulation;
  transition: all 0.3s;
}

a {
  display: inline-block;
  color: #3d405b;
  text-decoration: none;
}

a:hover {
  color: #f2cc8f;
}

b,
strong {
  font-weight: 700;
}
.section-padding {
  padding-top: 50px;
  padding-bottom: 50px;
}
.event-type {
  color: grey;
  font-weight: 800;
  text-transform: uppercase;
}
.section-bg {
  background-color: #f4f1de;
}

.events-section.section-bg .container > .row {
  margin-right: 5px;
  margin-left: 5px;
}
.v-list-item :hover {
  cursor: pointer;
}
.filter {
  display: flex;
  justify-content: space-between;
}
.filter-btn {
  color: grey;
}
.events-section.section-bg .container > .row .row {
  margin: auto;
}

.events-listing-section {
  margin-bottom: 100px;
}
.custom-block-date-wrap {
  background-color: #81b29a;
  border-radius: 20px;
  text-align: center;
  padding: 20px 30px;
}
.custom-block-date {
  font-size: 42px;
}

.events-detail-section .custom-block-info {
  padding: 40px 60px;
}

.events-detail-info {
  background-color: #f4f1de;
  border-radius: 20px;
  padding: 50px 25px;
}

.events-title {
  font-size: 28px;
  font-weight: 500;
}

/*---------------------------------------
  CUSTOM BUTTON               
-----------------------------------------*/
.custom-block-bg {
  background: #ffffff;
}
.custom-block {
  border-radius: 20px;
  position: relative;
  overflow: hidden;
  padding: 20px 20px;
}
.custom-block-info {
  padding-top: 10px;
}
.custom-block-span {
  color: #3d405b;
  font-weight: 700;
  min-width: 110px;
  margin-right: 10px;
}
.custom-btn {
  background: #a22b2f;
  border: 2px solid transparent;
  border-radius: 100px;
  color: #ffffff;
  font-size: 14px;
  font-weight: 700;
  line-height: normal;
  transition: all 0.3s;
  padding: 10px 20px;
}

.custom-btn:hover {
  background: #e07a5f;
  color: #ffffff;
}

.custom-border-btn {
  background: transparent;
  border: 2px solid #f2cc8f;
  color: #f2cc8f;
}

.custom-border-btn:hover {
  background: #f2cc8f;
  border-color: transparent;
  color: #ffffff;
}

.custom-btn-bg-white {
  border-color: #ffffff;
  color: #ffffff;
}
</style>
