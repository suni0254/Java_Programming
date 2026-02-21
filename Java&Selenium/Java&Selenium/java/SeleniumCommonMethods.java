public class SeleniumCommonMethods {
    /*Split the Text:
    public String getErrorMessageText(){
        return getText(txtErrorMsg);
    }
    String name= SecureRandomStringUtils.randomAlphabetic(40).toUpperCase(); this is expected
    String actualNameInErrorMessage = partDetailsPage.getErrorMessageText().split("-")[1].trim();
        Assert.assertEquals(actualNameInErrorMessage, name, "Actual name reflecting in the ErrorMessage is not same as Entered in add advisory page");


    Dropdown handle

    public void searchPartByOEM(String searchType ,String oemPartNo) {
        selSearchType(searchType);
        enterText(txtOemPartNo, oemPartNo);
        clickPrtSrchBtnOpt(SEARCH);
        report(INFO, PART_SEARCH_RESULT);
    }


    public void selSearchType(String searchValue) {
        selectOption(drpdwnSearchType, searchValue);
    }

    public void selectOption(By locator, String opt) {
        LOGGER.info("Before selectOption::{} {} {}", locator, ", with Select Option::", opt);
        WebElement element = this.waitForElement(locator);
        this.webDriverFluentWait().until(ExpectedConditions.elementToBeClickable(locator));
        Select select = new Select(element);
        select.selectByVisibleText(opt);
        this.waitUntilDomLoad();
        LOGGER.info("After selectOption::{} {} {}", locator, ", with Select Option::", opt);
    }

partSearchPage.searchPartByOEM(PART_SEARCH_TYPE_OEM_PART_NUMBER, "__%");

    Parameter pass:
    private static String lnkOemPartNumber = "//table[@id='idTableSearchResults']//tr[2]/td[2]/a[text()='%s']";

    private static By getLnkOemPartNumber(String oemPartNumber){
        return By.xpath(String.format(lnkOemPartNumber, oemPartNumber));
    }

    public void clickOemPartNumberHyperLink(String oemPartNumber){
        buttonClick(getLnkOemPartNumber(oemPartNumber));
        report(INFO, "Click on OEM Part number hyperlink on Part Search page");
    }
    public void buttonClick(By locator) {
        try {
            LOGGER.info("BeforeWaitForElement in buttonClick::{}", locator);
            this.webDriverFluentWait().until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception var5) {
            LOGGER.info("Exception in buttonClick ::{}", locator);
            LOGGER.info(var5);
        }


        public void deleteAdvisories() {
            AuthorityPage authorityPage = new AuthorityPage();
            if (isElementDisplayed(By.id("idTitleWrap"))) {
                List<WebElement> advisories = waitForElements(txtErrorMsg);
                int advisoryCount = advisories.size();
                for (int i = 0; i < advisoryCount; i++) {
                    WebElement deleteButton = advisories.get(i).findElement(txtErrorMsg);
                    deleteButton.click();
                    getDriver().findElement(clearAdvisory).click();
                    getDriver().findElement(confarmationRequired).click();
                    getDriver().findElement(By.id("idClearNote")).sendKeys("Test");
                    commonPage.clickingOnCapsok();
                    authorityPage.closeButton();
                }


            }
        }
        while (waitForElements(txtErrorMsg).size() > 0) {
        }
        066-50007-0101



        Name,Id,class  using send keys
        private static final By txtRemarks = By.name("remarks");
        public void enterRemarks(String remarks) {
            enterText(txtRemarks, remarks);
        }
        sellerCancelPurchaseOrder.enterRemarks("Remarks");

        public void enterText(By locator, String text) {
            LOGGER.info("Before enterText:: {} {} {}", locator, ", with text::", text);
            WebElement webElementEnter = this.waitForElement(locator);
            JavascriptExecutor js = (JavascriptExecutor)this.getDriver();
            js.executeScript("arguments[0].value='" + text + "'", new Object[]{webElementEnter});
            LOGGER.info("After enterText:: {} {} {}", locator, ", with text::", text);
        }

       // OK,CANCEL,SUBMIT THIS TYPE BUTTON USING SWICH CASE//

        private static final By clickSubmit = By.xpath("//form[@name='ActionForm']//div//a[2]");

        public void clickButton(String buttonName) {
            switch (buttonName) {
                case "Submit":
                    scrollToElement(getDriver().findElement(clickSubmit));
                    buttonClick(clickSubmit);
                    break;
                default:
                    LOGGER.info("Invalid Case");
            }
            report(INFO, "Clicked on " + buttonName + " button");


        }
        sellerCancelPurchaseOrder.clickButton("Submit");

        //Alerts OK//

        public void acceptAlert() {
            try {
                WebDriverWait wait = new WebDriverWait(this.getDriver(), Duration.ofSeconds(60L));
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = this.getDriver().switchTo().alert();
                alert.accept();
            } catch (NoAlertPresentException var3) {
                LOGGER.info(var3);
            }

           // Verification Element://

            public void verifyOrderExceptionPendingColor(String expectedColor) {
                String orderExceptionPendingColor = waitForElement(txtOrderExceptionsPending).getCssValue("color");
                if (orderExceptionPendingColor.equals(expectedColor))
                    report(INFO, "Verified Order Exception(s) pending color is " + expectedColor);
                else
                    report(ERROR, "Expected Order Exception(s) pending color is " + expectedColor + " but found "+ orderExceptionPendingColor);
            }

            public void verifyItemDetailsOrderQuantity(int expectedOrderQuantity){
                int actualOrderQuantity = Integer.valueOf(trim(getText(txtItemDetailsOrderQuantity)).replace(";", ""));
                Assert.assertEquals(actualOrderQuantity, expectedOrderQuantity, "Actual Order Quantity " + actualOrderQuantity + " do not match with the expected Order Quantity " + expectedOrderQuantity);
                report(INFO, "Verified Order Quantity in Item Details: " + expectedOrderQuantity);

            }

            public void verifyItemDetailsOrderQuantityColor(String expectedOrderQuantityColor){
                String actualOrderQuantityColor = getWebElementAttribute(txtItemDetailsOrderQuantity, "color");
                Assert.assertEquals(actualOrderQuantityColor, expectedOrderQuantityColor, "Actual Order Quantity color" + actualOrderQuantityColor + " do not match with the expected Order Quantity color " + expectedOrderQuantityColor);
                report(INFO, "Verified Order Quantity color in Item Details: " + expectedOrderQuantityColor);
            }
            public void verifyOrderStatus(String orderStatus) {
                String orderMessage = getElementTextAsString(waitForElement(valOrderStatus));
                if (orderMessage.contains(orderStatus))
                    report(INFO, "Order status verified as " + orderStatus);
                else
                    report(ERROR, "Order status is not displayed as" + orderStatus);
            }
            ssh-keygen -t rsa -b 4096 -C saikiran.sandapeta@wnco.com

            String format:
            private  String txtOrderStatusString = "//td[@class='OraColorHeaderSub' and contains(text(),'%s-%d (%s)')]";
            public By getTxtOrderStatusString(String orderNumber, int orderLineNumber, String orderStatus){
                return By.xpath(String.format(txtOrderStatusString, orderNumber, orderLineNumber, orderStatus));
            }

            Dropdown pagination list:
            public String selectAircraftRadioButton(String aircraft) {
                String aircraftName;
                setDynamicData(AIRCRAFT_TAIL_NUMBER, aircraft.split("-")[1].trim());
                boolean aircraftFound= false;
                List<WebElement> aircraftList = waitForElement(tblAircraftFleetList).findElements(By.tagName("tr"));
                if (isElementPresent(drpFleetListPagenation)) {
                    Select pageDropDown = new Select(waitForElement(drpFleetListPagenation));
                    List<WebElement> paginationList = pageDropDown.getOptions();

                    for(int j = 0; j < paginationList.size();) { // 2
                        for (int i = 2; i < aircraftList.size(); i++) {
                            aircraftName = aircraftList.get(i).findElement(By.xpath(TD3)).getText();
                            if (aircraftName.contains(aircraft)) {
                                WebElement radioButton = aircraftList.get(i).findElement(By.xpath("td/input[@type='RADIO']"));
                                buttonClick(radioButton);
                                report(INFO, "Selected the aircraft" + aircraftName);
                                aircraftFound = true;
                                break;
                            }
                        }
                        j++;
                        pageDropDown.selectByIndex(j);
                        waitUntilDomLoad();
                    }
                }
                else{
                    for (int i = 2; i < aircraftList.size(); i++) {
                        aircraftName = aircraftList.get(i).findElement(By.xpath(TD3)).getText();
                        if (aircraftName.contains(aircraft)) {
                            WebElement radioButton = aircraftList.get(i).findElement(By.xpath("td/input[@type='RADIO']"));
                            buttonClick(radioButton);
                            report(INFO, "Selected the aircraft" + aircraftName);
                            aircraftFound = true;
                            break;
                        }
                    }
                }
                Assert.assertTrue(aircraftFound, "Aircraft " + aircraft + " is not found in the feet list");

                return "";
            }

            ParseInt int converted in to string(12 overdue)
            public int getNoOfWarningMessage() {
                String message = getWarningMessage();
                int overdueMsgCount=0;
                for (String part : message.split(" ")){
                    overdueMsgCount=Integer.parseInt(part);
                    break;
                }
                return overdueMsgCount;
            }
            public String getWarningMessage() {
                String message = getText(txtWarningMsg);
                if(message.contains(";")){
                    message = message.replace(";", "");
                }
                report("INFO", "Capturing warning message in Preview Release Page");
                return message;
            }
            int overdueTasks=previewReleasePage.getNoOfWarningMessage();


            int overdueTasksUpdated = previewReleasePage.getNoOfWarningMessage();
            Assert.assertEquals(overdueTasksUpdated,overdueTasks+1);






            Authentication
            public void clickOnOKWithAuthentication() {
                try {
                    this.buttonClick(this.btnCapsOk);
                    if (!this.waitForElements(this.txtCapsAuthenticationPassword).isEmpty()) {
                        this.enterText(this.waitForElement(this.txtCapsAuthenticationPassword), this.getDynamicData("logOnPassword"));
                        this.report(INFO, "Enter Authentication Password");
                        this.buttonClick(this.waitForElement(this.btnAuthenticationOk));
                        this.report("INFO", "Clicked on OK with Authentication");
                        if (this.isElementVisible(this.btnYes)) {
                            this.buttonClick(this.btnYes);
                        }
                    }
                } catch (Exception var2) {
                    LOGGER.info(var2);
                }
            }

            SetDynamic
            public void recordDueDateCssValue(String cssValue, String identifier) {
                setDynamicData(identifier + "dueDate", waitForElement(dueDatetxt).getCssValue(cssValue));
                report("INFO", "Due date "+ cssValue + " of the task is recorded");
            }
            taskDetailsPage.recordDueDateCssValue("color", "color");
            Assert.assertEquals(basePage.getDynamicData("color" + "dueDate"), "rgba(0, 0, 0, 1)", "Color mismatch for the Due filed in Task details page under Details section");

            Index by 1
            public void clickOnWorkPackage(int workPackageIndex) {
                List<String> workPackageBarcode = getDynamicArrayData(WPBARCODES);
                buttonClick(By.xpath(TD_A_TEXT + workPackageBarcode.get(workPackageIndex - 1) + "']"));
                verifyMainPageTitle(WORK_PACKAGE_DETAILS);
            }
            Regular Expression By NextLine
            public void verifyStatusOfTasksDisplayed(String status) {
                List<String> statusValues = new ArrayList<>();
                if (status.equals("Historical Only")) {
                    statusValues.add("COMPLETE");
                    statusValues.add("CANCEL");
                    statusValues.add("TERMINATE");
                } else if (status.equals("Active Only")) {
                    statusValues.add("ACTV");
                } else if (status.equals("Active + Forecasted")) {
                    statusValues.add("ACTV");
                    statusValues.add("FORECAST");
                    statusValues.add("IN WORK");
                    statusValues.add("COMMIT");
                }
                int allRows = getDriver().findElements(tblSearchResultRows).size();
                String taskStatus = null;
                //Starting i value from 3 as the 1st 3 rows are related to header of table
                for (int i = 3; i < allRows; i++) {
                    //Task status is present in 7th column
                    taskStatus = getElementTextAsString(waitForElement(By.xpath(CommonXpathFormats.TBL_SEARCH_RESULTS + i + "]/td[7]"))).split("\n")[0].trim();
                    if (!statusValues.contains(taskStatus))
                        report(ERROR, "Expected status values are: " + statusValues + " ;actual status value displayed at line no " + i +  " for task is: " + taskStatus);
                }
                report(INFO, "For '" + status + "' task with any one of the " + statusValues + " is displayed as expected");
            }
            Check box selected and deselect  :
            public void selectAllUnassignedTasks() {
                buttonClick(btnSelectAll);
                report(INFO, "Clicked on Select All Link");
            }
            public void deSelectAllUnassignedTasks() {
                buttonClick(btnDeSelectAll);
                report(INFO, "Clicked on Deselect All Link");
            }



            Verification;
            public void verifySelectionStatusOfAllTasksCheckBoxes(boolean selectionStatus){
                List<WebElement> taskCheckboxes = waitForElements(selectCheckBoxes);
                String failureMessage;
                if (selectionStatus){
                    failureMessage = "Check box at index '%s' is not selected";
                }
                else {
                    failureMessage = "Check box at index '%s' is selected";
                }
                for (int i = 0; i < taskCheckboxes.size(); i++) {
                    scrollToElement(waitForElements(selectCheckBoxes).get(i));
                    Assert.assertEquals(waitForElements(selectCheckBoxes).get(i).isSelected(), selectionStatus, String.format(failureMessage, i));
                }
                if(selectionStatus)
                    report(INFO, "Verified All checkboxes are in Selected status");
                else
                    report(INFO, "Verified All checkboxes are in Unselected status");
            }
            CheckBoxes manually unselect:
            int[] taskListIndex = {1,2,3};
            workPackageDetailsPage.manuallyUnselectCheckBoxes(taskListIndex);
            List<Integer> indexToPrint = new ArrayList<>();
            for (int i = 0; i < taskListIndex.length; i++) {
                workPackageDetailsPage.verifySelectionStatusOfCheckBox(taskListIndex[i], false);
                indexToPrint.add(i+1);
            }


            public void manuallyUnselectCheckBoxes(int[] indexArray){
                List<Integer> arrayToPrint = new ArrayList<>();

                for (int i = 0; i < indexArray.length; i++){
                    checkboxClick(waitForElements(selectCheckBoxes).get(indexArray[i]), false);
                    arrayToPrint.add(i + 1);
                }
                report(INFO, "Manually unselected checkboxes at index " + arrayToPrint);
            }
            public void verifySelectionStatusOfCheckBox(int index, boolean selectionStatus){
                scrollToElement(waitForElements(selectCheckBoxes).get(index));

                if(selectionStatus) {
                    Assert.assertEquals(waitForElements(selectCheckBoxes).get(index).isSelected(), selectionStatus, "Check box at index " + index + " is not selected");
                }
                else {
                    Assert.assertEquals(waitForElements(selectCheckBoxes).get(index).isSelected(), selectionStatus, "Check box at index " + index + " is selected");
                }
            }


            checkboxes verify pop up:
            private String chkBoxDisplayOptions = "//table[@id='colSelect']//label[contains(text(),'%s')]//following::input[1]";
            private By getDisplayOptionsCheckBox(String displayOptionLabel){
                return By.xpath(String.format(chkBoxDisplayOptions, displayOptionLabel));
            }
            public void verifyDisplayOptionsCheckboxesVisibility(String displayOption){
                WebElement displayOptionField = waitForElement(getDisplayOptionsCheckBox(displayOption));
                Assert.assertTrue(displayOptionField.isDisplayed(), displayOption + " field is missing in the Display Options popup");
            }

            String[] displayOptions = {"Config Position", "Must Be Removed", "Due", "Soft Deadline", "Next Shop Visit", "Inventory", "Task Status", "Task Type", "Work Type(s)", "Originator", "Task Priority", "Schedule Priority", "Driving Task", "ETOPS Significant", "Material Availability" };
            for (int i = 0; i < displayOptions.length; i++){
                workPackageDetailsPage.verifyDisplayOptionsCheckboxesVisibility(displayOptions[i]);
            }
            basePage.report(INFO, "Verified Visibility of Display options


                    Table colum headers verify:
            private String columnHeader = "//*[@class='tableHeader' or contains(@id,'idTableOpenTasksCol')][text()='%s']";
            private By getColumnHeader(String columnName){
                return By.xpath(String.format(columnHeader, columnName));
            }
            public void verifyColumnVisibility(String columnName, boolean visibilityStatus){
                List<WebElement> columnHeaderElement = waitForElements(getColumnHeader(columnName));
                String failureMessage;
                if (visibilityStatus){
                    failureMessage = columnName + " column is not displayed even after selecting from display options";
                }
                else {
                    failureMessage = columnName + " column is displayed even when deselecting is display options";
                }
                Assert.assertEquals(!columnHeaderElement.isEmpty(), visibilityStatus,  failureMessage);
            }
            Testcase wise:
            for (int i = 0; i < displayOptions.length; i++) {
                workPackageDetailsPage.verifyColumnVisibility(displayOptions[i], true);
            }
            basePage.report(INFO, "Verified column headers are as per display options selected : " + Arrays.toString(displayOptions));

            Pop Up some check boxes deselect and verify:
            private String chkBoxDisplayOptions = "//table[@id='colSelect']//label[contains(text(),'%s')]//following::input[1]";
            private By getDisplayOptionsCheckBox(String displayOptionLabel){
                return By.xpath(String.format(chkBoxDisplayOptions, displayOptionLabel));
            }
            public void unSelectDisplayOptions(String displayOptionName){
                checkboxClick(getDisplayOptionsCheckBox(displayOptionName), false);
            }
            testcase wise:
            String[] displayOptionsToUnselect = {"Config Position", "Must Be Removed", "Due", "Soft Deadline"};
            setSubScenarioName("MTXXP-10816_Verify columns displayed after unselecting display options : " + Arrays.toString(displayOptionsToUnselect));
            workPackageDetailsPage.clickFilterLink();
            for (int i = 0; i < displayOptionsToUnselect.length; i++) {
                workPackageDetailsPage.unSelectDisplayOptions(displayOptionsToUnselect[i]);
            }
            basePage.report(INFO, "Unselected Display options: " + Arrays.toString(displayOptionsToUnselect));
            workPackageDetailsPage.clickDisplayOptionsOKButton();







            Validate Table Row:
            public void recordRemovedAndInstallPartSerialNum(int row) {
                scrollToElement(waitForElement(By.xpath(TABLE_PART_REQUIREMENT_LIST_TBODY)));
                if (isElementVisible(btnPartRequirementRemovedSerialNo)){
                    String removedSerialNum = getElementTextAsString(waitForElement(btnPartRequirementRemovedSerialNo));
                    setDynamicData(REMOVED_SERIAL_NUMBER_ROW +row,removedSerialNum);
                    report("INFO", "Recorded serial number in removed section"+ removedSerialNum);
                }
                else
                    report(ERROR, "Failed to record Removed Serial Number");

                if (isElementVisible(By.xpath(INSTALLED_PART_SERIAL_NUMBER))) {
                    String installedSerialNum = getElementTextAsString(waitForElement(By.xpath(INSTALLED_PART_SERIAL_NUMBER)));
                    setDynamicData(INSTALLED_SERIAL_NUMBER_ROW +row,installedSerialNum);
                    report("INFO", "Recorded serial number in installed section"+ installedSerialNum);
                }
                else
                    report(ERROR, "Failed to record Installed Serial Number");
            }


            public void validateSerialNumber(int row){
                scrollToElement(waitForElement(By.xpath(TABLE_PART_REQUIREMENT_LIST_TBODY)));
                String actualremovedSerialNum = getElementTextAsString(waitForElement(btnPartRequirementRemovedSerialNo));
                if(actualremovedSerialNum.equalsIgnoreCase(getDynamicData(REMOVED_SERIAL_NUMBER_ROW +row))){
                    report("INFO", "Removed Part Serial number same as recorded serial number"+actualremovedSerialNum);
                }
                else
                    report(ERROR, "Removed Part Serial number is not same as recorded serial number Actual:"+actualremovedSerialNum+ EXPECTED + getDynamicData(REMOVED_SERIAL_NUMBER_ROW +row));

                String actualInstalledSerialNum = getElementTextAsString(waitForElement(By.xpath(INSTALLED_PART_SERIAL_NUMBER)));
                if(actualInstalledSerialNum.equalsIgnoreCase(getDynamicData(INSTALLED_SERIAL_NUMBER_ROW +row))){
                    report("INFO", "Installed Part Serial number same as recorded serial number"+actualInstalledSerialNum);
                }
                else
                    report(ERROR, "Installed Part Serial number is not same as recorded serial number Actual:"+actualInstalledSerialNum+ EXPECTED + getDynamicData(INSTALLED_SERIAL_NUMBER_ROW +row));

            }

            if ().is displayed:

            private String finishButton = "//td[contains(text(),'%s')]//following-sibling::td//a[@title='%s']";
            public By getFinishButton(String skill, String title){
                return By.xpath(String.format(finishButton, skill, title));
            }

            if (commonPage.getDriver().findElement(taskDetailsPage.getFinishButton("RII", "Labour row cannot be finished until a repair reference is selected.")).isDisplayed()){
                taskDetailsPage.clickTaskBtnOpt("Select Reference");
                selectReferencePage.selectReferencewithNotes("AMM", "05-00-00-201-NG", "Test");
                Assert.assertTrue(commonPage.getDriver().findElement(taskDetailsPage.getFinishButton("RII", "Finish")).isEnabled(), "Finish button for RII skill not enabled after Select Reference");
            }

            VerifyTextInPage

            public void verifyLabourStage(String skill, String stage) {
                if (getElementTextAsString(waitForElement(By.xpath(TD_CONTAINS_TXT + skill + "')]//following-sibling::td[1]"))).equalsIgnoreCase(stage))
                    report("INFO", skill + " Labour stage status is " + stage);
                else report(ERROR, "Labour stage value is not correct");
            }
            public void clickTaskDetailsTab(String option) {
                boolean status = true;
                switch (option) {
                    case TASK_EXECUTION:
                        buttonClick(tabTaskExecution);
                        break;
                    case "Task Information":
                        buttonClick(tabTaskInfo);
                        break;
                    default:
                        status = false;
                }
                if (status) report("INFO", "Clicked on tab " + option);
                else report(ERROR, "Clicking on tab " + option + " is failed");

            }
            public void verifyFaultInformationStatus(String fieldName, String status) {
                if (isElementDisplayed(waitForElement(By.xpath("//*[@id='idBandFaultDetails']//td[text()='" + fieldName + ":']/following-sibling::td[contains(text(),'" + status + "')]")))) {
                    report("INFO", "Status " + status + " Verified successfully");
                } else {
                    report(ERROR, "Status   " + status + " Verified successfully");
                }
            }
            Menu And SubMenu click
            public void selectSubMenuSearch(By subMenuOne, By subMenuTwo) {
                this.selectMenuHome();
                this.movetoElement(this.waitForElement(subMenuOne));
                this.buttonClick(subMenuOne);
                ((JavascriptExecutor)this.getDriver()).executeScript("arguments[0].style.top ='47px'", new Object[]{this.waitForElement(subMenuTwo)});
                this.movetoElement(this.waitForElement(subMenuTwo));
                this.buttonClick(subMenuTwo);
            }
            public void selectSubmenu(String subMenuItem1, String subMenuItem2) {
                By subMenu1 = By.xpath("//a[text() = '" + subMenuItem1 + "']");
                By subMenu2 = By.xpath("//a[text() = '" + subMenuItem2 + "']");
                this.selectSubMenuSearch(subMenu1, subMenu2);
            }
            Table instead of dropdowns and checkbox selected
            public void selectMeasurements(String value) {
                if (isElementPresent(tblMeasurements)) {
                    List<WebElement> txtPartReqElm = waitForElements(tblMeasurements);
                    //int optionsCount;
                    for (int i = 1; i < txtPartReqElm.size(); i++) {
                        checkboxClick(txtPartReqElm.get(i).findElement(By.xpath(TD1_INPUT)), true);
                        if ((!txtPartReqElm.get(i).findElements(By.xpath(TD_SELECT)).isEmpty())) {
                            //optionsCount = getDropdownValuesNumbers(txtPartReqElm.get(i).findElement(By.xpath(TD_SELECT)));
                            selectValue(txtPartReqElm.get(i).findElement(By.xpath(TD_SELECT)), value);
                        } else if (!txtPartReqElm.get(i).findElements(By.xpath("td/input[starts-with(@name,'aMeasurementText')]")).isEmpty()) {
                            enterText(txtPartReqElm.get(i).findElement(By.xpath("td/input[starts-with(@name,'aMeasurementText')]")), "tagName");
                        }
                    }
                    report("INFO", "Select the measurement Details");
                }
            }

            Table validations:
            public void verifyShipmentQuantity(int lineNumber, int expectedQty) {
                int actualQty = Integer.parseInt(getElementTextAsString(waitForElements(txtShipmentExpQty).get(lineNumber - 1)).split(" ")[0].trim());
                if (actualQty == expectedQty) {
                    report(INFO, "Shipment quantity " + expectedQty + " is verified in line number " + lineNumber );
                } else {
                    report(FAIL,  "Shipment quantity" + expectedQty + " is not verified for part for line no " + lineNumber);
                }
            }


            public void verifyReceivedQuantity(int lineNumber, int expectedQty){
                int actualQty = Integer.parseInt(getElementTextAsString(waitForElements(txtReceivedQty).get(lineNumber - 1)).split(" ")[0].trim());
                Assert.assertEquals(actualQty, expectedQty, "Actual quantity " + actualQty + " is not equal to expected qty " + expectedQty);
                report(INFO, "Verified received quantity is " + expectedQty);
            }

            Verification And Validations:
            public void verifyShipmentQuantity(int lineNumber, int expectedQty) {
                int actualQty = Integer.parseInt(getElementTextAsString(waitForElements(txtShipmentExpQty).get(lineNumber - 1)).split(" ")[0].trim());
                if (actualQty == expectedQty) {
                    report(INFO, "Shipment quantity " + expectedQty + " is verified in line number " + lineNumber );
                } else {
                    report(FAIL,  "Shipment quantity" + expectedQty + " is not verified for part for line no " + lineNumber);
                }
            }

            public void verifyReceivedQuantity(int lineNumber, int expectedQty){
                int actualQty = Integer.parseInt(getElementTextAsString(waitForElements(txtReceivedQty).get(lineNumber - 1)).split(" ")[0].trim());
                Assert.assertEquals(actualQty, expectedQty, "Actual quantity " + actualQty + " is not equal to expected qty " + expectedQty);
                report(INFO, "Verified received quantity is " + expectedQty);
            }

            public void verifyPOLineNo(int orderLineNumber, String expectedValue){
                String actualValue = getElementTextAsString(waitForElements(poLineNO).get(orderLineNumber - 1));
                Assert.assertEquals(actualValue, expectedValue, "Actual po Line No '" + actualValue + "' is not equal to expected qty '" + expectedValue + "'");
                if(expectedValue.isBlank()){
                    expectedValue = BLANK;
                }
                report(INFO, "Verified po line No is " + expectedValue + " for order Line number " + orderLineNumber);
            }


           Verify Any field name and status:
            public void verifyFaultInformationStatus(String fieldName, String status) {
                if (isElementDisplayed(waitForElement(By.xpath("//*[@id='idBandFaultDetails']//td[text()='" + fieldName + ":']/following-sibling::td[contains(text(),'" + status + "')]")))) {
                    report("INFO", "Status " + status + " Verified successfully");
                } else {
                    report(ERROR, "Status   " + status + " Verified successfully");
                }
            }

        }
*/
}