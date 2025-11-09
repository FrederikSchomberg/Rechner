package reader;

public class TxtReaderCreator extends ReaderCreator{

	@Override
	public ReaderProduct factoryMethod() throws Exception {
		return new TxtReaderProduct();
	}

}
