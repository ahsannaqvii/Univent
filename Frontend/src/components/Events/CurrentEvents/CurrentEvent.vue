<template>
  <section class="events-section section-bg section-padding" id="section_4">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-12">
          <h2 class="mb-lg-3">Upcoming Events</h2>
        </div>

        <div class="row custom-block mb-3">
          <div class="col-lg-2 col-md-4 col-12 order-2 order-md-0 order-lg-0">
            <div
              class="custom-block-date-wrap d-flex d-lg-block d-md-block align-items-center mt-3 mt-lg-0 mt-md-0"
            >
              <h6 class="custom-block-date mb-lg-1 mb-0 me-3 me-lg-0 me-md-0">
                24
              </h6>

              <strong class="text-white">Feb 2048</strong>
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
              <a href="event-detail.html" class="events-title mb-3"
                >Private activities</a
              >

              <p class="mb-0">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
              </p>

              <div class="d-flex flex-wrap border-top mt-4 pt-3">
                <div class="mb-4 mb-lg-0">
                  <div class="d-flex flex-wrap align-items-center mb-1">
                    <span class="custom-block-span">Location:</span>

                    <p class="mb-0">National Center, NYC</p>
                  </div>

                  <div class="d-flex flex-wrap align-items-center">
                    <span class="custom-block-span">Ticket:</span>

                    <p class="mb-0">$250</p>
                  </div>
                </div>

                <div class="d-flex align-items-center ms-lg-auto">
                  <a href="event-detail.html" class="btn custom-btn"
                    >Register Now</a
                  >
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="row custom-block custom-block-bg">
          <div class="col-lg-2 col-md-4 col-12 order-2 order-md-0 order-lg-0">
            <div
              class="custom-block-date-wrap d-flex d-lg-block d-md-block align-items-center mt-3 mt-lg-0 mt-md-0"
            >
              <h6 class="custom-block-date mb-lg-1 mb-0 me-3 me-lg-0 me-md-0">
                28
              </h6>

              <strong class="text-white">Feb 2048</strong>
            </div>
          </div>

          <div class="col-lg-4 col-md-8 col-12 order-1 order-lg-0">
            <div class="custom-block-image-wrap">
              <a href="event-detail.html">
                <img
                src="./../../../assets/current-events/golf.jpg"
                  class="custom-block-image img-fluid"
                  alt=""
                />

                <!-- <i class="custom-block-icon bi-link"></i> -->
              </a>
            </div>
          </div>

          <div class="col-lg-6 col-12 order-3 order-lg-0">
            <div class="custom-block-info mt-2 mt-lg-0">
              <a href="event-detail.html" class="events-title mb-3"
                >Group tournament activities</a
              >

              <p class="mb-0">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
              </p>

              <div class="d-flex flex-wrap border-top mt-4 pt-3">
                <div class="mb-4 mb-lg-0">
                  <div class="d-flex flex-wrap align-items-center mb-1">
                    <span class="custom-block-span">Location:</span>

                    <p class="mb-0">National Center, NYC</p>
                  </div>

                  <div class="d-flex flex-wrap align-items-center">
                    <span class="custom-block-span">Ticket:</span>

                    <p class="mb-0">$350</p>
                  </div>
                </div>

                <div class="d-flex align-items-center ms-lg-auto">
                  <a href="/Registration" class="btn custom-btn"
                    >Register Now</a
                  >
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
  name: "CurrentEvent",
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
.section-bg {
  background-color: #f4f1de;
}

.events-section.section-bg .container > .row {
  margin-right: 5px;
  margin-left: 5px;
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
