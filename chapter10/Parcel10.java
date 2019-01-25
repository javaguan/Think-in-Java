package chapter10;



public class Parcel10 {
 public Destination destination(final String dest,final float price) {
	 return new Destination() {
		 private int cost;
		 {
			 cost=Math.round(price);
			 if(cost>100) {
				 System.out.println("over budget!");
			 }
		 }
			 private String label=dest;
			 private String readLabel() {return label;}
		 };
 }
 public static void main(String[] args) {
	Parcel10 parcel10=new Parcel10();
	Destination destination=parcel10.destination("Tasmania", 101.395f);
}
}
