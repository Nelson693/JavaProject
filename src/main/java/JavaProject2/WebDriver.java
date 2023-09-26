package JavaProject2;
    interface WebDriver {
    /*
    Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
need to look at the Project
     */
        void open();
        void close();
        String getTitle(String s);
    }
        interface RemoteWebDriver{
            void navigate();

            String getTitle(String title);
        }
        interface TakesScreenshot{
            void getScreenshot();
        }
        class ChromeDriver implements RemoteWebDriver,WebDriver{
            @Override
            public void open(){
                System.out.println("Opening ChromeDriver");
            }
            @Override
            public void close(){
                System.out.println("Closing ChromeDrive");
            }
            @Override
            public String getTitle(String title){
                return title;
            }
            @Override
            public void navigate(){
            }
        }
        class EdgeDriver implements RemoteWebDriver,WebDriver{
            public void open() {
                System.out.println("opening EdgeDriver");
            }

            @Override
            public void close() {
                System.out.println("closing EdgeDriver");
            }

            @Override
            public String getTitle(String title) {
                return title;
            }

            @Override
            public void navigate() {

            }

        }
        class WebDriverTester {
            public static void main(String[] args) {
                WebDriver[] arr = {new ChromeDriver(), new EdgeDriver()};
                for (WebDriver a : arr) {
                    a.close();
                    a.open();
                    a.getTitle("www.amazon.com");
                }
            }
        }