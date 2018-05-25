package setUp;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DataHourToFile {
	
	public static String dataHoraParaArquivo(){
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(timeStamp);
	}
}
