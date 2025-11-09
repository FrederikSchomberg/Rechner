package reader;

public class CsvReaderCreator extends ReaderCreator{

	@Override
	public ReaderProduct factoryMethod() throws Exception{
		return new CsvReaderProduct();
	}
	
}
