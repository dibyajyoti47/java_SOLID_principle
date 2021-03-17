package dj.learning.solid.dependancyinversion.begin;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
