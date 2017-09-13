function onlyNumber(obj) {
    $(obj).keyup(function(){
         $(this).val($(this).val().replace(/[^0-9]/g,""));
    }); 
}

function getEtcValue(className, printAreaId){
	
	var lists = $(className).find('input');	
	var result = 0;
	
	for(var i = 0; i<lists.length-1; i++){
		if(!isNaN(parseInt($(lists[i]).val()))){
			result += parseInt($(lists[i]).val());
		}
	}	
	if (!isNaN(parseInt($(printAreaId).val()))) {
		if (parseInt($(printAreaId).val()) > result) {
			var etcValue = parseInt($(printAreaId).val()) - result;
			$(lists[lists.length-1]).val(etcValue);
		}
	}
	
	
}

function sumValue(className, printAreaId){

	var lists = $(className).find('input');	
	var result = 0;
	
	for(var i = 0; i<lists.length; i++){
		if(!isNaN(parseInt($(lists[i]).val()))){
			result += parseInt($(lists[i]).val());
		}
	}
	
	$(printAreaId).val(result);
		
}

function isNumber(value) {
	  return typeof value === 'number' && isFinite(value);
}

$(function(){
    $('#display_detail_communication').hide();
    $('#display_detail_cafeBakery').hide();
    $('#display_detail_restaurant').hide();
    $('#display_detail_fastFood').hide();
	
    /* transportation */
    $('#detail_button_transportation').click(function(){
        $('#detail_button_transportation').hide();
        $('#hide_button_transportation').show();
        $('#display_detail_transportation').slideDown("slow");
        $("#inputTransportation").attr("readonly",true).attr("disabled",false);
        $("#inputTransportation").css("background-color", "#E5E5E5");
        getEtcValue('.display-transportation-li','#inputTransportation');
    });
    
    $('#hide_button_transportation').click(function(){
        $('#detail_button_transportation').show();
        $('#hide_button_transportation').hide();
        $('#display_detail_transportation').slideUp("fast");
        $("#inputTransportation").attr("disabled",false).attr("readonly",false);
        $("#inputTransportation").css("background-color", "");
    });
    
    /* communication */
    $('#detail_button_communication').click(function(){
        $('#detail_button_communication').hide();
        $('#hide_button_communication').show();
        $('#display_detail_communication').slideDown("slow");
        $("#inputCommunication").attr("readonly",true).attr("disabled",false);
        $("#inputCommunication").css("background-color", "#E5E5E5");
        getEtcValue('.display-communication-li','#inputCommunication');
    });
    
    $('#hide_button_communication').click(function(){
        $('#detail_button_communication').show();
        $('#hide_button_communication').hide();
        $('#display_detail_communication').slideUp("fast");
        $("#inputCommunication").attr("disabled",false).attr("readonly",false);
        $("#inputCommunication").css("background-color", "");
    });
    
      
    /* cafeBakery */
    $('#detail_button_cafeBakery').click(function(){
        $('#detail_button_cafeBakery').hide();
        $('#hide_button_cafeBakery').show();
        $('#display_detail_cafeBakery').slideDown("slow");
        $("#inputCafeBakery").attr("readonly",true).attr("disabled",false);
        $("#inputCafeBakery").css("background-color", "#E5E5E5");
        $("#cafeBakery_margin").show();
        getEtcValue('.display-cafeBakery-li','#inputCafeBakery');
    });
    
    $('#hide_button_cafeBakery').click(function(){
        $("#cafeBakery_margin").hide();
        $('#detail_button_cafeBakery').show();
        $('#hide_button_cafeBakery').hide();
        $('#display_detail_cafeBakery').slideUp("fast");
        $("#inputCafeBakery").attr("disabled",false).attr("readonly",false);
        $("#inputCafeBakery").css("background-color", "");
    });
    
    /* restaurant */
    $('#detail_button_restaurant').click(function(){
        $('#detail_button_restaurant').hide();
        $('#hide_button_restaurant').show();
        $('#display_detail_restaurant').slideDown("slow");
        $("#inputRestaurant").attr("readonly",true).attr("disabled",false);
        $("#inputRestaurant").css("background-color", "#E5E5E5");
        getEtcValue('.display-restaurant-li','#inputRestaurant');
    });
    
    $('#hide_button_restaurant').click(function(){
        $('#detail_button_restaurant').show();
        $('#hide_button_restaurant').hide();
        $('#display_detail_restaurant').slideUp("fast");
        $("#inputRestaurant").attr("disabled",false).attr("readonly",false);
        $("#inputRestaurant").css("background-color", "");
    });    
    
    /* fastFood */
    $('#detail_button_fastFood').click(function(){
        $('#detail_button_fastFood').hide();
        $('#hide_button_fastFood').show();
        $('#display_detail_fastFood').slideDown("slow");
        $("#inputFastFood").attr("readonly",true).attr("disabled",false);
        $("#inputFastFood").css("background-color", "#E5E5E5");
        $("#fastFood_margin").show();
        getEtcValue('.display-fastFood-li','#inputFastFood');
    });
    
    $('#hide_button_fastFood').click(function(){
        $("#fastFood_margin").hide();
        $('#detail_button_fastFood').show();
        $('#hide_button_fastFood').hide();
        $('#display_detail_fastFood').slideUp("fast");
        $("#inputFastFood").attr("disabled",false).attr("readonly",false);
        $("#inputFastFood").css("background-color", "");
    });        
    
   
});