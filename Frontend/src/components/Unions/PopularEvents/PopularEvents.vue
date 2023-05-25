<template>
  <body>
    <div class="section-title">
      <h2>POPULAR EVENTS <small>from Student Union</small></h2>
    </div>
    <div class="container">
      <div class="item-container" v-for="event in this.GetUnionEvents">
        <div class="img-container">
          <img :src="event.eventImage" alt="Event image" />
        </div>

        <div class="body-container">
          <div class="overlay"></div>

          <div class="event-info">
            <p class="title">{{ event.name }}</p>
            <div class="separator"></div>
            <p class="info">{{ event.eventType }}</p>
            <p class="price">Free</p>

            <div class="additional-info">
              <p class="info">
                <i class="fas fa-map-marker-alt"></i>
                {{ event.venue }}
              </p>
              <p class="info">
                <i class="far fa-calendar-alt"></i>
                {{ event.eventDate }}, {{ event.eventTime }}
              </p>

              <p class="info description">
                {{ event.description }} <span>more...</span>
              </p>
            </div>
          </div>

          <a class="action" :href="'/event-registration/' + event.id"
            >Register</a
          >
        </div>
      </div>
    </div>
  </body>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "union-event",
  computed: {
    ...mapGetters(["GetUnionEvents"]),
  },
};
</script>

<style scoped>
body {
  font-family: "DM Sans", sans-serif;
}

.section-title {
  padding-bottom: 40px;
  margin-top: 60px;
  display: flex;
  font-weight: 800;
  justify-content: center;
}
p {
  color: #757575;
  font-size: 14px;
  font-weight: normal;
  line-height: 24px;
}

.section-title small {
  text-align: center;
  display: block;
  color: grey;
  font-size: 20px;
}
h2 small {
  font-weight: 400;
  line-height: 1;
  margin: auto;

  color: #777;
  font-size: 65%;
}
.container {
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.item-container {
  position: relative;
  margin: 24px;
  width: 500px;
  height: 570px;
  overflow: hidden;
  background-color: #fff;
  box-shadow: 0 0 30px 5px rgba(0, 0, 0, 0.15);
  cursor: pointer;
}

.img-container,
.body-container {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}

.img-container img {
  width: 100%;
  height: 100%;
}

.body-container {
  position: relative;
}

.overlay {
  position: relative;
  width: 100%;
  height: 400px;
  background-color: rgba(24, 83, 122, 0.6);
  opacity: 0;
  transition: height linear 0.4s, opacity linear 0.2s;
}

.item-container:hover .overlay {
  opacity: 1;
  height: 150px;
}

.event-info {
  background-color: #fff;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 8px;
}

.title,
.price {
  color: black;
  font-size: 1.5em;
  font-weight: bold;
  letter-spacing: 1px;
  margin: 12px;
  text-align: center;
}

.info {
  letter-spacing: 0.5px;
  margin-bottom: 6px;
}

.separator {
  width: 20%;
  height: 6px;
  background-color: orange;
  margin-bottom: 16px;
}

.additional-info {
  border-top: 1px solid #bbb;
  margin-top: 12px;
  padding: 28px;
  padding-bottom: 0;
}

.additional-info .info {
  font-size: 0.9em;
  margin-bottom: 20px;
  text-align: center;
}

.info i {
  color: #18537a;
  font-size: 1.1em;
  margin-right: 4px;
}

.info span {
  color: #18537a;
  font-weight: bolder;
}

.action {
  color: #fff;
  border: 3px solid #fff;
  background-color: transparent;
  position: absolute;
  top: -100px;
  left: 50%;
  transform: translateX(-50%);
  width: 60%;
  outline: none;
  cursor: pointer;
  padding: 12px;
  text-transform: uppercase;
  font-size: 1.3em;
  font-weight: bold;
  letter-spacing: 2px;
  transition: background-color 0.4s, top 0.4s;
}

.item-container:hover .action {
  top: 50px;
}

.action:hover {
  background-color: rgba(255, 255, 255, 0.2);
}
</style>