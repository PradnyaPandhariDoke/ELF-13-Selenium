package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Go to Advanced Search']")
	private WebElement goToAdvanceSearchLink;

	public WebElement getFilterDropDown() {
		return filterDropDown;
	}
	@FindBy(xpath="//input[@class='crmbutton edit small']")
	private WebElement goToNewCondition;

	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProduct;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(id="viewname")
	private WebElement filterDropDown;

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkBox;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement edit;
	

	@FindBy(xpath="//a[text()='Delete']")
	private WebElement delete;
	
	
	public WebElement getDelete() {
		return delete;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getGoToAdvanceSearchLink() {
		return goToAdvanceSearchLink;
	}

	public WebElement getGoToNewCondition() {
		return goToNewCondition;
	}

	public WebElement getCreateProduct() {
		return createProduct;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
