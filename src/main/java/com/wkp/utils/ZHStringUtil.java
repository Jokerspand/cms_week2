package com.wkp.utils;

import java.util.Random;

public class ZHStringUtil {

	//方法1：随机产生n个中文字符串 (8分)
	public static String getZHString(int n){
	
		StringBuffer bf=new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			bf.append(StringUtil.randomChineseString());
		}
		return bf.toString();
		
	}
	//方法2：获得中文姓名，必须以真实姓开头，中华姓氏参见”百家姓.txt”，名字使用1-2个随机汉字(8分) 
	public static String getZHName(){
		char[] first= {'赵', '钱', '孙', '李', '周', '吴', '郑', '王', '孔', '江',
                '曹', '魏', '刘', '冯', '陈', '褚', '卫', '蒋', '沈', '韩', '杨', '朱', '秦',
                '尤', '许', '何', '吕', '施', '张', '戚', '谢', '邹', '喻', '柏', '水', '窦',
                '章', '云', '苏', '潘', '葛', '奚', '范', '彭', '郎', '鲁', '韦', '昌'};
		
		//生成姓名
		int firsts = new Random().nextInt(first.length);
		
		//姓名拼接名字
		String name=first[firsts]+getZHString(RandNumUtil.random(2, 4));
		return name;
		
	}
}
