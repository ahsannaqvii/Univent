<template>
    <div>
      <div class="demo-wrap">
        <img
          class="demo-bg"
          src="https://i.ibb.co/r7kc20Y/Home-Cover.jpg"
          alt=""
          height="600"
        />
        <div class="row">
          <div class="col-lg-6">
            <div class="demo-content">
              <h1>Student Events</h1>
            </div>
          </div>
          <div class="sideimg col-lg-4">
            <img
              src="https://i.ibb.co/qsHZk3w/Home2.jpg"
              height="350px"
              width="450px"
            />
            <div class="box"></div>
          </div>
        </div>
      </div>
      <div id="Events">
        <div class="container-fluid">
          <h1>Upcoming Events</h1>
          <div class="upcoming">
            <div class="row">
              <div class="col-lg-3">
                <div class="card" style="width: 18rem">
                  <img
                    src="https://i.ibb.co/XkNGvh5/Screen-Shot-2022-02-26-at-2-33-37-AM.jpg"
                    class="card-img-top"
                    style="height: 12rem"
                  />
  
                  <div class="card-body">
                    <p class="event-type">@EVENT TYPE</p>
                    <p class="title">EVENT NAME</p>
  
                    <p class="details">
                      <i class="fa-solid fa-bullhorn"></i> GUEST NAME
                    </p>
  
                    <p class="details">
                      <i class="fa-regular fa-building"></i> UNION NAME
                    </p>
                    <p class="details">
                      <i class="fa-regular fa-calendar"></i> DATE
                    </p>
                    <p class="details">
                      <i class="fa-regular fa-clock"></i> TIME
                    </p>
                    <p class="details">
                      <i class="fa-solid fa-location-dot"></i> Audi
                    </p>
                  </div>
                </div>
              </div>
              <div class="col-lg-3">
                <div class="card-body-icon">
                  <a href="/Events/GetSocietyEvent">
                    <i class="fa fa-plus-circle" style="color: black"> </i>
                  </a>
                </div>
              </div>
            </div>
          </div>
          <hr />
          <h1>Past Events</h1>
          <div class="past">
            <div class="row">
              <div class="col-lg-3">
                <div class="card" style="width: 18rem">
                  <img
                    src="https://i.ibb.co/XkNGvh5/Screen-Shot-2022-02-26-at-2-33-37-AM.jpg"
                    class="card-img-top"
                    style="height: 12rem"
                  />
  
                  <div class="card-body">
                    <p class="event-type">@EVENT TYPE</p>
                    <p class="title">EVENT NAME</p>
  
                    <p class="details">
                      <i class="fa-solid fa-bullhorn"></i> GUEST NAME
                    </p>
  
                    <p class="details">
                      <i class="fa-regular fa-building"></i> UNIONNAME
                    </p>
                    <p class="details">
                      <i class="fa-regular fa-calendar"></i> DATE
                    </p>
                    <p class="details">
                      <i class="fa-regular fa-clock"></i> TIME
                    </p>
                    <p class="details">
                      <i class="fa-solid fa-location-dot"></i> Audi
                    </p>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-3">
              <div class="card" style="width: 18rem">
                <img
                  src="https://i.ibb.co/XkNGvh5/Screen-Shot-2022-02-26-at-2-33-37-AM.jpg"
                  class="card-img-top"
                  style="height: 12rem"
                />
  
                <div class="card-body">
                  <p class="event-type">@EVENT TYPE</p>
                  <p class="title">EVENT NAME</p>
  
                  <p class="details">
                    <i class="fa-solid fa-bullhorn"></i> GUEST NAME
                  </p>
  
                  <p class="details">
                    <i class="fa-regular fa-building"></i> UNIONNAME
                  </p>
                  <p class="details">
                    <i class="fa-regular fa-calendar"></i> DATE
                  </p>
                  <p class="details"><i class="fa-regular fa-clock"></i> TIME</p>
                  <p class="details">
                    <i class="fa-solid fa-location-dot"></i> Audi
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  
  <script>
  </script>
  
  
  <style scoped >
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