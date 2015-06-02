package com.easycose.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.Map.Entry;

import javax.imageio.ImageIO;

public class Tool {
	
	public static boolean isWindow = isWindowsOS();
	
	// windows 路径分割正反斜杠皆可，不�?要区�?
	// Linux   只用正斜�?
	private static String DIR_SEPATRATOR = "/";
	
	
	
	public static void resizeImage(File srcFile, File destFile) throws IOException {  
   
        Image srcImg = ImageIO.read(srcFile);  
        BufferedImage buffImg = null;  
        buffImg = new BufferedImage(87, 20, BufferedImage.TYPE_INT_RGB);  
        buffImg.getGraphics().drawImage(  
                srcImg.getScaledInstance(87, 20, Image.SCALE_SMOOTH), 0,  
                0, null);  
  
        ImageIO.write(buffImg, "png", destFile); 
  
    }
	
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		// 鍘绘�?鈥�鈥濈鍙�?
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18)
				+ s.substring(19, 23) + s.substring(24);
	}
	
	public static String getDateStr(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		return str;
	}
	
	public static Date strToDate(String str,String format){
		if(format==null){
			format = "yyyy-MM-dd HH:mm:ss";//default
		}
		Date date = new Date();
		try {
			DateFormat df = new SimpleDateFormat(format);
			date = df.parse(str);
			System.out.println("         date ="+date);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("         date ="+date);
		return date;
	}
	
	public static String dateToStr(Date date,String format){
		if(format==null){
			format = "yyyy-MM-dd HH:mm:ss";//default
		}
		String str;
		DateFormat df = new SimpleDateFormat(format);
		str = df.format(date);
		return str;
	}
	
	public static boolean isWindowsOS(){
	    boolean isWindowsOS = false;
	    String osName = System.getProperty("os.name");
	    if(osName.toLowerCase().indexOf("windows")>-1){
	      isWindowsOS = true;
	    }
	    return isWindowsOS;
	 }
	
	public static boolean copyFile(File src, File dst) {
		if (!src.exists())
			return false;
		try {
			if (!dst.exists())
				dst.createNewFile();
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dst);
			byte[] buf = new byte[1024];
			int len = -1;
			while ((len = fin.read(buf)) != -1)
				fout.write(buf, 0, len);
			fout.flush();
			fout.close();
			fin.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public static File createFile(String fileName) throws IOException {
		File f = new File(fileName);
		if (!f.exists()) {
			createDirs(f.getParentFile()); // 鍒涘缓鐖剁洰褰�
			f.createNewFile(); // 鍒涘缓褰撳墠鏂囦�?
		}
		return f;
	}

	public static void createDirs(File dir) throws IOException {

		if (dir == null || dir.exists()) {
			return;
		}
		createDirs(dir.getParentFile());
		dir.mkdir();
	}
	
	public static void main(String[] args) {
		System.out.println(Tool.genLegalFilename("2.jpg")); // For test
		System.out.println(dateToStr(new Date(), null));
		System.out.println(Tool.getDateStr());
		
		
	}
	
	
	 public static String hashMapToJson(HashMap<String,Integer> map) {  
	        String string = "{";  
	        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {  
	            Entry e = (Entry) it.next();  
	            string += "\"" + e.getKey() + "\":";  
	            string += "\"" + e.getValue() + "\",";  
	        }  
	        string = string.substring(0, string.lastIndexOf(","));  
	        string += "}";  
	        return string;  
	    }
	 
	 public static String hashMapToJsonWithString(HashMap<String,String> map) {  
	        String string = "{";  
	        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {  
	            Entry e = (Entry) it.next();  
	            string += "\"" + e.getKey() + "\":";  
	            string += "\"" + e.getValue() + "\",";  
	        }  
	        string = string.substring(0, string.lastIndexOf(","));  
	        string += "}";  
	        return string;  
	    }

	//鑾峰緱鏂囦欢鎵╁睍鍚�?
	public static String getExtensionName(String filename) {
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length() - 1))) {
				return filename.substring(dot + 1);
			}
		}
		return filename;
	}
	 
	//淇濈�?褰撳墠鏂囦欢鎵╁睍鍚嶏紝骞舵牴鎹敓鎴愭柊鐨勬枃浠跺�?
	public static String genLegalFilename(String originName) {
		return getUUID() + '.' + getExtensionName(originName);
	}
	
	
	// Return Example: 20140807
	public static String getYearMonthDayStr(){
		Date aDate = new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd"); 
		String formattedDate = formatter.format(aDate); 
		return formattedDate;
	}
	
	//根据action，操作系统和时间组合路径
	public static String genUploadBaseDir(String actionDirName){
		String savePath = "";
		if (Tool.isWindowsOS()) {
			savePath = Constants.WinPath;
		} else {
			savePath = Constants.LinuxPath;
		}
		
		savePath += DIR_SEPATRATOR + actionDirName 
				+ DIR_SEPATRATOR + getYearMonthDayStr() ; 
		
		File f1 = new File(savePath);
		if (!f1.exists()) {
			f1.mkdirs();
		}
		
		
		return savePath;
	}
	
    

	
	
	
    /*
       获取商品图片保存路径
      style = 0   二手
      style = 1   代购


      savePlaceType =1：数据库
      savePlaceType =2：硬�?     
    */

	public static String getPicSavePath(int style,int savePlaceType){
	     String uploadPath="";
	     
	     if(1==savePlaceType){                 //1、数据库
	    	  if(0==style){                         //二手
	    	               uploadPath = Constants.secondhandSellerPicturePath_db + Tool.getYearMonthDayStr() + "";
  	          }else if(1==style){                   //代购
  		                   uploadPath = Constants.insteadSellerPicturePath_db + Tool.getYearMonthDayStr() + "";
  	          }
	     }else if(2==savePlaceType){          //2、硬�?     
	    	 if(0==style){                          //二手
	    		     if (Tool.isWindowsOS()) {            //windows
	    		    	   uploadPath = Constants.secondhandSellerPicturePath_disk_win + Tool.getYearMonthDayStr() + "";
	    		     }else{                               //Linux
	    		    	   uploadPath = Constants.secondhandSellerPicturePath_disk_linux + Tool.getYearMonthDayStr() + "";
	    		     }
	    		    
	          }else if(1==style){                   //代购
	        	     if (Tool.isWindowsOS()) {            //windows
   		    	           uploadPath = Constants.insteadSellerPicturePath_disk_win + Tool.getYearMonthDayStr() + "";
   		             }else{                               //Linux
   		    	           uploadPath = Constants.insteadSellerPicturePath_disk_linux + Tool.getYearMonthDayStr() + "";
   		             }
	          }
	     }
	 
// 	 System.out.println("uploadPath ="+uploadPath);
	      return uploadPath;
     }
	
	
	
    //根据OS，调整路�? （删除商品图片�?�用户图�?... 时需要）
    public static String getDeletePath(String path){   	 
        /*
             /zhaoxiajiaResource/commodity/secondhandSeller/picture/20141102/3e96b32d651042c697dbb07454d5a546.jpg  
                         改为
                   C:/zhaoxiajia/commodity/secondhandSeller/picture/20141102/3e96b32d651042c697dbb07454d5a546.jpg
        */      
    	
    	// 根据OS，调整路�?
		if (Tool.isWindowsOS()) {
			path = path.replace("/zhaoxiajiaResource", Constants.WinPath); // WinPath="C:\\zhaoxiajia";
		} else {
			path = path.replace("/zhaoxiajiaResource", Constants.LinuxPath); // LinuxPath="/home/zhaoxiajia";
		}

	//	System.out.println("path =" + path);

		return path;
    }
    
    
    
    
    
    /*
         获取图片保存路径 ：在浏览网站时发现我们的错误�?要改进的地方
     savePlaceType =1：数据库
     savePlaceType =2：硬�?     
    */

	public static String getSuggestionPicSavePath(int savePlaceType){
	     String uploadPath="";
	     
	     if(1==savePlaceType){                 //1、数据库
	    	               uploadPath = Constants.suggestionToImprove_db + Tool.getYearMonthDayStr() + "";
	          
	     }else if(2==savePlaceType){          //2、硬�?     
	    		     if (Tool.isWindowsOS()) {            //windows
	    		    	   uploadPath = Constants.suggestionToImprove_disk_win + Tool.getYearMonthDayStr() + "";
	    		     }else{                               //Linux
	    		    	   uploadPath = Constants.suggestionToImprove_disk_linux + Tool.getYearMonthDayStr() + "";
	    		     }
	     }
	 
//	 System.out.println("uploadPath ="+uploadPath);
	      return uploadPath;
     }
    
}
