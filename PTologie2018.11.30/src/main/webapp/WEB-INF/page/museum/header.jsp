<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
</head>
<body>

    <div class="m-head">
      <div class="logo">
        <a><img src="../static/logo.png"></a>
        <h1>馆藏文物保存环境监控分析平台</h1>
      </div>
      <div class="info">
        <div class="setting">
          <a></a>
          <ul class="folding">
            <a href="javascript:void(0);" onclick="subarea()"><i class="quyu"></i><span>区域管理</span></a>
            <a href="javascript:void(0);" onclick="equipment()"><i class="shebei"></i><span>设备管理</span></a>
            <a href="javascript:void(0);" onclick="user()"><i class="yonghu"></i><span>用户管理</span></a>
            <a href="javascript:void(0);" onclick="alarm()"><i class="gaojing"></i><span>告警与控制管理</span></a>
          </ul>
        </div>
        <div class="user">
          <div>
          <!--页面引入图片，当在一个文件夹时可直接引入 若不在一个文件夹 有共同的父文件夹 可用 ../表示父文件夹  -->
            <img src="../static/img-1.png">
          </div>
          <!--header必須用静态引入，因为header需要从session获取用户,session在home.jsp里 静态引入是一个是页面  session共享  -->
          <a>${sessionScope.loginUser.username}</a>
          <ul class="folding">
            <a href="javascript:void(0);" onclick="test()"><i class="xiugai"></i><span>修改密码</span></a>
            <a href="javascript:void(0);" onclick="logout()"><i class="tuichu"></i><span>退出登录</span></a>
          </ul>
        </div>
      </div>
   </div>
      
     
     <script type="text/javascript">
 	function subarea(){
 		window.location.href="${webPath}/subarea/subareaList.do";
 	}
			function equipment(){
 			window.location.href="${webPath}/equipment/equipmentList.do";
			}
			function user(){
 		window.location.href="${webPath}/user/userList.do";
 		
			}
			function alarm(){
 			window.location.href="${webPath}/alarm/alarmList.do";
 	
			}
			
			function logout(){
	 			window.location.href="${webPath}/loginUser/logout.do";
	 	
				}
			function changepwd(){
	 			window.location.href="${webPath}/loginUser/changepwd.do";
	 	
				}
			
		       function main(){
		          	window.location.href="${webPath}/loginUser/toMain.do";
		          }
     </script>
</body>

</html>