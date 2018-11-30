<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <script type="text/javascript">
  var page;
    $(function(){
    	
    	  $("#page").Page({
  		    totalPages:${page.totalPages},//total Pages
  		    liNums: ${page.pageSize},//the li numbers(advice use odd)
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
  		    
  		    var form1= 	document.getElementById("form1");
  		   var pageNum= 	document.getElementById("pageNum");
  		 pageNum.value=page
  		 console.log(form1)
  		  form1.action="${webPath}/equipment/findByPage.do";
  		  form1 .submit(); 
  	/* 	   var form1= 	document.getElementById("form1")
  		        //callBack function，page:active page
  		 	("#form1").action="${webPath}/equipment/findByPage.do?pageNum="+page;
  		 	console.log(form1);
  		 		("#form1").action.submit();  */
  		    }
  		}); 
    	  
    	  
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
        <i style="background-image: url(static/title-4.png);"></i>
        <a>终端设备</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称">
          <button>查询</button>
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
          <tbody>
           <c:forEach items="${page.dataList }" var="d">
            <tr>
              <td>01</td>
              <td>设备名称1</td>
              <td>设备标识</td>
              <td>温度监控</td>
              <td>区域名称1</td>
              <td>网关设备名称</td>
              <td class="green">在线</td>
              <td class="green">正常</td>
              <td>备注信息备注信息</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
 		</c:forEach>
          </tbody>
        </table>
      </div>
     
	
	     	<form id="form1">
	     	<input name="pageNum"  id="pageNum">
	     	</form>
	 
       <div class="m-paging">
        <div id="page"></div>
      </div>

      
     
    </div>
    <div class="box-1 zjsb">
      <div class="m-title">
        <i style="background-image: url(static/title-4.png);"></i>
        <a>中继设备</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称">
          <button>查询</button>
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
              <th>设备标识</th>
              <th>工作状态</th>
              <th>更新时间</th>
              <th>备注</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${page.dataList }" var="d">
            <tr>
              <td>01</td>
              <td>id19339458</td>
              <td>设备名称设备名称1</td>
              <td class="green">在线</td>
              <td>2018-10-15 10:29</td>
              <td>备注信息备注信息</td>
              <td>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
         </c:forEach>
          </tbody>
        </table>
      </div>
         <div class="m-paging">
        <div id="page1"></div>
      </div>
    </div>
    <div class="box-1 wgsb">
      <div class="m-title">
        <i style="background-image: url(static/title-4.png);"></i>
        <a>网关设备</a>
        <div></div>
      </div>
      <div class="control-bar">
        <div class="m-search">
          <i></i>
          <input type="text" name="" placeholder="请输入区域名称">
          <button>查询</button>
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
          <tbody>
            <c:forEach items="${page.dataList}" var="d">
            <tr>
              <td>01</td>
              <td>设备名称1</td>
              <td>设备标识</td>
              <td>420</td>
              <td>WG26</td>
              <td>1</td>
              <td>12.11</td>
              <td class="green">在线</td>
              <td>2018-10-15 10:29</td>
              <td>备注信息备注信息</td>
              <td>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
         </c:forEach>
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
          <span>添加</span>
          <a class="close"></a>
        </div>
        <div class="bd">
          <div class="m-input">
            <span>设备名称：</span>
            <label>
              <input type="text" name="" placeholder="请输入设备名称">
            </label>
          </div>
          <div class="m-select">
            <span>归属区域：</span>
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
          <div class="m-select">
            <span>设备类型：</span>
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
          <div class="m-input">
            <span>设备SN：</span>
            <label>
              <input type="text" name="" placeholder="请输入SN">
            </label>
          </div>
          <div class="m-input">
            <span>设备MAC：</span>
            <label>
              <input type="text" name="" placeholder="请输入MAC">
            </label>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm">确认</button>
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
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>设备MAC：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm">确认</button>
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
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>设备MAC：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-input">
            <span>GPS信息：</span>
            <label>
              <input type="text" name="" placeholder="请输入区域名称">
            </label>
          </div>
          <div class="m-textarea">
            <span>备注信息：</span>
            <label>
              <textarea placeholder="请输入备注内容"></textarea>
            </label>
          </div>
        </div>
        <div class="ft">
          <button class="cancel">取消</button>
          <button class="confirm">确认</button>
        </div>
      </div>
    </div>
  </div>
  <div class="sky-bg" id="particles-js"></div>
  <script src="js/particles.min.js"></script>
  <script src="js/app.js"></script>
</body>
</html>