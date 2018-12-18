<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   "http://www.w3.org/TR/html4/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>
<body>
 <div id="pp" class="m-popup-bg popup-1" style="display:none;">
      <div class="m-popup">
        <div class="hd">
          <span>修改密码</span>
          <a class="close"></a>
        </div>
        <div class="bd">
        <form id="userform"  name="userform" commandName="equipment" method="post">
          <div class="m-input">
            <span>密码：</span>
            <label>
              <input type="password"  id="password" name="password" placeholder="请输入新密码">
            </label>
          </div>
          <div class="m-input">
            <span>确认密码：</span>
            <label>
              <input type="password"  id="password1" name="password1" placeholder="请重新输入新密码">
            </label>
             <div id="errors" class="err_msg" >
          </div>
          </div>
          
          </form>
        </div>
        <div class="ft">
          <button class="cancel" id="canclePP">取消</button>
          <button class="confirm" id="confirmPP" onclick="confirmPP()">确认</button>
        </div>
      </div>
    </div>
    
</body>
</html>