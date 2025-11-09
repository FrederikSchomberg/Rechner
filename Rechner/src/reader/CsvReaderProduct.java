package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import business.Sportverein;

public class CsvReaderProduct extends ReaderProduct {

	private BufferedReader ein;

	public CsvReaderProduct() throws FileNotFoundException {
		super();
		this.ein = new BufferedReader(new FileReader("Sportverein.csv"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {

		String[] arr;

		Sportverein sp;
		try {
			arr = this.ein.readLine().split(";");
		} catch (IOException e) {
			throw new IOException("Fehler beim Lesen der Datei!");
		}

		return arr;
	}

	@Override
	public void schliesseDatei() throws IOException {
		this.ein.close();
	}

}
