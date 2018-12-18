package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.List;

public class Page { 
	private int currentPage=1; //当前页数
    private int totalPages; //总页数
    private int totalCounts; //记录总行数
    private int pageSize=5; //每页记录行数
    private int nextPage; //下一页
    private int prefPage; //前一页
   
	private List dataList;//数据List


	public int getCurrentPage(){ 
    	return currentPage; 
    	}
    
    public void setCurrentPage(int currentPage){ 
    	this.currentPage = currentPage; 
    	} 
    
    public int getTotalPages() { 
    	totalPages = totalCounts % pageSize == 0 ? totalCounts / pageSize : totalCounts / pageSize + 1; return totalPages; 
    	} 
    
    public int getTotalCounts() { 
    	return totalCounts; 
    	} 
    
   
    
    public void setTotalCounts(int totalCounts) { 
    	this.totalCounts = totalCounts; 
    	} 
    
    public int getPageSize() {
    	return pageSize; 
    	} 
    
    public void setPageSize(int pageSize) {
    	this.pageSize = pageSize; 
    	} 
    
    public int getNextPage() { 
    	if (currentPage < totalPages) { 
    		nextPage = currentPage + 1; 
    		} 
    	else {
    		nextPage = currentPage; 
    		} 
    	return nextPage; 
    		} 
    
    public int getPrefPage() { 
    	if (currentPage > 1) { 
    		prefPage = currentPage - 1; 
    		} 
    	else 
    	{ 
    		prefPage = currentPage; 
    		} 
    	return prefPage;
    	} 
    
    
  

  	public List getDataList() {
  		return dataList;
  	}

  	public void setDataList(List dataList) {
  		this.dataList = dataList;
  	}
    
    }
