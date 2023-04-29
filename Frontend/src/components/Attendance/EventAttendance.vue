<template>
  <v-app>
    <v-carousel :show-arrows="false" height="900px">
      <v-carousel-item
        v-for="(item, i) in items"
        :key="i"
        :src="item.src"
        reverse-transition="fade-transition"
        transition="fade-transition"
      ></v-carousel-item>
    </v-carousel>
    <div class="section-title">
      <h2>Student Attendance</h2>
    </div>

    <div class="container">
      <table class="table table-striped">
        <thead class="thead-dark">
          <tr>
            <th scope="col">Student ID</th>
            <th scope="col">Student Name</th>
            <th scope="col">Registration ID</th>
            <th scope="col">Event ID</th>
            <th scope="col">Attendance</th>
          </tr>
        </thead>
        <tbody>
          <!-- :class="classObject"
                  @click="classObject()" -->
          <tr v-for="reg in Registrations">
            <th scope="row">{{ reg.studentId }}</th>
            <td>{{ reg.name }}</td>
            <td>{{ reg.regId }}</td>
            <td>{{ reg.eventName }}</td>

            <td>
              <v-btn class="attendance-btn">
                <!-- @click="markAttendance(reg.regId)" -->
                <!-- v-model="defaultVall" -->

                <v-select
                v-model="defaultAttendanceVal"
                  class="select"
                  :items="attendanceValues"
                  @change="markAttendance($event,reg.regId,reg.studentId)"
                ></v-select>
              </v-btn>
            </td>
          </tr>
        </tbody>
      </table>
      <div class="col-lg-12">
        <fieldset>
          <button type="submit" id="form-submit" class="main-button">
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
    defaultAttendanceVal: 'A',
    // Images for carousel 
    items: [
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
  }),
  methods: {
    ...mapActions({ GetAllEventRegistrations: "AllEventRegistrations" }),
    //Function to hit the API to mark student attendance.
    markAttendance: function (event,id1,id2) {
      console.log("Attendance marked", event,id1,id2);
    },
  },
  mounted() {
    this.GetAllEventRegistrations();
  },

  computed: {
    ...mapGetters({ Registrations: "getRegistrationData" }),
  },
};
</script>

<style scoped>
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

/* .theme--light.v-select .v-select__selections {
  color: white !important;
  min-height: 10px;
} */

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