class Fantest{
		public static void main(String[] args){
		Fan products= new Fan();
		System.out.println("1st prd of Fan");
		System.out.println("speed:"+products.speed+"\t blades:"+products.blades+"\t companyname"+products.companyname+"\t colors"+products.colors+"\t typesoffans"+products.typesoffans);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Fan products1= new Fan();
		System.out.println("2nd prd of Fan");
		System.out.println("speed:"+products1.speed+"\t blades:"+products1.blades+"\t companyname"+products1.companyname+"\t colors"+products1.colors+"\t typesoffans"+products1.typesoffans);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Fan products3= new Fan(5, 4," usha","blue ","tablefan");
		System.out.println("3rd  prd of Fan");
		System.out.println("speed:"+products3.speed+"\t blades:"+products3.blades+"\t companyname:"+products3.companyname+"\t colors:"+products3.colors+"\t typesoffans:"+products3.typesoffans);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Fan products4= new Fan(7, 6," cropton","white","ceiling fan");
		System.out.println("4rd  prd of Fan");
		System.out.println("speed:"+products4.speed+"\t blades:"+products4.blades+"\t companyname:"+products4.companyname+"\t colors:"+products4.colors+"\t typesoffans:"+products4.typesoffans);
		System.out.println();
		//System.out.Println("=================================================================================================================");
		
		Fan products5= new Fan("usha",2999);
		System.out.println("prd of Fan"+"");
		System.out.println(products5.companyname+""+products5.fanvalue);
		
		Fan products6= new Fan("cropton",1999);
		System.out.println("prd of Fan"+"");
		System.out.println(products6.companyname+""+products6.fanvalue);
		}
	}