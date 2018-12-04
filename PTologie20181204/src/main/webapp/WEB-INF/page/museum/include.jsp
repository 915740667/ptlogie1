<%@page language="java" pageEncoding="utf-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%--自定标签 --%>
<%@ taglib prefix="u" uri="/WEB-INF/UserTag.tld" %>
<% request.setAttribute("webPath", request.getContextPath());%>
<%--引入公共CSS --%>
<link rel="stylesheet" type="text/css" href="${webPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${webPath}/css/main.css">
<link rel="stylesheet" type="text/css" href="${webPath}/css/login.css" />
<link rel="icon" href="${webPath}/static/favicon.ico" />
<link rel="shortcut icon" href="${webPath}/static/favicon.ico" />
<link rel="bookmark" href="${webPath}/static/favicon.ico" />
<link rel="stylesheet" type="text/css" href="${webPath}/css/jedate-6.5.0/skin/jedate.css">
<link rel="stylesheet" type="text/css" href="${webPath}/css/jquery.page.css">
 
<%--引入Jquery --%>
<script type="text/javascript" src="${webPath}/js/jquery.min.js"></script>
<%--引入选择页--%>
<script src="${webPath} /js/appjs" type="text/javascript"></script>
<%--报表js--%>
<script src="${webPath}/js/echarts.common.min.js" type="text/javascript"></script>
<%--日期类控件--%>
<script  src="${webPath} /js/particles.min.js"  type="text/javascript"></script>
<script   type="text/javascript"  src="${webPath}/js/jquery.cookie.js"></script>

<script   type="text/javascript"  src="${webPath}/css/jedate-6.5.0/dist/jedate.min.js"></script>
<script   type="text/javascript"  src="${webPath}/js/jquery.page.js"></script>
<<script type="text/javascript">



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
</script>

