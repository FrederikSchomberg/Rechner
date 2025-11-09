package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReaderProduct extends ReaderProduct {

	private BufferedReader ein;

	public CsvReaderProduct() throws IOException {

		this.ein = new BufferedReader(new FileReader("Sportverein.csv"));

	}

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] arr;

		try {
			arr = this.ein.readLine().split(";");
		} catch (IOException e) {
			throw new IOException("Fehler beim Lesen der Datei");
		}

		return arr;
	}

	@Override
	public void schließeDatei() throws IOException {
		this.ein.close();

	}

}
