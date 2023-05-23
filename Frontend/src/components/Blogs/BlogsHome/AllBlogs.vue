<template>
  <!-- BANNER SECTION  -->
  <div>
    <div class="heading-page header-text">
      <section class="page-heading">
        <div class="container">
          <div class="row">
            <div class="col-lg-12">
              <div class="text-content">
                <h4>SCUT Recent Posts</h4>
                <h2>Our Recent Blog Entries</h2>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>

    <section class="blog-posts grid-system">
      <div class="container">
        <div class="row">
          <div class="col-lg-8">
            <div class="all-blog-posts">
              <div class="row">
                <div class="col-lg-6" v-for="(blog, index) in this.GetBlogs">
                  <div class="blog-post">
                    <div class="blog-thumb">
                      <img
                        src="https://i.ibb.co/wC1gVMb/blog-thumb-01.jpg"
                        alt=""
                      />
                    </div>
                    <div class="down-content">
                      <span>{{ blog.category }}</span>

                      <a :href="'/Blog/' + blog.id"
                        ><h4>{{ blog.title }}</h4></a
                      >
                      <ul class="post-info">
                        <li>
                          <router-link :to="'/Blog/' + blog.id">
                            {{ blog.author }} |
                          </router-link>
                          <!-- <a :href="'/Blog/' + blog.id">{{ blog.author }} |</a> -->
                        </li>
                        <li>
                          <a href="#"
                            >{{ blog.blogDay }} {{ blog.blogMonth }},
                            {{ blog.blogYear }} |</a
                          >
                        </li>
                        <br />
                        <li><a href="#">26 Comments</a></li>
                      </ul>
                      <p>
                        {{ blog.content }}
                      </p>
                      <div class="post-options">
                        <div class="row">
                          <div class="col-lg-12">
                            <ul class="post-tags">
                              <li>
                                <font-awesome-icon
                                  :icon="['fas', 'box-archive']"
                                  style="color: orange; margin-right: 10px"
                                />
                              </li>
                              <li>
                                <a href="/"
                                  >South China University of Technology</a
                                >
                              </li>
                            </ul>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- SIDEBAR  -->
          <div class="col-lg-4">
            <div class="sidebar">
              <a href="/AddBlog"  class="sidebar__button">ADD BLOG</a>

              <div class="row">
                <div class="col-lg-12">
                  <div class="sidebar-item search">
                    <form id="search_form" name="gs" method="GET" action="#">
                      <input
                        type="text"
                        name="q"
                        class="searchText"
                        placeholder="type to search..."
                        autocomplete="on"
                      />
                    </form>
                  </div>
                </div>
                <div class="col-lg-12">
                  <div class="sidebar-item recent-posts">
                    <div class="sidebar-heading">
                      <h2>Recent Posts</h2>
                    </div>
                    <div class="content">
                      <ul v-for="item in this.GetBlogs">
                        <li>
                          <a :href="'/Blog/' + item.id">
                            <h5>
                              {{ item.title }}
                            </h5>
                            <span
                              >{{ item.blogMonth }} {{ item.blogDay }},
                              {{ item.blogYear }}</span
                            >
                          </a>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                <!-- SIDEBAR CATEGORIES  -->
                <div class="col-lg-12">
                  <div class="sidebar-item categories">
                    <div class="sidebar-heading">
                      <h2>Categories</h2>
                    </div>
                    <div class="content">
                      <ul v-for="item in this.GetBlogs">
                        <li>
                          <router-link :to="'/Blog/' + item.id"
                            >- {{ item.category }}</router-link
                          >
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                <!-- SIDEBAR TAGS  -->
                <div class="col-lg-12">
                  <div class="sidebar-item tags">
                    <div class="sidebar-heading">
                      <h2>Tag Clouds</h2>
                    </div>
                    <div class="content">
                      <ul>
                        <li><a href="#">Lifestyle</a></li>
                        <li><a href="#">Creative</a></li>
                        <li><a href="#">HTML5</a></li>
                        <li><a href="#">Inspiration</a></li>
                        <li><a href="#">Motivation</a></li>
                        <li><a href="#">PSD</a></li>
                        <li><a href="#">Responsive</a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>


<script>
import { mapGetters } from "vuex";

