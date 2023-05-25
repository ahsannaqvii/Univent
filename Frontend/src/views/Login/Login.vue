<template>
  <section class="main-wrapper">
    <div class="main-container" id="container">
      <div class="form-container sign-in-container">
        <!-- TODO:Add a post method  -->
        <v-form>
          <h1>SIGN IN</h1>
          <div class="social-container">
            <a href="#" class="social"
              ><font-awesome-icon :icon="['fab', 'facebook']"
            /></a>
           
            <a href="#" class="social"
              ><font-awesome-icon :icon="['fab', 'linkedin']"
            /></a>
          </div>
          <v-text-field
            class="text-field"
            type="email"
            name="email"
            placeholder="Enter your email"
            :rules="[rules.required, rules.email]"
            v-model.trim="email"
            outlined
          />
          <v-text-field
            class="text-field"
            type="password"
            name="password"
            placeholder="Enter your password"
            :rules="[rules.required]"
            v-model.trim="password"
            counter
            maxlength="25"
            outlined
          />
          <!-- icon="close" -->
          <v-alert :value="error" color="error" style="color: red">
            The username or the password is incorrect
          </v-alert>
          <button type="submit" class="signinbtn" @click.prevent="login">
            SIGN IN
          </button>
        </v-form>
      </div>
      <div class="overlay-container">
        <div class="overlay">
          <iframe
            src="https://drive.google.com/file/d/1rJbqXiEkltUUDnHNNj15iAnD_zp4jZf2/preview"
            width="630"
            height="490"
          ></iframe>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import rules from "@/rules";
export default {
  name: "Login",

  data: () => ({
    rules: rules,
    password: "",
    email: "",
    error: false,
  }),
  methods: {
    login() {
      this.$store
        .dispatch("Login", {
          email: this.email,
          password: this.password,
        })
        .then((success) => this.$router.push("/"))
        .catch((error) => (this.error = true));
    },
  },
};
</script>

<style scoped>
.main-wrapper {
  background: white;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  height: 80vh;
}
.main-container {
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);
  position: relative;
  overflow: hidden;
  width: 1000px;
  max-width: 100%;
  min-height: 480px;
}

h1 {
  font-weight: bold;
  margin-top: 20px;
}

p {
  font-size: 14px;
  font-weight: 100;
  line-height: 20px;
  letter-spacing: 0.5px;
  margin: 20px 0 30px;
}

span {
  font-size: 12px;
}

a {
  color: #333;
  font-size: 14px;
  text-decoration: none;
  margin: 15px 0;
}

.signinbtn {
  border-radius: 20px;
  border: 1px solid #ffffff;
  background-color: #001233;
  color: #ffffff;
  font-size: 12px;
  font-family: "Poppins", sans-serif;
  font-weight: bold;
  padding: 12px 45px;
  letter-spacing: 1px;
  text-transform: uppercase;
  transition: transform 80ms ease-in;
}
.signinbtn:active {
  transform: scale(0.95);
}
.signinbtn:hover {
  color: orange;
}
.signinbtn:focus {
  outline: none;
}

button.ghost {
  background-color: transparent;
  border-color: #ffffff;
}

form {
  background-color: #ffffff;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  padding: 0 50px;
  height: 100%;
  text-align: center;
}

.text-field {
  height: 40px !important;
  flex: 0;
  margin-bottom: 50px;
}

.form-container {
  width: 50%;
  position: absolute;
  top: 0;
  height: 100%;
  transition: all 0.6s ease-in-out;
}

.sign-in-container {
  justify-content: center;
  align-items: center;
  left: 0;
  width: 40%;
  z-index: 2;
}

.container.right-panel-active .sign-in-container {
  transform: translateX(100%);
}

.sign-up-container {
  left: 0;
  width: 50%;
  opacity: 0;
  z-index: 1;
}

.container.right-panel-active .sign-up-container {
  transform: translateX(100%);
  opacity: 1;
  z-index: 5;
  animation: show 0.6s;
}

@keyframes show {
  0%,
  49.99% {
    opacity: 0;
    z-index: 1;
  }

  50%,
  100% {
    opacity: 1;
    z-index: 5;
  }
}

