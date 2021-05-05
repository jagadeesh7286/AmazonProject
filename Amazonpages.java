package com.qa.pages;

import java.util.Collection;

import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpages {
	WebDriver driver;

	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement categoriesDropDown;
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindAll(@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div/div[1]/span[1]/div[1]/div[1]"))
	List <WebElement> itemNames;
	
	@FindAll(@FindBy(className="a-price-whole"))
	List <WebElement> itemPrices;
	
	@FindAll(@FindBy(xpath="//*[@id=\"navFooter\"]/div[4]/ul/li/a"))
	List <WebElement> countryList;
	
	@FindAll(@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]"))
	List <WebElement> signInLink;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement help;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement signinbtn;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-newCust\"]/a")
	WebElement starthere;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(name="rememberMe")
	WebElement keepSignIn;
	
	@FindBy(id="nav-search-submit-button")
	WebElement clickSearchButton;
	@FindBy(xpath="//span[contains(text(),'New Apple iPhone 11 (128GB) - Purple')]")
	WebElement Click1;
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addCard;
	@FindBy(xpath="//p[@class='a-text-left a-size-base'][contains(text(),'128GB')]")
	WebElement size;
	
	public Amazonpages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getSize()
	{
		return size;
	}
	public WebElement getAddCartButton() {
		return addCard;
	}
	public WebElement ClickOn() {
		return Click1;
	}
	public WebElement getSearchBTN() {
		return clickSearchButton;
	}
	
	
	public WebElement clickHelp() {
		return help;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getcontinueButton() {
		return continuebtn;
	}
	public WebElement signIn() {
		return signinbtn;
	}
	
	
	public WebElement getsearchButton() {
		return search;
	}
	
	
	public WebElement clickStartHere() {
		return starthere;
	}
	public WebElement getName() {
		return name;
	}
	
	
	
	
	
	public WebElement getCategoriesDropDown() {
		return categoriesDropDown;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement KeepMeSignedIn() {
		return keepSignIn;
	}
	
	public List <WebElement> getItemNames() {
		return itemNames;
	}
	
	public List <WebElement> getItemprices() {
		return itemPrices;
	}

	public List<WebElement> getCountryList() {
	
		return countryList ;
	}

	public WebElement getSignInLink() {
	
		return (WebElement) signInLink;
	}
	
}


