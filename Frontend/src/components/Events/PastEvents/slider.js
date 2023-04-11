// Portfolio Slider
$(document).ready(function () {
  $(".portfolio-slider").slick({
    infinite: true,
    slidesToShow: 1,
    slidesToScroll: 1,
    dots: true,
    arrows: false,
    fade: true,
    speed: 300,
    cssEase: "linear",
    adaptiveHeight: true,
  });
});

$("#btn-prev").click(function (t) {
  t.preventDefault();
  $(".portfolio-slider").slick("slickPrev");
});
$("#btn-next").click(function (t) {
  t.preventDefault();
  $(".portfolio-slider").slick("slickNext");
});
