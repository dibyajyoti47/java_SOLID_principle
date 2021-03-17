package dj.learning.solid.dependancyinversion.end;

public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
