package java_job_database;

import java.util.*;
import java.util.Date;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JobSearch", "root", "");//Establishing connection
				System.out.println("Connected to the database successfully");
				//--------retrieve data from applicant
				//update with Applicant object
				PreparedStatement preparedStatement=connection.prepareStatement("select * from Applicant");
		        //Creating Java ResultSet object
		        ResultSet resultSet=preparedStatement.executeQuery();
		        while(resultSet.next()){
		        	int applicantID = resultSet.getInt("ApplicantID");
		             String FirstName=resultSet.getString("FirstName");
		             String LastName=resultSet.getString("LastName");
		             String EmailAddress=resultSet.getString("EmailAddress");
		             //Printing Results
		             System.out.println(applicantID+" "+FirstName+" "+LastName+" "+EmailAddress);
		           
		            
		             
		        }
				
			} catch (SQLException e) {
				
				System.out.println("Error while connecting to the database");
			
					}
		
		 //applicant number
		 int applicantNumber = 1; //can change this to other numbers
		 System.out.println("Your applicant number is: " +applicantNumber);
		 
		 Scanner scanner2 = new Scanner(System.in);
		
		 
		 	Job[] arrJob = new Job[] {new Job()};
		 
		 	System.out.println("Enter jobURL: ");
			arrJob[0].jobURL = scanner2.nextLine();
			
			System.out.println("Enter companyName: ");
			arrJob[0].companyName = scanner2.nextLine();
			
			System.out.println("Enter jobTitle: ");
			arrJob[0].jobTitle = scanner2.nextLine();
	
			System.out.println("Enter location: ");
			arrJob[0].location = scanner2.nextLine();
		
			arrJob[0].timestamp = new Date();
			
			System.out.println("Enter interview: (true/false) ");
			arrJob[0].interview = scanner2.nextBoolean();
			
			System.out.println("Enter replied: (true/false) ");
			arrJob[0].replied = scanner2.nextBoolean();
			
			System.out.println("Enter jobReq: ");
			arrJob[0].jobReq = scanner2.next();
			
			scanner2.close();
		 
		 try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JobSearch", "root", "");
	            Statement s = con.createStatement();
	            System.out.println("Connection extablished Successfully!");
	            s.executeUpdate("INSERT INTO Job(JobURL, CompanyName, JobTitle, Location, Interview, Replied, JobReq, ApplicantID) VALUES('"+arrJob[0].jobURL+"', '"+arrJob[0].companyName+"', '"+arrJob[0].jobTitle+"', '"+arrJob[0].location+"', "+arrJob[0].interview+", "+arrJob[0].replied+", '"+arrJob[0].jobReq+"', "+applicantNumber+");");
	            System.out.println("Update executed Successfully!");
	        }
	        catch(Exception e){
	            System.out.println(e.toString());
	        }
		 
		 
	}

}
