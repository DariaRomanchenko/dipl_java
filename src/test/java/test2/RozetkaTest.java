package test2;

import org.junit.After;
import org.junit.Test;
import pages.MainPage;
import pages.VideoAdapter;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.DriverFactory.closeDriver;

public class RozetkaTest {
        private String desiredAdapterCode = " (PH-GTX1050TI-4G) ";
        private VideoAdapter expectedAdapter =
                VideoAdapter
                        .builder()
                        .code(desiredAdapterCode)
                        .name("Asus")
                        .memory("4GB")
                        .build();

    @Test
     public void graphicCardTest() {
       VideoAdapter actualAdapterFound =
         new MainPage()
                            .goToLaptopsAndComputers()
                            .goToVideoAdapters()
                            .getVideoAdapterDisplayedByCode(desiredAdapterCode);
            assertThat(actualAdapterFound).isEqualTo(expectedAdapter);
        }

  @After
  public void teardown() {
            closeDriver();
        }
    }


