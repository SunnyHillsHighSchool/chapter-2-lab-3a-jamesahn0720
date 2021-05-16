# Chapter-2-Lab-3a

Lab Goal :   This lab was designed to review basic class creation and to introduce and demonstrate how to use an ArrayList.  


Lab Description :   Create a Toy class that stores a Toy name and a count and how many of that toy exist.   Use the sample runner code below to help you create the class and define the methods.


Files Needed:
Toy.java
Main.java
.replit
run_button.sh

Main Code : 
Toy t = new Toy( "sorry" );
System.out.println( t.getCount() );
System.out.println( t );
System.out.println( t.getName() );

Toy s = new Toy( "ji goe" );
System.out.println(s.getCount() );
s.setCount( 5 );
System.out.println(s.getCount() );
System.out.println( s );

Sample Output : 
1
sorry 1
sorry
1
5
ji goe 5
