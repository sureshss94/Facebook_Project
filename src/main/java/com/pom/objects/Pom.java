package com.pom.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email ;
	@FindBy(id="pass")
	private WebElement password ;
	@FindBy(name="login")
	private WebElement login ;
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create ;
	@FindBy(name="firstname")
	private WebElement firstname ;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement passwordincreate ;
	@FindBy(xpath="//select[@aria-label='Day']")
	private  WebElement date ;
	@FindBy(xpath="//select[@aria-label='Month']")
	private WebElement month ;
	@FindBy(xpath="//select[@aria-label='Year']")
	private WebElement year ;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender ;
	@FindBy(name="websubmit")
	private WebElement submitbtn ;
	public Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public WebElement getCreate() {
		return create;
	}
	public void setCreate(WebElement create) {
		this.create = create;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getPasswordincreate() {
		return passwordincreate;
	}
	public void setPasswordincreate(WebElement passwordincreate) {
		this.passwordincreate = passwordincreate;
	}
	public WebElement getDate() {
		return date;
	}
	public void setDate(WebElement date) {
		this.date = date;
	}
	public WebElement getMonth() {
		return month;
	}
	public void setMonth(WebElement month) {
		this.month = month;
	}
	public WebElement getYear() {
		return year;
	}
	public void setYear(WebElement year) {
		this.year = year;
	}
	public WebElement getGender() {
		return gender;
	}
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public void setSubmitbtn(WebElement submitbtn) {
		this.submitbtn = submitbtn;
	}
	
	
	

}
