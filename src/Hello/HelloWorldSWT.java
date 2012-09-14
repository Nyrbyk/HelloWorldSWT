package Hello;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello brave new world !");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
