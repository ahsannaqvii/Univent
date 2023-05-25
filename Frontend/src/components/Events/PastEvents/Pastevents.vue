<template>
  <section class="section-portfolio">
    <img
      src="./../../../assets/pastevents/blue.svg"
      class="bg1"
      height="100%"
      alt=""
    />

    <img
      class="bg2"
      src="./../../../assets/pastevents/hero-element-bg2.svg"
      alt=""
    />

    <div class="container">
      <div class="row">
        <div class="col">
          <div class="section-title">
            <h6>
              &lt; EXPERTISE IN FINTECH, SPECIALIZING IN BANKING AND PAYMENTS
              /&gt;
            </h6>
            <h2>Our Past Events</h2>
            <img
              class="bg"
              src="./../../../assets/pastevents/title-success.png"
              alt=""
            />
          </div>
        </div>
      </div>

      <div class="row auto-960">
        <div class="col mt60">
          <img class="bg-element" alt="" />
          <div class="portfolio-controls">
            <a id="btn-prev" href="#" class="btn-links">
              <img
                class="prev"
                src="./../../../assets/pastevents/blu-back.svg"
                alt=""
                height="40"
              />
            </a>
            <a id="btn-next" href="#" class="btn-links">
              <img
                class="next"
                src="./../../../assets/pastevents/blue-next.svg"
                alt=""
                height="40"
              />
            </a>
          </div>
          <div
            class="portfolio-slider slick-initialized slick-slider slick-dotted"
          >
            <div class="slick-list draggable" style="height: 275px">
              <div class="slick-track" style="opacity: 1; width: 4968px">
                <div
                  class="portfolio-card slick-slide slick-current slick-active"
                  data-slick-index="0"
                  aria-hidden="false"
                  tabindex="0"
                  role="tabpanel"
                  id="slick-slide10"
                  aria-describedby="slick-slide-control10"
                  style="
                    width: 828px;
                    position: relative;
                    left: 0px;
                    top: 0px;
                    z-index: 999;
                    opacity: 1;
                  "
                >
                  <div class="portfolio-body">
                    <div class="portfolio-image">
                      <img
                        src="./../../../assets/pastevents/work-1.jpg"
                        alt=""
                        class="img-fluid image"
                      />
                    </div>
                    <div class="portfolio-content">
                      <div class="tags-list">
                        <span class="tags">Project Rescue</span>

                        <span class="tags">Advising</span>

                        <span class="tags">Solutioning</span>

                        <span class="tags">Training</span>
                      </div>
                      <h3 class="title">
                        Mobile Fintech for Third-World Countries
                      </h3>
                      <div class="content">
                        <p>
                          A mobile fintech company needed a range of services to
                          revive a failed project and bring it to completion.
                        </p>
                      </div>
                      <a
                        href="/"
                        class="btn -secondary"
                        tabindex="0"
                      >

                        <img class="ico svg" alt="" />
                        Read More
                      </a>
                    </div>
                  </div>
                </div>
                <div
                  class="portfolio-card slick-slide"
                  data-slick-index="1"
                  aria-hidden="true"
                  tabindex="-1"
                  role="tabpanel"
                  id="slick-slide11"
                  aria-describedby="slick-slide-control11"
                  style="
                    width: 828px;
                    position: relative;
                    left: -828px;
                    top: 0px;
                    z-index: 998;
                    opacity: 0;
                    transition: opacity 300ms linear 0s;
                  "
                >
                  <div class="portfolio-body">
                    <div class="portfolio-image">
                      <img
                        src="./../../../assets/pastevents/work-2.jpg"
                        alt=""
                        class="img-fluid image"
                      />
                    </div>
                    <div class="portfolio-content">
                      <div class="tags-list">
                        <span class="tags">Solutioning</span>
                      </div>
                      <h3 class="title">
                        Bringing fintech solutions for two major players in the
                        Philippines
                      </h3>
                      <div class="content">
                        <p>
                          A Philippine telco and a global credit card company
                          needed a mobile payment gateway to be deployed in
                          developing countries.
                        </p>
                      </div>
                      <a
                        href=""
                        class="btn -secondary"
                        tabindex="-1"
                      >
                        <img
                          src="/assets/images/ico-bookmark.svg"
                          class="ico svg"
                          alt=""
                        />
                        Read More
                      </a>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <ul class="slick-dots" style="" role="tablist">
              <li class="slick-active" role="presentation">
                <button
                  type="button"
                  role="tab"
                  id="slick-slide-control10"
                  aria-controls="slick-slide10"
                  aria-label="1 of 6"
                  tabindex="0"
                  aria-selected="true"
                >
                  1
                </button>
              </li>
              <li role="presentation" class="">
                <button
                  type="button"
                  role="tab"
                  id="slick-slide-control11"
                  aria-controls="slick-slide11"
                  aria-label="2 of 6"
                  tabindex="-1"
                >
                  2
                </button>
              </li>
              <li role="presentation" class="">
                <button
                  type="button"
                  role="tab"
                  id="slick-slide-control12"
                  aria-controls="slick-slide12"
                  aria-label="3 of 6"
                  tabindex="-1"
                >
                  3
                </button>
              </li>
              <li role="presentation" class="">
                <button
                  type="button"
                  role="tab"
                  id="slick-slide-control13"
                  aria-controls="slick-slide13"
                  aria-label="4 of 6"
                  tabindex="-1"
                >
                  4
                </button>
              </li>
              <li role="presentation" class="">
                <button
                  type="button"
                  role="tab"
                  id="slick-slide-control14"
                  aria-controls="slick-slide14"
                  aria-label="5 of 6"
                  tabindex="-1"
                >
                  5
                </button>
              </li>
              <li role="presentation" class="">
                <button
                  type="button"
                  role="tab"
                  id="slick-slide-control15"
                  aria-controls="slick-slide15"
                  aria-label="6 of 6"
                  tabindex="-1"
                >
                  6
                </button>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>


