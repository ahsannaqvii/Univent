<template>
  <section class="about-section section-padding" id="section_2">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-12 text-center">
          <h2 class="mb-lg-5 mb-4">ANNOUCEMENT</h2>
        </div>

        
        <div class="col-lg-5 col-12 me-auto mb-4 mb-lg-0">
          <h3 class="mb-3">International Student Union</h3>

          <p><strong>Since 1984</strong>, {{ this.GetUnionAnnoucement }}</p>

          <p>
            Tiya Golf Club is 100% free CSS template provided by TemplateMo
            website. Please tell your friends about our website. Thank you for
            visiting.
          </p>
        </div>
        <div class="col-lg-3 col-md-6 col-12 mb-4 mb-lg-0 mb-md-0">
          <div class="member-block">
            <div class="member-block-image-wrap">
              <img
                :src="this.GetUnionImage"
                class="member-block-image img-fluid"
                alt=""
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>


<script>
import { mapGetters } from "vuex";
export default {
  name: "AboutUnion",
  computed: {
    ...mapGetters(["GetUnionAnnoucement", "GetUnionImage"]),
  },
};
</script>
<style scoped>
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
  background-color: white;
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