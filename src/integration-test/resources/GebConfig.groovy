import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions

//tiver que deixar o firefox como o padrão
// Default driver configuration
driver = {
    FirefoxOptions options = new FirefoxOptions()
    options.setBinary('/usr/bin/firefox')  // Especifique o caminho do executável do Firefox aqui
    new FirefoxDriver(options)
}

environments {
    // run via “./gradlew -Dgeb.env=firefox iT”
    // run via “./gradlew -Dgeb.env=firefox iT”
    firefox {
        // Esta configuração será usada quando o ambiente 'firefox' for especificado.
        // Se você deseja a mesma configuração que o padrão, você pode omitir este bloco.
    }
}