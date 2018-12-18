<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <script type="text/javascript">
//加载数据
    $(function(){
 	   $.ajax({
		        url: "${webPath}/subarea/init",
		        data: {
		        	pageNum: 1,
		        },
		        type: "POST",
		        dataType: "JSON",
		        success: function(data) {
		            $('#page1').jqPaginator({
		                totalPages: data.page,
		                visiblePages: data.pageNum,
		                currentPage: 1,
		                first: '<a class="first" href="javascript:void(0);">首页</a>',
		                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
		                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
		                last: '<a class="last" href="javascript:void(0);">末页</a>',
		                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
		                onPageChange: function (num) {
		               
		                	findPage1(num);
		                }
		            }); 
		        }
		    });
      mSelect();
      mCheckbox();
      mPopup();
      $(".control-bar .add").click(function(){
        $("#p1").show();
      })
      $(".m-table .edit").click(function(){
        $("#p1").show();
      })
      
    })
    
    function findPage1(d1){
	
    	var condition=  document.getElementById("queryArea").value;
    	
    	$.ajax({
	        url: "${webPath}/subarea/findareaList",
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
	            	  str += "<tr><td>" + Lists[k].sceneId + "</td><td>" + Lists[k].sceneName + "</td><td>" + Lists[k].sceneType + "</td><td>" 
	 		            + Lists[k].location + "</td><td>" +Lists[k].remark + "</td><td>" 
	 		            +Lists[k].count + "</td><td>" +Lists[k].equipmentName + "</td><td>" +Lists[k].remark + "</td><td>  <a class='delete' onclick='deleteById("+Lists[k].sceneId+")'><span>删除</span></a>" +"</td></tr>";
 	  		          }  
	            $("#nr1").html(str);
	        }
	    });
    }
    
    
    function queryArea(){
    	var condition=  document.getElementById("queryArea").value;
    	$.ajax({
            url: "${webPath}/subarea/getPage",
            data: {
            	pageNum: 1,
            	condition:condition
            },
            type: "POST",
            dataType: "JSON",
            success: function(data) {
                $('#page1').jqPaginator({
	                totalPages: data.page,
	                visiblePages: data.pageNum,
	                currentPage: 1,
	                first: '<a class="first" href="javascript:void(0);">首页</a>',
	                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
	                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
	                last: '<a class="last" href="javascript:void(0);">末页</a>',
	                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
	                onPageChange: function (num) {
	                	findPage1(num);
	                }
	            });
            }
        });
    }
    
    //添加功能
    function submit1(){
    	//名称
    	var  areaName=document.getElementById("areaName").value;
    	//位置
    	var  location=document.getElementById("location").value;
    	//物品
    	var  article=document.getElementById("article").value;
    	//网关名称
    	var  gateName=document.getElementById("gateName").value
    	//网关id
    	 var  gateId=document.getElementById("gateWayId").value
    	//备注
   		var  content=document.getElementById("content").value;
    	//场景类型
    	var sceneType=document.getElementsByName("sceneType");  
    	var sceneTypes=[];
    	var sceneTypes="";
	    for ( k in sceneType) {
			if(sceneType[k].checked){
				sceneTypes+=sceneType[k].value+","
			}
		}
	    console.log(sceneTypes)
	 	$.ajax({
	        url: "${webPath}/subarea/addArea",
	        data: {
	        	sceneName: areaName,
	        	location: location,
	        	article: article,
	        	gatename: gateName,
	        	gateid: gateId,
	        	contents: content,
	        	areaType:  JSON.stringify(sceneTypes)
	        },
	        type: "POST",
	        dataType: "text",
	        success: function(data) {
	        	if(data=="ok"){
	        		alert("success")
		 	     	   $("#p1").hide();
	        		location.reload();
	        	}if(data=="error"){
	        		alert("error")
		 	     	   $("#p1").hide();
	        		location.reload();
	        	}
	        	
	        }
	        });
    }
    
    
    //获取下拉列表的值 
    function getId(id){
    	 var  gateId=document.getElementById("gateWayId")
    	gateId.value=id
    }

    
    function deleteById(id){
    	$.ajax({
	        url: "${webPath}/subarea/deleteById",
	        data: {
	        	sceneId: id
	        },
	        type: "POST",
	        dataType: "text",
	        success: function(data) {
	        	if(data=="ok"){
	        		alert("success")
	        		location.reload();
	        	}if(data=="error"){
	        		alert("error")
	        		location.reload();
	        	}
	        }
	        });
    }
  </script>
</head>
<body>
 
  <div class="page mgt-area">

  <div>
    <%@ include file="header.jsp" %>
    
    </div>
    <div class="m-bread">
      <style>
		p{padding:0px; margin:0px;display: inline;}
	</style>
      <a href="javascript:void(0);" onclick="main()"><p>首页</p></a><p> /</p>  <a href="#"><p>区域管理 </p></a> 
    </div>
    <div class="box-1">
      <div class="m-title">
        <i style="background-image: url(../static/title-3.png);"></i>
        <a>区域信息</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称" id="queryArea">
          <button onclick ="queryArea();">查询</button>
        </div>
        <button class='m-icon-btn add'>
          <i></i>
          <span>增加</span>
        </button>
      </div>
      <div class="m-table">
        <table>
          <thead>
            <tr>
              <th>序号</th>
              <th>区域名称</th>
              <th>监控类型</th>
              <th>所在位置</th>
              <th>物品信息</th>
              <th>设备数</th>
              <th>网关设备</th>
              <th>备注</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody  id="nr1">

          </tbody>
        </table>
      </div>
      <div class="m-paging">
        <div id="page1"></div>
        </div>
    </div>
 <%@ include file="userPWD.jsp" %>
  
    <div id="p1" class="m-popup-bg popup-1">
      <div class="m-popup">
        <div class="hd">
          <span>添加</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-input">
            <span>区域名称：</span>
            <label>
              <input type="text" id="areaName" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>所在位置：</span>
            <label>
              <input type="text" id="location" placeholder="请输入位置名称">
            </label>
          </div>
          <div class="m-input">
            <span>物品信息：</span>
            <label>
              <input type="text" id="article" placeholder="请输入物品名称">
            </label>
          </div>
          <div class="m-select">
            <span>网关设备：</span>
            <label>
              <div>请选择</div>
              <ul id="gateId">
                  <c:forEach items="${requestScope.gateList}" var="keyword" >
     					 <li onclick="getId('${keyword.equipmentid}')">${keyword.equipmentname}</li>
     			</c:forEach>
              </ul>
              <input type="hidden" name=""  id="gateName">
            </label>
          </div>
            <input type="hidden" name=""  id="gateWayId">
          <div class="m-checkbox">
            <span>监控类型：</span>
            <div>
              <a ><input type="checkbox" name="sceneType" value="1"><span>温湿度监控</span></a>
              <a><input type="checkbox" name="sceneType" value="2"><span>水温预警</span></a>
              <a><input type="checkbox" name="sceneType" value="3"><span>湿度预警</span></a>
              <a><input type="checkbox" name="sceneType" value="4"><span>入侵预警</span></a>
            </div>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容" id="content"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm"  onclick="submit1()">确认</button>
        </div>
      </div>
    </div>

  </div>

   <div class="sky-bg" id="particles-js"></div>
</body>
</html>