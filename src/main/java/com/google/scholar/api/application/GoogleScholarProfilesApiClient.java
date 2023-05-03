package com.google.scholar.api.application;

import com.google.scholar.api.model.GoogleScholarAuthorApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "googleScholarProfilesApi", url = "https://serpapi.com")
public interface GoogleScholarProfilesApiClient {

    @GetMapping("/search.json")
    GoogleScholarAuthorApiResponse search(@RequestParam("engine") String engine,
                                          @RequestParam(value = "hl", required = false) String language,
                                          @RequestParam(value = "start", required = false) Integer start,
                                          @RequestParam(value = "num", required = false) Integer num,
                                          @RequestParam(value = "no_cache", required = false) Boolean noCache,
                                          @RequestParam(value = "async", required = false) Boolean async,
                                          //@RequestParam(value = "q", required = false) String query,
                                          @RequestParam(value = "author_id", required = false) String authorId,
                                          @RequestParam("api_key") String apiKey);
    /*search(@RequestParam("engine") String engine,
                                          @RequestParam(value = "hl", required = false) String language,
                                          @RequestParam(value = "start", required = false) Integer start,
                                          @RequestParam(value = "num", required = false) Integer num,
                                          @RequestParam(value = "no_cache", required = false) Boolean noCache,
                                          @RequestParam(value = "async", required = false) Boolean async,
                                          @RequestParam("q") String query,
                                          @RequestParam("api_key") String apiKey, String s);*/

}

