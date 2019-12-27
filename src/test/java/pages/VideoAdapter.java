package pages;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import okhttp3.Response;

@Builder
@Getter
@EqualsAndHashCode()

    public class VideoAdapter {
        private String name;
        private String code;
        private String memory;

}



