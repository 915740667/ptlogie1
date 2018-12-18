<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <link rel="stylesheet" type="text/css" href="css/common.css">
  <link rel="stylesheet" type="text/css" href="css/main.css">
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/common.js"></script>
  <script type="text/javascript">
    $(function(){
    
   	 $.ajax({
	        url: "${webPath}/error/init",
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	        	//初始化页面参数 返回各个设备列表和设备个数
	            var str = "";
	            var Lists=data.dataList
	             for(var k in Lists) {
		            str += "<tr><td>" + Lists[k].userid + "</td><td>" + Lists[k].username + "</td><td>" + Lists[k].loginname + "</td><td>" 
		            + Lists[k].phone + "</td><td>" +Lists[k].email + "</td><td>" 
		             +Lists[k].userstatus + "</td><td>  <a class='delete'><span>删除</span></a>" +"</td></tr>";
		          }  
	            $("#nr1").html(str);
	           
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
    	
 	 $.ajax({
	        url: "${webPath}/rule/init",
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	        	//初始化页面参数 返回各个设备列表和设备个数
	            var str = "";
	            var Lists=data.dataList
	             for(var k in Lists) {
		            str += "<tr><td>" + Lists[k].userid + "</td><td>" + Lists[k].username + "</td><td>" + Lists[k].loginname + "</td><td>" 
		            + Lists[k].phone + "</td><td>" +Lists[k].email + "</td><td>" 
		             +Lists[k].userstatus + "</td><td>  <a class='delete'><span>删除</span></a>" +"</td></tr>";
		          }  
	            $("#nr2").html(str);
	            
	            $('#page2').jqPaginator({
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
   	 
    	
      mSelect();
      mSwitch();
      mPopup();
      $(".control-bar .add").click(function(){
        $("#p2").show();
      })
      $(".m-table .edit").click(function(){
        $("#p1").show();
      })
    })
    
  function findPage1(d1){
    	$.ajax({
	        url: "${webPath}/error/findErrorList",
	        data: {
	        	pageNum: d1,
	        },
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	            var str = "";
	            var Lists=data.dataList
	             for(var k in Lists) {
	            	   str += "<tr><td>" + Lists[k].userid + "</td><td>" + Lists[k].username + "</td><td>" + Lists[k].loginname + "</td><td>" 
	  		            + Lists[k].phone + "</td><td>" +Lists[k].email + "</td><td>" 
	  		             +Lists[k].userstatus + "</td><td>  <a class='delete'><span>删除</span></a>" +"</td></tr>";
 	  		          }  
	            $("#nr1").html(str);
	        }
	    });
    }
    
    
    function findPage2(d1){
    	$.ajax({
	        url: "${webPath}/rule/findRuleList",
	        data: {
	        	pageNum: d1,
	        },
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	            var str = "";
	            var Lists=data.dataList
	             for(var k in Lists) {
	            	   str += "<tr><td>" + Lists[k].userid + "</td><td>" + Lists[k].username + "</td><td>" + Lists[k].loginname + "</td><td>" 
	  		            + Lists[k].phone + "</td><td>" +Lists[k].email + "</td><td>" 
	  		             +Lists[k].userstatus + "</td><td>  <a class='delete'><span>删除</span></a>" +"</td></tr>";
 	  		          }  
	            $("#nr2").html(str);
	        }
	    });
    }
    
    function queryRule(){
    	var condition=  document.getElementById("queryRule").value;
    	$.ajax({
            url: "${webPath}/rule/findRuleList",
            data: {
            	pageNum: 1,
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
	  		             +Lists[k].userstatus + "</td><td>  <a class='delete'><span>删除</span></a>" +"</td></tr>";
                }  
                $("#nr1").html(str);
          
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
	                	findPage1(num);
	                }
	            });
            }
        });
    }
    
    function queryError(){
    	var condition=  document.getElementById("queryError").value;
    	$.ajax({
            url: "${webPath}/error/findErrorList",
            data: {
            	pageNum: 1,
            	condition:condition
            },
            type: "POST",
            dataType: "JSON",
            success: function(data) {
            	//初始化页面参数 返回各个设备列表和设备个数
	            var str = "";
	            var Lists=data.dataList
	             for(var k in Lists) {
		            str += "<tr><td>" + Lists[k].userid + "</td><td>" + Lists[k].username + "</td><td>" + Lists[k].loginname + "</td><td>" 
		            + Lists[k].phone + "</td><td>" +Lists[k].email + "</td><td>" 
		             +Lists[k].userstatus + "</td><td>  <a class='delete'><span>删除</span></a>" +"</td></tr>";
		          }  
	            $("#nr2").html(str);
	            
	            $('#page2').jqPaginator({
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
    
    
    

  </script>
</head>
<body>
  <div class="page mgt-alarm">
 	<div>
  <!--include是静态引入  jsp:include是动态引入 -->
  <%@ include file="header.jsp" %>
<%--   <jsp:include page="header.jsp" flush="true" /> --%>
    </div>
    <div class="m-bread">
    <style>
		p{padding:0px; margin:0px;display: inline;}
	</style>

     <a href="javascript:void(0);" onclick="main()"><p>首页</p></a><p> /</p>  <a href="#"><p>告警与控制管理 </p></a> 
   
    </div>
    <div class="box-1">
      <div class="m-title">
        <i style="background-image: url(../static/title-2.png);"></i>
        <a>报警信息</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
       
           <input type="text" name="areaName"  id ="queryError" placeholder="请输入区域名称">
          <button onclick="searcnAlarm()">查询</button>
        
         
        </div>
      </div>
      <div class="m-table">
        <table>
          <thead>
            <tr>
              <th>序号</th>
              <th>区域名称</th>
              <th>报警类型</th>
              <th>报警时间</th>
              <th>报警设备</th>
              <th>报警数值</th>
              <th>报警联系人</th>
            </tr>
          </thead>
          <tbody id="nr1">
        
          </tbody>
        </table>
      </div>
         <div class="m-paging">
        <div id="page1"></div>
        </div>
    </div>
    <div class="box-1">
      <div class="m-title">
        <i style="background-image: url(../static/title-2.png);"></i>
        <a>规则设置</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="areaName" id="queryRule" placeholder="请输入区域名称">
          <button  onclick="searchRule()">查询</button>
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
              <th>告警规则</th>
              <th>控制规则</th>
              <th>报警联系人</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody id="nr2">
         
   
          </tbody>
        </table>
      </div>
          <div class="m-paging">
        <div id="page2"></div>
        </div>
    </div>
    <div id="p1" class="m-popup-bg popup-1">
      <div class="m-popup">
        <div class="hd">
          <span>编辑</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-select">
            <span>选择区域：</span>
            <label>
              <div>请选择</div>
              <ul>
                <li>选项一</li>
                <li>选项二</li>
                <li>选项三</li>
                <li>选项四</li>
                <li>选项五</li>
                <li>选项三</li>
                <li>选项四</li>
                <li>选项五</li>
              </ul>
              <input type="hidden" name="">
            </label>
          </div>
          <div class="m-title-3">
            <a>控制规则</a>
            <div></div>
          </div>
          <div class="m-double-select">
            <span>温度控制范围：</span>
            <label><input type="text" name="" placeholder="初始"></label>
            <i></i>
            <label><input type="text" name="" placeholder="末尾"></label>
          </div>
          <div class="m-double-select">
            <span>湿度控制范围：</span>
            <label><input type="text" name="" placeholder="初始"></label>
            <i></i>
            <label><input type="text" name="" placeholder="末尾"></label>
          </div>
          <div class="m-title-3">
            <a>告警规则</a>
            <div></div>
          </div>
          <div class="m-input">
            <span>温度高于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>温度低于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>温度高于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>温度低于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm">确认</button>
        </div>
      </div>
    </div>
    <div id="p2" class="m-popup-bg popup-2">
      <div class="m-popup">
        <div class="hd">
          <span>添加</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-select">
            <span>选择区域：</span>
            <label>
              <div>请选择</div>
              <ul>
                <li>选项一</li>
                <li>选项二</li>
                <li>选项三</li>
                <li>选项四</li>
                <li>选项五</li>
                <li>选项三</li>
                <li>选项四</li>
                <li>选项五</li>
              </ul>
              <input type="hidden" name="">
            </label>
          </div>
          <div class="m-marked-title">
            <div>
              <span>温湿度规则</span>
            </div>
          </div>
          <div class="m-title-3">
            <a>控制规则</a>
            <div></div>
          </div>
          <div class="m-double-select">
            <span>温度控制范围：</span>
            <label><input type="text" name="" placeholder="初始"></label>
            <i></i>
            <label><input type="text" name="" placeholder="末尾"></label>
          </div>
          <div class="m-double-select">
            <span>湿度控制范围：</span>
            <label><input type="text" name="" placeholder="初始"></label>
            <i></i>
            <label><input type="text" name="" placeholder="末尾"></label>
          </div>
          <div class="m-title-3">
            <a>告警规则</a>
            <div></div>
          </div>
          <div class="m-input">
            <span>温度高于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>温度低于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>温度高于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>温度低于该值告警：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>

          <div class="m-marked-title">
            <div>
              <span>入侵规则</span>
            </div>
          </div>
          <div class="m-switch">
            <span>入侵告警：</span>
            <label> 
              <div>
                <a>OFF</a>
              </div>
              <input type="hidden" name="">
            </label>
          </div>

          <div class="m-marked-title">
            <div>
              <span>火警规则</span>
            </div>
          </div>
          <div class="m-switch">
            <span>火警告警：</span>
            <label> 
              <div>
                <a>OFF</a>
              </div>
              <input type="hidden" name="">
            </label>
          </div>

          <div class="m-marked-title">
            <div>
              <span>浸水规则</span>
            </div>
          </div>
          <div class="m-switch">
            <span>浸水告警：</span>
            <label> 
              <div>
                <a>OFF</a>
              </div>
              <input type="hidden" name="">
            </label>
          </div>

        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm">确认</button>
        </div>
      </div>
    </div>
     <%@ include file="userPWD.jsp" %>
  </div>
  <div class="sky-bg" id="particles-js"></div>
 
</body>
</html>