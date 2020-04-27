package com.wkp.test;




import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.wkp.common.utils.DateUtil;
import com.wkp.domain.Person;
import com.wkp.utils.RandNumUtil;
import com.wkp.utils.ZHStringUtil;

public class UserTest {

	@Test
	public void test() {
		
		
		
		for (int i = 0; i < 100; i++) {
			Person p=new Person();
			//获取时间日历
			Calendar c = Calendar.getInstance();
			//重新设置时间
			c.set(2012, 1, 1);
			//赋值
			p.setName(ZHStringUtil.getZHName());
			p.setId(i+1);
			p.setAge(RandNumUtil.random(1, 100));//生成随机数调用自己写的工具类
			p.setXc(RandNumUtil.getValue(30000, 80000, 2));//生成随机薪资调用自己写的工具类
			Date random = DateUtil.random(c.getTime(), new Date());
			p.setPy(random);
			
			System.out.println(i+1+" "+p);
		}
		
		
	}

}
