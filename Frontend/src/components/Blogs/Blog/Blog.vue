<template>
  <div>
    <div class="heading-page header-text">
      <section class="page-heading">
        <div class="container">
          <div class="row">
            <div class="col-lg-12">
              <div class="text-content">
                <h4>SCUT Post Details</h4>
                <h2>SINGLE BLOG POST</h2>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>
    <div class="blog-posts grid-system">
      <div class="container">
        <div class="row">
          <div class="col-lg-8">
            <div class="all-blog-posts">
              <div class="row">
                <div class="col-lg-12">
                  <div class="blog-post">
                    <div class="blog-thumb">
                      <img
                        src="https://i.ibb.co/RNBdJsB/blog-thumb-05.jpg"
                        alt=""
                      />
                    </div>
                    <div class="down-content">
                      <span>{{ this.displayBlog.category }}</span>
                      <a href="post-details.html"
                        ><h4>{{ this.displayBlog.title }}</h4></a
                      >
                      <ul class="post-info">
                        <li>
                          <a href="#">{{ this.displayBlog.author }} |</a>
                        </li>
                        <li>
                          <a href="#"
                            >{{ this.displayBlog.blogMonth }}
                            {{ this.displayBlog.blogDay }},
                            {{ this.displayBlog.blogYear }}
                          </a>
                        </li>
                        <br />
                        <li><a href="#">26 Comments</a></li>
                      </ul>
                      <p>
                        {{ this.displayBlog.content }}
                      </p>
                      <div class="post-options">
                        <div class="row">
                          <div class="col-6">
                            <ul class="post-tags">
                              <li><i class="fa fa-tags"></i></li>
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
                <!-- TOTAL COMMENTS  -->
                <div class="col-lg-12">
                  <div class="sidebar-item comments">
                    <div class="sidebar-heading">
                      <h2>COMMENTS</h2>
                    </div>
                    <div class="content">
                      <ul v-for="blogComment in this.displayBlog.blogComments">
                        <li>
                          <div class="author-thumb">
                            <img
                              src="https://i.ibb.co/SdPPMnP/comment-author-01.jpg"
                              alt=""
                            />
                          </div>
                          <div class="right-content">
                            <h4>
                              {{ blogComment.sname }}<span>May 16, 2020</span>
                            </h4>
                            <p>
                              {{ blogComment.comment }}
                            </p>
                          </div>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                <!-- COMMENT INPUT SEC -->
                <!-- <Comments :blogId="this.$route.params.blogId" /> -->
                <div class="col-lg-12">
                  <div class="sidebar-item submit-comment">
                    <div class="sidebar-heading">
                      <h2>Your comment</h2>
                    </div>
                    <div class="content">
                      <form id="comment" action="#" method="post">
                        <div class="row">
                          <div class="col-md-6 col-sm-12">
                            <fieldset>
                              <input
                                name="name"
                                type="text"
                                id="name"
                                placeholder="Your name"
                                required=""
                                v-model="name"
                                style="
                                  background-image: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABHklEQVQ4EaVTO26DQBD1ohQWaS2lg9JybZ+AK7hNwx2oIoVf4UPQ0Lj1FdKktevIpel8AKNUkDcWMxpgSaIEaTVv3sx7uztiTdu2s/98DywOw3Dued4Who/M2aIx5lZV1aEsy0+qiwHELyi+Ytl0PQ69SxAxkWIA4RMRTdNsKE59juMcuZd6xIAFeZ6fGCdJ8kY4y7KAuTRNGd7jyEBXsdOPE3a0QGPsniOnnYMO67LgSQN9T41F2QGrQRRFCwyzoIF2qyBuKKbcOgPXdVeY9rMWgNsjf9ccYesJhk3f5dYT1HX9gR0LLQR30TnjkUEcx2uIuS4RnI+aj6sJR0AM8AaumPaM/rRehyWhXqbFAA9kh3/8/NvHxAYGAsZ/il8IalkCLBfNVAAAAABJRU5ErkJggg==');
                                  background-repeat: no-repeat;
                                  background-attachment: scroll;
                                  background-size: 16px 18px;
                                  background-position: 98% 50%;
                                "
                              />
                            </fieldset>
                          </div>
                          <div class="col-md-6 col-sm-12">
                            <fieldset>
                              <input
                                name="email"
                                type="text"
                                id="email"
                                placeholder="Your email"
                                required=""
                              />
                            </fieldset>
                          </div>
                          <div class="col-md-12 col-sm-12">
                            <fieldset>
                              <input
                                name="subject"
                                type="text"
                                id="subject"
                                placeholder="Subject"
                              />
                            </fieldset>
                          </div>
                          <div class="col-lg-12">
                            <fieldset>
                              <textarea
                                name="message"
                                rows="6"
                                id="message"
                                placeholder="Type your comment"
                                required=""
                                v-model="comment"
                              ></textarea>
                            </fieldset>
                          </div>
                          <div class="col-lg-12">
                            <fieldset>
                              <button
                                id="form-submit"
                                class="main-button"
                                @click.prevent="submitComment"
                              >
                                Submit
                              </button>
                            </fieldset>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- SIDEBAR  -->
          <div class="col-lg-4">
            <div class="sidebar">
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
                <!-- RECENT POSTS  -->
                <div class="col-lg-12">
                  <div class="sidebar-item recent-posts">
                    <div class="sidebar-heading">
                      <h2>Recent Posts</h2>
                    </div>
                    <div class="content">
                      <ul>
                        <li>
                          <a href="post-details.html">
                            <h5>
                              {{ this.displayBlog.title }}
                            </h5>
                            <span
                              >{{ this.displayBlog.blogMonth }}
                              {{ this.displayBlog.blogDay }},
                              {{ this.displayBlog.blogYear }}</span
                            >
                          </a>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>

                <!-- SIDEBAR CATEGORIS  -->
                <div class="col-lg-12">
                  <div class="sidebar-item categories">
                    <div class="sidebar-heading">
                      <h2>Categories</h2>
                    </div>
                    <div class="content">
                      <ul>
                        <li><a href="#">- Nature Lifestyle</a></li>
                        <li><a href="#">- Awesome Layouts</a></li>
                        <li><a href="#">- Creative Ideas</a></li>
                        <li><a href="#">- Eatery</a></li>
                        <li><a href="#">- Sport</a></li>
                        <li><a href="#">- Creative &amp; Unique</a></li>
                      </ul>
                    </div>
                  </div>
                </div>
                <!-- SIDEBAR CLOUDS  -->
                <div class="col-lg-12">
                  <div class="sidebar-item tags">
                    <div class="sidebar-heading">
                      <h2>Tag Clouds</h2>
                    </div>
                    <div class="content">
                      <ul>
                        <li><a href="#">Lifestyle</a></li>
                        <li><a href="#">Creative</a></li>
                        <li><a href="#">Sport</a></li>
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
    </div>
  </div>
