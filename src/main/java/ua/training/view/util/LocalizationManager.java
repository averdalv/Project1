package ua.training.view.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationManager {
    private static LocalizationManager localizationManager;
    private String propertyFileName = "resources/menu";
    private ResourceBundle bundle;
    public static LocalizationManager getLocalizationManager() {
        if(localizationManager == null) {
            localizationManager = new LocalizationManager();
        }
        return localizationManager;
    }
    private LocalizationManager() {
        bundle = ResourceBundle.getBundle(propertyFileName,Locale.ENGLISH);
    }
    public void setLocale(Locale locale) {
        bundle = ResourceBundle.getBundle(propertyFileName,locale);
    }
    public String getStringValue(String key) {
        return bundle.getString(key);
    }
}
