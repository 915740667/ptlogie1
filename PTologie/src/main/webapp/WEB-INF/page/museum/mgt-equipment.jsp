<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <script type="text/javascript">
 
    $(function(){
   	   $.ajax({
 		        url: "${webPath}/equipment/init",
 		        type: "POST",
 		        dataType: "JSON",
 		       data: {
		        	pageNum: 1,
		        },
 		        success: function(data) {
 		        	//初始化页面参数 返回各个设备列表和设备个数
		            
		    	    $('#M-box1').jqPaginator({
		                totalPages: data.page1,
		                visiblePages: data.pageNum,
		               /*  currentPage: 1, */
		                first: '<a class="first" href="javascript:void(0);">首页</a>',
		                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
		                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
		                last: '<a class="last" href="javascript:void(0);">末页</a>',
		                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
		                onPageChange: function (num) {
		                	findPage1(num);
		                }
		            });
		    	    $('#M-box2').jqPaginator({
		                totalPages: data.page2,
		                visiblePages: data.pageNum,
		                currentPage: 1,
		                first: '<a class="first" href="javascript:void(0);">首页</a>',
		                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
		                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
		                last: '<a class="last" href="javascript:void(0);">末页</a>',
		                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
		                onPageChange: function (num) {
		                		findPage2(num);
		                }
		            });
		    	    $('#M-box3').jqPaginator({
		                totalPages: data.page3,
		                visiblePages: data.pageNum,
		                currentPage: 1,
		                first: '<a class="first" href="javascript:void(0);">首页</a>',
		                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
		                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
		                last: '<a class="last" href="javascript:void(0);">末页</a>',
		                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
		                onPageChange: function (num) {
		                		findPage3(num);
		                	
		                }
		            });
		     	
		            
 		        }
 		    });
    	  
   	mSelect();
     mCheckbox();
      mPopup();
      $(".zdsb .add").click(function(){
        $("#p1").show();
      })
      $(".zdsb .m-table .edit").click(function(){
        $("#p1").show();
      })

      $(".zjsb .add").click(function(){
        $("#p2").show();
      })
      $(".wgsb .add").click(function(){
        $("#p3").show();
      })
    })
    
   
      function findPage1(d1){
    	var condition=  document.getElementById("queryDevice").value;
    	$.ajax({
	        url: "${webPath}/equipment/findequipmentList",
	        data: {
	        	pageNum: d1,
	        	equipmentType:[1,4,5],
	        	condition:condition
	        },
	        type: "POST",
	        dataType: "JSON",
	        traditional:true, 
	        success: function(data) {
	            var str = "";
		            var eqpList=data.dataList
		             for(var k in eqpList) {
	  		            str += "<tr><td>" + eqpList[k].equipmentid + "</td><td>" + eqpList[k].equipmentname + "</td><td>" + eqpList[k].snno + "</td><td>" 
	  		            + eqpList[k].equipmenttype + "</td><td>" +eqpList[k].sceneid + "</td><td>" 
	  		            +eqpList[k].alarmstatus + "</td><td>" +eqpList[k].workstatus + "</td><td>" +eqpList[k].electric + "v"+"</td><td>" +eqpList[k].content + "</td><td>  <a class='delete'  onclick='deleteById("+eqpList[k].equipmentid+")'><span>删除</span></a>" +"</td></tr>";
	  		          }  
		            $("#nr1").html(str);
	        }
	    });
    }
    
      function findPage2(d2){
    	  var condition=  document.getElementById("queryRelay").value;
    	  $.ajax({
		        url: "${webPath}/equipment/findequipmentList",
		        data: {
		        	pageNum: d2,
		        	equipmentType:2,
		        	condition:condition
		        },
		        type: "POST",
		        dataType: "JSON",
		        success: function(data) {
		            var str1 = "";
		            var relayList=data.dataList
		             for(var k in relayList) {
		               str1 += "<tr><td>" + relayList[k].equipmentid + "</td><td>" + relayList[k].equipmentname + "</td><td>" + relayList[k].macno + "</td><td>" 
	  		           +relayList[k].content  + "</td><td>  <a class='delete'   onclick='deleteById("+relayList[k].equipmentid+")'><span>删除</span></a>" +"</td></tr>";
	  		          
		            }  
		            $("#nr2").html(str1);
		        }
		    });
      }
      
      
      function findPage3(d2){ 
    	  var condition=  document.getElementById("queryGate").value;
      $.ajax({
	        url: "${webPath}/equipment/findequipmentList",
	        data: {
	        	pageNum: d2,
	        	equipmentType:3,
	        	condition:condition
	        },
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	            var str3 = "";
	            var gateList=data.dataList
	             for(var k in gateList) {
  		            str3+= "<tr><td>" + gateList[k].equipmentid + "</td><td>" + gateList[k].equipmentname + "</td><td>" + gateList[k].equipmentname + "</td><td>" 
  		            + gateList[k].chipsn + "</td><td>" +gateList[k].hostname + "</td><td>" 
  		            +gateList[k].chipsn + "</td><td>" +gateList[k].gps + "</td><td>" +gateList[k].workstatus + "</td><td>" +gateList[k].createtime  + "</td><td>" +gateList[k].content + "</td><td>  <a class='delete'  onclick='deleteById("+gateList[k].equipmentid+")'><span>删除</span></a>" +"</td></tr>";
  		          }  
	            $("#nr3").html(str3);
	        }
	    });
      }   
      
   
   function queryDevice(){
	var condition=  document.getElementById("queryDevice").value;
	$.ajax({
        url: "${webPath}/equipment/findequipmentList",
        data: {
        	pageNum: 1,
        	equipmentType:[1,4,5],
        	condition:condition
        },
        type: "POST",
        dataType: "JSON",
        traditional:true, 
        success: function(data) {
         $('#M-box1').jqPaginator({
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
   
   function queryRelay(){
	   var condition=  document.getElementById("queryRelay").value;
		$.ajax({
	        url: "${webPath}/equipment/findequipmentList",
	        data: {
	        	pageNum: 1,
	        	equipmentType:2,
	        	condition:condition
	        },
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
		            $('#M-box2').jqPaginator({
		            	totalPages: data.page,
		                visiblePages: data.pageNum,
		                currentPage: 1,
		                first: '<a class="first" href="javascript:void(0);">首页</a>',
		                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
		                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
		                last: '<a class="last" href="javascript:void(0);">末页</a>',
		                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
		                onPageChange: function (num) {
		                	findPage2(num);
		                }
		            });
		        }
		    });
		   }
   
   
   function queryGate(){
	   var condition=  document.getElementById("queryGate").value;
		$.ajax({
	        url: "${webPath}/equipment/findequipmentList",
	        data: {
	        	pageNum: 1,
	        	equipmentType:3,
	        	condition:condition
	        },
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
		            $('#M-box3').jqPaginator({
		                totalPages: data.page,
		                visiblePages: data.pageNum,
		                currentPage: 1,
		                first: '<a class="first" href="javascript:void(0);">首页</a>',
		                prev: '<a class="prev" href="javascript:void(0);">上一页</a>',
		                next: '<a  class="next" href="javascript:void(0);">下一页</a>',
		                last: '<a class="last" href="javascript:void(0);">末页</a>',
		                page: '<a class="page" href="javascript:void(0);">{{page}}</a>',
		                onPageChange: function (num) {
		                	findPage3(num);
		                }
		            });
		        }
		    });
   }
   
   
   function getId(id){
	   var sceneId=document.getElementById("sceneId");
	   sceneId.value=id;
   }
   
   function gettype(type){
	   var Type=document.getElementById("equipmentType");
	   Type.value=type;
   }
   
   
   
   function submit1(){
	   var name= document.getElementById("name1").value;
	   var sceneId= document.getElementById("sceneId").value;
	   var equipmentType= document.getElementById("equipmentType").value;
	   var sn= document.getElementById("sn").value;
	   var mac= document.getElementById("mac1").value;
	   var content= document.getElementById("content1").value;
	   $.ajax({
	        url: "${webPath}/equipment/addequipment",
	        data: {
	        	Name:name,
	        	sceneid:sceneId,
	        	equipmenttype:equipmentType,
	        	SN:sn,
	        	Mac:mac,
	        	Content:content
	        },
	        type: "POST",
	        dataType: "text",
	        traditional:true, 
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
   
   
   
   function submit2(){
	   var name= document.getElementById("name2").value;
	   var mac= document.getElementById("mac2").value;
	   var content= document.getElementById("content2").value;
	   
	   $.ajax({
		   url: "${webPath}/equipment/addequipment",
	        data: {
	        	Name:name,
	        	Mac:mac,
	        	equipmenttype:2,
	        	Content:content
	        },
	        type: "POST",
	        dataType: "text",
	        traditional:true, 
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
   
   
   

   function submit3(){
	   var name= document.getElementById("name3").value;
	   var gps= document.getElementById("gps3").value;
	   var mac= document.getElementById("mac3").value;
	   var content= document.getElementById("content3").value;
	   
	   $.ajax({
	        url: "${webPath}/equipment/addequipment",
	        data: {
	        	Name:name,
	        	GPS:gps,
	        	Mac:mac,
	        	equipmenttype:3,
	        	Content:content
	        },
	        type: "POST",
	        dataType: "text",
	        traditional:true, 
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
   
   function deleteById(id){
		$.ajax({
	        url: "${webPath}/equipment/deleteById",
	        data: {
	        	equipmentid: id
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
  <div class="page mgt-equipment">
	<div>
  <!--include是静态引入  jsp:include是动态引入 -->
  <%@ include file="header.jsp" %>
<%--   <jsp:include page="header.jsp" flush="true" /> --%>
    </div>
    <div class="m-bread">
      <style>
		p{padding:0px; margin:0px;display: inline;}
	</style>
        <a href="javascript:void(0);" onclick="main()"><p>首页</p></a><p> /</p>  <a href="#"><p>设备管理 </p></a> 
    </div>
    <div class="box-1 zdsb">
      <div class="m-title">
        <i style="background-image: url(../static/title-4.png);"></i>
        <a>终端设备</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称" id="queryDevice">
          <button  onclick ="queryDevice();">查询</button>
        </div>
        <button class='m-icon-btn add'  >
          <i></i>
          <span>增加</span>
        </button>
      </div>
      <div class="m-table">
        <table>
          <thead>
            <tr>
              <th>序号</th>
              <th>设备名称</th>
              <th>设备标识</th>
              <th>设备类型</th>
              <th>归属区域</th>
              <th>归属网关</th>
              <th>工作状态</th>
              <th>供电状态</th>
              <th>备注</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody id="nr1">
          </tbody>
        </table>
      </div>

       <div class="m-paging">
        <div id="M-box1"></div>
      </div>

      
     
    </div>
    <div class="box-1 zjsb">
      <div class="m-title">
        <i style="background-image: url(../static/title-4.png);"></i>
        <a>中继设备</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称"  id="queryRelay">
          <button   onclick="queryRelay();">查询</button>
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
              <th>设备名称</th>
              <th>设备MAC</th>
              <th>备注</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody id="nr2">
         
          </tbody>
        </table>
      </div>
         <div class="m-paging">
        <div id="M-box2"></div>
      </div>
    </div>
    <div class="box-1 wgsb">
      <div class="m-title">
        <i style="background-image: url(../static/title-4.png);"></i>
        <a>网关设备</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称" id="queryGate">
          <button  onclick="queryGate();">查询</button>
        </div>
        <button class='m-icon-btn add' >
          <i></i>
          <span>增加</span>
        </button>
      </div>
      <div class="m-table">
        <table>
          <thead>
            <tr>
              <th>序号</th>
              <th>设备名称</th>
              <th>设备标识</th>
              <th>上报周期</th>
              <th>主机名</th>
              <th>信道</th>
              <th>GPS</th>
              <th>工作状态</th>
              <th>更新时间</th>
              <th>备注</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody id="nr3">
    
          </tbody>
        </table>
      </div>
      <div class="m-paging">
        <div id="M-box3"></div>
      </div>
    </div>
    
    
    <div id="p1" class="m-popup-bg popup-1">
      <div class="m-popup">
        <div class="hd">
          <span>添加</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-input">
            <span>设备名称：</span>
            <label>
              <input type="text" name="" placeholder="请输入设备名称" id="name1">
            </label>
          </div>
          <div class="m-select">
            <span>归属区域：</span>
            <label>
              <div>请选择</div>
              <ul id="scene">
                <c:forEach items="${requestScope.sceneList}" var="keyword" >
     					 <li onclick="getId('${keyword.sceneid}')">${keyword.scenename}</li>
     			</c:forEach>
              </ul>
              <input type="hidden" name="">
            </label>
          </div>
             <input type="hidden" name=""  id="sceneId">
          <div class="m-select">
            <span>设备类型：</span>
            <label>
              <div>请选择</div>
              <ul id="eqp">
                <li  onclick="gettype('4')">控制设备</li>
                <li onclick="gettype('1')">监控设备</li>
                <li onclick="gettype('5')">测控设备</li>
              </ul>
              <input type="hidden" name="">
            </label>
          </div>
          <input type="hidden" name=""  id="equipmentType">
          <div class="m-input">
            <span>设备SN：</span>
            <label>
              <input type="text" name="" placeholder="请输入SN" id="sn">
            </label>
          </div>
          <div class="m-input">
            <span>设备MAC：</span>
            <label>
              <input type="text" name="" placeholder="请输入MAC" id="mac1">
            </label>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容" id="content1"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel"  id="cancle1">取消</button>
          <button class="confirm" onclick="submit1()">确认</button>
        </div>
      </div>
    </div>
    <div id="p2" class="m-popup-bg popup-1">
      <div class="m-popup">
        <div class="hd">
          <span>添加</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-input">
            <span>设备名称：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称" id="name2">
            </label>
          </div>
          <div class="m-input">
            <span>设备MAC：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称" id="mac2">
            </label>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容" id="content2"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm"  onclick="submit2()">确认</button>
        </div>
      </div>
    </div>
    <div id="p3" class="m-popup-bg popup-1">
      <div class="m-popup">
        <div class="hd">
          <span>添加</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-input">
            <span>设备名称：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称" id="name3">
            </label>
          </div>
          <div class="m-input">
            <span>设备MAC：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称" id="mac3">
            </label>
          </div>
          <div class="m-input">
            <span>GPS信息：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称" id="gps3">
            </label>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容" id="content3"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm"  onclick="submit3()">确认</button>
        </div>
      </div>
    </div>
     <%@ include file="userPWD.jsp" %>
  </div>
  <div class="sky-bg" id="particles-js"></div>

</body>
</html>