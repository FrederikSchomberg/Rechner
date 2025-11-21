package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReaderProduct extends ReaderProduct{

	private BufferedReader ein;
	
	public CsvReaderProduct() {
		try {
			this.ein = new BufferedReader(new FileReader("Sportverein.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String[] leseAusDatei() throws IOException {
		String[] arr;
		try {
			arr = this.ein.readLine().split(";");
		} catch (IOException e) {
			throw new IOException("Fehler beim lesen der Datei");
		}
		
		return arr;
	}

	@Override
	public void schliesseDatei() throws IOException {
		this.ein.close();
		
	}

	

}
