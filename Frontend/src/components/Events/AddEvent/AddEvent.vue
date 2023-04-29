<template>
  <div class="wrapper">
    <div class="form-left">
      <div class="form-left-container">
        <h2>Event Information</h2>
        <h5>Cabbages and Learning</h5>
        <p class="text">
          <span> Venue : Auditorium </span>
        </p>
        <p class="text">
          <span>Date : 24-Apr-23 </span>
        </p>

        <div>
          <input type="submit" class="account" value="Seminar" />
        </div>
      </div>
    </div>
    <form class="form-right">
      <h2>Registration form</h2>
      <div class="row">
        <div class="col-sm-6 mb-3">
          <label>First Name</label>

          <v-text-field
            class="text-field"
            type="text"
            name="first_name"
            placeholder="Enter your first name"
            outlined
          />
        </div>
        <div class="col-sm-6 mb-3">
          <label>Last Name</label>

          <v-text-field
            class="text-field"
            type="text"
            name="last_name"
            placeholder="Enter your last name"
            outlined
          />
        </div>
      </div>
      <div class="row">
        <div class="col-sm-6 mb-3">
          <label>Event ID</label>
          <v-text-field
            class="text-field"
            type="text"
            name="email"
            placeholder="Enter the event ID"
            v-model.trim="id"
            readonly
            outlined
          />
        </div>
        <div class="col-sm-6 mb-3">
          <label>Student ID</label>
          <v-text-field
            class="text-field"
            type="text"
            v-model="studentID"
            name="studentID"
            placeholder="Enter your student ID"
            outlined
          />
        </div>
      </div>
      <div class="mb-3">
        <label class="option">
          I agree to the <a href="#">Terms and Conditions</a>
          <input type="checkbox" checked />
          <span class="checkmark"></span>
        </label>
      </div>
      <div class="form-field">
        <button class="register" @click.prevent="RegisterEvent">
          Register
        </button>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: "AddEvent",
};
</script>


<style scoped>
.wrapper {
  max-width: 1200px;
  background-color: #fff;
  border-radius: 10px;
  position: relative;
  display: flex;
  margin: 10rem auto;
  box-shadow: 0 8px 20px 0px #1f1f1f1a;
  overflow: hidden;
}

.wrapper .form-left {
  background: #192836;
  border-top-left-radius: 10px;
  border-bottom-left-radius: 10px;
  padding: 20px 40px;
  position: relative;
  height: 40rem;
  width: 100%;
  color: #fff;
}
.wrapper .form-left .form-left-container {
  position: relative;
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.wrapper h2 {
  font-weight: 700;
  text-transform: uppercase;
  font-size: 25px;
  padding: 5px 0 0;

  margin-bottom: 34px;
  pointer-events: none;
}

.wrapper .form-left p {
  font-size: 0.9rem;
  font-weight: 300;
  line-height: 1.5;
  pointer-events: none;
}

.wrapper .form-left .text {
  margin: 10px 0 10px;
  color: white;
}

.wrapper .form-left p span {
  font-weight: 700;
}

.wrapper .form-left input {
  padding: 15px;
  background: #fff;
  border-top-left-radius: 5px;
  border-bottom-right-radius: 5px;
  width: 180px;
  border: none;
  margin: 15px 0 50px 0px;
  cursor: pointer;
  color: #333;
  font-weight: 700;
  font-size: 0.9rem;
  appearance: unset;
  outline: none;
}

.wrapper .form-left input:hover {
  background-color: #f2f2f2;
}

.wrapper .form-right {
  padding: 20px 60px;
  position: relative;
  width: 100%;
}

.wrapper .form-right h2 {
  color: #001233;
  position: relative;
  display: flex;
  justify-content: center;
}

.wrapper .form-right label {
  font-weight: 600;
  font-size: 15px;
  color: #666;
  display: block;
  margin-bottom: 8px;
}

.wrapper .form-right .input-field {
  width: 100%;
  padding: 10px 15px;
  border: 1px solid #e5e5e5;
  border-top-left-radius: 5px;
  border-bottom-right-radius: 5px;
  outline: none;
  color: #333;
}

.wrapper .form-right .input-field:focus {
  border: 1px solid #31a031;
}

.wrapper .option {
  display: block;
  position: relative;
  padding-left: 30px;
  margin-bottom: 12px;
  font-size: 0.95rem;
  font-weight: 900;
  cursor: pointer;
  user-select: none;
}

.wrapper .option input {
  position: absolute;
  opacity: 0;
  cursor: pointer;
  height: 0;
  width: 0;
}

.wrapper .checkmark {
  position: absolute;
  top: 0;
  left: 0;
  height: 18px;
  width: 18px;
  background-color: #fff;
  border: 2px solid #ddd;
  border-radius: 2px;
}

.wrapper .option:hover input ~ .checkmark {
  background-color: #f1f1f1;
}

.wrapper .option input:checked ~ .checkmark {
  border: 2px solid #e5e5e5;
  background-color: #fff;
  transition: 300ms ease-in-out all;
}

.wrapper .checkmark:after {
  content: "\2713";
  position: absolute;
  display: none;
  color: #3786bd;
  font-size: 1rem;
}

.wrapper .option input:checked ~ .checkmark:after {
  display: block;
}

.wrapper .option .checkmark:after {
  left: 2px;
  top: -4px;
  width: 5px;
  height: 10px;
}

.form-field {
  position: relative;
  align-items: center;
  justify-content: center;
  display: flex;
}
.wrapper .register {
  padding: 12px;
  background: #a22b2f;
  margin-top: 10px;
  border-top-left-radius: 5px;
  border-bottom-right-radius: 5px;
  width: 130px;
  border: none;
  cursor: pointer;
  color: #fff;
  font-weight: 700;
  font-size: 15px;
}

.wrapper .register:hover {
  background-color: #f7b265;
}

.wrapper a {
  text-decoration: none;
  color: #001233;
}
</style>