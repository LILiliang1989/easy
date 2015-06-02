package com.easycose.util;

import org.apache.struts2.ServletActionContext;

public class Constants {
	public final static String WinPath="C:\\zhaoxiajia";
	public final static String LinuxPath="/home/zhaoxiajia";
	public static final Object USER_SESSION = "cur_user";
	
	
	
	
	/********** 1、商品图�?   **********/
	/*** 1.1、硬�?   ***/
	//二手商品
	public static final String secondhandSellerPicturePath_disk_win  ="C:/zhaoxiajia/commodity/secondhandSeller/picture/";       //Windows下的保存路径
	public static final String secondhandSellerPicturePath_disk_linux="/home/zhaoxiajia/commodity/secondhandSeller/picture/";	 //Linux下的保存路径
	
	//代购商品
	public static final String insteadSellerPicturePath_disk_win  ="C:/zhaoxiajia/commodity/insteadSeller/picture/";             //Windows下的保存路径
	public static final String insteadSellerPicturePath_disk_linux="/home/zhaoxiajia/commodity/insteadSeller/picture/";	         //Linux下的保存路径
		
	
	/*** 1.2、数据库   ***/
	public static final String secondhandSellerPicturePath_db="/zhaoxiajiaResource/commodity/secondhandSeller/picture/";        //保存在数据库中的路径
	public static final String insteadSellerPicturePath_db   ="/zhaoxiajiaResource/commodity/insteadSeller/picture/";           //保存在数据库中的路径

	
	
	
	
	
	/********** 2、需要改进：图片   **********/
	/*** 2.1、硬�?   ***/
	public static final String suggestionToImprove_disk_win      ="C:/zhaoxiajia/suggestionToImprove/picture/";       //Windows下的保存路径
	public static final String suggestionToImprove_disk_linux ="/home/zhaoxiajia/suggestionToImprove/picture/";	      //Linux下的保存路径
	
	
	/*** 2.2、数据库   ***/
	public static final String suggestionToImprove_db         ="/zhaoxiajiaResource/suggestionToImprove/picture/";	      //Linux下的保存路径


}
