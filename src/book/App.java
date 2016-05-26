package book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class App
{ 

	static String findCourseName(int var){


		switch(var)
		{
			case 1:return "Chemistry";			
            case 2:return "Intro CS";
			case 5:return "Physics";
			case 3:return "Computer Programming";
			case 4:return "Personal Computer Lab";
			case 6:return "Linear Algebra";
			case 7:return "Assembly Programming";
			case 8:return "Discrete Math";
			case 9:return "Engineering Math";
			case 12:return "C Programming";
			case 10:return "Computer Organization";
			case 11:return "Data Structures";
			case 13:return "Systems Programming";
			case 14:return "Intro Data Processing";
			case 15:return "Programming Languages";
			case 16:return "Computer Graphics";
			case 17:return "Data Base";
			case 18:return "Operating System";
			case 19:return "Algorithm Design & Analysis";
			case 20:return "Parallel Processing";
			case 21:return "Distributed Computing";
			case 22:return "Computer Network";
			case 23:return "Logics";
			case 24:return "Object-Oriented Programming";
			case 25:return "CS Seminar";
			case 26:return "System Analysis";
			case 27:return "Numerical Analysis";
			case 28:return "Intro Info Systems";
			case 29:return "Multimedia Systems";
			case 30:return "Intro Analysis";
			case 31:return "Formal Languages";
			case 32:return "Data Communication";
			case 33:return "Simulation";
			case 34:return "Computer & Society";
			case 35:return "Compiler";
			case 36:return "Software Engineering";
			case 37:return "Artificial Intelligence";
			case 38:return "Statistics";
			case 39:return "Microprocessor";
			case 40:return "Intro Internet";
			case 41:return "Engineering Lab";
			case 42:return "Intro Digital Eng";
			case 43:return "Digital Eng";
			case 44:return "Image Processing";
			case 45:return "Data Processing";
			case 46:return "Chemistry";
			case 47:return "Modern Programming";
            case 48:return "Digital Systems";
			case 49:return "Intro Computer Communication";
			case 50:return "Info Search";
			case 51:return "Comm System Programming";
			case 52:return "Computer System Design";
			case 53:return "Computer Eng";
			case 54:return "Logic Circuit Lab";
			case 55:return "CS Education";
			case 56:return "CS Education 2";
			case 57:return "Embeded Systems";
			case 58:return "Bilo Informatics";
			case 59:return "Japanese 1";
			case 60:return "Japanese 2";
			case 61:return "Project";
			case 62:return "Web Programming";
			case 63:return "Mobile Programming";
			case 64:return "Windows Programming";
			case 65:return "Design Pattrens";
			case 66:return "Adv Systems Programming";
			case 67:return "Computer Security";
			case 68:return "Enterprose Programming";
			case 69:return "Network Programming";
			case 70:return "Intern";
			case 71:return "Network & Data Comm";
			case 72:return "Computer Programming 2";
			case 73:return "Programming Appl";
			case 74:return "File Processing";
			case 75:return "Programming App";
			case 76:return "Algorithm Design & Analysis;break";
			case 77:return "English Composition";
			case 78:return "Eng Design";
			case 79:return "Software Design";
			case 80:return "Computer Modeling";
			case 81:return "Geology";
			case 82:return "Automata Theory";
			case 83:return "Program Techniques";
			case 84:return "Java Programming";
			case 85:return "Mecatronics";
			case 86:return "Biology";
			case 87:return "Internet System";
			case 88:return "Calculus 1";
			case 89:return "Network Design";
			case 90:return "Computer Organization";
			case 91:return "Algorithm Design & Analysis";
			case 92:return "Advanced Software Engineering";
			case 93:return "Laptop Programming";
			case 94:return "Intern ";
			case 95:return "Web Programming";
		}
        return "not Found";
	}
	
	
	
	public ArrayList<String> datagraph(String courseName) throws TasteException, IOException {
		int subno=courseId(courseName);
		int a=0,b=0,c=0;
		ArrayList<Integer> count=new ArrayList<Integer>();
		count.clear();
		BufferedReader br = null;
		 String line = "";
	 	String cvsSplitBy = ",";
	 	
	 	String csv="C:\\Users\\INDIA\\Desktop\\book\\data\\sample.csv";
	 	
	 	try {

	 		br = new BufferedReader(new FileReader(csv));
	 		while ((line = br.readLine())!=null) {

	 		        // use comma as separator
	 			String[] cidgpa = line.split(cvsSplitBy);

	 			double sid=Double.parseDouble(cidgpa[0]);
	 			double course=Double.parseDouble(cidgpa[1]);
	    		double gpa=Double.parseDouble(cidgpa[2]);
	    		 int subnb=subno;
	    		if(course==subnb){
	    			if(gpa>=4.7)
	    				a=a+1;
	    			if((gpa>=3.5)&&(gpa<4.7))
	    				b=b+1;
	    			if((gpa>=2)&&(gpa<3.5))
	    				c=c+1;
	    			
	    		}
	    		
	    	
	    		
	 			 //test is test
	 		}

	 	} catch (FileNotFoundException e) {
	 		e.printStackTrace();
	 	} catch (IOException e) {
	 		e.printStackTrace();
	 	} finally {
	 		if (br != null) {
	 			try {
	 				br.close();
	 			} catch (IOException e) {
	 				e.printStackTrace();
	 			}
			}
		}
	 	
		count.add(a);
		count.add(b);
		count.add(c);
        
		float A=(count.get(0)).intValue();
        float B=(int)(count.get(1)).intValue();
        float C=(int)(count.get(2)).intValue();
        float total=(int)(A+B+C);
        System.out.println(count.toString());
        
        System.out.println(100*A/total);
        System.out.println(100*B/total);
        System.out.println(100*C/total);
        
        
        ////
       
        System.out.println((int)A/total);
        
        float Per_A=Math.round((100*A/total));
        float Per_B=Math.round((100*B/total));
        float Per_C=Math.round((100*C/total));
        
ArrayList<String> res=new ArrayList<String>();
res.add(String.valueOf( Per_A));
res.add(String.valueOf( Per_B));
res.add(String.valueOf( Per_C));

		return res;
	}
	
	
	
	
	
	
public int courseId(String CourseName){
	
	
	switch(CourseName)
	{
	case "chemistry" :  return  1;
	case "introcs" :  return  2;
	case "computerprogramming" :  return  3;
	case "personalcomputer lab" :  return  4;
	case "physics" :  return  5;
	case "linearalgebra" :  return  6;
	case "assemblyprogramming" :  return  7;
	case "discretemath" :  return  8;
	case "engineeringmath" :  return  9;
	case "computerorganization" :  return  10;
	case "datastructures" :  return  11;
	case "cprogramming" :  return  12;
	case "systemsprogramming" :  return  13;
	case "introdataprocessing" :  return  14;
	case "programminglanguages" :  return  15;
	case "computergraphics" :  return  16;
	case "database" :  return  17;
	case "operatingsystem" :  return  18;
	case "algorithmdesignandanalysis" :  return  19;
	case "parallelprocessing" :  return  20;
	case "distributedcomputing" :  return  21;
	case "computernetwork" :  return  22;
	case "logics" :  return  23;
	case "objectorientedprogramming" :  return  24;
	case "csseminar" :  return  25;
	case "systemanalysis" :  return  26;
	case "numericalanalysis" :  return  27;
	case "introinfosystems" :  return  28;
	case "multimediasystems" :  return  29;
	case "introanalysis" :  return  30;
	case "formallanguages" :  return  31;
	case "datacommunication" :  return  32;
	case "simulation" :  return  33;
	case "computerandsociety" :  return  34;
	case "compiler" :  return  35;
	case "softwareengineering" :  return  36;
	case "artificialintelligence" :  return  37;
	case "statistics" :  return  38;
	case "microprocessor" :  return  39;
	case "introinternet"  :  return  40;
	case "engineeringlab"  :  return  41;
	case "introdigitaleng"  :  return  42;
	case "digitaleng"  :  return  43;
	case "imageprocessing"  :  return  44;
	case "dataprocessing" :  return   45;
	
	case "modernprogramming" :  return   47;
	case "digitalsystems" :  return   48;
	case "introcomputercommunication" :  return   49;
	case "infosearch" :  return   50;
	case "commsystemprogramming" :  return   51;
	case "computersystemdesign" :  return   52;
	case "computereng" :  return   53;
	case "logiccircuitlab" :  return   54;
	case "cseducation" :  return   55;
	case "cseducation2" :  return   56;
	case "embededsystems" :  return   57;
	case "biloinformatics" :  return   58;
	case "japanese1" :  return   59;
	case "japanese2" :  return   60;
	case "project" :  return   61;
	case "webprogramming" :  return   62;
	case "mobileprogramming" :  return   63;
	case "windowsprogramming" :  return   64;
	case "designpattrens" :  return   65;
	case "advsystemsprogramming" :  return   66;
	case "computersecurity" :  return   67;
	case "enterpriseprogramming" :  return   68;
	case "networkprogramming" :  return   69;
	case "intern" :  return   70;
	case "network&datacomm" :  return   71;
	case "computerprogramming2" :  return   72;
	case "programmingappl" :  return   73;
	case "fileprocessing" :  return   74;
	case "programmingapp" :  return   75;
	case "algorithmdesign&analysis" :  return   76;
	case "englishcomposition" :  return   77;
	case "engdesign" :  return   78;
	case "softwaredesign" :  return   79;
	case "computermodeling" :  return   80;
	case "geology" :  return   81;
	case "automatatheory" :  return   82;
	case "programtechniques" :  return   83;
	case "javaprogramming" :  return   84;
	case "mecatronics" :  return   85;
	case "biology" :  return   86;
	case "internetsystem" :  return   87;
	case "calculus1"  :  return  88;
	case "networkdesign" :  return   89;
	
	case "advancedsoftwareengineering" :  return   92;
	case "laptopprogramming" :  return   93;
	
	}
	return 0;
	
}
	
	
	
	
	public ArrayList<String> datap(int id,String courseName) throws TasteException, IOException {

//		HashMap<String,String> Result=new HashMap<>();
ArrayList<String> predicted=new ArrayList<String>();
        predicted.clear();
		String fileName="pGPA.csv";
			
			DataModel model = new FileDataModel(new File("C:\\Users\\INDIA\\Desktop\\book\\data",fileName));
        
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);
		UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);



		long takeID=id;


		List<RecommendedItem> recommendations = recommender.recommend(takeID, 100);
		HashMap<String,Integer> list=new HashMap<>();

		list.put("chemistry",1);
		list.put("introcs",2);
		list.put("computerprogramming",3);
		list.put("personalcomputer lab",4);
		list.put("physics",5);
		list.put("linearalgebra",6);
		list.put("assemblyprogramming",7);
		list.put("discretemath",8);
		list.put("engineeringmath",9);
		list.put("computerorganization",10);
		list.put("datastructures",11);
		list.put("cprogramming",12);
		list.put("systemsprogramming",13);
		list.put("introdataprocessing",14);
		list.put("programminglanguages",15);
		list.put("computergraphics",16);
		list.put("database",17);
		list.put("operatingsystem",18);
		list.put("algorithmdesignandanalysis",19);
		list.put("parallelprocessing",20);
		list.put("distributedcomputing",21);
		list.put("computernetwork",22);
		list.put("logics",23);
		list.put("objectorientedprogramming",24);
		list.put("csseminar",25);
		list.put("systemanalysis",26);
		list.put("numericalanalysis",27);
		list.put("introinfosystems",28);
		list.put("multimediasystems",29);
		list.put("introanalysis",30);
		list.put("formallanguages",31);
		list.put("datacommunication",32);
		list.put("simulation",33);
		list.put("computerandsociety",34);
		list.put("compiler",35);
		list.put("softwareengineering",36);
		list.put("artificialintelligence",37);
		list.put("statistics",38);
		list.put("microprocessor",39);
		list.put("introinternet", 40);
		list.put("engineeringlab", 41);
		list.put("introdigitaleng", 42);
		list.put("digitaleng", 43);
		list.put("imageprocessing", 44);
		list.put("dataprocessing", 45);
		list.put("chemistry", 46);
		list.put("modernprogramming", 47);
		list.put("digitalsystems", 48);
		list.put("introcomputercommunication", 49);
		list.put("infosearch", 50);
		list.put("commsystemprogramming", 51);
		list.put("computersystemdesign", 52);
		list.put("computereng", 53);
		list.put("logiccircuitlab", 54);
		list.put("cseducation", 55);
		list.put("cseducation2", 56);
		list.put("embededsystems", 57);
		list.put("biloinformatics", 58);
		list.put("japanese1", 59);
		list.put("japanese2", 60);
		list.put("project", 61);
		list.put("webprogramming", 62);
		list.put("mobileprogramming", 63);
		list.put("windowsprogramming", 64);
		list.put("designpattrens", 65);
		list.put("advsystemsprogramming", 66);
		list.put("computersecurity", 67);
		list.put("enterpriseprogramming", 68);
		list.put("networkprogramming", 69);
		list.put("intern", 70);
		list.put("network&datacomm", 71);
		list.put("computerprogramming2", 72);
		list.put("programmingappl", 73);
		list.put("fileprocessing", 74);
		list.put("programmingapp", 75);
		list.put("algorithmdesign&analysis", 76);
		list.put("englishcomposition", 77);
		list.put("engdesign", 78);
		list.put("softwaredesign", 79);
		list.put("computermodeling", 80);
		list.put("geology", 81);
		list.put("automatatheory", 82);
		list.put("programtechniques", 83);
		list.put("javaprogramming", 84);
		list.put("mecatronics", 85);		
		list.put("biology", 86);
		list.put("internetsystem", 87);
		list.put("calculus1", 88);
		list.put("networkdesign", 89);
		list.put("computerorganization", 90);
		list.put("algorithmdesign&analysis", 91);
		list.put("advancedsoftwareengineering", 92);
		list.put("laptopprogramming", 93);
		list.put("intern", 94);
		list.put("webprogramming", 95);




		String course=courseName;
		int subno=list.get(course);



		for (RecommendedItem recommendation : recommendations) {
			

			if(recommendation.getItemID()==subno){
//                Result.put("Course ID", ""+ recommendation.getItemID());
//                Result.put("Course Name", findCourseName((int) recommendation.getItemID()));
//				Result.put("Your Predicted GPA is:", "" + recommendation.getValue());
				String grade;
				
					
				
			if(recommendation.getValue()>4.7){
				grade="A";
				predicted.add(grade);	
			}
			
			if((recommendation.getValue()>=3.5)&&(recommendation.getValue()<4.7)){
				grade="B";
				predicted.add(grade);
			}
				
			if((recommendation.getValue()>=2)&&(recommendation.getValue()<3.5)){
				grade="C";
				predicted.add(grade);
			}
			
				
			
			
				}

		}


		return predicted;
	}
	
	public ArrayList<String> dataexcel(int id,String courseName) throws TasteException, IOException {

//		HashMap<String,String> Result=new HashMap<>();
		ArrayList<String> courses=new ArrayList();

        
		String fileName="pGPA.csv";
			
			DataModel model = new FileDataModel(new File("C:\\Users\\INDIA\\Desktop\\book\\data",fileName));
        
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);
		UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);



		long takeID=id;


		List<RecommendedItem> recommendations = recommender.recommend(takeID, 100);
		HashMap<String,Integer> list=new HashMap<>();

		list.put("chemistry",1);
		list.put("introcs",2);
		list.put("computerprogramming",3);
		list.put("personalcomputer lab",4);
		list.put("physics",5);
		list.put("linearalgebra",6);
		list.put("assemblyprogramming",7);
		list.put("discretemath",8);
		list.put("engineeringmath",9);
		list.put("computerorganization",10);
		list.put("datastructures",11);
		list.put("cprogramming",12);
		list.put("systemsprogramming",13);
		list.put("introdataprocessing",14);
		list.put("programminglanguages",15);
		list.put("computergraphics",16);
		list.put("database",17);
		list.put("operatingsystem",18);
		list.put("algorithmdesignandanalysis",19);
		list.put("parallelprocessing",20);
		list.put("distributedcomputing",21);
		list.put("computernetwork",22);
		list.put("logics",23);
		list.put("objectorientedprogramming",24);
		list.put("csseminar",25);
		list.put("systemanalysis",26);
		list.put("numericalanalysis",27);
		list.put("introinfosystems",28);
		list.put("multimediasystems",29);
		list.put("introanalysis",30);
		list.put("formallanguages",31);
		list.put("datacommunication",32);
		list.put("simulation",33);
		list.put("computerandsociety",34);
		list.put("compiler",35);
		list.put("softwareengineering",36);
		list.put("artificialintelligence",37);
		list.put("statistics",38);
		list.put("microprocessor",39);
		list.put("introinternet", 40);
		list.put("engineeringlab", 41);
		list.put("introdigitaleng", 42);
		list.put("digitaleng", 43);
		list.put("imageprocessing", 44);
		list.put("dataprocessing", 45);
		list.put("chemistry", 46);
		list.put("modernprogramming", 47);
		list.put("digitalsystems", 48);
		list.put("introcomputercommunication", 49);
		list.put("infosearch", 50);
		list.put("commsystemprogramming", 51);
		list.put("computersystemdesign", 52);
		list.put("computereng", 53);
		list.put("logiccircuitlab", 54);
		list.put("cseducation", 55);
		list.put("cseducation2", 56);
		list.put("embededsystems", 57);
		list.put("biloinformatics", 58);
		list.put("japanese1", 59);
		list.put("japanese2", 60);
		list.put("project", 61);
		list.put("webprogramming", 62);
		list.put("mobileprogramming", 63);
		list.put("windowsprogramming", 64);
		list.put("designpattrens", 65);
		list.put("advsystemsprogramming", 66);
		list.put("computersecurity", 67);
		list.put("enterpriseprogramming", 68);
		list.put("networkprogramming", 69);
		list.put("intern", 70);
		list.put("network&datacomm", 71);
		list.put("computerprogramming2", 72);
		list.put("programmingappl", 73);
		list.put("fileprocessing", 74);
		list.put("programmingapp", 75);
		list.put("algorithmdesign&analysis", 76);
		list.put("englishcomposition", 77);
		list.put("engdesign", 78);
		list.put("softwaredesign", 79);
		list.put("computermodeling", 80);
		list.put("geology", 81);
		list.put("automatatheory", 82);
		list.put("programtechniques", 83);
		list.put("javaprogramming", 84);
		list.put("mecatronics", 85);		
		list.put("biology", 86);
		list.put("internetsystem", 87);
		list.put("calculus1", 88);
		list.put("networkdesign", 89);
		list.put("computerorganization", 90);
		list.put("algorithmdesign&analysis", 91);
		list.put("advancedsoftwareengineering", 92);
		list.put("laptopprogramming", 93);
		list.put("intern", 94);
		list.put("webprogramming", 95);
		
		
		
		




		String course=courseName;
		int subno=list.get(course);



		for (RecommendedItem recommendation : recommendations) {

			if(recommendation.getValue()>4.7){
                courses.add(findCourseName((int) recommendation.getItemID()));
//                Result.put("Course Name", findCourseName((int) recommendation.getItemID()));
				
			}

		}


		return courses;
	}




}
  