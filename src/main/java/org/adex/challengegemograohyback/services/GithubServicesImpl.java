package org.adex.challengegemograohyback.services;

import org.adex.challengegemograohyback.models.LanguageDto;
import org.adex.challengegemograohyback.models.Repo;
import org.adex.challengegemograohyback.models.RepoDto;
import org.adex.challengegemograohyback.repositories.DB;
import org.adex.challengegemograohyback.utilities.Mappers;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GithubServicesImpl implements GithubServices {

    @Override
    public List<Repo> getAllRepositories() {
        return DB.getRepos();
    }

    @Override
    public List<LanguageDto> getAllRepositoriesGoupedByLanguages() {

        Map<String, LanguageDto> languageDtoMap = new HashMap<>();

        this.getAllRepositories().forEach(repo -> {
            String language = repo.getLanguage();
            RepoDto repoDto = Mappers.toRepoDto(repo);
            if (languageDtoMap.containsKey(language)) {
                languageDtoMap.get(language).getRepos().add(repoDto);
            } else {
                LanguageDto languageDto = new LanguageDto(language);
                languageDto.addRepo(repoDto);
                languageDtoMap.put(language, languageDto);
            }
        });

        System.err.println(languageDtoMap);
        return new ArrayList<>(languageDtoMap.values());
    }
}
