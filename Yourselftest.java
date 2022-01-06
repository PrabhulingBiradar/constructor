class Yourselftest{
	
		public static void main(String[] args){
		Yourself intro= new Yourself ();
		System.out.println("1st intro for Yourself()");
		System.out.Println("myname:"+intro.myname+"\t myhobbies :"+intro.myhobbies+"\t mydream :"+intro.mydream+"\t weight:"intro.weight+"\t age:"+intro.age);
		System.out.println();
		
		Yourself intro1= new Yourself ();
		System.out.println("2nd intro for Yourself");
		System.out.Println("myname:"+intro1.myname+"\t myhobbies :"+intro1.myhobbies+"\t mydream :"+intro1.mydream+"\t weight:"intro1.weight+"\t age:"+intro1.age);
		System.out.println();
		
		Yourself intro2= new Yourself ("prabhu","playingonlinegames","millionre",60,20);
		System.out.println("1st intro for Yourself(5 String) ");
		System.out.Println("myname:"+intro2.myname+"\t myhobbies :"+intro2.myhobbies+"\t mydream :"+intro2.mydream+"\t weight:"intro2.weight+"\t age:"+intro2.age);
		System.out.println();
		
		Yourself intro3= new Yourself ("prabhuling","cricket","crorepati",55,20);
		System.out.println("2nd intro for Yourself(5 String) ");
		System.out.println("myname :"+intro3.myname+"\t myhobbies :"+intro3.myhobbies+"\t mydream :"+intro3.mydream+"\t weight:"intro3.weight+"\t age:"+intro3.age);
		System.out.println();
		
		Yourself intro4= new Yourself ("prabhu",20);
		System.out.println("1st intro fot yourself(String,int) ");
		System.out.println();
		System.out.println("myname :"+intro4.myname+"\t age:"+intro4.age);
		System.out.println();
		
		Yourself intro5= new Yourself ("prabhuling",21);
		System.out.println("2nd intro fot yourself(String,int) ");
		System.out.println();
		System.out.println("myname :"+intro5.myname+"\t age:"+intro5.age);
		System.out.println();
		}



}