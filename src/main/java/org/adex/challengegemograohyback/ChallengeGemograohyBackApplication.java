package org.adex.challengegemograohyback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.adex.challengegemograohyback.models.GitHubObject;
import org.adex.challengegemograohyback.models.Repo;
import org.adex.challengegemograohyback.repositories.DB;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ChallengeGemograohyBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChallengeGemograohyBackApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            GitHubObject github = restTemplate.getForObject(
                    "https://api.github.com/search/repositories?q=created:>" + LocalDate.now().minusMonths(1) + "&sort=stars&order=desc", GitHubObject.class);
            DB.setRepos(github.getItems());
        };
    }

}

