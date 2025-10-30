// java/com/test_automation/calculator/DisplayMyNameController.java

package com.test_automation.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayMyNameController {
    @Autowired
    private DisplayMyName displayMyName;

    @RequestMapping("/displayMyName")
    public String displayMyName() {
        return displayMyName.getName();
    }
}
