<template>
  <header>
    <span class="image-clickable">
      <a href="index.html">
        <img src="./../../assets/navbar/SOC.jpeg" alt="main-logo" class="logo"  />
      </a>
    </span>
    <nav>
      <ul class="nav-links">
        <li><a href="#">Events</a></li>
        <li><a href="#">Unions</a></li>
        <li><a href="#">About</a></li>
      </ul>
    </nav>
    <a href="#"><button>Sign Out</button></a>
  </header>
</template>
<style scoped>
header {
  display: flex;
  justify-content: flex-end;
  align-items: center;
  margin: 0.5rem 1.5rem;
}

a,
button {
  color: black;
}

.image-clickable {
  margin-right: auto;
}

.logo {
  height: 3.5rem;
  margin-right: auto;
}

.nav-links {
  list-style: none;
  margin:0;
}

.nav-links li {
  display: inline-block;
  padding: 0 1.25rem;
}

.nav-links li a {
  text-decoration: none;
  font-family: "Montserrat", sans-serif;
  font-size: 1rem;
  transition: all 0.5s ease 0s;
}

.nav-links li a:hover {
  color: rgba(0, 173, 181, 0.8);
}

button {
  background: #a12c2f;
  cursor: pointer;
  padding: 9px 20px;
  border: none;
  color:white;
  border-radius: 50px;
  font-family: "Montserrat", sans-serif;
  font-size: 1rem;
  transition: all 0.5s ease 0s;
  margin-left: 20px;
}

button:hover {
  background: rgba(0, 173, 181, 0.8);
}
</style>