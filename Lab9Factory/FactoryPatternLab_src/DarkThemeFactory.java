
public class DarkThemeFactory implements ThemeFactory {

	public Toolbar createToolbar() {
		// TODO Auto-generated method stub
		return new DarkToolbar();
	}

	public Dialog createDialog() {
		// TODO Auto-generated method stub
		return new DarkDialog();
	}

	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new DarkMenu();
	}

}
