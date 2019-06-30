package com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.text.ParseException;

public class PolicyDemo {

	
	public static void main(String[] args) {
		String pcy="src/inputcase.txt";
		policy_file();
		exchange();
		date(list);
		
		/*try{
			
			throw new  Newexception("This is My error Message");
		}
		catch( Newexception s){
			
			System.out.println(s) ;

	}*/
		
		public static void policy_file(List<Policy> pcy)throws NewException
		{
			List<policy> list1=new ArrayList<>();
			 try
			 {
				 BufferedReader s=new BufferedReader(new FileReader(pcy));
				 
				 String ply;
				 ply=s.readLine();
				 while(ply!=null)
				 {
					 String[] z =ply.split("  ");
					 policy m=new policy(x[0], x[1] ,x[2], x[3], x[4], x[5]);
					 replaceAll("[^A-Z]"," ");
					 list1.add(m);
					 ply=s.readLine();
					 
				 }
			 }
			 catch(NewException e)
			 {
				 System.out.Println(e);
			 }
		}
		public static void exchange(List<Policy> listt)throws NewException
		{
			policy_file();
			List<policy> list2=new ArrayList<>();
			policyamt=0;
			for(String i:list2)
				{
				for(policy j:list1)
				{
				if(j.policy_no().substring(0,2))
						{
					policyamt=policyamt+j.getCost_of_policy();
						}
				}
				System.out.println(policyamt);
				}
			
		}
		public static void date(List<Policy> list1) throws NewException
		{
				DateTimeFormatter formater = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			    
				//Local date instance
				LocalDate localDate = LocalDate.now();
				String dateString = formater.format(localDate);
				for(int i=0;i<list1;i++)
				{
					String expirydate=i.getDate_of_expiry();
					LocalDate localDate = LocalDate.parse(expirydate, formater );
					try{
				    if (localDate.isBefore(expirydate)) { 
						  
			            // When Date localDate < Date expirydate
				    	throw new NewException("The Policy "+i.getpolicy_no()+" is Expired") ;
					}
					}
				    catch(ParseException s)
				    {
				    	s.printStackTrace();
				    }
				 }
		}
		
}
}
