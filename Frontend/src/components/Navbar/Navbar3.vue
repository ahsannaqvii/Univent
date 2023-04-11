<!-- THIS IS SMU NAVBAR  -->

<template>
  <header role="site-header" id="header" class="site-header">
    <div class="container-fluid">
      <div id="header-two" class="header-shadow header-two obg-site row">
        <div class="navbar-header-container container">
          <div class="navbar-header branding d-flex align-items-center">
            <div class="site-branding mr-auto">
              <div class="ob-smu-logo">
                <a
                  target="_blank"
                  href="//www.smu.edu.sg"
                  rel="home"
                  title="Singapore Management University (SMU)"
                  name="top"
                  ><img
                    class="ob-smulogo ob-smulogo-d d-none d-lg-inline-block"
                    alt="Singapore Management University (SMU)"
                    src="../../assets/navbar/logo-d-smu.svg"
                    width="153"
                    height="60" /><img
                    class="ob-smulogo ob-smulogo-t d-none d-md-inline-block d-lg-none"
                    alt="Singapore Management University (SMU)"
                    src="../../assets/navbar/logo-t-smu.svg"
                    width="113"
                    height="60" /><img
                    class="ob-smulogo ob-smulogo-m d-inline-block d-md-none"
                    alt="Singapore Management University (SMU)"
                    src="../../assets/navbar/logo-m-smu.svg"
                    width="37"
                    height="48"
                /></a>
              </div>
              <div class="ob-oblique">
                <img src="/themes/smubase_4g/svg/oblique.svg" />
              </div>
            </div>

            <div
              id="branding-subheader"
              class="branding-subheader d-none d-lg-inline-block ml-auto"
            >
              <div class="mr-lg-3 mr-1 block block--basic block--topnavi">
                <div>
                  <form
                    action="/search/node"
                    class="search-form search-form-hidden"
                  >
                    <input
                      name="keys"
                      type="text"
                      id="search"
                      class="search-field mr-1 search-field-hidden"
                      placeholder="Search..."
                    />
                    <i class="fas fa-times search-close d-none"></i>
                  </form>
                  <a class="cta cta-silver mr-1 search-btn d-flex"
                    ><i class="fas fa-search"></i>
                  </a>
                  </div>
                </div>
              </div>

              <div class="d-lg-block d-none block block--mainnavigation-2">
                <nav
                  class="tbm tbm-main tbm-arrows"
                  id="tbm-main"
                  data-breakpoint="980"
                  aria-label="main navigation"
                >
                  <button class="tbm-button" type="button">
                    <span class="tbm-button-container">
                      <span></span>
                      <span></span>
                      <span></span>
                      <span></span>
                    </span>
                  </button>
                  <div class="tbm-collapse always-show">
                    <ul class="tbm-nav level-0 items-7" role="list">
                      <li class="tbm-item level-1" aria-level="1">
                        <div class="tbm-link-container">
                          <a href="/programmes" class="tbm-link level-1">
                            Programmes
                          </a>
                        </div>
                      </li>

                      <li class="tbm-item level-1" aria-level="1">
                        <div class="tbm-link-container">
                          <a
                            href="/schools-institutes"
                            class="tbm-link level-1"
                          >
                            Schools &amp; Institutes
                          </a>
                        </div>
                      </li>

                      <li class="tbm-item level-1" aria-level="1">
                        <div class="tbm-link-container">
                          <a href="/research" class="tbm-link level-1">
                            Research
                          </a>
                        </div>
                      </li>

                      <li
                        class="tbm-item level-1 dropdown-column tbm-item--has-dropdown active active-trail"
                        aria-level="1"
                      >
                        <div class="tbm-link-container">
                          <span
                            class="tbm-link level-1 no-link tbm-toggle active-trail"
                            tabindex="0"
                            aria-expanded="false"
                          >
                            Campus Life
                          </span>
                        </div>
                      </li>

                      <li class="tbm-item level-1" aria-level="1">
                        <div class="tbm-link-container">
                          <a href="/partnerships" class="tbm-link level-1">
                            Partnerships
                          </a>
                        </div>
                      </li>

                      <li
                        class="tbm-item level-1 tbm-left tbm-item--has-dropdown open"
                        aria-level="1"
                      >
                        <div class="tbm-link-container">
                          <span
                            class="tbm-link level-1 no-link tbm-toggle"
                            tabindex="0"
                            aria-expanded="true"
                          >
                            About
                          </span>
                        </div>
                      </li>

                      <li
                        class="tbm-item level-1 tbm-left tbm-item--has-dropdown"
                        aria-level="1"
                      >
                        <div class="tbm-link-container">
                          <span
                            class="tbm-link level-1 no-link tbm-toggle"
                            tabindex="0"
                            aria-expanded="false"
                          >
                            Connect
                          </span>
                        </div>
                      </li>
                    </ul>
                  </div>
                </nav>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: "Navbar",
};
</script>

