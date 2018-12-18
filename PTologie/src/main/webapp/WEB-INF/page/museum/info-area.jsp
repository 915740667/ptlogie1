<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   "http://www.w3.org/TR/html4/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta charset="utf-8">
  <title></title>
  <script type="text/javascript">
    $(function(){
    searchType(1); 
   mPopup(); 
   mSelect(); 
     mCheckbox(); 
       mSwitch2(); 
      $(".control-bar .add").click(function(){
        $("#p1").show();
      })
      $(".m-table .edit").click(function(){
        $("#p1").show();
      })

      jeDate("#d1",{
        isinitVal:true,
        format: 'YYYY-MM-DD',
        donefun: function(obj){
        //时间
        var date=obj.val
        var Type=document.getElementById("Type").value;
        var AreaId="<%=session.getAttribute("AreaId")%>";
        
    /*     $.ajax({
	        url: "${webPath}/subarea/searchAreaDataByTypeAndDateAndAreaId",
	        data: {
	        	sceneId: AreaId,
	        	type:Type,
	        	date:d1
	        },
	        type: "POST",
	        dataType: "text",
	        success: function(data) {
	        	
	        }
	        });   */
        
        }   
      })
      
      jeDate("#d2",{
        isinitVal:true,
        format: 'YYYY-MM-DD'
      })
      
      jeDate("#d3",{
        isinitVal:true,
        format: 'YYYY-MM-DD'
      })

    })
    
    
    //环境数据温湿度查询图像
 		function  searchType(Type){
    	
    	var AreaId="<%=session.getAttribute("AreaId")%>";
    	//初始化类型
    	var TypeData=document.getElementById("Type");
    	TypeData.value=Type 
    	//获取时间 
    	var d1=document.getElementById("d1").value;
    	
  /* 	$.ajax({
	        url: "${webPath}/subarea/searchAreaDataByTypeAndDateAndAreaId",
	        data: {
	        	sceneId: AreaId,
	        	type:Type,
	        	date:d1
	        },
	        type: "POST",
	        dataType: "text",
	        success: function(data) {
	        	
	        }
	        });  */
	
    }
  </script>
