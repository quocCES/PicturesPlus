package Interfaces;

public interface ReadyMadeFrames {
	//Style filter
	String txt_AllStyle_xpath = "//*[@id=\"frame-style-all\"]";
	String txt_KoaStyle_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[1]/ul/li[3]";
	String txt_ModernStyle_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[1]/ul/li[4]";
	String txt_DisstreesedStyle_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[1]/ul/li[5]";
	
	//Color filter
	String txt_AllColor_xpath = "//*[@id=\"frame-style-all\"]";
	String txt_Black_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[2]/ul/li[3]";
	String txt_White_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[2]/ul/li[4]";
	String txt_Gray_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[2]/ul/li[5]";
	String txt_Red_xpath = "//div[3]/div/div/div[1]/article/section/nav/div[2]/div[2]/ul/li[6]";
	
	//Price filter
	String txt_leftPrice_xpath = "//*[@id='price-ranger-slider']/div/div[1]";
	String txt_rightPrice_xpath ="//*[@id=\"price-ranger-slider\"]/div/div[3]/div";
	
//Product
	//KoaVenner
	String txt_KoaVener_xpath = "//*[@id=\"product-section\"]/ul/li[1]/div";
	//Matte Black 
	String txt_MatteBlack_xpath = "//*[@id=\"product-section\"]/ul/li[2]/div";
	//Light Brown Woodgrain
	String txt_lightBrownWoodgrain_xpath = "//*[@id=\"product-section\"]/ul/li[3]/div";
	//GreyWoodgrain
	String txt_GreyWoodgrain_xpath = "//*[@id=\"product-section\"]/ul/li[4]/div";
	//BrownW
	String txt_BrownWoodgrain_xpath = "//*[@id=\\\"product-section\\\"]/ul/li[5]/div";
	//Charcoal Woodgrain
	String txt_CharcoalWoodgrain_xpath ="//*[@id=\\\"product-section\\\"]/ul/li[6]/div";
	//WHITEWASH WOODGRAIN
	String txt_WHITEWASHWOODGRAIN_xpath ="//*[@id=\\\"product-section\\\"]/ul/li[7]/div";
}
