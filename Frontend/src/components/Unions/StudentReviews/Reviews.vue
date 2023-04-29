<template>
  <section id="testimonial">
 
    <div class="container">
      <div class="row">
        <div class="section-title">
          <h2>STUDENT REVIEWS <small>from around the world</small></h2>
        </div>
        <div class="container1">
          <div  class="col-md-4 col-sm-4">
            <div class="item">
              <div class="tst-image">
                <img
                  src="https://i.ibb.co/kB8wdKh/tst-image1.jpg"
                  class="img-responsive"
                  alt=""
                />
              </div>
              <div class="tst-author">
                <h4>Jackson</h4>
                <span>Shopify Developer</span>
              </div>
              <p>
                You really do help young creative minds to get quality education
                and professional job search assistance. I’d recommend it to
                everyone!
              </p>
              <div class="tst-rating">
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
              </div>
            </div>
          </div>

          <div class="col-md-4 col-sm-4">
            <div class="item">
              <div class="tst-image">
                <img
                  src="https://i.ibb.co/TTqzLWt/tst-image2.jpg"
                  class="img-responsive"
                  alt=""
                />
              </div>
              <div class="tst-author">
                <h4>Camila</h4>
                <span>Marketing Manager</span>
              </div>
              <p>
                Trying something new is exciting! Thanks for the amazing law
                course and the great teacher who was able to make it
                interesting.
              </p>
              <div class="tst-rating">
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
              </div>
            </div>
          </div>

          <div class="col-md-4 col-sm-4">
            <div class="item">
              <div class="tst-image">
                <img
                  src="https://i.ibb.co/t4qrhBL/tst-image4.jpg"
                  class="img-responsive"
                  alt=""
                />
              </div>
              <div class="tst-author">
                <h4>Barbie</h4>
                <span>Art Director</span>
              </div>
              <p>
                Trying something new is exciting! Thanks for the amazing law
                course and the great teacher who was able to make it
                interesting.
              </p>
              <div class="tst-rating">
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
                <font-awesome-icon :icon="['fas', 'star']" />
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
  name: "Reviews",
};
</script>

<style scoped>




p {
  color: #757575;
  font-size: 14px;
  font-weight: normal;
  line-height: 24px;
}
.section-title {
  padding-bottom: 40px;
  margin-top: 20px;
}

.section-title h2 {
  margin: 0;
}
.container {
  margin-bottom:50px;

}
.container1 {
  display: flex;
}
h2 small {
  font-weight: 400;
  line-height: 1;
  color: #777;
  font-size: 65%;
}

.section-title small {
  display: block;
}
#testimonial {

  background: #f9f9f9;
}

#testimonial {
  text-align: center;
}
#testimonial .item {
  background: transparent;
  margin: 20px 0;
  padding: 4em 3em;
  border-radius: 4px;
  text-align: left;
  box-shadow: 0 -0.5rem 1rem rgba(0 0 0 / 0.15);

}

#testimonial .col-md-4 {
  display: block;
  width: 100%;
}

#testimonial .item > p {
  font-size: 16px;
  line-height: 26px;
}

.tst-rating {
  margin-bottom: 15px;
}

.tst-rating .fa {
  color: #3f51b5;
}

.tst-image,
.tst-author {
  display: inline-block;
  vertical-align: middle;
  margin-bottom: 20px;
  text-align: left;
}

.tst-image img {
  border-radius: 50px;
  width: 60px !important;
  height: 60px;
  margin-right: 15px;
}

.tst-author h4 {
  margin: 0;
}

.tst-author span {
  color: #808080;
  font-size: 14px;
}
</style>