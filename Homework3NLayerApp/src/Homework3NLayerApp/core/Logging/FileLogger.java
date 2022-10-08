package Homework3NLayerApp.core.Logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("File ile loglandı "+data);
	}

}
