<template>
  <div>
    <Navbar v-if="!$route.meta.hideNavbar"/>
    <router-view></router-view>
  </div>
</template>

<script>
import Navbar from './components/Navbar/Navbar.vue';
export default {
  name: 'App',
  components : {
    Navbar
  }

};
</script>

<style >
* {
  font-family: 'DM sans', sans-serif;
  font-weight: 800;
}

</style>
