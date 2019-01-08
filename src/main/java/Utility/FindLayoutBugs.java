package Utility;
import java.util.Collection;

import org.openqa.selenium.WebDriver;

import com.googlecode.fightinglayoutbugs.FightingLayoutBugs;
import com.googlecode.fightinglayoutbugs.LayoutBug;
import com.googlecode.fightinglayoutbugs.WebPage;

public class FindLayoutBugs {
	public void findLayoutIssues (WebDriver driver)
	{
	 WebPage webPage = new WebPage(driver);
		FightingLayoutBugs flb = new FightingLayoutBugs();
     final Collection<LayoutBug> layoutBugs = flb.findLayoutBugsIn(webPage);
     System.out.println("Found " + layoutBugs.size() + " layout bug(s).");
     for (LayoutBug bug : layoutBugs) {
         System.out.println(bug);
     }
     }
}
