package com.easycose.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Random;

import com.opensymphony.xwork2.ActionContext;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
/**
 * 生成验证码
 * @author ldz
 *
 */
public class ImageAction {
	private InputStream imageStream;//借助于stream组件输出
	private String code;//页面传来的用户输入的验证码
	private boolean data = false;
	private String time;
	public String checkImage(){
		try {
			String s = (String)ActionContext.getContext().getSession().get("code");
			if(s.equalsIgnoreCase(code)){
				data = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "checkImage";
	}
	public String execute(){//业务方法  
		/**
		 * 1 生成验证码图片
		 * 2 将图片赋值给imageSream属性
		 */
		BufferedImage image = new BufferedImage(200,60,BufferedImage.TYPE_INT_RGB);
		Graphics graphic = image.getGraphics();		//获取画笔
		graphic.drawRect(0, 0, 200, 60);
		graphic.setColor(Color.white); 				//填充背景为白色
		graphic.fillRect(2, 2, 196, 56);				//设置边框
		Random ran = new Random();
	
		String str = getCode(4);
		String code = str;							//
		graphic.setColor(getRandomColor());			//随机背景色
		Font font = new Font(null, Font.BOLD,50);	//字体   三个参数非别为 
		graphic.setFont(font);
		graphic.drawString(str, 10, 45);			//将r  画上去
		// 将图片压缩成jpeg格式
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
		//画干扰线
		for(int i=1;i<=80;i++){
			graphic.setColor(getRandomColor());
			graphic.drawLine(ran.nextInt(200), ran.nextInt(200), ran.nextInt(200),ran.nextInt(200));
		}
		try {
			encoder.encode(image);
			//将图片压缩结果从bos中取出，给imageStream
			byte[] bytes = bos.toByteArray();
			imageStream = new ByteArrayInputStream(bytes);
			ActionContext.getContext().getSession().put("code",code);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";//可以跳转到error.jsp
		}    
		return "success";
		
	}

	public static Color getRandomColor(){//设置随机色
		Random ran = new Random();
		Color color = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
		return color;
	}
	private String getCode(int size){
		char[] chars={'A','B','C','D','E','F','G','H','S','J','K','M','N','P','Q','R','T','V','W','Y'};
		String code="";
		for(int i=0; i<size;i++){
			code+=chars[(new Random()).nextInt(chars.length)];
		}
		return code;
	}
	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isData() {
		return data;
	}
	public void setData(boolean data) {
		this.data = data;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
