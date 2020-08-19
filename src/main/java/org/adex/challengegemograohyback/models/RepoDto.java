package org.adex.challengegemograohyback.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RepoDto {
        private long id;
        private String name;
        private String url;
}
