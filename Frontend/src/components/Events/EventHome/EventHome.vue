<template>
  <div class="page-front">
    <header>
      <div class="header-content">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 col-md-7 col-lg-6">
              <h6>&lt; software engineering done right /&gt;</h6>
              <h1>By Students, For Students</h1>
              <p>
                O&amp;B's Java and Agile training courses were developed using
                knowledge gained from real-world software development projects.
                We offer classes in
                <a
                  class="header-link-bold"
                  href="/training_tracks/java-developer/"
                  target="_blank"
                  >Java</a
                >,
                <a href="/Event" target="_blank"
                  >Spring</a
                >,
                <a href="/java-framework/jpa-hibernate/" target="-blank"
                  >Hibernate</a
                >,
                <a href="/training_tracks/agile-manager/" target="_blank"
                  >Agile</a
                >, and other related technologies.
              </p>
              <a href="/Event" class="btn -secondary mt10">
                <img
                  src="./../../../assets/ico-arrow.svg"
                  alt=""
                  class="ico svg"
                />
                Browse Events  &amp; Unions
              </a>
            </div>
          </div>
        </div>
      </div>

      <div class="element-2">
        <img src="./../../../assets/bg-element1.svg" alt="" />
      </div>

      <div class="element-1">
        <img src="./../../../assets/img-heading.png" />
      </div>
    </header>
    <About />
    <Pastevents  />
    <CurrentEvent :currentEvent="this.GetCurrentEvents" />
  </div>
</template>


<script>
import { mapGetters } from "vuex";

import Pastevents from "../PastEvents/Pastevents.vue";
import About from "../AboutEvent/AboutEvent.vue";
import CurrentEvent from "../CurrentEvent/CurrentEvent.vue";
export default {
  name: "event-page",
  components: {
    Pastevents,
    CurrentEvent,
    About,
  },
  computed: mapGetters(["GetCurrentEvents"]),

  
};
</script>


<style scoped >
/* REMOVE LATER  */
.mt10 {
  margin-top: 10px !important;
}
section {
  padding-top: 3.75rem;
  padding-bottom: 3.75rem;
  overflow: hidden;
}
h5 {
  font-family: "DM Sans", sans-serif;
  font-size: 21px;
  color: #222930;
}
h1,
h2,
h3,
h4,
h5,
h6 {
  margin-top: 0;
  margin-bottom: 0.5rem;
}
h1 {
  font-family: "DM Sans", sans-serif;
  font-size: 60px;
  line-height: 1.09;
  font-weight: bold;
  color: #ffffff;
}

h6 {
  font-family: "DM Sans", sans-serif;
  font-size: 14px;
  font-weight: 600;
  line-height: normal;
  letter-spacing: 1.5px;
  color: #ff9c2e;
  text-transform: uppercase;
}

a {
  color: #007bff;
  text-decoration: none;
  background-color: transparent;
}

