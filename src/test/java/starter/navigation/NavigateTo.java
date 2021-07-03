package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    ChoucairTestingPage choucairTestingPage;

    @Step("Open the Choucair testing jobs page")
    public void theChoucairTestingPage() {
        choucairTestingPage.open();
    }
}
