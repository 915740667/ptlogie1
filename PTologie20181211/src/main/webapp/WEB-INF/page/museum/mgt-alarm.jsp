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
    	$("#page").Page({
    	    totalPages:3 ,//total Pages
    	    liNums: 3,//the li numbers(advice use odd)
    	    activeClass: 'activP', //active class style
    	    firstPage: '首页',//first button name
    	    lastPage: '末页',//last button name
    	    prv: '上一页',//prev button name
    	    next: '下一页',//next button name
    	    hasFirstPage: true,//whether has first button
    	    hasLastPage: true,//whether has last button
    	    hasPrv: true,//whether has prev button
    	    hasNext: true,//whether has next button
    	    callBack : function(page){
    	        //callBack function，page:active page
    	    }
    	});
    	//加载数据
    	$("#page1").Page({
    	    totalPages:3 ,//total Pages
    	    liNums: 3,//the li numbers(advice use odd)
    	    activeClass: 'activP', //active class style
    	    firstPage: '首页',//first button name
    	    lastPage: '末页',//last button name
    	    prv: '上一页',//prev button name
    	    next: '下一页',//next button name
    	    hasFirstPage: true,//whether has first button
    	    hasLastPage: true,//whether has last button
    	    hasPrv: true,//whether has prev button
    	    hasNext: true,//whether has next button
    	    callBack : function(page){
    	        //callBack function，page:active page
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
    
  
    
    
    function searcnAlarm(){
    	
    	form1.action="${webPath}/alarm/searcnAlarm.do";
    	form1.submit();
    };
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
        <i style="background-image: url(static/title-2.png);"></i>
        <a>报警信息</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <form id="form1" name="form1">
           <input type="text" name="areaName" placeholder="请输入区域名称">
          <button onclick="searcnAlarm()">查询</button>
          </form>
         
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
          <tbody>
            <tr>
              <td>01</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>02</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>03</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>04</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>05</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>06</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>07</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>08</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>09</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
            <tr>
              <td>10</td>
              <td>区域名称区域名称1</td>
              <td>温度报警</td>
              <td>2018-10-15   10:29</td>
              <td>温度监控1号设备</td>
              <td>23.8℃</td>
              <td>张筱雨</td>
            </tr>
          </tbody>
        </table>
      </div>
         <div class="m-paging">
        <div id="page"></div>
        </div>
    </div>
    <div class="box-1">
      <div class="m-title">
        <i style="background-image: url(static/title-2.png);"></i>
        <a>规则设置</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
           <form id="form2">
          <input type="text" name="areaName" placeholder="请输入区域名称">
          <button  onclick="searchRule()">查询</button>
          </form>
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
          <tbody>
            <tr>
              <td>01</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>02</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>03</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>04</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>05</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>06</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>07</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>08</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>09</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>10</td>
              <td>区域名称区域名称1</td>
              <td>告警规则告警规则</td>
              <td>控制规则控制规则</td>
              <td>张筱雨</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
          <div class="m-paging">
        <div id="page1"></div>
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