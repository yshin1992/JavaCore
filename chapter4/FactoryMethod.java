package chapter4;

import java.text.NumberFormat;

/**
 * 工厂方法示例
 * @author yshin1992
 *
 */
public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.1;
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		
		System.out.println(currencyFormatter.format(x));
		System.out.println(percentFormatter.format(x));
	}

}
