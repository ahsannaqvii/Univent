<template>
  <div>
    <v-carousel :show-arrows="false" height="900px">
      <v-carousel-item
        v-for="(item, i) in items"
        :key="i"
        :src="item.src"
        reverse-transition="fade-transition"
        transition="fade-transition"
      ></v-carousel-item>
    </v-carousel>

    <AboutUnion />
    <UnionTeam />
    <PopularEvents />
    <Reviews />
  </div>
</template>


<script>
import AboutUnion from "../AboutUnion/AboutUnion.vue";
import PopularEvents from "../PopularEvents/PopularEvents.vue";
import UnionTeam from "../UnionTeam/UnionTeam.vue";
import Reviews from "../StudentReviews/Reviews.vue";
export default {
  name: "Union",
  components: {
    AboutUnion,
    UnionTeam,
    PopularEvents,
    Reviews,
  },
  data() {
    return {
      items: [
        {
          src: "https://i.ibb.co/j6phDRw/photo-1522202176988-66273c2fd55f-crop-faces-edges-cs-tinysrgb-fit-crop-fm-jpg-ixid-Mnwx-Mj-A3f-DB8-M.jpg",
        },
        {
          src: "https://i.ibb.co/hV6m48X/photo-1606761568499-6d2451b23c66-crop-faces-edges-cs-tinysrgb-fit-crop-fm-jpg-ixid-Mnwx-Mj-A3f-DB8-M.jpg",
        },

        {
          src: "https://i.ibb.co/mhBx0Cc/photo-1523050854058-8df90110c9f1-crop-faces-edges-cs-tinysrgb-fit-crop-fm-jpg-ixid-Mnwx-Mj-A3f-DB8-M.jpg",
        },
      ],
    };
  },
};
</script>



