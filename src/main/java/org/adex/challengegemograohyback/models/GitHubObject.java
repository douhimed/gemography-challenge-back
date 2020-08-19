package org.adex.challengegemograohyback.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GitHubObject {


    public long total_count;
    public List<Repo> items;

}
