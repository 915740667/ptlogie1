<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title></title>
<script type="text/javascript">
    /* 页面加载完成后立即执行此方法 */
  	$(function(){
    	/* 初始化用户管理列表 */
    	$.ajax({
	        url: "${webPath}/user/init",
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	        
	            /* 填充分页 */
	            $('#page').jqPaginator({
	                totalPages: data.page,
	                visiblePages: data.pageNum,
	                currentPage: 1,
	                first: '<a class="first" href="javascript:void(0);">首页</a>',
	                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
	                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
	                last: '<a class="last" href="javascript:void(0);">末页</a>',
	                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
	                onPageChange: function (num) {
	                	/* 调用查询 */
	                	findPage1(num);
	                }
	            });
	        }
	    });
     	mPopup();
     	mSelect();
     	mCheckbox();
      	
     	/* 添加 */
     	$(".control-bar .add").click(function(){
        	$("#p1").show();
      	})
      	
      	/* 编辑 */
      	$(".m-table .edit").click(function(){
        	$("#p1").show();
      	})
      	
      	/* 取消 */
      	$(".ft .cancel").click(function(){
      		clear();
      	})
      	
      	/* 确定 */
      	$(".ft .confirm").click(function(){
      		confirm();
      	})
      	
      	/* 弹出框关闭 */
      	$(".hd .close").click(function(){
      		clear();
      	})
      	
   	})
    
    /* 列表分页查询 */
  	function findPage1(d1){
  		/* 查询条件 -- 用户名字 */
    	var condition=  document.getElementById("queryUser").value;
   		$.ajax({
        	url: "${webPath}/user/finduserList",
	        data: {
	        	pageNum: d1,
	        	condition:condition
	        },
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	            var str = "";
	            var Lists=data.dataList
	             for(var k in Lists) {
	            	 	str += "<tr><td>" + Lists[k].userid + "</td><td>" + Lists[k].username + "</td><td>" + Lists[k].loginname + "</td><td>" 
	  		            	+ Lists[k].phone + "</td><td>" +Lists[k].email + "</td><td>" 
	 		             	+Lists[k].userstatus + "</td><td>  <a class='delete' onclick='deleteById("+Lists[k].userid+")'><span>删除</span></a>" +"</td></tr>";
	 		          	}  
	            $("#nr1").html(str);
	        }
	    });
    }
    
    /* 取消 */
    function clear(){
    	/* 隐藏页面 */
    	$("#p1").hide();
    	/* 清空数据 */
    	$("#sceneId").html("");
    	$("#areaName").val("");
    	$("#areaId").val("");
    	$("#name").val("");
    	$("#password").val("");
    	$("#password_1").val("");
    	$("#telephone").val("");
    	$("#email").val("");
    	$("#warning").removeClass("selected");
    	$("#monitor").removeClass("selected");
    	$("#device").removeClass("selected");
    }
    
    /* 确定提交 */
    function confirm(){
    	/* 字段检查 */
    	check();
    	/* 获得用户对象 */
    	var user = getUserInfo();
		/* 通过验证后，发起请求 */    	
    	$.ajax({
            url: "${webPath}/user/saveAndUpdate",
            data: {
            	user: JSON.stringify(user)
            },
            type: "POST",
            dataType: "JSON",
            success: function(data) {
            	if(istemp(user.userid)){
            		console.log("新增成功");
            		/* 关闭弹出框 */
            		clear();
            		/* 重新加载页面 */
            		location.reload();
            	} else {
            		console.log("修改成功");
            	}
            }
        });
    }
    
    /* 删除 */
    function deleteById(userid){
    	if(istemp(userid)){
    		alert("页面出错，用户id为空！");
    		return false;
    	}
		/* 通过验证后，发起请求 */    	
    	$.ajax({
            url: "${webPath}/user/deleteById",
            data: {
            	userid: userid
            },
            type: "POST",
            dataType: "JSON",
            success: function(data) {
            	if(data=="ok"){
	        		alert("删除成功")
	        	}if(data=="error"){
	        		alert("删除失败")
	        	}
        		location.reload();
            }
        });
    }
    
    /* 字段检查 */
    function check(){
    	var companyid = $("#companyid").val();
    	if(istemp(companyid)){
    		alert("请选择区域！");
    		return false;
    	}
    	var username = $("#username").val();
    	if(istemp(username)){
    		alert("请填写登录名！");
    		return false;
    	}
    	var name = $("#name").val();
    	if(istemp(name)){
    		alert("请填写姓名！");
    		return false;
    	}
    	var password = $("#password").val();
    	if(istemp(password)){
    		alert("请填写密码！");
    		return false;
    	}
    	var password_1 = $("#password_1").val();
    	if(istemp(password_1)){
    		alert("请填写重复密码！");
    		return false;
    	}
    	if(password != password_1){
    		alert("两次输入的密码不匹配，请重新输入！");
    		return false;
    	}
    	var telephone = $("#telephone").val();
    	if(istemp(telephone)){
    		alert("请输入手机号！");
    		return false;
    	}
    	/* 正则验证手机号 */
    	if(!check_telephone(telephone)){
    		alert("请输入正确的手机号！");
    		return false;
    	}
    	var email = $("#email").val();
    	if(istemp(email)){
    		alert("请输入邮箱地址！");
    		return false;
    	}
    	/* 正则验证邮箱地址 */
    	if(!check_email(email)){
    		alert("请输入正确的邮箱地址！");
    		return false;
    	}
    }
    
    /* 判断是不是空 */
    function istemp(obj){
    	if(obj == null || obj == "" || typeof(obj) == "undefined"){
    		return true;
    	} else {
    		return false;
    	}
    }
    
    /* 正则验证手机号是否正确 */
    function check_telephone(phone){
    	if(/^1[34578]\d{9}$/.test(phone)){
    		return true;
    	} else {
    		return false;
    	}
    }
    
    /* 正则验证邮箱地址是否正确 */
    function check_email(email){
    	var re = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
    	if(re.test(email)){
    		return true;
    	} else {
    		return false;
    	}
    }
    
    /* 获得用户对象 */
    function getUserInfo(){
    	/* 获得监控类型 */
    	var box = $(".m-checkbox > input[type=checkbox]");
    	var watchtype;
    	for(var i = 0; i < box.length; i ++){
    		if(box[i].checked == "checked"){
    			watchtype += "," + box[i].val();
    		}
    		if(watchtype.length > 0){
    			watchtype = watchtype.substring(1,watchtype.length);
    		}
    		console.log(watchtype);
    	}
    	/* 构造用户信息 */
    	var user = {
    			companyid : $("companyid").val(),// 公司id
    			loginname : $("#username").val(),// 用户名
    			password : $("#password").val(),// 密码
    			username : $("#name").val(),// 姓名
				phone : $("#telephone").val(),// 手机号
				email : $("#email").val(),// 邮箱地址
				usertype : $("#usertype").val(),// 用户类型 1 admin  2 手机用户默认收短信  3 手机用户不收短信
				userstatus : 2,// 1登录 2 退出
				watchtype : watchtype
    		    
    	}
    	console.log(user);
    	return user;
    }
    
    /* 根据公司id查询区域信息 */
    function getArea(companyid){
    	var companyid = $("#companyid").val();
    	if(istemp(companyid)){
    		alert("页面加载出错，公司id为空！");
    		return false;
    	}
		/* 通过验证后，发起请求 */    	
    	$.ajax({
            url: "${webPath}/subarea/getSceneListByCompanyid",
            data: {
            	companyid: companyid
            },
            type: "POST",
            dataType: "JSON",
            success: function(data) {
            	/* 遍历data */
            	if(!istemp(data)){
            		var li_list;
            		for(var i=0; i<data.length; i++){
            			li_list += "<li >选项一</li>";
            		}
            	}
            }
        });
    }
    
  	/* 获取下拉列表的值 */
    function getId(id){
    	var sceneId=document.getElementById("areaId")
    	sceneId.value=id
    }
  	
  	/* 获得当前页码 */
  	function getPageNum(){
  		var num = $("#page .page.active").html();
  		return num;
  	}
  </script>
