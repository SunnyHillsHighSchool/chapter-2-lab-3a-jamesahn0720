[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4768135&assignment_repo_type=AssignmentRepo)
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
