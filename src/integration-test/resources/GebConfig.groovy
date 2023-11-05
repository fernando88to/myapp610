import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.safari.SafariDriver

driver = {  // Default driver configuration
    FirefoxOptions options = new FirefoxOptions()
    options.setBinary("/usr/bin/firefox")  // Especifique o caminho do executável do Firefox aqui
    new FirefoxDriver(options)
}

environments {

    // You need to configure in Safari -> Develop -> Allowed Remote Automation
//    safari {
//        driver = { new SafariDriver() }
//    }
//
//    // run via “./gradlew -Dgeb.env=chrome iT”
//    chrome {
//        driver = { new ChromeDriver() }
//    }
//
//    // run via “./gradlew -Dgeb.env=chromeHeadless iT”
//    chromeHeadless {
//        driver = {
//            ChromeOptions o = new ChromeOptions()
//            o.addArguments('headless')
//            new ChromeDriver(o)
//        }
//    }

    // run via “./gradlew -Dgeb.env=firefoxHeadless iT”
    firefoxHeadless {
        driver = {
            FirefoxOptions o = new FirefoxOptions()
            o.addArguments('-headless')
            new FirefoxDriver(o)
        }
    }

    // run via “./gradlew -Dgeb.env=firefox iT”
    // run via “./gradlew -Dgeb.env=firefox iT”
    firefox {
        // Esta configuração será usada quando o ambiente 'firefox' for especificado.
        // Se você deseja a mesma configuração que o padrão, você pode omitir este bloco.
    }
}