</head>
<body>
	<div class="page mgt-user">
		<div>
			<!--include是静态引入  jsp:include是动态引入 -->
			<%@ include file="header.jsp"%>
			<%--   <jsp:include page="header.jsp" flush="true" /> --%>
		</div>
		<div class="m-bread">
			<style>
p {
	padding: 0px;
	margin: 0px;
	display: inline;
}
</style>
			<a href="javascript:void(0);" onclick="main()"><p>首页</p></a>
			<p>/</p>
			<a href="#"><p>用户管理</p></a>
		</div>
		<div class="box-1">
			<div class="m-title">
				<i style="background-image: url(../static/title-8.png);"></i> <a>用户管理</a>
				<div></div>
			</div>
			<div class="control-bar">
				<div class="m-search">
					<i></i> 
					<input type="text" name="" placeholder="请输入用户名称" id="queryUser">
					<button onclick="findPage1(1)">查询</button>
				</div>
				<button class='m-icon-btn add'>
					<i></i> <span>增加</span>
				</button>
			</div>
			<div class="m-table">
				<table>
					<thead>
						<tr>
							<th>序号</th>
							<th>用户名</th>
							<th>登录名</th>
							<th>手机号</th>
							<th>邮箱</th>
							<th>归属区域</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody id="nr1">

					</tbody>
				</table>
			</div>
			<div class="m-paging">
				<div id="page"></div>
			</div>
		</div>

		<div id="p1" class="m-popup-bg popup-1">
			<div class="m-popup">
				<div class="hd">
					<span>添加</span> <a class="close"></a>
				</div>
				<div class="bd">
					<!-- 所属公司id -->
					<input type="hidden" id="companyid" name="companyid" value="${sessionScope.loginUser.companyid}">
					<div class="m-select">
						<span>选择区域：</span> 
						<label>
							<div>请选择</div>
							<!-- 初始化查询 -->
							<ul id="sceneId">
			                  	<c:forEach items="${requestScope.list}" var="scene" >
	     					 		<li onclick="getId('${scene.sceneid}')">${scene.scenename}</li>
				     			</c:forEach>
			              	</ul>
			              	<input type="hidden" name=""  id="areaName">
			              	<input type="hidden" name=""  id="areaId">
						</label>
					</div>
					<div class="m-input">
						<span>登录名：</span> <label> <input type="text" id="username"
							placeholder="请输入登录名">
						</label>
					</div>
					<div class="m-input">
						<span>姓名：</span> <label> <input type="text" id="name"
							placeholder="请输入姓名">
						</label>
					</div>
					<div class="m-input">
						<span>密码：</span> <label> <input type="password" id="password"
							placeholder="请输入密码">
						</label>
					</div>
					<div class="m-input">
						<span>重复密码：</span> <label> <input type="password" id="password_1"
							placeholder="请重复输入密码">
						</label>
					</div>
					<div class="m-input">
						<span>手机号：</span> <label> <input type="text" id="telephone"
							placeholder="请输入手机号">
						</label>
					</div>
					<div class="m-input">
						<span>邮箱：</span> <label> <input type="text" id="email"
							placeholder="请输入邮箱">
						</label>
					</div>
					<div class="m-checkbox">
						<span>监控类型：</span>
						<div>
							<a id="monitor" class="selected"><input type="checkbox" name="temper"><span>温湿度监控</span></a>
							<a id="warning" ><input type="checkbox" name="water"><span>水温预警</span></a>
							<a id="device" ><input type="checkbox" name="device"><span>设备监控</span></a>
						</div>
					</div>
				</div>
				<div class="ft">
					<button class="cancel">取消</button>
					<button class="confirm">确认</button>
				</div>
			</div>
		</div>
		<%@ include file="userPWD.jsp"%>
	</div>
	<div class="sky-bg" id="particles-js"></div>

</body>
</html>