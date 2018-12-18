<%@ page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   "http://www.w3.org/TR/html4/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
</head>
<body>

  <div class="page home">
  	<div>
  <!--include是静态引入  jsp:include是动态引入 -->
  <%@ include file="header.jsp" %>
    </div>
    <div class="container">
      <div class="left">
        <div class="m-title">
          <i style="background-image: url(../static/title-1.png);"></i>
          <a>系统设备</a>
          <div></div>
        </div>
        <div class="round">
          <div id="radio">
          </div>
          <br>
          <p>设备在线率</p>
        </div>
        <div class="box"  id="box">
        </div>
      </div>
      <div class="center">
        <div class="m-title">
          <i style="background-image: url(../static/title-1.png);"></i>
          <a>系统告警数统计</a>
          <div></div>
        </div>
        <div class="m-title-2">
          <a>7天告警数统计数据</a>
        </div>
        <div id="c1" class="chart-1"></div>
       
        <div class="m-title-2">
          <a>各区域告警比例图</a>
        </div>
        <div id="c2" class="chart-2"></div>
        
      </div>
      <div class="right">
        <div class="top">
          <div class="m-title">
            <i style="background-image: url(../static/title-3.png);"></i>
            <a>区域信息</a>
            <div></div>
          </div>
          <div class="box">
      			<div  id="dataInfo">
            </div>
          </div>
        </div>
        <div class="bottom">
          <div class="m-title">
            <i style="background-image: url(../static/title-4.png);"></i>
            <a>数据信息</a>
            <div></div>
          </div>
          <div class="box">
            <div class="item" id="day">
            
            </div>
            <div class="item" id="month">
            
            </div>
          </div>

          <div class="m-table">
            <table>
              <thead>
                <tr>
                  <th>序号</th>
                  <th>区域名称</th>
                  <th>设备名称</th>
                  <th>数据内容</th>
                  <th>上报时间</th>
                </tr>
              </thead>
              <tbody id="abc">
            
              </tbody>
            </table>
          </div>
  	<div class="m-paging">
      <div id="M-box1"></div>
     </div>
        </div>
      </div>
    </div>
    <%@ include file="userPWD.jsp" %>
  </div>
 <div class="sky-bg" id="particles-js"></div>
  <script type="text/javascript">
  $(function(){
	  
	  //警告统计
		 $.ajax({
		        url: "${webPath}/error/errorStatistics" ,
		        type: "POST",
		        
		        dataType: "JSON",
		        success: function(data) {
		        	 // 只需修改以下数据即可
		            var category1 = ["数据告警","设备告警"];
		            var data1 = data
		            //end 只需修改以上数据即可
		            var arr1=[],arr2=[],arr3=[];
		            for(var i = 0;i<data1.length;i++){
		              arr1.push(data1[i].val[0]);
		              arr2.push(data1[i].val[1]);
		              arr3.push(data1[i].x);
		            }
		            var c1 = echarts.init(document.getElementById('c1'));
		            var option1 = {
		              tooltip: {},
		              legend: {//图例组件，颜色和名字
		                right:10,
		                top:0,
		                itemGap: 16,
		                itemWidth: 7,
		                itemHeight: 7,
		                data:[{name:category1[0]},{name:category1[1]}],
		                textStyle: {
		                  color: '#fff',
		                  fontStyle: 'normal',
		                  fontFamily: '微软雅黑',
		                  fontSize: 14,            
		                }
		              },
		              xAxis: {
		                data: arr3,
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
		              series: [
		                {
		                  name: category1[0],
		                  type: 'bar',
		                  data: arr1,
		                  barWidth: 10,
		                  itemStyle:{
		                    normal:{
		                      color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
		                        offset: 1, color: 'rgba(33, 65, 139, 1)'
		                      },{
		                        offset: 0.5, color: 'rgba(0, 173, 255, 1)'
		                      }], false),
		                    }
		                  }
		                },
		                {
		                  name: category1[1],
		                  type: 'bar',
		                  data: arr2,
		                  barWidth: 10,
		                  itemStyle:{
		                    normal:{
		                      color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
		                        offset: 1, color: 'rgba(141, 50, 0, 1)'
		                      },{
		                        offset: 0.5, color: 'rgba(255, 90, 0, 1)'
		                      }], false),
		                    }
		                  }
		                }
		              ]
		            };
		            c1.setOption(option1);
		            
		        }
		    });
	  //警告比例
		 $.ajax({
		        url:  "${webPath}/error/alarmProportion" ,
		        type: "POST",
		       
		        dataType: "JSON",
		        success: function(data) {
		        
		            var c2 = echarts.init(document.getElementById('c2'));
		            var option2 = {
		             
		              series:[
		                {
		                  name: '访问来源',
		                  type: 'pie',
		                  radius : ['25%','40%'],
		                  center: ['50%', '50%'],
		                  data:data,
		                  label: {
		                    normal: {
		                      formatter: '{one|{d}%}{two|{b}}',
		                      textStyle: {
		                        rich:{
		                          one:{
		                            fontSize:18,
		                            color:"#fff",
		                            fontFamily: 'DINC',
		                          },
		                          two:{
		                            fontSize:13,
		                            color: '#00adff',
		                          }
		                        }
		                      }
		                    }
		                  },
		                  itemStyle: {
		                    emphasis: {
		                      shadowBlur: 10,
		                      shadowOffsetX: 0,
		                      shadowColor: 'rgba(0, 0, 0, 0.5)'
		                    },
		                    normal:{
                                color:function(params) {
                                //自定义颜色
                                var colorList = [          
                                        '#00FFFF', '#00FF00', '#FFFF00', '#FF8C00', '#FF0000', '#FE8463',"#17cbaf","#20d3e8","#00adff","#007eff","#f88552","#ffa800","#ffea00","#acd056",
                                    ];
                                    return colorList[params.dataIndex]
                                 }
                            }
		                  }
		                }
		              ]
		            }
		            c2.setOption(option2);
		        }
		    });
	  
	  mPopup();
 /*  setInterval("dataInfo()",2000);   */
	 eqpOnline(); 
	  dataInfo();  
  	 sensorCount(); 
	 areaData();   
	  dataCountByDay();   
	  dataCountByMonth();
  })
  //设备在线率
  function eqpOnline(){
	  $.ajax({
	        url: "${webPath}/equipment/eqpOnline" ,
	
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	        	
	          var str = "";
	             str += "<span  style='font-size:30px ;text-align:center; paddint-top:50px'>" + data + "</span><i>%</i>" ;
	            $("#radio").html(str); 
	        }
	    });
  }
  
  //查询传感器数量
  function sensorCount(){
	  $.ajax({
	        url:  "${webPath}/sensor/sensorCountByType" ,
	  
	        type: "POST",
	        dataType: "JSON",
	        success: function(data) {
	          var str = "";
	          
	         var Lists=data
	             for(var k in Lists) {
	            	    str += "<div class='item'><div class='info'> <i style='background-image: url(static/icon-1.png);'></i><p>" + Lists[k].type + "</p></div><div class='num'><span>" + Lists[k].count + "</span> <i>台</i></div> </div>" ; 
	            }  
	            $("#box").html(str);   
	         
	        }
	    });
  }
  
  //获取实时数据
   	function dataInfo() {
  		 $.ajax({
		        url: "${webPath}/dataInfo/init",
		    	data:{
 	    			pageNum: 1,
 	    		},
		        type: "POST",
		        dataType: "JSON",
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
  	//区域信息
  	function areaData(){
  		 $.ajax({
		        url:  "${webPath}/subarea/areaData" ,
		        type: "POST",
		        dataType: "JSON",
		        success: function(data) {
		        	
		            var str = "";
		            var Lists=data
		            
		             for(var k in Lists) {
		            	    str += " <div class='item'><div class='hd'><p>"+Lists[k].sceneName+"</p><span>"+Lists[k].location+
		            	    " </span> </div> <div class='bd'><ul> <li><i>设备数</i><span class='num'>"+Lists[k].deviceCount+"</span></li><li><i>物品</i><span>"
		            	    +Lists[k].articleName+"</span></li><li><i>一周告警次数</i><span class='num'>"+Lists[k].errorCount+"</span></li></div><a class='ft' href='#' onclick='areaInfo("+Lists[k].sceneId+")'> "+"<span>监控信息</span><i>"+"</i></a></div>";
		            }  
		         
		             $("#dataInfo").html(str);  
	           
		        }
		    });
  	}
  
  
 
     function areaInfo(id){
        	window.location.href="${webPath}/subarea/areaInfo?id="+id;
        } 
        
     
        
        
       
        
        function dataCountByDay(){
       	 $.ajax({
		        url: "${webPath}/dataInfo/dataCountByDay",
		        type: "POST",
		        dataType: "JSON",
		        success: function(data) {
		        	
		           		 var str = "";
		            	    str += "<i>当天数据量 :</i><span>" + data + "</span>";
		            $("#day").html(str);
		        }
		    });
        }
     
 		function dataCountByMonth(){
 			 $.ajax({
 		        url: "${webPath}/dataInfo/dataCountByMonth",
 		      
 		        type: "POST",
 		        dataType: "JSON",
 		        success: function(data) {
 		        	
 		     		 var str = "";
	            	    str += "<i>当月数据量 :</i><span>" + data + "</span>";
	            $("#month").html(str);
 		        }
 		    });
        }
          
  
 		
 		 function findPage1(d1){
 	    	$.ajax({
 	    		url: "${webPath}/dataInfo/findDataList",
 	    		data:{
 	    			pageNum: d1,
 	    		},
		        type: "POST",
		        dataType: "JSON",
		        success: function(data) {
		        	console.log(data.dataList)
		            var str = "";
		            var Lists=data.dataList
		             for(var k in Lists) {
		            	    str += "<tr><td>"+ Lists[k].id +"</td><td>" + Lists[k].sceneName + "</td><td>" + Lists[k].equipmentName + "</td><td>" 
		  		            + Lists[k].humidity + "</td><td>" +Lists[k].updatetime + "</td></tr>";
		            }  
		            $("#abc").html(str);
 		        }
 		    });
 	    }

        </script>
</body>
</html>