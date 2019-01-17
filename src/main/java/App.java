import org.apache.commons.lang.ArrayUtils;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static final String DEV = "DEV";
    public static final String PROD = "PROD";
    public static final String SRC_MAIN_RESOURCES_SANDBOX_CONFIG_PROPERTIES = "src\\main\\resources\\sandbox.config.properties";
    public static final String SRC_MAIN_RESOURCES_PRODUCTION_CONFIG_PROPERTIES = "src\\main\\resources\\production.config.properties";

    /**
     * @param args 0-Environment variable
     * @throws IOException
     * @throws JAXBException
     */
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties(); // you can use properties files for constant text variables.
        InputStream inputStream = null;
        String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);
        if(ArrayUtils.isNotEmpty(args)){
            if(args[0].equalsIgnoreCase(DEV)){
                inputStream = new FileInputStream(SRC_MAIN_RESOURCES_SANDBOX_CONFIG_PROPERTIES); // you can output as XML files.
            }else if (args[0].equalsIgnoreCase(PROD)){
                inputStream = new FileInputStream(SRC_MAIN_RESOURCES_PRODUCTION_CONFIG_PROPERTIES); // you can output as XML files.
            }
            prop.load(inputStream);
        }else{
            System.exit(1);
        }
    }
}