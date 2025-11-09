package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import reader.CsvReaderCreator;
import reader.ReaderCreator;
import reader.ReaderProduct;
import reader.TxtReaderCreator;

public class SportvereineModel {
	private Sportverein sportverein;

	public SportvereineModel() {
		// TODO Auto-generated constructor stub
	}

	public void schreibeSportvereineInCsvDatei() throws IOException {

		BufferedWriter aus = new BufferedWriter(new FileWriter("SportvereineAusgabe.csv", true));
		aus.write(sportverein.gibSportvereinZurueck(';'));
		aus.close();

	}

	public void leseAusDatei(String typ) throws IOException {

		if ("csv".equals(typ)) {
			ReaderCreator readerCreator = new CsvReaderCreator();
			ReaderProduct readerProduct = readerCreator.factoryMethod();

			String[] zeile = readerProduct.leseAusDatei();
			this.sportverein = new Sportverein(zeile[0], zeile[1], Integer.parseInt(zeile[2]),
					Integer.parseInt(zeile[3]), zeile[4].split("_"));
			readerProduct.schließeDatei();
//			BufferedReader ein = new BufferedReader(new FileReader("Sportverein.csv"));
//			String[] zeile = ein.readLine().split(";");
//			this.sportverein = new Sportverein(zeile[0], zeile[1], Integer.parseInt(zeile[2]),
//					Integer.parseInt(zeile[3]), zeile[4].split("_"));
//			ein.close();
		} else {
			ReaderCreator readerCreator = new TxtReaderCreator();
			ReaderProduct readerProduct = readerCreator.factoryMethod();

			String[] zeile = readerProduct.leseAusDatei();
			this.sportverein = new Sportverein(zeile[0], zeile[1], Integer.parseInt(zeile[2]),
					Integer.parseInt(zeile[3]), zeile[4].split("_"));
			readerProduct.schließeDatei();
		}
	}

	public Sportverein getSportverein() {
		return sportverein;
	}

	public void setSportverein(Sportverein sportverein) {
		this.sportverein = sportverein;
	}
}