<script>
export default {
  name: "Pastevents",
};
</script>


<style scoped>
/* GENERAL HTML TAGS CSS  */

section {
  padding-top: 3.75rem;
  padding-bottom: 3.75rem;
}
img {
  vertical-align: middle;
  border-style: none;
  overflow: clip;
}

h6 {
  font-family: "Montserrat", sans-serif;
  font-size: 0.875rem;
  font-weight: 600;
  margin-top: 0;
  letter-spacing: 1.5px;
  color: #001233;
  text-transform: uppercase;
}
h2 {
  font-family: "Montserrat", sans-serif;
  font-size: 48px;
  line-height: normal;
  margin-bottom: 0.5rem;
  font-weight: bold;
  margin-top: 0;
  display: block;

  text-align: center;
  color: #22292e;
}
button,
html [type="button"] {
  -webkit-appearance: button;
}
button,
select {
  text-transform: none;
}
button,
input {
  overflow: visible;
}
li,
ul {
  font-family: "Montserrat", sans-serif;
  font-size: 1rem;
  line-height: 1.75;
  color: #141516;
}
h3,
h4 {
  font-family: "Montserrat", sans-serif;
  line-height: normal;
  text-align: left;
  color: #222930;
}
h3 {
  font-size: 1.6rem;
  font-weight: bold;
}
a,
a:hover {
  color: white;
}
a {
  text-decoration: none;
  background-color: transparent;
}
p {
  font-family: "Montserrat", sans-serif;
  font-size: 1rem;
  line-height: 1.75;
  color: #141516;
  margin-top: 0;
  margin-bottom: 1rem;
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}

h6.-dark,
p {
  text-align: left;
}

.section-portfolio {
  position: relative;
}

/* CSS FOR IMAGE 1  */
.section-portfolio .bg1 {
  position: absolute;
  z-index: 0;
  top: 10%;
  right: 45%;
}
/* CSS FOR IMAGE 2 */
.section-portfolio .bg2 {
  position: absolute;
  bottom: 131px;
  /* z-index: -1; */
  width: 100vw;
}

/* CSS FOR ENTIRE CONTAINER SHOWCASING EVENTS  */
.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}

/* TO SHOW THE TITLE OF EVENT (TOP HEADING )  
Our Success Stories */
.row {
  display: flex;
  flex-wrap: wrap;
  margin-right: -15px;
  margin-left: -15px;
}
.col {
  flex-basis: 0;
  flex-grow: 1;
  max-width: 100%;
  position: relative;
  min-height: 1px;
  padding-right: 15px;
  padding-left: 15px;
}

