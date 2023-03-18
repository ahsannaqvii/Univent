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
