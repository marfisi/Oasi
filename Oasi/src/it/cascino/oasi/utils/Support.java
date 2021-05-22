package it.cascino.oasi.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Support{
	private static String decimalSep;
	private static DecimalFormatSymbols symbols;
	private static DecimalFormat decimalFormat;

	public static String floatToString(Float f){
		if(f == null){
			return "";
		}
		decimalSep = ",";
		symbols = new DecimalFormatSymbols(Locale.ITALY);
		symbols.setDecimalSeparator(decimalSep.charAt(0));
		decimalFormat = new DecimalFormat("#.##", symbols);
		decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
		String fToStr = decimalFormat.format(f);
		return fToStr;
	}
	
	public static BigDecimal arrotonda(BigDecimal val, Integer precisione){
		return val.setScale(precisione, RoundingMode.HALF_UP);
	}
}
