import java.time.*;

public class DiaryEntry {

	LocalDate dateOfMeeting = null;
	LocalTime startTime = null;
	LocalTime endTime = null;
	String description = null;
	
	DiaryEntry(String date, String startTime, String endTime, String description)
	{
		this.dateOfMeeting = LocalDate.parse(date);
		this.startTime = LocalTime.parse(startTime);
		this.endTime = LocalTime.parse(endTime);
		this.description = description;
	}
	
	
	public LocalDate getDateOfMeeting() {
		return dateOfMeeting;
	}
	public void setDateOfMeeting(LocalDate dateOfMeeting) {
		this.dateOfMeeting = dateOfMeeting;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
