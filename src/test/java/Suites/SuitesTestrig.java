package Suites;


import Tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({HomePage.class, ServicePage.class, RequirementForm.class, DomainsPage.class, HireQAPage.class, BlogPage.class})

public class SuitesTestrig {
}