</template>



<script>
import { mapActions, mapGetters } from "vuex";

export default {
  name: "Blog",
  data: () => ({
    blogId: "",
    name: "",
    comment: "",
  }),

  mounted() {
    // this.$store.dispatch("Blogs");
  },
  computed: {
    ...mapGetters(["GetBlog"]),

    displayBlog() {
      return this.GetBlog(this.$route.params.blogId);
    },
  },
  methods: {
    ...mapActions(["AddComment"]),
    submitComment() {
      this.$store.dispatch("AddComment", {
        blogId: this.$route.params.blogId,
        name: this.name,
        comment: this.comment,
      });
      this.$router.push("/Blogs");
    },
  },
};
</script>

<style scoped>
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
.page-heading .text-content h2 {
  color: #fff;
  font-size: 36px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.5px;
}

/* BLOG PAGE CENTER CSS */
.blog-posts .blog-post {
  margin-bottom: 30px;
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
a {
  text-decoration: none !important;
  background-color: transparent;
}
.blog-posts .down-content h4 {
  font-size: 20px;
  letter-spacing: 0.25px;
  text-transform: capitalize;
  font-weight: 900;
  color: #20232e;
  margin: 10px 0px 12px 0px;
}

.grid-system .down-content ul.post-info li {
  margin-right: 3px;
  display: inline-block;
}
.blog-posts .down-content ul.post-info li a {
  font-size: 14px;
  color: #aaa;
  font-weight: 400;
  transition: all 0.3s;
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
.blog-posts .down-content ul.post-tags li {
  display: inline-block;
  color: #aaa;
}
.blog-posts .down-content ul.post-tags li a {
  font-size: 16px;
  color: #aaa;
  font-weight: 400;
  transition: all 0.3s;
}
/* SIDEBAR CSS */
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

/* COMMENTS CSS  */

.blog-posts .comments {
  margin-top: 30px;
}
.blog-posts .sidebar-heading h2 {
  font-size: 18px;
  text-transform: uppercase;
  font-weight: 900;
  letter-spacing: 0.5px;
  color: #20232e;
  border-bottom: 1px solid #eee;
  padding-bottom: 15px;
  margin-bottom: 25px;
}
.blog-posts .comments ul li {
  display: inline-block;
  margin-bottom: 20px;
  padding-bottom: 20px;
  border-bottom: 1px solid #eee;
}
.blog-posts .comments ul li .author-thumb {
  display: inline;
  float: left;
}
.blog-posts .comments ul li .author-thumb img {
  max-width: 100px;
  display: inline;
}
.blog-posts .comments ul li .right-content {
  margin-left: 130px;
}
.blog-posts .comments ul li .right-content h4 {
  color: #20232e;
  font-size: 19px;
  font-weight: 900;
  letter-spacing: 0.5px;
}
.blog-posts .comments ul li .right-content h4 span {
  font-size: 14px;
  color: #aaa;
  font-weight: 400;
  letter-spacing: 0.25px;
  margin-left: 20px;
}
/* COMMENT INPUT CSS  */
.blog-posts .submit-comment {
  margin-top: 60px;
}

.blog-posts .submit-comment input {
  width: 100%;
  height: 46px;
  border: 1px solid #eee;
  font-size: 13px;
  text-transform: uppercase;
  font-weight: 500;
  color: #7a7a7a;
  outline: none;
  padding: 0px 15px;
  margin-bottom: 30px;
}
.blog-posts .submit-comment button {
  display: inline-block;
  background-color: #f48840;
  color: #fff;
  font-size: 13px;
  font-weight: 500;
  padding: 12px 20px;
  text-transform: uppercase;
  transition: all 0.3s;
  border: none;
  outline: none;
}
.blog-posts .submit-comment textarea {
  width: 100%;
  height: 46px;
  border: 1px solid #eee;
  font-size: 13px;
  text-transform: uppercase;
  font-weight: 500;
  color: #7a7a7a;
  outline: none;
  padding: 10px 15px;
  margin-bottom: 30px;
  height: 180px;
  max-height: 220px;
  max-width: 100%;
  min-width: 160px;
}
</style>