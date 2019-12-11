
public class FactoryPatternLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThemeFactory lightFactory = new LightThemeFactory();
		ThemeFactory darkFactory = new DarkThemeFactory();

		System.out.println(lightFactory.createToolbar());
		System.out.println(lightFactory.createDialog());
		System.out.println(lightFactory.createMenu());
		
		System.out.println(darkFactory.createToolbar());
		System.out.println(darkFactory.createDialog());
		System.out.println(darkFactory.createMenu());
	}

}
