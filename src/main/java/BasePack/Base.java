package BasePack;

import java.util.function.Consumer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public final class Base {
	
	private Base() {}
	public static void selectValueFromDropDown(Consumer<Select>consumer, WebElement element) {
		consumer.accept(new Select(element));
	}
}
