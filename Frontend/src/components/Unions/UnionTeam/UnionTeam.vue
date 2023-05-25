<template>
  <section id="team">
    <div class="container">
      <div class="row">
        <div class="col-md-12 col-sm-12">
          <div class="section-title">
            <h2>
              International Student Union
              <small>Meet the qualified hierarchy of ISU</small>
            </h2>
          </div>
        </div>

        <div class="col-md-3 col-sm-6">
          <div class="team-thumb">
            <div class="team-image">
              <img
                src="./../../../assets/union-team/author-image1.jpg"
                class="img-responsive"
                alt=""
              />
            </div>
            <div class="team-info">
              <h3>{{ this.GetUnionData.president }}</h3>
              <span>President</span>
            </div>
            <ul class="social-icon">
              <li>
                <a> <font-awesome-icon :icon="['fab', 'behance']" /></a>
                <a> <font-awesome-icon :icon="['fab', 'twitter']" /></a>
                <a><font-awesome-icon :icon="['fas', 'envelope']" /></a>
              </li>
            </ul>
          </div>
        </div>

        <div class="col-md-3 col-sm-6">
          <div class="team-thumb">
            <div class="team-image">
              <img
                src="./../../../assets/union-team/author-image2.jpg"
                class="img-responsive"
                alt=""
              />
            </div>
            <div class="team-info">
              <h3>{{ this.GetUnionData.vicePresident }}</h3>
              <span>Vice President</span>
            </div>
            <ul class="social-icon">
              <li>
                <a> <font-awesome-icon :icon="['fab', 'behance']" /></a>
                <a> <font-awesome-icon :icon="['fab', 'twitter']" /></a>
                <a><font-awesome-icon :icon="['fas', 'envelope']" /></a>
              </li>
            </ul>
          </div>
        </div>

        <div class="col-md-3 col-sm-6">
          <div class="team-thumb">
            <div class="team-image">
              <img
                src="./../../../assets/union-team/author-image3.jpg"
                class="img-responsive"
                alt=""
              />
            </div>
            <div class="team-info">
              <h3>{{ this.GetUnionData.secretary }}</h3>
              <span>Secretary</span>
            </div>
            <ul class="social-icon">
              <!-- <li><a href="#" class="fa fa-twitter"></a></li> -->
              <li>
                <a> <font-awesome-icon :icon="['fab', 'behance']" /></a>
                <a> <font-awesome-icon :icon="['fab', 'twitter']" /></a>
                <a><font-awesome-icon :icon="['fab', 'instagram']" /></a>
              </li>
            </ul>
          </div>
        </div>

        <div class="col-md-3 col-sm-6">
          <div class="team-thumb">
            <div class="team-image">
              <img
                src="./../../../assets/union-team/author-image4.jpg"
                class="img-responsive"
                alt=""
              />
            </div>
            <div class="team-info">
              <h3>{{ this.GetUnionData.headITDept }}</h3>
              <span>Head IT Department</span>
            </div>
            <ul class="social-icon">
              <li>
                <a> <font-awesome-icon :icon="['fab', 'behance']" /></a>
                <a> <font-awesome-icon :icon="['fab', 'twitter']" /></a>
                <a><font-awesome-icon :icon="['fab', 'instagram']" /></a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import { mapGetters } from "vuex";
export default {
  name: "union-team",
  computed: {
    ...mapGetters(["GetUnionData"]),
  },
};
</script>

<style scoped>
body {
  background: #ffffff;
  font-family: "DM sans", sans-serif;
  overflow-x: hidden;
  padding-top: 70px;
}
h1,
h2,
h3,
h4,
h5,
h6 {
  font-family: "DM sans", sans-serif;
  line-height: inherit;
}

a {
  color: #252525;
  -webkit-transition: 0.5s;
  transition: 0.5s;
  text-decoration: none !important;
}
h1 {
  color: #252525;
  font-size: 3em;
  line-height: normal;
}

h2 {
  color: #353535;
  font-size: 2em;
  padding-bottom: 10px;
}

h3 {
  font-size: 1.5em;
  margin-bottom: 0;
}

h3,
h3 a {
  color: #454545;
}

p {
  color: #757575;
  font-size: 14px;
  font-weight: normal;
  line-height: 24px;
}
h2 small {
  font-weight: 400;
  line-height: 1;
  color: #777;
  font-size: 65%;
}
#team {
  background: #f9f9f9;
  text-align: center;
}

.row {
  margin-bottom: 80px;
}
.team-thumb {
  background: #ffffff;
  position: relative;
  overflow: hidden;
  text-align: left;
}

.team-info {
  padding: 20px 30px;
}

.team-image img {
  width: 100%;
}

.team-thumb .social-icon {
  border-top: 1px solid #f0f0f0;
  padding: 20px 20px 0 20px;
}

.team-thumb .social-icon li a {
  background: #ffffff;
  color: #252020;
}

.team-info h3 {
  margin: 0;
}
.section-title {
  padding-bottom: 40px;
}

.section-title h2 {
  margin: 0;
}
.social-icon li a {
  padding-right: 30px;
}
.social-icon li a:hover,
.social-icon li a:active,
.social-icon li a:focus {
  color: orange;
  outline: none;
}

.section-title small {
  display: block;
  color: grey;
  font-size: 20px;
}
</style>