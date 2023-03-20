This project demonstrate the bug that new Context is created for every new Integration Test class, even though both 
classes extends common base class annotated with @SpringBootTest

To see, run all the tests and observe the logs, the Test configuration classes is loaded twice.
