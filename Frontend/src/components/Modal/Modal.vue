<template>
  <v-row justify="center" class="model-overlay">
    <v-card class="modal-container">
      <v-card-title>
        <span class="text-h5">Edit User Profile</span>
      </v-card-title>
      <v-card-text>
        <v-container>
          <v-row>
            <v-col cols="12" sm="6" md="4">
              <v-text-field
                label="Phone"
                clearable
                v-model="phone"
              ></v-text-field>
            </v-col>
            <v-col cols="12" sm="6" md="4">
              <v-text-field
                label="Email"
                clearable
                v-model="email"
              ></v-text-field>
            </v-col>
            <v-col cols="12" sm="6" md="4">
              <v-text-field
                label="Password"
                type="password"
                v-model="password"
                clearable
              ></v-text-field>
            </v-col>

            <v-col cols="12">
              <v-text-field
                label="Street"
                v-model="street"
                clearable
              ></v-text-field>
            </v-col>
            <v-col cols="12">
              <v-text-field
                label="City"
                clearable
                v-model="city"
              ></v-text-field>
            </v-col>
            <v-col cols="12">
              <v-text-field
                label="Country*"
                v-model="country"
                clearable
              ></v-text-field>
            </v-col>
          </v-row>
        </v-container>
      </v-card-text>
      <v-card-actions>
        <v-spacer></v-spacer>
        <v-btn
          style="margin-right: 20px; background-color: #001233; color: white"
          variant="text"
          @click="close"
        >
          Close
        </v-btn>
        <v-btn
          style="background-color: #001233; color: white"
          variant="text"
          @click="saveResult"
        >
          Save
        </v-btn>
      </v-card-actions>
    </v-card>
  </v-row>
</template>


<script>
import { mapActions } from "vuex";

export default {
  name: "Modal",
  data() {
    return {
      phone: "",
      password: "",
      email: "",
      street: "",
      city: "",
      country: "",
    };
  },
  mounted() {
    this.phone = this.$store.state.userPhone;
    this.password = this.$store.state.userPassword;
    this.email = this.$store.state.userEmail;
    this.street = this.$store.state.userAddress.userStreet;
    this.city = this.$store.state.userAddress.userCity;
    this.country = this.$store.state.userAddress.userCountry;
  },
  methods: {
    ...mapActions(["UpdateUserProfile"]),
    saveResult() {
      this.UpdateUserProfile({
        phone: this.phone,
        password: this.password,
        email: this.email,
        street: this.street,
        city: this.city,
        country: this.country,
      });
      this.$emit("close");
    },
    close() {
      this.$emit("close");
    },
  },
};
</script>

<style >
.model-overlay {
  position: absolute;
  z-index: 9998;
  background-color: rgba(0, 0, 0, 0.5);
  width: 100%;
  height: 100%;
  display: table;
  transition: opacity 0.3s ease;
}
.modal-container {
  width: 60%;
  height: 60%;
  top: 20%;
  margin: auto;
  padding: 20px 30px;
  background-color: rgba(0, 0, 0, 0.5);

  border-radius: 2px;
  transition: opacity 0.3s ease;

  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.33);
  transition: all 0.3s ease;
}
.button {
  background-color: black;
}
</style>