.overlay-container {
  position: absolute;
  top: 0;
  left: 40%;
  width: 60%;
  height: 100%;
  overflow: hidden;
  transition: transform 0.6s ease-in-out;
  z-index: 100;
}
/* https://lh3.googleusercontent.com/xDzC2ZeRigVnqBR5CeusCgW03MMG2EoVDrqrLbXmqxHK8L119IHt6N5cB8KF8D33So8Imh-ShdPsJ6jNXN1nHow7z72xfJbp24R6DWmW_yzrniTHx0Om-5x1znlA5LHiUu7ekOcdY6X_ndBjPDVTEzL-MziuK84YeguZ1pHzs28GZgQuxpBIAHRIQ49OpKiIpLHIDicZf4fFpa6bWD6rB-Bw93FWAUqrRB_bD72OUedpWDE1lkNlYZlJWzHEUgZnS1cfsu7TrIEVHX2jqpbrA8LQZbKFSGSsxyPYEL7iaEeCXDZlwGqgC5EoftoSThZkMSyT9AFJLVmUgASwqrFSWcXHPBnh18-3yG9_A610J-3sj-TbPyx-0oeuefY8KqtDFKdwuSQB_WHOLDJ2hNeM1cvdDIBGRhGcp2iFJpPMDIn_HlkAfFkzen1hS1OfMMeXBKhfkIQ_RYCMER8hUmCECR6rNy8R9agUBk0xT1estpj3Zg3PL7Tukt3lmdsyfEQioDqhJKtG_d2iavKhHi69P-g6S82_wslmt0pG_J0EGlG2ZPH1xDITaxBEnxPTxGbvxnSZCs4FRFiXew5eI9fqmWllk2_r7oB4jhYV0yja7rA76wgkyVXo9ozZpHmyQDjp4B9iZdha2zkixHqBPU219meZRotfjYoYKP5Rvlf9ppRp6-F83AaKmNo_VqXO8JbH5yTOB146qZ9NCYq0c51E3SwkRCtT3sjL0UZEjNOhjY4WtkcL4kJjcUtAsSV4k6Y3x2luXLyxDOhTJml9LKT6lEX8Rf6mi4pmTVfdim_EP-y-mDMrU1ze6dBIn-Vtv3GM6YP5Sh31gizLm1Ix8VM2vihOJtwqQk64p4Uz2EbI4VKqTHGzjj_AJy8n6JHrlLFfjrkyLozKVa4xTh7A9s5R8akVJT5iz8-w0_SX0LMe9NAhgKDfy1XUe2qiDsM742PNqkY4qLmw5hSjqz3Ttn8K=w1027-h800-no?authuser=0.png */
.overlay {
  background-image: url("https://drive.google.com/file/d/1rJbqXiEkltUUDnHNNj15iAnD_zp4jZf2/view?usp=share_link");
  background-repeat: no-repeat;
  background-size: contain;
  background-position: 0 0;
  color: #ffffff;
  position: relative;
  left: 0%;
  height: 100%;
  width: 300%;
  transform: translateX(0);
  transition: transform 0.6s ease-in-out;
}
.container.right-panel-active .overlay-container {
  transform: translateX(-100%);
}

.form-container h1 {
  color: orange;
  font-size: 2.5rem;
  font-family: "Poppins", sans-serif;
}
.container.right-panel-active .overlay {
  transform: translateX(50%);
}

.overlay-panel {
  position: absolute;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  padding: 0 40px;
  text-align: center;
  top: 0;
  height: 100%;
  width: 50%;
  transform: translateX(0);
  transition: transform 0.6s ease-in-out;
}

.overlay-left {
  transform: translateX(-20%);
}

.container.right-panel-active .overlay-left {
  transform: translateX(0);
}

.overlay-right {
  right: 0;
  transform: translateX(0);
}

.container.right-panel-active .overlay-right {
  transform: translateX(20%);
}

.social {
  font-size: 1.5rem;
  color: #001233;
}
.social-container {
  margin: 20px 0;
}

.social-container a {
  border: 1px solid #dddddd;
  border-radius: 50%;
  display: inline-flex;
  justify-content: center;
  align-items: center;
  margin: 0 5px;
  height: 40px;
  width: 40px;
}

footer {
  background-color: #222;
  color: #fff;
  font-size: 14px;
  bottom: 0;
  position: fixed;
  left: 0;
  right: 0;
  text-align: center;
  z-index: 999;
}

footer p {
  margin: 10px 0;
}

footer i {
  color: red;
}

footer a {
  color: #3c97bf;
  text-decoration: none;
}
</style>
