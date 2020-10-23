
public class Record {

	//id --> random number from 100 to 10000 
	//recordTitle ---> Null or empty
	//singerName ---> NUll or empty
	//recordLength ---> more than zero
	//recordRanking ---> more than zero less than 6 
	
	private int id;
	private String recordTitle;
	private String singerName;
	private double recordLength;
	private int recordRanking;
				
	//constructor
	public Record(String recordTitle, String singerName, double recordLength, int recordRanking) {
		
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
		
		
	}
	
	//getter 
	public int getId() {
		return id;
	}
	public String getRecordTitle() {
		return recordTitle;
	}
	public String getSingerName() {
		return singerName;
	}
	public double getRecordLength() {
		return recordLength;
	}
	public int getRecordRanking() {
		return recordRanking;
	}
	
	
	//setter
	public void setId() {
		id = (int)(Math.random()*(10000 - 100)+1) + 100;		
	}
	
	public void setRecordTitle(String recordTitle) {
		if(recordTitle.isEmpty()||recordTitle == null) {
			System.err.println("Wrong input about record title.");
		} else {
			this.recordTitle = recordTitle;
		}
	}
	
	public void setSingerName(String singerName) {
		if(singerName.isEmpty()||singerName == null) {
			System.err.println("Wrong input about singer name.");
		} else {
			this.singerName = singerName;
		}
	}
	
	public void setRecordLength(double recordLength) {
		if(recordLength > 0) {
			this.recordLength = recordLength;
		} else {
			System.err.println("Wrong input about record length.");
		}
	}
	
	public void setRecordRanking(int recordRanking) {
		if(recordRanking > 0 && recordRanking <= 6) {
			this.recordRanking = recordRanking;
		} else {
			System.err.println("Wrong input about record Ranking.");
		}
	}
	
}
