class Adidastest{
		public static void main(String[] args){
		Adidas products= new Adidas();
		System.out.println("1st prd of Adidas");
		System.out.println("gymtrainingbags:"+products.gymtrainingbags+"\t joggers:"+products.joggers+"\t tracksuits"+products.tracksuits+"\t jerseys"+products.jerseys+"\t sweatshirts"+products.sweatshirts);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Adidas products1= new Adidas();
		System.out.println("2nd prd of Adidas");
		System.out.println("gymtrainingbags:"+products1.gymtrainingbags+"\t joggers:"+products1.joggers+"\t tracksuits"+products1.tracksuits+"\t jerseys"+products1.jerseys+"\t sweatshirts"+products1.sweatshirts);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Adidas products3= new Adidas("luxury gymtrainingbags"," black joggers"," grey tracksuits","blue jerseys","crewneck sweatshirts");
		System.out.println("3rd  prd of Adidas");
		System.out.println("gymtrainingbags:"+products3.gymtrainingbags+"\t joggers:"+products3.joggers+"\t tracksuits:"+products3.tracksuits+"\t jerseys:"+products3.jerseys+"\t sweatshirts:"+products3.sweatshirts);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Adidas products4= new Adidas("luxury gymtrainingbags"," black joggers"," grey tracksuits","blue jerseys","crewneck sweatshirts");
		System.out.println("4rd  prd of Adidas");
		System.out.println("gymtrainingbags:"+products4.gymtrainingbags+"\t joggers:"+products4.joggers+"\t tracksuits:"+products4.tracksuits+"\t jerseys:"+products4.jerseys+"\t sweatshirts:"+products4.sweatshirts);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Adidas products5= new Adidas("joggers",2999);
		System.out.println("prd of Adidas"+"");
		System.out.println(products5.joggers+""+products5.price);
		
		Adidas products6= new Adidas("jerseys",1999);
		System.out.println("prd of Adidas"+"");
		System.out.println(products6.joggers+""+products6.price);
		}
	}