package reader;

import java.io.IOException;

public class TxtReaderCreator extends ReaderCreator{

	@Override
	public ReaderProduct factoryMethod() throws IOException {
		return new TxtReaderProduct();
	}

}
