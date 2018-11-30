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
		    	window.location.href="${webPath}/user/userList.do";
		    }
		}); 
      mPopup();
      mSelect();
      mCheckbox();
      $(".control-bar .add").click(function(){
        $("#p1").show();
      })
      $(".m-table .edit").click(function(){
        $("#p1").show();
      })
    })
  </script>
</head>
<body>
  <div class="page mgt-user">
	<div>
  <!--include是静态引入  jsp:include是动态引入 -->
  <%@ include file="header.jsp" %>
<%--   <jsp:include page="header.jsp" flush="true" /> --%>
    </div>
    <div class="m-bread">
      <style>
		p{padding:0px; margin:0px;display: inline;}
	</style>
       <a href="javascript:void(0);" onclick="main()"><p>首页</p></a><p> /</p>  <a href="#"><p>用户管理 </p></a> 
    </div>
    <div class="box-1">
      <div class="m-title">
        <i style="background-image: url(static/title-8.png);"></i>
        <a>用户管理</a>
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
              <th>用户名</th>
              <th>登录名</th>
              <th>手机号</th>
              <th>邮箱</th>
              <th>归属区域</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>01</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>02</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>03</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>04</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>05</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>06</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>07</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>08</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>09</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
            <tr>
              <td>10</td>
              <td>张筱雨</td>
              <td>admin1</td>
              <td>18829301090</td>
              <td>1827347478@qq.com</td>
              <td>区域名称区域名称1</td>
              <td>
                <a class="edit"><span>编辑</span></a>
                <a class="delete"><span>删除</span></a>
              </td>
            </tr>
           
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
          <div class="m-input">
            <span>登录名：</span>
            <label>
              <input type="text" name="" placeholder="请输入登录名">
            </label>
          </div>
          <div class="m-input">
            <span>姓名：</span>
            <label>
              <input type="text" name="" placeholder="请输入姓名">
            </label>
          </div>
          <div class="m-input">
            <span>密码：</span>
            <label>
              <input type="password" name="" placeholder="请输入密码">
            </label>
          </div>
          <div class="m-input">
            <span>重复密码：</span>
            <label>
              <input type="password" name="" placeholder="请重复输入密码">
            </label>
          </div>
          <div class="m-input">
            <span>手机号：</span>
            <label>
              <input type="text" name="" placeholder="请输入手机号">
            </label>
          </div>
          <div class="m-input">
            <span>邮箱：</span>
            <label>
              <input type="text" name="" placeholder="请输入邮箱">
            </label>
          </div>
          <div class="m-checkbox">
            <span>监控类型：</span>
            <div>
              <a class="selected"><input type="checkbox" name=""><span>温湿度监控</span></a>
              <a><input type="checkbox" name=""><span>水温预警</span></a>
            </div>
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