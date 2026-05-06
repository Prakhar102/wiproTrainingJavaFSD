// -------------------- HIDE / TOGGLE --------------------

// Jab document ready ho jaata hai
$(document).ready(function(){

  // Hide button click hone par
  $("#btn_hide").click(function(){

    // #second paragraph ko toggle karo (show/hide with animation)
    $("#second").toggle(2000, function(){

      // Animation complete hone ke baad ye chalega (callback)
      console.log("Toggle done or finished");

    });

  });
});


// -------------------- FADING EFFECT --------------------

$(document).ready(function(){

  // Fade button click hone par
  $("#fadding_effect").click(function(){

    // Pehle pura fade out (invisible)
    $("#third").fadeOut();

    // Fir same element ko half visible (opacity = 0.5)
    $("#third").fadeTo("slow", 0.5);

  });
});


// -------------------- BOX ANIMATION --------------------

$(document).ready(function(){

  // Callback function ka use animation complete hone ke baad kaam karne ke liye hota hai

  $("#Box").click(function(){

    // Pehle #third paragraph ko hide karo
    $("#third").fadeOut();

    // .box element par animation apply karo
    $(".box").animate({

      // width ko 200px increase karo
      width : "+=200px",

      // height fix 200px
      height : "200px",

      // text ka size bada karo
      fontSize : "20px"

    }, "slow"); // slow speed animation

  });
});


// -------------------- KEYBOARD EVENTS --------------------

// Jab koi key press hoti hai
$("body").keydown(function(event){

  // Agar 'A' key (ASCII code 65) press hui
  if(event.which == 65)
  {
    $(".box").hide(2000, function(){
      console.log("Task Completed ");
    });
  }

  // Agar 'D' key (ASCII code 68) press hui
  if(event.which == 68)
  {
    $(".box").show(2000, function(){
      console.log("Task Completed ");
    });
  }

  // Konsi key press hui wo print karega
  console.log(event.which);
});