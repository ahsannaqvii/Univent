<template>
  <header>
    <div class="container">
      <div class="row">
        <div class="col-md-4 col-lg-2">
          <div class="logo">
            <a href="index.html">
              <img src="./../../assets/navbar/SOC.jpeg" alt=""  />
            </a>
          </div>
        </div>
        <div class="col-md-4 col-lg-8">
          <nav>
            <ul>
              <li>
                <a class="active" href="index.html">Home</a>

                <ul>
                  <li><a href="index.html">Home 1</a></li>
                  <li><a href="home-2.html">Home 2</a></li>
                  <li><a href="home-3.html">Home 3</a></li>
                </ul>
              </li>
              <li><a href="about.html">About</a></li>
              <li><a href="academics.html">Academics</a></li>
              <li><a href="discover.html">Discover</a></li>
              <li><a href="history.html">History</a></li>
              <li>
                <a href="#">Pages</a>
                <ul>
                  <li><a href="apply.html">Apply</a></li>
                </ul>
              </li>
              <li>
                <a href="news.html">News</a>
                <ul>
                  <li><a href="news.html">News</a></li>
                  <li><a href="news-single.html">News Single</a></li>
                </ul>
              </li>
            </ul>
          </nav>
          <div class="mobile-menu">
            <i class="ti-menu"></i>
            <i class="ti-close"></i>
          </div>
        </div>
        <div class="col-md-4 col-lg-2">
          <div class="social-icon">
            <ul>
              <li>
                <a href="#"><i class="ti-instagram"></i></a>
                <font-awesome-icon class="icon" :icon="['fab', 'instagram']" />
              </li>
              <li>
                <a href="#"
                  ><font-awesome-icon class="icon" :icon="['fab', 'facebook']"
                /></a>
              </li>
              <li>
                <a href="#"
                  ><font-awesome-icon class="icon" :icon="['fab', 'google']"
                /></a>
              </li>
              <li>
                <a href="#"
                  ><font-awesome-icon class="icon" :icon="['fab', 'twitter']"
                /></a>
              </li>
              <li class="search-icon">
                <!-- <a href="#"
                  ><font-awesome-icon class="icon-search" :icon="['fas', 'search']"
                /></a> -->
              </li>
            </ul>
          </div>
          <div class="search">
            <input type="search" placeholder="Search..." />
            <i class="ti-close"></i>
          </div>
        </div>
      </div>
    </div>
  </header>
</template>

<style scoped>
.icon {
  padding-left: 20px;
}
.icon-search {
  display: flex;
}
header {
  /* background-color: rgba(255, 255, 255, 0.45); */
  background-color:white;
  position: absolute;
  width: 100%;
  z-index: 999;
  display: block;
  height: 100px;
}

/* a {
  text-decoration: none;
} */
a:hover {
  color:#d74d52;
  text-decoration: underline;
}

/* a,
a:after,
a:before {
  color: #192836;
  transition: all 0.4s ease-in-out;
}

a:visited,
a:focus,
a:active {
  text-decoration: none;
  outline: none;
} */
a {
  color: black;
  background-color: transparent;
}
img {
  max-width: 100%;
  height: 4.4rem;
}

img {
  vertical-align: middle;
  border-style: none;
}
nav {
  text-align: center;
}
ul {
  margin: 0;
  padding: 0;
  display: block;
  list-style-type: disc;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  padding-inline-start: 40px;
}
nav li {
  display: inline-block;
  position: relative;
}
ul li {
  list-style: none;
}
ul li a {
  padding: 10px 0;
}

/* -------------------------------------  */

.nav a::after {
  content: "";
  position: absolute;
  width: 100%;
  transform: scaleX(0);
  height: 2px;
  bottom: 0;
  left: 0;
  background-color: #0087ca;
  transform-origin: bottom right;
  transition: transform 0.25s ease-out;
}

.nav a:hover::after {
  transform: scaleX(1);
  transform-origin: bottom left;
}
.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
  /* margin-right:0; */
}
.row {
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  margin-right: -15px;
  margin-left: -15px;
}
.logo {
  position: absolute;
  z-index: 99;
}
.home-3 .gallery-carousel .item:after,
.home-3 .search {
  background: #d74d52cf;
}
.search {
  position: fixed;
  width: 100%;
  height: 100%;
  background: #d74d52f2;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  display: none;
  z-index: 99;
}
.home-3 .search input {
  border-color: #fff;
}
.search input {
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  border: 0;
  width: 70%;
  height: 10%;
  padding: 0 20px;
  font-size: 20px;
  letter-spacing: 1px;
  border: 1px solid #fff;
  background: transparent;
  color: #fff;
}
[type="search"] {
  outline-offset: -2px;
  -webkit-appearance: none;
}
button,
input {
  overflow: visible;
}
.social-icon li {
  display: inline-block;
}
.home-3 nav .active,
.home-3 nav .active:before,
.home-3 .our-value .item a:hover {
  color: #d74d52;
}
nav .active,
nav .active:before {
  color: #d74d52;
}
nav a {
  font-weight: 700;
  text-transform: capitalize;
  display: inline-block;
  position: relative;
  margin-right: 35px;
  padding: 25px 0;
  font-size: 14px;
}
/* nav a:after {
  background: #d74d52;
} */
nav ul li > ul {
  position: absolute;
  top: 150%;
  left: 0;
  opacity: 0;
  visibility: hidden;
  text-align: left;
  min-width: 138px;
  padding: 10px 0;
  background: #ffffffd9;
  transition: all 0.4s ease-in-out;
}
</style>