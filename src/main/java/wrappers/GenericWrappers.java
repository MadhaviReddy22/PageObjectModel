package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers {
	
	RemoteWebDriver driver;

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				
				} else if(browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					
				} else if(browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers.IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("The browser "+browser+" is launched with the given url "+url+" succesfully");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser "+browser+" is not launched due to session not created error.");
		} catch (WebDriverException e) {
			System.err.println("The browser "+browser+" is not launched due to unknown error.");
		} finally {
			takeSnap();
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The element with id "+idValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+idValue+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with id "+idValue+" is not visible in the application.");
		} catch (ElementNotInteractableException e) {
			System.err.println(" The element with id "+idValue+" is not interactable in the appllication.");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with id "+idValue+" is not stable in the application.");
		} catch (WebDriverException e) {
			System.err.println("The element with id "+idValue+" is not entered with the data "+data+" due to unknown error.");
		} finally {
			takeSnap();
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The element with name "+nameValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name "+nameValue+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with name "+nameValue+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with name "+nameValue+" is not interactable in the application.");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with name "+nameValue+" is not stable in the application.");
		} catch (WebDriverException e) {
			System.err.println("The element with name "+nameValue+" is not entered with the data "+data+" due to unknown error.");
		} finally {
			takeSnap();
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with xpath "+xpathValue+" is not interactable in the application.");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with xpath "+xpathValue+" is not stable in the application.");
		} catch (WebDriverException e) {
			System.err.println("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error.");
		} finally {
			takeSnap();
		}
	}
	
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String pageTitle = driver.getTitle();
			if (pageTitle.equals(title)) {
				System.out.println("The title of the page "+pageTitle+" matches with the expected title "+title);
			} else {
				System.err.println("The title of the page "+pageTitle+" does not match with the expected title "+title);
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The title of the page cannot be verified due to unknown error");
		} finally {
			takeSnap();
		}
			
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				System.out.println("The element with id "+id+" that is holding the actual text "+actualText+" matches with the expected text "+text);
			} else {
				System.err.println("The element with id "+id+" that is holding the actual text "+actualText+" does not match with the expected text "+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with id "+id+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with id "+id+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with id "+id+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with id "+id+" that is holding the acutal text cannot be verified with expected text due to unknown exception");
		} finally {
			takeSnap();
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				System.out.println("The element with xpath "+xpath+" that is holding the text "+actualText+" matches with the expected text "+text);
			} else {
				System.err.println("The element with xpath "+xpath+" that is holding the text "+actualText+" does not match the expected text "+text);
				}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpath+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with xpath "+xpath+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with xpath "+xpath+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with xpath "+xpath+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with xpath "+xpath+" that is holding the actual text cannot be verified with the expected text due to unknown error");
		} finally {
			takeSnap();
		}
	}
	

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			System.out.println(actualText);
			if (actualText.contains(text)) {
				System.out.println("The element with xpath "+xpath+" that is holding the text "+actualText+" matches with the expected text "+text);
			} else {
				System.err.println("The element with xpath "+xpath+" that is holding the text "+actualText+" does not match with the expected text "+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpath+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with xpath "+xpath+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with xpath "+xpath+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with xpath "+xpath+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with xpath "+xpath+" that is holding the actual text cannot be verified with the expected text due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("The element with id "+id+" was clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The click could not be performed on the element with id "+id+" due to an error");
		} catch (NoSuchElementException e) {
			System.err.println("The element with id "+id+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with id "+id+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with id "+id+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with id "+id+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with id "+id+" is not clickable due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with class name "+classVal+" was clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The click could not be performed on the element with class name "+classVal+" due to an error");
		} catch (NoSuchElementException e) {
			System.err.println("The element with class name "+classVal+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with class name "+classVal+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with class name "+classVal+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with class name "+classVal+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with class name "+classVal+" is not clickable due to unknown error");
		} finally {
				takeSnap();
			}
			
		}
		
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			System.out.println("The element with name "+name+" was clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The click could not be performed on the element with "+name+" due to an error");
		} catch (NoSuchElementException e) {
			System.err.println("The element with name "+name+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with name "+name+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with name "+name+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with name "+name+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with name "+name+" is not clickable due to unknown error");
		} finally {
				takeSnap();
		}
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with link "+name+" was clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The click could not be performed on the element with link "+name+" due to an error");
		} catch (NoSuchElementException e) {
			System.err.println("The element with link "+name+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with link "+name+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with link "+name+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with link "+name+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with link "+name+" is not clickable due to an unknown error");
		} finally {
			takeSnap();
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with link "+name+" was clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The click could not be performed on the element with link "+name+" due to an error");
		} catch (NoSuchElementException e) {
			System.err.println("The element with link "+name+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with link "+name+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with link "+name+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with link "+name+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with link "+name+" is not clickable due to an unknown error");
		} 
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
	   try {
		driver.findElementByXPath(xpathVal).click();
		   System.out.println("The element with Xpath "+xpathVal+" was clicked");
	} catch (ElementClickInterceptedException e) {
		// TODO Auto-generated catch block
		System.err.println("The click could not be performed on the element with Xpath "+xpathVal+" due to an error");
	} catch (NoSuchElementException e) {
		System.err.println("The element with Xpath "+xpathVal+" is not found in the DOM");
	} catch (ElementNotVisibleException e) {
		System.err.println("The element with Xpath "+xpathVal+" is not visible in the application");
	} catch (ElementNotInteractableException e) {
		System.err.println("The element with Xpath "+xpathVal+" is not interactable in the application");
	} catch (StaleElementReferenceException e) {
		System.err.println("The element with Xpath "+xpathVal+" is not stable in the application");
	} catch (WebDriverException e) {
		System.err.println("The element with Xpath "+xpathVal+" is not clickable due to an unknown error");
	} finally {
		takeSnap();
	}
}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with Xpath "+xpathVal+" was clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The click could not be performed on the element with Xpath "+xpathVal+" due to an error");
		} catch (NoSuchElementException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not clickable due to an unknown error");
		} 
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String appText = null;
		try {
			 appText = driver.findElementById(idVal).getText();
			System.out.println("The element with Id "+idVal+" contains the text "+appText);
		} catch (NoSuchElementException e) {
			System.err.println("The element with Id "+idVal+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Id "+idVal+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with Id "+idVal+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with Id "+idVal+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Id "+idVal+" could not capture/get the text due to an unknown error");
		} finally {
			takeSnap();
		}
		return appText; 
	}
	
    public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
    	String actualText = null;
    	try {
			actualText = driver.findElementByXPath(xpathVal).getText();
			System.out.println("The element with Xpath "+xpathVal+" contains the text "+actualText);
    	} catch (NoSuchElementException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with Xpath "+xpathVal+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Xpath "+xpathVal+" could not be captured/get the text due to an unknown error");
		} finally {
			takeSnap();
		}
		return actualText; 
	}
    
    public String getTextByLink(String linkText) {
		// TODO Auto-generated method stub
    	String actualText = null;
    	try {
			actualText = driver.findElementByLinkText(linkText).getText();
			System.out.println("The element with link "+linkText+" contains the text "+actualText);
		} catch (NoSuchElementException e) {
			System.err.println("The element with Xpath "+linkText+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Xpath "+linkText+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with Xpath "+linkText+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with Xpath "+linkText+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Xpath "+linkText+" could not be captured/get the text due to an unknown error");
		} finally {
			takeSnap();
		}
    	return actualText;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select selText = new Select (text);
			selText.selectByVisibleText(value);
			System.out.println("The value "+value+" from the dropdown field with the Id "+id+" is selected");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not selectable due to an unknown error");
		} catch (NoSuchElementException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+"is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" could not be selected due to an unknown error");
		} finally {
			takeSnap();	
		}
	}    
	
	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByXPath(xpath);
			Select selText = new Select(text);
			selText.selectByVisibleText(value);
			System.out.println("The value "+value+" from the drop down field with the xpath "+xpath+" is selected");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The value "+value+" from the dropdown field with xpath "+xpath+" is not selectable due to an unknown error");
		} catch (NoSuchElementException e) {
			System.err.println("The value "+value+" from the dropdown field with xpath "+xpath+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The value "+value+" from the dropdown field with xpath "+xpath+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The value "+value+" from the dropdown field with xpath "+xpath+"is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The value "+value+" from the dropdown field with xpath "+xpath+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The value "+value+" from the dropdown field with xpath "+xpath+" could not be selected due to an unknown error");
		} finally {
			takeSnap();	
			
		}
	}
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownText = driver.findElementById(id);
			Select selText = new Select (dropdownText);
			selText.selectByIndex(value);
			System.out.println("The value "+value+" from the dropdown field with the Id "+id+" is selected");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not selectable due to an unknown error");
		} catch (NoSuchElementException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+"is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" could not be selected due to an unknown error");
		} finally {
			takeSnap();	
		}
	}
	
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownText = driver.findElementById(id);
			Select selText = new Select(dropdownText);
			selText.selectByValue(value);
			System.out.println("The value "+value+" from the dropdown field with the Id "+id+" is selected");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not selectable due to an unknown error");
		} catch (NoSuchElementException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+"is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The value "+value+" from the dropdown field with Id "+id+" could not be selected due to an unknown error");
		} finally {
			takeSnap();	
		}
	}
	
	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownText = driver.findElementByName(name);
			Select selText = new Select(dropdownText);
			selText.selectByValue(value);
			System.out.println("The value "+value+" from the dropdown field with the name "+name+" is selected");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The value "+value+" from the dropdown field with name "+name+" is not selectable due to an unknown error");
		} catch (NoSuchElementException e) {
			System.err.println("The value "+value+" from the dropdown field with name "+name+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The value "+value+" from the dropdown field with name "+name+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The value "+value+" from the dropdown field with name "+name+"is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			System.err.println("The value "+value+" from the dropdown field with name "+name+" is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The value "+value+" from the dropdown field with name "+name+" could not be selected due to an unknown error");
		} finally {
			takeSnap();	
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
				
		try {
			Set<String> allWinID = driver.getWindowHandles(); 
			for (String eachID : allWinID) {
				driver.switchTo().window(eachID);
				break;
			}
			
			System.out.println("Switched to the parent window");
			
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			  System.err.println("Window not found");  
	    } catch (WebDriverException e) {
		      System.err.println("Unable to switch to the parent window due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinID = driver.getWindowHandles();
			for (String eachID : allWinID) {
				driver.switchTo().window(eachID);
			}
			System.out.println("Able to switch to the last window ");
	  } catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			  System.err.println("Window not found");  
	  } catch (WebDriverException e) {
		System.err.println("Unable to switch to the last window due to unknown error");
		} finally {
			takeSnap();
		}
	}
	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert is accepted");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("Alert not present");
		} catch (UnhandledAlertException e) {
			System.err.println("Unable to accept the Alert due to an error");
		} catch (WebDriverException e) {
			System.err.println("Unable to access the the Alert due to unknown error");
		} finally {
			takeSnap();
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
	try {
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
	} catch (NoAlertPresentException e) {
		// TODO Auto-generated catch block
		System.err.println("Alert not present");
	} catch (UnhandledAlertException e) {
		System.err.println("Unable to dismiss the Alert due to an error");
	} catch (WebDriverException e) {
		System.err.println("Unable to dismiss the the Alert due to unknown error");	
	} finally {
		takeSnap();
	}
}
	
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
			System.out.println("Alert Text displayed: "+alertText);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("Alert not present");
		} catch (UnhandledAlertException e) {
			System.err.println("Unable to capture the Alert text due to an error");
		} catch (WebDriverException e) {
			System.err.println("Unable to access the the Alert due to unknown error");
		}
		return alertText;
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		
		try {
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/snap1.jpg");
			FileUtils.copyFile(temp, dest);
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("The file was not copied due to unknown error");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Unable to copy the file from source to destination folder due to unknown error");
		}
					
  }
	
	public void scrollPageDown(String xpath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_DOWN);
			System.out.println("Page scroll down successful");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpath+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with xpath "+xpath+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with xpath "+xpath+" is not interactable in the application.");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with xpath "+xpath+" is not stable in the application.");
		} catch (WebDriverException e) {
			System.err.println("Unable to scroll down the page due to unknown error.");
		} finally {
			takeSnap();
		}
	}
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The browser is closed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to close the browser due to an unknown error");
		} 
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("All the active browsers are closed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to close the browsers due to an unknown error");
		} 
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("Wait could not be implemented due to unknown error ");
		}
		
	  }
	}
	

