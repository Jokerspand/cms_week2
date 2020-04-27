package com.wkp.utils;

public class RandNumUtil {

	//获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87
	public static double getValue(final double min, final double max,final int scale){
		
		int pow = (int) Math.pow(10, scale);
		int index=0;
		double one=0;
		while (1==1) {
			
			one=Math.floor((Math.random()*(max-min)+min)*pow)/pow;
			
			index++;
			
			if(index==100) {
				
				break;
			}
		}
		return one;
		
		
		}
	//返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值
	public static int random(int min, int max){
		
		int shu=(int) (Math.random()*((max-min)+min));
		return shu;
		
		} 
	
}