<style scoped>
#header {
  position: relative;
  z-index: 99;
}
.container-fluid {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}

.not-front #header #header-two.obg-site {
  background-color: #151c55;
}
#header #header-two {
  -webkit-box-shadow: 0 5px 10px -4px rgba(0, 0, 0, 0.5);
  box-shadow: 0 5px 10px -4px rgba(0, 0, 0, 0.5);
  position: relative;
}

#header #header-two .navbar-header-container {
  position: relative;
  height: auto;
}

.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}
.align-items-center {
  -webkit-box-align: center !important;
  align-items: center !important;
}
.d-flex {
  display: -webkit-box !important;
  display: flex !important;
}
#header #header-two .navbar-header-container .site-branding {
  white-space: nowrap;
  position: relative;
}

.mr-auto,
.mx-auto {
  margin-right: auto !important;
}
#header #header-two .navbar-header-container .ob-smu-logo,
#header #header-two .navbar-header-container .ob-bu-logo,
#header #header-two .navbar-header-container .ob-oblique {
  display: inline-block;
}
#header #header-two .navbar-header-container .ob-smu-logo,
#header #header-two .navbar-header-container .ob-bu-logo {
  background: #fff;
  padding-right: 15px;
}

#header #header-two .navbar-header-container .ob-smu-logo a,
#header #header-two .navbar-header-container .ob-bu-logo a {
  padding: 15px 0;
  display: inline-block;
}

a {
  color: #8a704c;
  font-weight: 600;
}
#header .ob-smulogo {
  height: 77px;
  width: auto;
}
img {
  vertical-align: middle;
  border-style: none;
}
img {
  overflow-clip-margin: content-box;
  overflow: clip;
}
#header #header-two .navbar-header-container .ob-oblique {
  display: inline-block;
}

#header #header-two .ob-oblique {
  margin-left: -1px;
}
#header #header-two .navbar-header-container .ob-oblique img {
  width: auto;
  height: 107px !important;
}

element.style {
}
#header #header-two .navbar-header-container .ob-oblique img {
  width: auto;
  height: 107px !important;
}
/* //remove later  */
#header #header-two .navbar-header-container .ob-oblique img {
  width: 30px;
  height: 80px;
}
#header #header-two .branding-subheader {
  max-width: none;
}

#header #branding-subheader {
  transition: all 0.3s ease-in-out;
}
div#branding-subheader {
  display: -webkit-box !important;
  display: -ms-flexbox !important;
  display: flex !important;
  -ms-flex-wrap: wrap;
  flex-wrap: wrap;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  -webkit-box-align: end;
  -ms-flex-align: end;
  align-items: flex-end;
  height: 100%;
}

#header .block--topnavi {
    opacity: 1;
    -webkit-transition: all .3s ease-in-out;
    transition: all .3s ease-in-out;
    top: 7px;
    position: relative;
}

/* SEARCH ICON  */
.search-form-hidden, .search-btn-hidden {
    display: none !important;
}
.search-form {
    position: relative;
}
form {
    display: block;
    margin-top: 0em;
}

.search-form .search-field.search-field-hidden {
    width: 0;
    opacity: 0;
}
.search-form .search-field {
    border-radius: 5px;
    padding: 0.36rem 1.75rem 0.36rem 0.75rem !important;
    border: 0;
    height: 37px;
    width: 200px;
    opacity: 1;
    -webkit-transition: all .3s ease-in-out;
    transition: all .3s ease-in-out;
}
button, input {
    overflow: visible;
}
input, button, select, optgroup, textarea {
    margin: 0;
    font-family: inherit;
    font-size: inherit;
    line-height: inherit;
}
.row {
    display: -webkit-box;
    display: flex;
    flex-wrap: wrap;
    margin-right: -15px;
    margin-left: -15px;
}
.search-form .search-close {
    position: absolute;
    z-index: 9;
    color: #000;
    right: 1rem;
    top: 50%;
    -webkit-transform: translatey(-50%);
    transform: translatey(-50%);
    cursor: pointer;
}
.d-none {
    display: none !important;
}
.fa, .fas {
    font-weight: 900;
}
.tbm {
    background-color: transparent;
    margin-top: 10px;
    margin-right: 1rem;
}

.tbm {
    background-color: #f5f5f5;
}
.tbm {
    position: relative;
}
.tbm .tbm-nav, .tbm .dropdown-menu {
    float: none !important;
}
.tbm .tbm-nav>li {
    padding: 0 !important;
    border: 0;
}

.tbm-item.level-1 {
    border-right: 1px solid rgba(0,0,0,0.2);
}
.tbm-item.level-1 {
    position: relative;
    z-index: 1;
}

li, table tfoot tr td, table tbody tr td, table thead tr th {
    font-size: 1rem;
    font-family: "Open Sans",sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji";
    color: #000;
}
</style>