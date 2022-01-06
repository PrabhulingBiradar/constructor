class Fan{
int speed;
int blades;
String companyname;
String colors;
String typesoffans;
int fanvalue;



Fan(){
	System.out.println("the defult construct of fan");
	System.out.println();
}  

Fan (int spd, int bld, String cpnm, String col, String tff){

	speed=spd;
	blades=bld;
	companyname=cpnm;
	colors=col;
	typesoffans=tff;
	System.out.println("the Constructor Fan(int,int,String,String,String)");

}
Fan (String cpnm, int fv ){
	companyname=cpnm;
	fanvalue=fv;
	System.out.println("the constructor Fan(String,int)");

}


}