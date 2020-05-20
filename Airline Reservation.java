import java.io.*;
import java.util.*;
class Air
{
	int pass1=12345,bill=0;
	int a,b,w,age,date,ch,ch1;
	char c;
	int exit=1,r,p,q,i,j,l;
	String text,tn,tofo,s,name,se,to,sd;
	String s1[]=new String[1000];
	public int menu()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\t\t************Welcome To Air INDIA Airport************");
		System.out.println("\t\t***********************New Delhi***********************");
		System.out.println("\t\t*_____________________________________________________*");
		System.out.println("\t1-Resevation");
		System.out.println("\t2-Cancelation");
		System.out.println("\t3-Macdonald");
		System.out.println("\t4-Flight Informations");
		System.out.println("\t5-Management(For Authorized Personal only)");
		System.out.println("\t6-Queries");
		System.out.println("\t7-Quit");
		System.out.println("\n\tEnter your choice(1-7)_ _ _ _ _");
		ch=Integer.parseInt(in.readLine());
		return(ch);
	}
	public void resevation()throws Exception
	{
		r=0;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\t1-New Reservation");
		System.out.println("\t2-Resevation Searching");
		System.out.println("\t3-Quit");
		System.out.println("\tTicket is non modificable &non transferable");
		System.out.println("\tEnter Your choice_ _ _ _ _");
		ch=Integer.parseInt(in.readLine());
		if(ch==1)
		{
			System.out.println("\tEnter Resevation class");
			System.out.println("\t1-Bussiness");
			System.out.println("\t2-Economoy");
			System.out.println("\t3-Quit");
			System.out.println("\tEnter Your choice_ _ _ _ _");
			System.out.println("\tNow Get an Exiting offer Due to Governmental Price Reduction");
			System.out.println("\tNow travel anywhere in World only at"); 
			System.out.println("\tRs.4500 for Bussiness class"); 
			System.out.println("\tRs.3000 for Economy class");
			ch1=Integer.parseInt(in.readLine());
			if(ch1==1)
			{
				FileWriter f1=new FileWriter("bsRes.txt",true);
				BufferedWriter b1=new BufferedWriter(f1);
				PrintWriter p1=new PrintWriter(b1);
				
				FileReader f2=new FileReader("ecRes.txt");
				BufferedReader b2=new BufferedReader(f2);
				
				while((text=b2.readLine())!=null)
				{
					r++;
				}
				System.out.println("\tEnter your Name");
				name=in.readLine();
				System.out.println("\tEnter you age");
				age=Integer.parseInt(in.readLine());
				System.out.println("\tEnter Your Sex");
				se=in.readLine();
				System.out.println("\tDate of travel in ddmmyy format");
				date=Integer.parseInt(in.readLine());
				System.out.println("\tEnter origin station");
				to=in.readLine();
				System.out.println("\tEnter destination station");
				tn=in.readLine();
				System.out.println("\tYour Ticket no is DHbs"+(r+1));
				p1.print("DHbs"+(r+1)+" ");
				p1.println(name+" "+age+" "+se+" "+date+" "+tn+" "+to+"\n");
				b2.close();
				p1.close();
			}
			if(ch1==2)
			{
				FileWriter f1=new FileWriter("ecRes.txt",true);
				BufferedWriter b1=new BufferedWriter(f1);
				PrintWriter p1=new PrintWriter(b1);

				FileReader f2=new FileReader("ecRes.txt");
				BufferedReader b2=new BufferedReader(f2);
				r=0;
				while((text=b2.readLine())!=null)
				{
				r++;
				}
				System.out.println("\tEnter your Name");
				name=in.readLine();
				System.out.println("\tEnter you age");
				age=Integer.parseInt(in.readLine());
				System.out.println("\tEnter Your Sex");
				se=in.readLine();
				System.out.println("\tDate of travel in ddmmyy format");
				date=Integer.parseInt(in.readLine());
				System.out.println("\tEnter origin station");
				tn=in.readLine();
				System.out.println("\tEnter destination station");
				to=in.readLine();
				System.out.println("\tYour Ticket no is DHec"+(r+1));
				p1.print("DHec"+(r+1)+" ");
				p1.println(name+" "+age+" "+se+" "+date+" "+tn+" "+to+"");
				b2.close();
				p1.close();
			}
		}
		if(ch==2)
		{
			System.out.println("\tEnter Resevation class");
			System.out.println("\t1-Bussiness");
			System.out.println("\t2-Economoy");
			System.out.println("\t3-Quit");
			System.out.println("\tEnter Your choice_ _ _ _ _");
			ch1=Integer.parseInt(in.readLine());
			if(ch1==1)
			{
				FileReader f1=new FileReader("bsRes.txt");
				BufferedReader b1=new BufferedReader(f1);
				System.out.println("\tEnter your Resevation ticket number");
				tn=in.readLine();
				while((text=b1.readLine())!=null)
				{
					a=text.indexOf(" ");
					to=text.substring(0,a);
					if(to.equals(tn))
					{
						System.out.println(text);
					}
				}
				b1.close();
			}
			if(ch1==2)
			{
				FileReader f1=new FileReader("ecRes.txt");
				BufferedReader b1=new BufferedReader(f1);
				System.out.println("\tEnter your Resevation ticket number");
				tn=in.readLine();
				while((text=b1.readLine())!=null)
				{
					a=text.indexOf(" ");
					to=text.substring(0,a);
					if(to.equals(tn))
					{
						System.out.println(text);
					}
				}
				b1.close();
			}
		}
	}
	public void cancelation()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\tEnter Resevation class");
		System.out.println("\t1-Bussiness");
		System.out.println("\t2-Economoy");
		System.out.println("\t3-Quit");
		System.out.println("\tEnter Your choice_ _ _ _ _");
		ch=Integer.parseInt(in.readLine());
		if(ch==1)
		{
			System.out.println("\tEnter Resevation Ticket no.");
			tn=in.readLine();
			System.out.println("\tEnter Again to confirm");
			to=in.readLine();
			FileReader f2=new FileReader("ecRes.txt");
			BufferedReader b2=new BufferedReader(f2);
			r=0;	
			while((text=b2.readLine())!=null)
			{
				s1[r]=text;
				a=s1[r].indexOf(" ");
				s=s1[r].substring(0,p);
				if(s.equalsIgnoreCase(tn)&&s.equalsIgnoreCase(to))
				{
					w=r;
				}
				r++;	
			}
			b2.close();
			FileWriter f1=new FileWriter("bsRes.txt");
			BufferedWriter b1=new BufferedWriter(f1);
			PrintWriter p1=new PrintWriter(b1);
			r=0;
			while(s1[r]!=null)
			{
				if(r!=w)
					p1.println(s1[r]);
				else
					p1.println(q+"Canceled");
			}
			if(tn.equals(to))
			{
				System.out.println("\tYou will get Rs."+45*60+" as refund.");
			}
			p1.close();
		}
		if(ch==2)
		{
			String t1,t2;
			System.out.println("\tEnter Resevation Ticket no.");
			tn=in.readLine();
			System.out.println("\tEnter Again to confirm");
			to=in.readLine();
			FileReader f2=new FileReader("ecRes.txt");
			BufferedReader b2=new BufferedReader(f2);
			r=0;
			while((text=b2.readLine())!=null)
			{
				s1[r]=text;
				a=s1[r].indexOf(" ");
				s=s1[r].substring(0,a);
				if(s.equalsIgnoreCase(to)&&s.equalsIgnoreCase(tn))
				{		
					w=r;	
				}	
				r++;	
			}
			b2.close();	
			FileWriter f1=new FileWriter("ecRes.txt");
			BufferedWriter b1=new BufferedWriter(f1);
			PrintWriter p1=new PrintWriter(b1);
			r=0;	
			while(s1[r]!=null)
			{	
				if(r!=w)	
					p1.println(s1[r]);
				else	
					p1.println(q+"Canceled");
			}	
			if(tn.equalsIgnoreCase(to))
			{		
		 		System.out.println("\tYou will get Rs."+45*60+" as refund.");
			}	
				p1.close();
			}
		}
	public void macdonald()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		do
		{
			System.out.println("\tCode     Item                  Cost");
			System.out.println("\t1-Kids Meal                    Rs.60");
			System.out.println("\t2-Beef tower                   Rs.75");
			System.out.println("\t3-Meat Stack                   Rs.180");
			System.out.println("\t4-Salad Meal                   Rs.85");
			System.out.println("\t5-Little Meal                  Rs.60");
			System.out.println("\t6-Big Meal                     Rs.75");
			System.out.println("\t7-Huge Meal                    Rs.95");
			System.out.println("\t8-French Fries                 Rs.70");
			System.out.println("\t9-Veg. Hamburgar               Rs.80");
			System.out.println("\t10-Non Veg. Hamburger          Rs.100");
			System.out.println("\t11-Cheese Pizza                Rs.55");
			System.out.println("\t12-Onion Pizza                 Rs.60");
			System.out.println("\t13-Capricon Pizza              Rs.70");
			System.out.println("\t14-Tomato Pizza                Rs.45");
			System.out.println("\t15-Bislery                     Rs.15");
			System.out.println("\t16-Exit                              ");
			System.out.println("\tEnter Your Choice(1-15)");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:bill=bill+60;
				break;
				case 2:bill=bill+75;
				break;	
				case 3:bill=bill+180;
				break;
				case 4:bill=bill+85;
				break;
				case 5:bill=bill+60;
				break;
				case 6:bill=bill+75;
				break;
				case 7:bill=bill+95;
				break;
				case 8:bill=bill+70;
				break;
				case 9:bill=bill+80;
				break;
				case 10:bill=bill+100;
				break;
				case 11:bill=bill+55;
				break;
				case 12:bill=bill+60;
				break;
				case 13:bill=bill+70;
				break;
				case 14:bill=bill+45;
				break;
				case 15:bill=bill+15;
				break;
				case 16:exit=0;
				break;	
				default:System.out.println("You Have Entered Wrong Choice");
				break;
			}
		}while(exit!=0);
		bill=bill+10*bill/100;
		System.out.println("Your Bill has amounted to Rs."+bill);
	}	
	public void info()throws Exception
	{
		FileReader f2=new FileReader("Flight Information.txt");
		BufferedReader b2=new BufferedReader(f2);
		DataInputStream in=new DataInputStream(System.in); 
		System.out.println("1-By Stations");
		System.out.println("2-Veiw Stations ");
		System.out.println("3-Exit");
		ch=Integer.parseInt(in.readLine());
		if(ch==1)
		{
			System.out.println("Enter flight origin");
			to=in.readLine();
			System.out.println("Origin\tDestination\tFlight No.\tDepartureTime\tArrivalTime");
			while((text=b2.readLine())!=null)
			{
				l=text.length();
				b=text.indexOf(" ");
				s=text.substring(0,b);
				if(to.equalsIgnoreCase(s))
				{
					for(i=0;i<=l;i++)
					{
						c=text.charAt(i);
						if(c==' ')
						{
							System.out.print("\t");
						}
						else
						{
							System.out.print(c);
						}
					}
				}
				System.out.println();
			}
		}
		if(ch==2)
		
		{
			
			System.out.println("\tAgartala");
			System.out.println("\tAhmedabad");
			System.out.println("\tAllahabad");
			System.out.println("\tAmritsar");
			System.out.println("\tBangalore");
			System.out.println("\tBangkok");
			System.out.println("\tBhopal");
			System.out.println("\tBhubaneshwar");
			System.out.println("\tCalicut");
			System.out.println("\tChandigarh");
			System.out.println("\tChennai");
			System.out.println("\tCochin");
			System.out.println("\tColombo");
			System.out.println("\tDelhi");
			System.out.println("\tDubai");
			System.out.println("\tGaya");
			System.out.println("\tGoa");
			System.out.println("\tHyderabad");
			System.out.println("\tJammu");
			System.out.println("\tJamnagar");
			System.out.println("\tJodhpur");
			System.out.println("\tKabul");
			System.out.println("\tKanpur");
			System.out.println("\tKathmandu");
			System.out.println("\tKolkata");
			System.out.println("\tKuwait");
			System.out.println("\tLucknow");
			System.out.println("\tMumbai");
			System.out.println("\tPatna");
			System.out.println("\tPortblair");
			System.out.println("\tPune");
			System.out.println("\tSingapore");
			System.out.println("\tSrinagar");
			System.out.println("\tVadodra");
			System.out.println("\tVaranasi");
			System.out.println("\tYangoon");
		}
	}
	public void management()throws Exception
	{
		FileWriter f1=new FileWriter("Staff.txt",true);
		BufferedWriter b1=new BufferedWriter(f1);
		PrintWriter p1=new PrintWriter(b1);
		FileReader f2=new FileReader("Staff.txt");
		BufferedReader b2=new BufferedReader(f2);
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\n\tEnter Your Authorization code_ _ _ _ _");
		ch=Integer.parseInt(in.readLine());
		String text;
		if(ch==pass1)
		{
			System.out.println("\t1-Staff Record");
			System.out.println("\t2-Enter new Staff");
			System.out.println("\t3-Veiw resevation records");
			System.out.println("\t4-Back");
			System.out.println("\n\tEnter Your choice(1-3)_ _ _ _ _");
			ch1=Integer.parseInt(in.readLine());
			switch(ch1)
			{
				case 1:System.out.println("Name\tPost\t Amount");
				while((text=b2.readLine())!=null)
				{
					System.out.println(text);
				}
				break;
				case 2:String name,post;
				System.out.println("Enter name of person");
				name=in.readLine();
				System.out.println("Enter post of person");
				post=in.readLine();
				System.out.println();
				p1.println(name+"\t"+post+"\tPayed");			
				break;
				case 3:r=0;
				FileReader f3=new FileReader("bsRes.txt");
				BufferedReader b3=new BufferedReader(f3);
				while(((text=b3.readLine())!=null))
				{
					text=text.trim();
					b=text.lastIndexOf(" ");
					System.out.print(text.substring(0,b));
					r++;
					if(r%50==0)
					{
						System.out.println("Press any key to continue");
						char c=(char)in.read();
					}
				}
				b3.close();
				FileReader f4=new FileReader("ecRes.txt");
				BufferedReader b4=new BufferedReader(f4);
				while(((text=b4.readLine())!=null))
				{
					text=text.trim();
					b=text.lastIndexOf(" ");
					System.out.print(text.substring(0,b));
					r++;	
					if(r%50==0)
					{
						System.out.println("Press any key to continue");
						char c=(char)in.read();
					}
				}
				b4.close();
				break;
				default:System.out.println("\tYou have Entered Wrong Choice");
				break;
			}
		}
		p1.close();
		b2.close();
	}
	public void query()throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		FileWriter f1=new FileWriter("Complain.txt",true);
		BufferedWriter b1=new BufferedWriter(f1);
		PrintWriter p1=new PrintWriter(b1);
		System.out.println("\t1-Complain");
		System.out.println("\t2-Query");
		System.out.println("\t3-back");
		System.out.println("\n\tEnter Your choice(1-3)_ _ _ _ _");
		ch=Integer.parseInt(in.readLine());
		if(ch==1)
		{
			System.out.println("\n\tEnter Your Complain_ _ _ _ _");
			String comp;
			comp=in.readLine();
			p1.println("COM\t"+comp);
		}
		if(ch==2)
		{
			System.out.println("\n\tEnter Your Query_ _ _ _ _");
			String que;
			que=in.readLine();
			p1.println("QUE\t"+que);
		}	
		p1.close();
	}
	
	public static void main(String arg[])throws Exception
	{
		Air obj=new Air();
		DataInputStream in=new DataInputStream(System.in);
		int se1,pass1;
		int exit=1;
		do
		{
			se1=obj.menu();
			if(se1==1)
			{
				obj.resevation();
			}
			if(se1==2)
			{
				obj.cancelation();
			}
			if(se1==3)
			{
				obj.macdonald();
			}
			if(se1==4)
			{
				obj.info();
			}
			if(se1==5)
			{
				obj.management();
			}
			if(se1==6)
			{
				obj.query();
			}
			if(se1==7)
			{
				exit=0;
				System.out.println("Thank You For Visiting Us");
				System.out.println("\t(A Unit Of Air India (P) Ltd.)");
			}
		}while(exit!=0);
	}
}

