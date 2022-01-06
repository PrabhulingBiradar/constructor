class Adidas{
String gymtrainingbags;
String joggers;
String tracksuits;
String  jerseys;
String  sweatshirts;
int     price;
 Adidas(){
	System.out.println("the default constructor Adidas");
	System.out.println();
	}
	
	Adidas(String gt, String jog, String ts, String js, String ss){
	
	
	gymtrainingbags=gt;
	joggers =jog;
	tracksuits =ts;
    jerseys =js;
    sweatshirts = ss;
	System.out.println("the Constructor Adidas(String,String,String,String,String,String)");
	
	
	}
	
	Adidas (String jog, int pr){
	joggers=jog;
	price=pr;
	System.out.println("the constructor Adidas(String,int)");
	
	}
	
	}