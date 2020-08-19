package org.adex.challengegemograohyback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repo {

    private long id;
    private String name;
    private String url;
    private String language = "NOT_SPECIFIED";

    public void setLanguage(String language) {
        if (language != null)
            this.language = language;
    }
}
