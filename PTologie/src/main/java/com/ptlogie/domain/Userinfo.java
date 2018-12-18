package com.ptlogie.domain;

public class Userinfo {
	//用户id
    private Integer userid;

    private Integer companyid;

    private String username;

    private String password;

    private String phone;

    private String email;
    //用户类型  1 admin  2 手机用户默认收短信  3 手机用户不收短信
    private Integer usertype;
    //1登录 2 退出
    private Integer userstatus;
    // temper 温度监控  water 湿度监控  device 设备监控 
    private String watchtype;

    
    private String loginname;
    
    
    public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public String getWatchtype() {
        return watchtype;
    }

    public void setWatchtype(String watchtype) {
        this.watchtype = watchtype == null ? null : watchtype.trim();
    }
}