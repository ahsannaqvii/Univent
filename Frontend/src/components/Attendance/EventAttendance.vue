<template>
  <v-app>
    <v-carousel :show-arrows="false" height="900px">
      <v-carousel-item
        v-for="(item, i) in imageURLs"
        :key="i"
        :src="item.src"
        reverse-transition="fade-transition"
        transition="fade-transition"
      ></v-carousel-item>
    </v-carousel>
    <div class="section-title">
      <h2>Student Attendance</h2>
    </div>

      <v-btn class="event-selection-btn" height="4rem" >
        <v-select
          dark
          class="select"
          :items="this.GetPastEvents"
          label="Select an Event"
          name="PastEvent"
          item-text="eventName"
          return-object
          @change="ChooseEvent($event)"
        ></v-select>
      </v-btn>

    <div class="container">
      <table class="table table-striped" v-if="eventChosen">
        <thead class="thead-dark">
          <tr>
            <th scope="col">Student ID</th>
            <th scope="col">Student Name</th>
            <th scope="col">Registration ID</th>
            <th scope="col">Event Name</th>
            <th scope="col">Event Date</th>
            <th scope="col">Attendance</th>
          </tr>
        </thead>

        <tbody>
          <tr v-for="reg in Registrations">
            <th scope="row">{{ reg.studentId }}</th>
            <td>{{ reg.name }}</td>
            <td>{{ reg.regId }}</td>
            <td>{{ reg.eventName }}</td>
            <td>{{ reg.eventDate }}</td>

            <td>
              <v-btn class="attendance-btn">
                <v-select
                  dark
                  class="select"
                  :items="attendanceValues"
                  @change="markAttendance($event, reg.regId)"
                ></v-select>
              </v-btn>
            </td>
          </tr>
        </tbody>
      </table>
      <div class="col-lg-12" v-if="eventChosen">
        <fieldset>
          <button
            type="submit"
            id="form-submit"
            class="main-button"
            @click="SubmitAttendance()"
          >
            Submit
          </button>
        </fieldset>
      </div>
    </div>
  </v-app>
</template>

<script>
import { mapActions, mapGetters } from "vuex";

export default {
  name: "EventAttendance",
  data: () => ({
    isActive: true,
    eventChosen: false,

    // Images for carousel
    imageURLs: [
      {
        src: "https://i.ibb.co/j6phDRw/photo-1522202176988-66273c2fd55f-crop-faces-edges-cs-tinysrgb-fit-crop-fm-jpg-ixid-Mnwx-Mj-A3f-DB8-M.jpg",
      },
      {
        src: "https://i.ibb.co/hV6m48X/photo-1606761568499-6d2451b23c66-crop-faces-edges-cs-tinysrgb-fit-crop-fm-jpg-ixid-Mnwx-Mj-A3f-DB8-M.jpg",
      },

      {
        src: "https://i.ibb.co/mhBx0Cc/photo-1523050854058-8df90110c9f1-crop-faces-edges-cs-tinysrgb-fit-crop-fm-jpg-ixid-Mnwx-Mj-A3f-DB8-M.jpg",
      },
    ],
    attendanceValues: ["P", "A"],
    attendanceData: [],
  }),
  methods: {
    ...mapActions({
      PastEvents: "PastEvents",
    }),

    //Function to hit the API to mark student attendance.
    markAttendance: function (attendance, regId) {
      this.attendanceData.push({ regId, attendance });
    },

    //Function to choose event for which we want student attendance
    ChooseEvent: function ({ eventId }) {
      this.attendanceData = [];
      this.eventChosen = true;
      this.$store.dispatch("GetEventAttendance", eventId);
    },
    SubmitAttendance: function () {
      this.$store.dispatch("MarkAttendance", this.attendanceData);
    },
  },
  mounted() {
    this.PastEvents();
  },

  computed: {
    ...mapGetters({
      Registrations: "getEventRegistrationData",
      GetPastEvents: "GetPastEvents",
    }),
  },
};
</script>

<style scoped>
.event-selection-btn {
  display: flex;
  margin: auto;
  padding: 40px;
  width: 10%;
  justify-content: center;
  margin-top: 20px;
  margin-bottom: 80px;
}
.custom-btn-bg {
  background-color: #192836 !important;
}
.attendance-btn {
  display: flex;
  margin-left: 5px;
}
.theme--light.v-btn.v-btn--has-bg {
  background-color: #192836 !important;
}



.select {
  width: 50px;
}

.thead-dark {
  background-color: #192836;
  color: #ffffff;
  padding-bottom: 2rem;
}
.jumbotron {
  padding: 2rem 1rem;
  margin-bottom: 2rem;
  background-color: #e9ecef;
  border-radius: 0.3rem;
}
.section-title small {
  display: block;
  color: grey;
  font-size: 20px;
  text-align: center;
}
.section-title {
  padding-bottom: 40px;
  display: flex;
  justify-content: center;
  margin-top: 80px;
  text-align: center;
}

.section-title h2 {
  margin: 0;
  text-transform: uppercase;
  font-size:5rem;
  font-weight: 700;
}
.main-button {
  display: flex;
  background-color: #192836;
  color: #fff;
  font-size: 13px;
  font-weight: 500;
  padding: 12px 20px;
  text-transform: uppercase;
  transition: all 0.3s;
  border: none;
  justify-content: center;
  margin: auto;
  text-align: center;
  outline: none;
}
</style>