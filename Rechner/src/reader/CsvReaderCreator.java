package reader;

import java.io.IOException;

public class CsvReaderCreator extends ReaderCreator{

	@Override
	public ReaderProduct factoryMethod() throws IOException {
		return new CsvReaderProduct();
	}

}