</head>
<body>
  <div class="page info-area">
  <div>
   <%@ include file="header.jsp" %>
 </div>
    <div class="m-bread">
      <style>
		p{padding:0px; margin:0px;display: inline;}
	</style>
      <a href="javascript:void(0);" onclick="main()"><p>首页</p></a><p> /</p>  <a href="#"><p>区域信息 </p></a> 
    </div>
    <div class="box-1">
      <div class="item">
        <span>实时温度</span>
        <div class="numerical">
          <i>36</i>
          <p>℃</p>
        </div>
      </div>
      <div class="item">
        <span>实时湿度</span>
        <div class="numerical">
          <i>55</i>
          <p>%RH</p>
        </div>
      </div>
      <div class="item">
        <span>烟感报警</span>
        <div class="normal">
          <i></i>
          <p>正常</p>
        </div>
      </div>
      <div class="item">
        <span>火警监测</span>
        <div class="warning">
          <i></i>
          <p>报警</p>
        </div>
      </div>
      <div class="item">
        <span>漏水监测</span>
        <div class="normal">
          <i></i>
          <p>正常</p>
        </div>
      </div>
    </div>
    <div class="box-2">
      <div class="m-title">
        <i style="background-image: url(../static/title-5.png);"></i>
        <a>环境数据</a>
        <div></div>
      </div>
      <div class="left">
        <div class="filter">
          <div class="m-switch-2" id="m-switch-2">
            <a class="active" onclick="searchType(1)" >温度</a>
            <a onclick="searchType(2)" >湿度</a>
            <input type="hidden" id="Type"> 
          </div>
      
          <div class="m-input date">
            <label>
              <input id="d1" type="text" name="" placeholder="选择日期">
            </label>
          </div>
        </div>
        
           
        <div id="c1" class="chart-1"></div>
        <script type="text/javascript">
        $(function(){
        	
        });
    
      
          var data1 = [
            {
              name:"设备名称1",
              data:[31,34,65,23,45,76,12,34,21,25,54,21,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称2",
              data:[12,31,34,65,23,45,76,12,34,21,25,54,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称3",
              data:[54,21,31,34,65,23,45,76,12,34,21,25,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称4",
              data:[23,45,76,12,34,21,25,54,21,31,34,65,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称5",
              data:[45,76,12,34,21,25,54,21,31,34,65,23,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称6",
              data:[76,12,34,21,25,54,21,31,34,65,23,45,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称7",
              data:[12,34,21,25,54,21,31,34,65,23,45,76,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称8",
              data:[37,34,63,23,44,26,12,54,81,25,94,21,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称9",
              data:[51,44,25,23,45,23,13,34,25,35,64,33,31,34,65,23,45,76,12,34,21,25,54,21,21]
            },
            {
              name:"设备名称10",
              data:[35,33,68,28,48,78,18,38,28,28,58,28,31,34,65,23,45,76,12,34,21,25,54,21,21]
            }
          ];
          
          
          var qujian = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24];
          var color1 = ["#ffea00","#ffa800","#f88552","#ff2323","#acd056","#20d3e8","#00adff","#2832ff","#f000ff","#644aff"];
          var series1 = [];
          var name1 = [];
          for(var i =0;i<data1.length;i++){
            var obj = {};
            obj.name = data1[i].name;
            obj.type = 'line';
            obj.symbol = 'circle';
            obj.symbolSize = 5;
            obj.lineStyle = {};
            obj.lineStyle.normal = {};
            obj.lineStyle.normal.width = 1;
            obj.itemStyle = {};
            obj.itemStyle.normal={};
            obj.itemStyle.normal.color = color1[i];
            obj.data = data1[i].data
            series1.push(obj);
            name1.push(data1[i].name);
          }
          var c1 = echarts.init(document.getElementById('c1'));
          var option1 = {
              tooltip: {
              trigger: 'axis'
            },
            grid:{
                left:'5%',
                right:'0',
                bottom:'15%',
                containLabel:true
            },

            
            legend: {
              icon: 'rect',
              itemWidth: 14,
              itemHeight: 5,
              itemGap: 13,
              data: name1,
              right: '4%',
              textStyle: {
                fontSize: 12,
                color: '#F1F1F3'
              }
            },
            xAxis: {
              data: qujian,
              axisLabel: {
                textStyle: {
                  color: '#fff',
                  fontStyle: 'normal',
                  fontSize: 13,
                }
              },
              splitLine: {
                show: true,
                lineStyle: {
                  color: ['#0b2443'],
                }
              },
              axisLine:{
                lineStyle:{
                  color:'#00adff',
                }
              },
            },
            yAxis: {
              axisLabel: {
                textStyle: {
                  color: '#fff',
                  fontStyle: 'normal',
                  fontSize: 13,
                }
              },
              splitLine: {
                show: true,
                lineStyle: {
                  color: ['#0b2443'],
                }
              },
              axisLine:{
                lineStyle:{
                  color:'#00adff',
                }
              },
            },
            //工具栏支持数据展示缩放
            toolbox: {
            	left: "300px",
            	top: "90%",
            	bottom: "3%",
            	right: "15%",
            	containLabel: true,
                feature: {
                   dataView:{  //数据展示
                	   show:true,
                	 /*   textColor:'#100' ,
                	   textareaColor:'#c23531' */
                   },
                   restore:{ //还原
                	   show:false,
                   },
                   dataZoom:{ // 截取部分数据展示
                	   show:true
                   },
                   saveAsImage:{
                	   show:true
                   }
                   
                }
            },
            series: series1
          };
          c1.setOption(option1);
        </script>
      </div>
      <div class="right">
        <div class="m-table">
          <table>
            <thead>
              <tr>
                <th>序号</th>
                <th>设备名称</th>
                <th>类型</th>
                <th>数据内容</th>
                <th>上报时间</th>
                <th>告警内容</th>
                <th>环境分布</th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${equipmentList}" var="eqp">
              <tr>
                <td>01</td>
                <td>设备名称1</td>
                <td>类型1</td>
                <td>数据内容1</td>
                <td>2018-10-22</td>
                <td>告警内容1</td>
                <td><a class="to-view" onclick="toshow('1')"><span>查看</span></a></td>
              </tr>
			</c:forEach>
            </tbody>
          </table>
        </div>
        <div class="m-paging">
        <div id="page1"></div>
        </div>
      </div>
    </div>

    <div class="box-3">
      <div class="m-title">
        <i style="background-image: url(../static/title-6.png);"></i>
        <a>安全数据</a>
        <div></div>
      </div>
      <div class="m-table">
        <table>
          <thead>
            <tr>
              <th>序号</th>
              <th>设备名称</th>
              <th>类型</th>
              <th>数据内容</th>
              <th>上报时间</th>
              <th>告警系统</th>
            </tr>
          </thead>
          <tbody>
             <c:forEach items="${equipmentList}" var="eqp">
            <tr>
              <td>01</td>
              <td>设备名称1</td>
              <td>类型1</td>
              <td>数据内容1</td>
              <td>2018-10-22</td>
              <td>告警内容1</td>
            </tr>
      </c:forEach>

          </tbody>
        </table>
      </div>
     <div class="m-paging">
        <div id="page4"></div>
        </div>
    </div>

    <div class="box-4">
      <div class="m-title">
        <i style="background-image: url(../static/title-1.png);"></i>
        <a>设备信息</a>
        <div></div>
      </div>
      <div class="left">
        <h5>
          <span>系统设备</span>
          <i>(在线率：85%)</i>
        </h5>
        <div class="statistical">
          <div class="item">
            <span>湿温度传感器</span>
            <div>
              <i>25</i>
              <p>台</p>
            </div>
          </div>
          <div class="item">
            <span>湿温度传感器</span>
            <div>
              <i>32</i>
              <p>台</p>
            </div>
          </div>
          <div class="item">
            <span>湿温度传感器</span>
            <div>
              <i>15</i>
              <p>台</p>
            </div>
          </div>
        </div>
        <h5><span>设备列表</span></h5>
        <div class="m-table">
          <table>
            <thead>
              <tr>
                <th>序号</th>
                <th>设备名称</th>
                <th>设备类型</th>
                <th>供电状态</th>
                <th>在线状态</th>
                <th>告警状态</th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${equipmentList}" var="eqp">
              <tr>
                <td>${eqp.equipmentid }</td>
                <td>${eqp.equipmentname}</td>
                <td>${eqp.equipmenttype}</td>
                <td>${eqp.eletric}</td>
                <td>${eqp.workstatus}</td>
                <td>${eqp.alarmstatus}</td>
              </tr>
           </c:forEach> 
            </tbody>
          </table>
        </div>
         <div class="m-paging">
        <div id="page2"></div>
        </div>
      </div>
      <div class="right">
        <h5><span>一周内系统告警数统计</span></h5>
        <div class="statistical">
          <div class="item">
            <span>湿温度传感器</span>
            <div>
              <i>25</i>
              <p>台</p>
            </div>
          </div>
          <div class="item">
            <span>湿温度传感器</span>
            <div>
              <i>32</i>
              <p>台</p>
            </div>
          </div>
          <div class="item">
            <span>湿温度传感器</span>
            <div>
              <i>15</i>
              <p>台</p>
            </div>
          </div>
        </div>
        <h5><span>告警信息</span></h5>
        <div class="m-table">
          <table>
            <thead>
              <tr>
                <th>序号</th>
                <th>报警设备</th>
                <th>报警数值</th>
                <th>告警类别</th>
                <th>告警时间</th>
                <th>联系人</th>
              </tr>
            </thead>
            <tbody>
       <c:forEach items="${alarmList}" var="alarm">
              <tr>
                <td>${alarm.id}</td>
                <td>${alarm.equipmentid}</td>
                <td>${alarm.datavalue}</td>
                <td>${alarm.type}</td>
                <td>new Date()</td>
                <td>${alarm.message}</td>
              </tr>
       </c:forEach>
            </tbody>
          </table>
        </div>
     <div class="m-paging">
        <div id="page3"></div>
        </div>
      </div>
    </div>
    <div class="box-5">
      <div class="m-title">
        <i style="background-image: url(../static/title-7.png);"></i>
        <a>监控报告</a>
        <div></div>
      </div>
      <div class="left">
        <div class="m-input">
          <span>报告名称：</span>
          <label>
            <input type="text" name="" placeholder="请输入区域名称">
          </label>
        </div>
        <div class="m-input date">
          <span>开始时间：</span>
          <label>
            <input id="d2" type="text" name="" placeholder="请选择日期">
          </label>
        </div>
        <div class="m-input date">
          <span>结束时间：</span>
          <label>
            <input id="d3" type="text" name="" placeholder="请选择日期">
          </label>
        </div>
      </div>
      <div class="right">
        <div class="m-input">
          <span>报告名称：</span>
          <label>
            <input type="text" name="" placeholder="请输入区域名称">
          </label>
        </div>
        <button>生成报告</button>
      </div>
    </div>
 <%@ include file="userPWD.jsp" %>
  </div>
  <div class="sky-bg" id="particles-js"></div>

</body>
</html>