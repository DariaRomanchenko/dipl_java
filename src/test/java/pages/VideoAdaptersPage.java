package pages;

import lombok.Builder;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VideoAdaptersPage extends AbstractPage {
        public VideoAdapter getVideoAdapterDisplayedByCode(String videoAdapterText) {
            String adapterElementLocator = "//span[contains(text(), '" +
                    videoAdapterText + "')]";

            String[] desiredAdapterText = defaultWait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath(adapterElementLocator)))
                    .getText()
                    .split(" ");

            String adapterName = desiredAdapterText[0];
            String adapterCode = desiredAdapterText[desiredAdapterText.length-1]
                    .replace("(", "")
                    .replace(")", "");
            String adapterMemory = desiredAdapterText[7];

            return VideoAdapter.builder()
                    .name(adapterName)
                    .code(adapterCode)
                    .memory(adapterMemory)
                    .build();
        }
    }

//span[text()=' Asus PCI-Ex GeForce GTX 1050 Ti Phoenix 4GB GDDR5 (128bit) (1290/7008) (DVI, HDMI, DisplayPort) (PH-GTX1050TI-4G) ']

