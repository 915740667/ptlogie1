function mSelect(){
  $(".m-select label > div").click(function(){
    if($(this).parents("label").hasClass("active")){
      $(this).parents("label").removeClass("active")
    }else {
      $(this).parents("label").addClass("active")
    }
  })
  $(".m-select label > ul li").click(function(){
    var content = $(this).text();
    $(this).parents("label").children("div").css("color","#fff");
    $(this).parents("label").children("div").text(content);
    $(this).parents("label").children("input").val(content);
    $(this).parents("label").removeClass("active");
  })
}



function mCheckbox(){
  $(".m-checkbox a").click(function(){
    if($(this).hasClass("selected")){
      $(this).removeClass("selected");
      $(this).children("input").removeAttr("checked");
    }else {
      $(this).addClass("selected");
      $(this).children("input").attr("checked",'true');
    }
  })
}

function mSwitch(){
  $(".m-switch label div").click(function(){
    if($(this).parents("label").hasClass("on")){
      $(this).parents("label").removeClass("on");
      $(this).children("a").text("OFF");
      $(this).parents("label").children("input").val("OFF");
    }else {
      $(this).parents("label").addClass("on");
      $(this).children("a").text("ON");
      $(this).parents("label").children("input").val("ON")
    }
  })
}
function mSwitch2(){
  $(".m-switch-2 a").click(function(){
    $(this).parents(".m-switch-2").children("a").removeClass("active");
    $(this).addClass("active");
  })
}

function mPopup(){
  $(".m-popup >.hd .close").click(function(){
    $(this).parents(".m-popup-bg").hide();
  })
  $(".m-popup >.ft .cancel").click(function(){
    $(this).parents(".m-popup-bg").hide();
  })
}