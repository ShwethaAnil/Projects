package com.mphasis.training.bundles;

import java.util.ListResourceBundle;

public class Example_fr_FR extends ListResourceBundle {
public Object[][] getContents() {
return frenchLanguage;
}
static final Object[][] frenchLanguage = {
{"Name", "un"},
{"Address", "je"},
{"Number", "996677554"},
};
}