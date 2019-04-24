package com.mphasis.training.bundles;

import java.util.ListResourceBundle;

public class Example_en_US extends ListResourceBundle {
public Object[][] getContents() {
return englishLanguage;
}
static final Object[][] englishLanguage = {
{"Name", "a"},
{"Address", "i"},
{"Number", "996677554"},
};
}