p {
  font-family: "DM Sans", sans-serif;
  font-size: 16px;
  font-weight: 500;
  color: #141516;
  line-height: 2;
  letter-spacing: normal;
  margin-top: 0;
  margin-bottom: 1rem;
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
.btn.-secondary {
  position: relative;
  text-transform: uppercase;

  display: inline-flex;
  padding: 1rem 1.3125rem;
  font-family: "Aktiv Grotesk Medium", Arial, Helvetica, sans-serif;
  font-size: 12px;
  font-weight: 500;
  font-style: normal;
  font-stretch: normal;
  line-height: normal;
  letter-spacing: normal;
  text-align: left;
  color: #ffffff;
  border-radius: 3rem;
  /* background-image: -webkit-gradient(
    linear,
    left top,
    right top,
    from(#fafafa),
    to(#f0f0f0)
  ); */
  background-size: cover;
  background-image: url(https://i.ibb.co/vX2MxJf/service-item-bg.jpg);

  /* background-image: linear-gradient(to right, #001233, #001233); */
  /* -webkit-box-shadow: 0 10px 30px -10px #c5ccd4;
  box-shadow: 0 10px 30px -10px #c5ccd4; */
}
p .-header {
  color: #ffffff;
}

li {
  font-family: "DM Sans", sans-serif;
  font-size: 16px;
  font-weight: 500;
  color: #141516;
  line-height: 2;
  letter-spacing: normal;
}

a {
  color: #fe9c37;
}
a:hover {
  color: #fe9c37;
}
.page-front {
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;

  text-align: left;
}
.page-front header {
  position: relative;
  overflow: hidden;
  background: url(./../../../assets/-AJAR.jpg) top center no-repeat;

  background-size: cover;
}

.page-front header h1 {
  margin-bottom: 20px;
}

.top-nav {
  z-index: 999;
  position: relative;
  height: 100px;
  border-bottom: solid 2px rgba(255, 255, 255, 0.3);
}
.col {
  -ms-flex-preferred-size: 0;
  flex-basis: 0;
  -webkit-box-flex: 1;
  -ms-flex-positive: 1;
  flex-grow: 1;
  max-width: 100%;
}
.navigation-bar {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.navigation-bar > .logo {
  transition: all 200ms ease-in-out;
}
.navigation-bar > .logo:hover {
  opacity: 1;
  -webkit-transform: translateY(-2px);
  transform: translateY(-2px);
  -webkit-transition: all 200ms ease-in-out;
  transition: all 200ms ease-in-out;
}
.contact-details span {
  font-family: "DM Sans", sans-serif;
  font-size: 16px;
  color: #ffffff;
  font-weight: bold;
  padding-left: 10px;
}
.navigation-bar > .logo:active {
  -webkit-transform: translateY(2px);
  transform: translateY(2px);
  -webkit-transition: all 100ms ease-in-out;
  transition: all 100ms ease-in-out;
}
.row {
  display: flex;
  -ms-flex-wrap: wrap;
  flex-wrap: wrap;
  margin-right: -15px;
  margin-left: -15px;
}
.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}
.navbar-menu {
  list-style: none;
  padding-left: 0;
  display: flex;
  margin-bottom: 0;
}
.navbar-menu img {
  width: 25px;
}
.navbar-menu > li {
  -ms-flex-item-align: center;
  align-self: center;
}
.navbar-menu > li a {
  font-family: "Exo 2", sans-serif;
  font-size: 16px;
  font-weight: 600;
  font-style: normal;
  font-stretch: normal;
  line-height: normal;
  letter-spacing: normal;
  text-align: left;
  color: #ffffff;
  opacity: 0.7;
  padding: 10px 16px;
}
.navbar-menu > li a:hover {
  opacity: 1;
  position: relative;
  -webkit-transition: -webkit-transform 300ms;
  transition: -webkit-transform 300ms;
  transition: transform 300ms;
  transition: transform 300ms, -webkit-transform 300ms;
}
.navbar-menu .dropdown-item {
  color: #141516;
  padding: 10px 20px;
  font-size: 16px;
}
.navbar-menu .dropdown-item:hover {
  color: #ffa02f;
}
.navbar-menu .dropdown-item:active {
  background-color: transparent;
}
article,
aside,
footer,
header,
nav,
section {
  display: block;
}
.dropdown,
.dropup {
  position: relative;
}

.dropdown-toggle::after {
  display: inline-block;
  width: 0;
  height: 0;
  margin-left: 0.255em;
  vertical-align: 0.255em;
  content: "";
  border-top: 0.3em solid;
  border-right: 0.3em solid transparent;
  border-bottom: 0;
  border-left: 0.3em solid transparent;
}

.dropdown-toggle:empty::after {
  margin-left: 0;
}
.dropdown-item {
  display: block;
  width: 100%;
  padding: 0.25rem 1.5rem;
  clear: both;
  font-weight: 400;
  color: #212529;
  text-align: inherit;
  white-space: nowrap;
  background-color: transparent;
  border: 0;
}
.page-front header p a {
  color: white;
  font-weight: bold;
}
.dropdown-item:focus,
.dropdown-item:hover {
  color: #16181b;
  text-decoration: none;
  background-color: #f8f9fa;
}
.button_container {
  position: relative;
  top: 5%;
  height: 27px;
  width: 35px;
  cursor: pointer;
  z-index: 100;
  -webkit-transition: opacity 0.25s ease;
  transition: opacity 0.25s ease;
}
.button_container:hover {
  opacity: 0.7;
}
.button_container.active .top {
  -webkit-transform: translateY(11px) translateX(0) rotate(45deg);
  transform: translateY(11px) translateX(0) rotate(45deg);
  background: #fff;
}
.button_container.active .middle {
  opacity: 0;
  background: #fff;
}
.button_container.active .bottom {
  -webkit-transform: translateY(-11px) translateX(0) rotate(-45deg);
  transform: translateY(-11px) translateX(0) rotate(-45deg);
  background: #fff;
}
.button_container span {
  background: #fff;
  border: none;
  height: 5px;
  width: 100%;
  position: absolute;
  top: 0;
  left: 0;
  -webkit-transition: all 0.35s ease;
  transition: all 0.35s ease;
  cursor: pointer;
}
.button_container span:nth-of-type(2) {
  top: 11px;
}
.button_container span:nth-of-type(3) {
  top: 22px;
}
.dropdown-item.active,
.dropdown-item:active {
  color: #fff;
  text-decoration: none;
  background-color: #007bff;
}

.dropdown-item.disabled,
.dropdown-item:disabled {
  color: #6c757d;
  background-color: transparent;
}
.dropdown-menu {
  position: absolute;
  top: 100%;
  left: 0;
  z-index: 1000;
  display: none;
  float: left;
  min-width: 10rem;
  padding: 0.5rem 0;
  margin: 0.125rem 0 0;
  font-size: 1rem;
  color: #212529;
  text-align: left;
  list-style: none;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px solid rgba(0, 0, 0, 0.15);
  border-radius: 0.25rem;
}
.nav-link {
  display: block;
  padding: 0.5rem 1rem;
}

.nav-link:focus,
.nav-link:hover {
  text-decoration: none;
}

.nav-link.disabled {
  color: #6c757d;
}
.btn .ico {
  margin-right: 10px;
}
.nav {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
  flex-wrap: wrap;
  padding-left: 0;
  margin-bottom: 0;
  list-style: none;
}
.overlay {
  position: fixed;
  background: #ff962c;
  top: 0;
  left: 0;
  width: 100%;
  height: 0%;
  opacity: 0;
  visibility: hidden;
  -webkit-transition: opacity 0.35s, visibility 0.35s, height 0.35s;
  transition: opacity 0.35s, visibility 0.35s, height 0.35s;
  overflow: hidden;
  z-index: 3;
}

.overlay.open {
  opacity: 0.9;
  visibility: visible;
  height: 100vh;
  width: 100vw;
}
.overlay.open li {
  -webkit-animation: fadeInRight 0.5s ease forwards;
  animation: fadeInRight 0.5s ease forwards;
  -webkit-animation-delay: 0.35s;
  animation-delay: 0.35s;
}
.overlay.open li:nth-of-type(2) {
  -webkit-animation-delay: 0.4s;
  animation-delay: 0.4s;
}
.overlay.open li:nth-of-type(3) {
  -webkit-animation-delay: 0.45s;
  animation-delay: 0.45s;
}
.overlay.open li:nth-of-type(4) {
  -webkit-animation-delay: 0.5s;
  animation-delay: 0.5s;
}
.overlay nav {
  position: relative;
  top: 50%;
  -webkit-transform: translateY(-50%);
  transform: translateY(-50%);
  font-weight: 400;
  text-align: center;
}
.overlay ul {
  list-style: none;
  padding: 0;
  margin: 0 auto;
  display: inline-block;
  position: relative;
  height: 100%;
}
.overlay ul li {
  display: block;
  height: 25%;
  height: calc(100% / 4);
  min-height: 50px;
  position: relative;
  opacity: 0;
}
.overlay ul li a {
  font-family: "Aktiv Grotesk", Arial, Helvetica, sans-serif, serif;
  display: block;
  position: relative;
  color: #fff;
  text-decoration: none;
  overflow: hidden;
  font-size: 50px;
  display: inline-block;
}
.overlay ul li a:hover:after,
.overlay ul li a:focus:after,
.overlay ul li a:active:after {
  width: 100%;
}
.overlay ul li a:after {
  content: "";
  position: absolute;
  bottom: 0;
  left: 50%;
  width: 0%;
  -webkit-transform: translateX(-50%);
  transform: translateX(-50%);
  height: 3px;
  background: #fff;
  -webkit-transition: 0.35s;
  transition: 0.35s;
}
.page-front header > .header-content {
  padding-bottom: 130px;
  padding-top: 50px;
  position: relative;
  z-index: 1;
}
div {
  display: block;
}
.page-front header > .element-1 {
  position: absolute;
  right: 8%;
  bottom: 2px;
  z-index: 1;
  top: 5rem;
}

.page-front header p {
  color: #fff;
}
.page-front header p a {
  color: white;
  font-weight: bold;
}
.page-front header h6 {
  margin-bottom: 20px;
  color: #fff;
}

.page-front header > .element-2 {
  position: absolute;
  bottom: -2px;
}
.page-front header > .element-2 > img {
  width: 100vw;
  transition: none;
}

img {
  vertical-align: middle;
  border-style: none;
  page-break-inside: avoid;
  overflow-clip-margin: content-box;
  overflow: clip;
}
.btn {
  display: inline-block;
  font-weight: 400;
  text-align: center;
  white-space: nowrap;
  vertical-align: middle;

  border: 1px solid transparent;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  line-height: 1.5;
  border-radius: 0.25rem;
}
.btn:focus,
.btn:hover {
  text-decoration: none;
}

.btn.focus,
.btn:focus {
  outline: 0;
  -webkit-box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
  box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
}
.btn-secondary {
  color: #fff;
  background-color: #6c757d;
  border-color: #6c757d;
}

.btn-secondary:hover {
  color: #fff;
  background-color: #5a6268;
  border-color: #545b62;
}

.btn-secondary.focus,
.btn-secondary:focus {
  -webkit-box-shadow: 0 0 0 0.2rem rgba(108, 117, 125, 0.5);
  box-shadow: 0 0 0 0.2rem rgba(108, 117, 125, 0.5);
}

/* REMOVE LATER  */

﻿.demo-wrap {
  overflow: hidden;
  position: relative;
  background-color: white;
}
.demo-bg {
  opacity: 0.2;
  position: absolute;
  width: 100%;
}

.demo-content {
  position: relative;
  padding: 32% 0%;
  color: #242c42;
  text-align: center;
}

.demo-content h1 {
  font-weight: 700;
  font-size: 64px;
  text-transform: capitalize;
}

.sideimg {
  margin: 4% 0%;
  z-index: 1;
  position: relative;
}

.box {
  background-color: #242c42;
  height: 350px;
  width: 450px;
  position: absolute;
  z-index: -1;
  top: 10%;
  right: -10%;
}

/* for cards and showing events  */
.row {
  margin-left: 3%;
}
#carousel {
  margin-bottom: 3%;
}

.carousel-item {
  background-color: white;
}

/* EVENT SECTION  */

.upcoming h1,
.past h1 {
  margin-left: 1%;
  margin-bottom: 3%;
  height: 20px;
}

.upcoming,
.past {
  display: flex;
  margin-bottom: 3rem;
  /* margin-top: 3rem; */
}

.card {
  margin-left: 10%;
  margin-bottom: 10%;
}

hr {
  width: 25%;
  margin: 3% auto;
  border: 2px solid #242c42;
}

.event-type {
  background-color: #242c42;
  color: white;
  position: relative;
  width: 50%;
  /*    ye width sahi hai , not working for Ahsan only */
  text-align: center;
  padding: 2%;
}

.title {
  font-weight: bold;
}

.details {
  font-size: 14px;
}
.register {
  text-decoration: none;
}
.register:hover {
  color: white;
}

.card-body-icon {
  text-align: center;
  position: relative;
  top: 50%;
  margin-left: -150px;
  left: 50%;
  transform: translate(-50%, -50%);
}
.card-body-icon a {
  font-size: 35px;
}

.card-body-icon:hover {
  color: grey;
  cursor: pointer;
}
</style>

