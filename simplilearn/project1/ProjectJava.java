package project1;
import java.io.*;
import java.util.*;
class Asscendingorder{
	void arrange() {
		File dir=new File("E:\\New folder\\projectjava\\AscendingOrderfile");
		String[] children=dir.list();
		for(int i =0; i<children.length;i++) {
			for(int j =i+1; j<children.length;j++){
		
				if(children[i].compareTo(children[j])>0){
					String temp=children[i];
					children[i]=children[j];
					children[j]=temp;
				}
			}
		}
		for(int i=0;i<children.length;i++) {
			System.out.println(children[i]);
		}
	}
}

 class createfile{
File f=new File("E:\\New folder//projectjava//Addfile.txt");
void Disp() {
try {
if(f.createNewFile()) {
	System.out.println("file succesfully created....!");
	}
else {
	System.out.println("the specific file allready exists.....!");
}
} 
catch(IOException e){
	System.out.println(e);
}
}
}

class deletefile{
 void Deletefile(){
File del=new File("E://New folder//Projectjava//delete");
if(del.exists()) {
	System.out.println(del.delete()+ " File Succesfully got deleted....!");
}
else{
	System.out.println("Required file doesn't exists.....!");
}
 }	
	}
class searchfile{
	void search() {
		File dir=new File("E:\\New folder\\projectjava");
		String[] children=dir.list();
		if(children==null) {
			System.out.println("fileNotFound...!");
			}
		else {
			for(int i=0; i<children.length;i++) {
				String filename = children[i]; 
				System.out.println(filename);
			}
		}
	}
}
class AboutUs{
	void open() {
		try {
			FileReader r=new FileReader("E:\\New folder\\projectjava\\AboutUs.txt");
			try {
				int i;
				System.out.println("***************************** ABOUT US ************************");
				while((i=r.read())!=-1) {
					System.out.print((char)i);
				}
			}
				finally {
					System.out.print("\n");
					System.out.println("this is the content in file");
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
	}
}


public class ProjectJava {
public static void main(String[] args) {
	
int num;
String ch;
char alph;
do {
System.out.println("                WELCOME TO LOCKED.COM     \n\n       ");
System.out.println("       MAIN MENU          ");
System.out.println("plese select the appropriate option displayed below");
System.out.println("press 1 To  Get Files In Ascending Order \npress 2 to Handle Files\npress 3 to Close The Application\npress 0 About Us");
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
num=sc.nextInt();
    if(num==1) {
	Asscendingorder ref=new Asscendingorder();
	ref.arrange();
   }
    else if(num==2) {
	      System.out.println("press A To Create a File\npress B Delete a File\npress C To Search a Specific File");
	      alph=sc.next().charAt(0);
	     // System.out.println(equals);
	      if (alph=='A'||alph=='a') {
          createfile ref1=new createfile();
          ref1.Disp();
         }
	      else if(alph=='B' || alph=='b') {
          deletefile ref2=new deletefile();
          ref2.Deletefile();
         }
	      else if(alph=='C' || alph=='c') {
	    	  searchfile ref3=new searchfile();
	    	  ref3.search();
	      }
	      else if(alph>'C' || alph>0) {
	    	  System.out.println("Invalid input......!");
	      }
  }
    else if(num==3) {
	 System.out.println("the application has closed......!");
	 System.exit(0);
  }
    else if(num==0) {
    	AboutUs ref4=new AboutUs();
    	ref4.open();
    }
    else {  
			System.out.println("you have entered the wrong number");
			
  }

  System.out.println("to return to main menu press 5");
  num=sc.nextInt();
}
while(num==(5));
}
}

