$(document).ready(function() {
  console.log("Starting... " + new Date());

  $("#sendButton").click(function() {
    // Show the loading component
    $("#loading").removeClass("d-none");

    $.ajax({
      type: "POST",
      url: "/chat",
      data: {
         "prompt": $("#question").val(),
         "quantity": $("#quantity").val()
       }
    })
    .done(function(data) {
      // Fill the response field
      $("#response").val(data);

      // Hide the loading component
      $("#loading").addClass("d-none");
    });
  });

  // Clear button
  $("#clearButton").click(function() {
      // Clear fields
      $("#question").val("");
      $("#response").val("");
  });

  // Quantity field behaviour
  var quantitiy=10;
  $('.quantity-right-plus').click(function(e){
    e.preventDefault();
    var quantity = parseInt($('#quantity').val());
    $('#quantity').val(quantity + 1);
  });

  $('.quantity-left-minus').click(function(e){
     e.preventDefault();
     var quantity = parseInt($('#quantity').val());
     if(quantity > 0){
        $('#quantity').val(quantity - 1);
     }
  });
});