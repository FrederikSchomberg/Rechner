package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReaderProduct extends ReaderProduct {

	BufferedReader ein;

	public TxtReaderProduct() throws Exception {
		this.ein = new BufferedReader(new FileReader("Sportverein.txt"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] arr = new String[5];
		
		String zeile = this.ein.readLine();
		int i = 0;
		while(i < arr.length) {
			arr[i] = zeile;
			zeile = this.ein.readLine();
			i++;
		}
		return arr;
		
	}

	@Override
	public void schliesseDatei() throws IOException {
		this.ein.close();

	}

}
