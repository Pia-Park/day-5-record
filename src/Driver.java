import java.util.Scanner;

public class Driver {
	
	//method to print just one object which pass as an argument
	public static void printRecord(Record album) {
		System.out.println("ID: " + album.getId() + "\n"
				+ "Title: " + album.getRecordTitle() + "\n"
				+ "Singer: " + album.getSingerName() + "\n"
				+ "Record length: " + album.getRecordLength() + "\n"
				+ "Record Ranking: " + album.getRecordRanking() + "\n");
	}
	
	
	//method to iterate through the array and find the index of record equals to title
	public static int findIndexOfTitle(Record[] recordArr, String title) {
		for(int i = 0; i < recordArr.length; i++) {
			if(recordArr[i].getRecordTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}

	//getAverage of lengthRecord --> return average 
	public static void getAverageLength(Record[] recordArr) {
		double result = 0;
		for(int i = 0; i < recordArr.length; i++) {
			if(recordArr[i].getRecordLength() > 0) {
				result += recordArr[i].getRecordLength();							
			}
		}
		System.out.println("Total length is " + result);
		System.out.println("Length Average is " + result / recordArr.length);

		
	}
	
	//getAverage of ranking --> return average
	
	public static void getAverageRanking(Record[] recordArr) {
		int result = 0;
		for(int i = 0; i < recordArr.length; i++) {
			if(recordArr[i].getRecordRanking() > 0) {
				result += recordArr[i].getRecordRanking();							
			}
		}
		System.out.println("Total Ranking is " + result);
		System.out.println("Ranking Average is " + result / recordArr.length);

		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// at least create 7 objects 
		Record a1 = new Record("Hello", "Adel", 3.23, 1);
		Record a2 = new Record("good morning", "john", 3.44, 4);
		Record a3 = new Record("happy", "parrel", 4.12, 5);
		Record a4 = new Record("die", "amen", 5.23, 2);
		Record a5 = new Record("all for you", "shinhwa", 5.13, 3);
		Record a6 = new Record("anything", "good", 2.56, 6);
		Record a7 = new Record("painkiller", "sungsi", 3.23, 7);
		
		
		// create array and add these objects to array
		Record[] recordArr = new Record[7];
		recordArr[0] = a1;
		recordArr[1] = a2;
		recordArr[2] = a3;
		recordArr[3] = a4;
		recordArr[4] = a5;
		recordArr[5] = a6;
		recordArr[6] = a7;
		
		
		//Ask the user to enter the title of the record
		//read the input
		System.out.println("Enter the title of the record: ");
		String searchTitle = input.nextLine();
		
		//findRecord 
		//print the record 	
		
		int index = findIndexOfTitle(recordArr, searchTitle);
		
		if(index == -1) {
			System.err.println("We don't have " + searchTitle);
		} else {
			System.out.println("We find the song. Here is information of the song. Index is " + index + ".");
			printRecord(recordArr[index]);
		}

				
		//print the averages 
		getAverageLength(recordArr);	
		getAverageRanking(recordArr);				

		
	}

}
