
<template>
  <section class="about-section section-padding" id="section_2">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-12 text-center">
          <h2 class="mb-lg-5 mb-4">
            About South China University of Technology
          </h2>
        </div>

        <div class="col-lg-5 col-12 me-auto mb-4 mb-lg-0">
          <h3 class="mb-3">SCUT History</h3>

          <p>
            <strong>Since 1984</strong>, The South China University of
            Technology (SCUT) is a leading educational institution in China. It
            is a public research-intensive university directly governed by the
            Chinese Ministry of Education. Located in the city of Guangzhou, a
            thriving metropolis in South China, the university today covers a
            total area of 391 hectares, consisting of three campuses: the Wushan
            Campus, the University Town Campus, and the Guangzhou International
            Campus.
          </p>

          <p>
            In 1995, SCUT was listed in China's "Project 211", a national
            endeavor aiming at strengthening top institutions of higher learning
            as a priority for the 21st century. 
          </p>
        </div>

        <div class="col-lg-3 col-md-6 col-12 mb-4 mb-lg-0 mb-md-0">
          <div class="member-block">
            <div class="member-block-image-wrap">
              <img
                src="./../../../assets/about/img1.jpg"
                class="member-block-image img-fluid"
                alt=""
              />

              <ul class="social-icon">
                <li class="social-icon-item">
                  <a href="#" class="social-icon-link bi-twitter"></a>
                </li>

                <li class="social-icon-item">
                  <a href="#" class="social-icon-link bi-whatsapp"></a>
                </li>
              </ul>
            </div>

            <div class="member-block-info d-flex align-items-center">
              <h4>Michael</h4>

              <p class="ms-auto">Founder</p>
            </div>
          </div>
        </div>

        <div class="col-lg-3 col-md-6 col-12">
          <div class="member-block">
            <div class="member-block-image-wrap">
              <img
                src="./../../../assets/about/img2.jpg"
                class="member-block-image img-fluid"
                alt=""
              />

              <ul class="social-icon">
                <li class="social-icon-item">
                  <a href="#" class="social-icon-link bi-linkedin"></a>
                </li>
                <li class="social-icon-item">
                  <a href="#" class="social-icon-link bi-twitter"></a>
                </li>
              </ul>
            </div>

            <div class="member-block-info d-flex align-items-center">
              <h4>Sandy</h4>

              <p class="ms-auto">Co-Founder</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>


<script>
export default {
  name: "about-events",
};
</script>

<style scoped>
body {
  background-color: #ffffff;
  font-family: "DM Sans", sans-serif;
}

/*---------------------------------------
  TYPOGRAPHY               
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

ul li {
  color: #717275;
  /* font-size: var(--p-font-size); */
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
  /* color: var(--link-hover-color); */
}

b,
strong {
  font-weight: 700;
}
.section-padding {
  padding-top: 50px;
  padding-bottom: 50px;
}
.about-section {
  padding-bottom: 70px;
}

.container {
  --bs-gutter-x: 1.5rem;
  --bs-gutter-y: 0;
  width: 100%;
  padding-right: calc(var(--bs-gutter-x) * 0.5);
  padding-left: calc(var(--bs-gutter-x) * 0.5);
  margin-right: auto;
  margin-left: auto;
}
.row {
  --bs-gutter-x: 1.5rem;
  --bs-gutter-y: 0;
  display: flex;
  flex-wrap: wrap;
  margin-top: calc(-1 * var(--bs-gutter-y));
  margin-right: calc(-0.5 * var(--bs-gutter-x));
  margin-left: calc(-0.5 * var(--bs-gutter-x));
}
.member-block-image-wrap {
  border-radius: var(--border-radius-medium);
  position: relative;
  overflow: hidden;
}

.member-block-image-wrap:hover .member-block-image {
  transform: scale(1.2);
}

.member-block-image-wrap:hover .social-icon {
  opacity: 1;
}

.member-block-image-wrap .social-icon {
  background-color: var(--white-color);
  border-radius: var(--border-radius-large);
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  opacity: 0;
  transition: all 0.5s;
  padding: 15px 20px;
  width: auto;
}

.member-block-image {
  transition: all 0.3s;
}

.member-block-info {
  padding: 10px;
}

.member-block-info h4,
.member-block-info p {
  margin-bottom: 0;
}
.text-center {
  text-align: center !important;
}
</style>