export default {
  name: "AllBlogs",

  mounted() {
    this.$store.dispatch("Blogs");
  },
  computed: {
    ...mapGetters(["GetBlogs"]),
  },
};
</script>
<style scoped>
.sidebar__button{
  border-radius:10px;
  border:1px solid #fff;
  padding:10px;
  color:#fff;
  font-weight:500;
  background-color: #20232e;
  cursor:pointer;
}
.heading-page {
  padding-top: 110px;
}
.page-heading {
  width: 100%;

  padding: 120px 0px;
  text-align: left;
  background-position: center center;
  background-repeat: no-repeat;
  background-size: cover;
  background-image: url(https://i.ibb.co/dBbR67r/heading-bg.jpg);
}
.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}
.row {
  display: flex;
  flex-wrap: wrap;
  margin-right: -15px;
  margin-left: -15px;
}
.page-heading .text-content h4 {
  color: #f48840;
  font-size: 18px;
  text-transform: uppercase;
  font-weight: 900;
  letter-spacing: 0.5px;
  margin-bottom: 15px;
}
.blog-posts .down-content h4 {
  font-size: 24px;
  text-transform: capitalize;
  letter-spacing: 0.5px;
  font-weight: 900;
  color: #20232e;
  margin: 10px 0px 12px 0px;
}
.blog-posts .down-content h4 {
  font-size: 20px;
  letter-spacing: 0.25px;
}
.blog-posts .down-content ul.post-info li a {
  font-size: 14px;
  color: #aaa;
  font-weight: 400;
  transition: all 0.3s;
}
.page-heading .text-content h2 {
  color: #fff;
  font-size: 36px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.5px;
}

/* ALL BLOGS POSTS CSS  */

.blog-posts {
  margin-top: 100px;
}
.blog-posts .blog-post {
  margin-bottom: 30px;
  height: auto;
}
.blog-posts .blog-thumb img {
  width: 100%;
  overflow: hidden;
}
.blog-posts .down-content {
  padding: 40px;
  border-right: 1px solid #eee;
  border-left: 1px solid #eee;
  border-bottom: 1px solid #eee;
}
.blog-posts .down-content span {
  font-size: 18px;
  text-transform: uppercase;
  letter-spacing: 0.5px;
  font-weight: 900;
  color: #f48840;
}
ul {
  padding: 0;
  margin: 0;
  list-style: none;
}

.blog-posts .down-content ul.post-info li {
  display: inline-block;
  margin-right: 8px;
}

/* MAY CHANGE THIS  */
.grid-system .down-content ul.post-info li {
  margin-right: 3px;
}
.blog-posts .down-content p {
  padding: 25px 0px;
  margin: 25px 0px;
  border-top: 1px solid #eee;
  border-bottom: 1px solid #eee;
}
p {
  margin-bottom: 0px;
  font-size: 15px;
  font-weight: 400;
  color: #7a7a7a;
  line-height: 30px;
}
.blog-posts .down-content ul.post-tags li,
.blog-posts .down-content ul.post-share li {
  color: #aaa;
}
.blog-posts .down-content ul.post-tags li,
.blog-posts .down-content ul.post-share li {
  display: inline-block;
}
.blog-posts .down-content ul.post-tags li a,
.blog-posts .down-content ul.post-share li a {
  font-size: 18px;
  color: #aaa;
  font-weight: 400;
  transition: all 0.3s;
}

/* SIDEBAR CSS  */
.sidebar {
  margin-left: 30px;
}
.sidebar .search {
  margin-top: 0px;
}

.sidebar .search input {
  width: 100%;
  height: 50px;
  border: 1px solid #eee;
  font-size: 13px;
  text-transform: uppercase;
  font-weight: 500;
  color: #7a7a7a;
  outline: none;
  padding: 0px 15px;
}
.sidebar .sidebar-item {
  margin-top: 50px;
}
.sidebar .sidebar-heading h2 {
  font-size: 18px;
  text-transform: uppercase;
  font-weight: 900;
  letter-spacing: 0.5px;
  color: #20232e;
  border-bottom: 1px solid #eee;
  padding-bottom: 15px;
  margin-bottom: 25px;
}
.sidebar .recent-posts ul li {
  margin-bottom: 15px;
  padding-bottom: 15px;
  border-bottom: 1px solid #eee;
}
a {
  text-decoration: none !important;
  background-color: transparent;
}
.sidebar .recent-posts ul li h5 {
  font-size: 19px;
  font-weight: 900;
  color: #20232e;
  line-height: 30px;
  transition: all 0.3s;
}
.sidebar .recent-posts ul li span {
  display: block;
  font-size: 14px;
  color: #aaa;
  margin-top: 8px;
}
/* SIDEBAR CATEGORIES  */
.sidebar .sidebar-item {
  margin-top: 50px;
}
.sidebar .categories ul li {
  margin-bottom: 15px;
}
.sidebar .categories ul li a {
  font-size: 16px;
  font-weight: 700;
  color: #20232e;
  transition: all 0.3s;
}

/* SIDEBAR TAGS  */
.sidebar .tags ul li {
  margin-bottom: 10px;
}
.tags .content ul li {
  display: block;
}
.sidebar .tags ul li {
  margin-right: 6px;
  display: inline-block;
}
.sidebar .tags ul li a {
  font-size: 15px;
  font-weight: 500;
  color: #aaa;
  display: inline-block;
  border: 1px solid #eee;
  padding: 10px 18px;
  transition: all 0.3s;
}
</style>