.section-title {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.section-title h6 {
  text-align: center;
}
.section-title > .bg {
  position: absolute;
  top: calc(70% - 130px);
  z-index: -1;
  display: none;
}

/* END OF HEADING  */

/* MAIN CSS FOR SHOWING EVENTS  */
.mt60 {
  margin-top: 60px !important;
}
.auto-960 {
  max-width: 960px;
  margin: 0 auto;
}
.section-portfolio .bg-element {
  position: absolute;
  z-index: 3;
  bottom: 50px;
  right: 40px;
}

/* FOR LEFT RIGHT CONTROLS  */
.portfolio-controls {
  position: absolute;
  right: 30px;
  top: 20px;
  z-index: 3;
}
.portfolio-controls > .btn-links {
  display: inline-block;
  opacity: 0.8;
  margin: 2px;
  margin-top: 0;
  margin-bottom: 0;
}

/* SLIDER  */
.slick-dotted.slick-slider {
  margin-bottom: 30px;
}
.slick-slider {
  position: relative;
  display: block;
  box-sizing: border-box;
  user-select: none;
  touch-action: pan-y;
  -webkit-tap-highlight-color: transparent;
}
.portfolio-slider {
  background-color: #fff;
  padding: 36px;
  border-radius: 4px;
  box-shadow: 0 5px 30px 0 hsla(210, 2%, 52%, 0.13);
  display: flex;
  -ms-flex-pack: start;
  justify-content: flex-start;
}

.slick-list {
  position: relative;
  display: block;
  overflow: hidden;
  margin: 0;
  padding: 0;
}
.slick-slider .slick-track,
.slick-slider .slick-list {
  transform: translate3d(0, 0, 0);
}

.slick-track {
  position: relative;
  top: 0;
  left: 0;
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.slick-track:before,
.slick-track:after {
  display: table;
  content: "";
}
.slick-track:after,
.slick-track:before {
  content: "";
  display: table;
}
.slick-initialized .slick-slide {
  display: block;
}

.slick-slide {
  display: none;
  float: left;
  height: 100%;
  min-height: 1px;
}
.portfolio-body {
  display: flex;
  align-items: flex-start;
  justify-content: flex-start;
  border-radius: 4px;
  position: relative;
}
.portfolio-image {
  width: 40%;
}
.portfolio-image > .image {
  box-shadow: 0 5px 20px 0 hsla(210, 2%, 52%, 0.13);
}
.slick-slide img {
  display: block;
}
.img-fluid,
.img-thumbnail {
  max-width: 100%;
  height: auto;
}
.portfolio-content {
  width: 60%;
  margin-left: 30px;
}
blockquote,
span.tags {
  font-stretch: normal;
  letter-spacing: normal;
  text-align: left;
}
span.tags {
  display: inline-block;
  padding: 8px 8px;
  font-family: "Montserrat", sans-serif;
  font-size: 13px;
  font-weight: 600;
  font-style: normal;
  line-height: normal;
  color: white;
  border-radius: 5px;
  background-color: #a22b2f;
  margin: 4px;
}
.portfolio-content > .title {
  margin-bottom: 16px;
  margin-top: 8px;
}

/* FOR DOTS  */
.portfolio-slider > .slick-dots {
  bottom: -45px;
  transition: all 0.3s;
}

.slick-dots {
  position: absolute;
  bottom: -25px;
  list-style: none;
  display: block;
  text-align: center;
  padding: 0;
  left: 0;

  margin: 0;
  width: 100%;
}
.slick-dots li,
.slick-dots li button {
  height: 20px;
  width: 20px;
  cursor: pointer;
}
.slick-dots li {
  position: relative;
  display: inline-block;
  margin: 0 5px;
  padding: 0;
}
.slick-dots li button {
  border: 0;
  background: transparent;
  display: block;
  outline: none;
  line-height: 0;
  font-size: 0;
  color: transparent;
  padding: 5px;
}
.slick-dots li button {
  height: 15px;
  background-color: #001233;
  border-radius: 20px;
  width: 15px;
  cursor: pointer;
}
.portfolio-content > .content {
  margin-top: 16px;
  margin-bottom: 24px;
}
.portfolio-content > .btn {
  margin-bottom: 20px;
}
.btn.-secondary,
.btn.-secondary:not(:disabled):not(.disabled).active,
.btn.-secondary:not(:disabled):not(.disabled):active {
  background-image: linear-gradient(90deg, #a22b2f, #a22b2f);
}
</style>

