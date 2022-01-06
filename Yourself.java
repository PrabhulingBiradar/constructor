class YourSlef{
String myname;
String  myhobbies;
String  mydream;
int     weight;
int      age;

	YourSlef(){
		System.out.println("the default constructor YourSlef");
		System.out.println();
		
	}
	
		YourSlef(String mn, String mh, String md, int wh, int ag){
			myname=mn;
			myhobbies=mh;
			mydream=md;
			weight=wh;
			age=ag;
			System.out.println("the Constructor YourSlef(String,String,String,int,int)");
		}
		
		YourSlef(String mn, int ag){
			
			myname=mn;
			age=ag;
			System.out.println("the Constructor YourSlef(String,int)");
			
		}	
}