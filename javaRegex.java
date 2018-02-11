import java.util.regex.*;

public class javaRegex {

	public static void main(String[] args) {
		boolean val = Pattern.compile("^([a-zA-Z0-9_\\.]+)@([a-z\\-]+)\\.([org||com||net]{3})$").
				matcher("chetu2@syr.net").matches();
		
		System.out.println(val);

	}

	//^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-]+)\.([a-zA-Z]{2,5})$
}