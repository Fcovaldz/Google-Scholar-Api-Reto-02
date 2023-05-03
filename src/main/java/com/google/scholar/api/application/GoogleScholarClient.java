package com.google.scholar.api.application;

import com.google.scholar.api.model.GoogleScholarAuthorApiResponse;
import com.google.scholar.api.model.ScholarResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "googleScholarAuthorApi", url = "https://serpapi.com")
public interface GoogleScholarClient {

    @GetMapping("/search.json")
    GoogleScholarAuthorApiResponse search(@RequestParam("engine") String engine,
                                          @RequestParam("author_id") String authorId,
                                          @RequestParam(value = "hl", required = false) String language,
                                          @RequestParam(value = "view_op", required = false) String viewOp,
                                          @RequestParam(value = "sort", required = false) String sort,
                                          @RequestParam(value = "citation_id", required = false) String citationId,
                                          @RequestParam(value = "start", required = false) Integer start,
                                          @RequestParam(value = "num", required = false) Integer num,
                                          @RequestParam(value = "no_cache", required = false) Boolean noCache,
                                          @RequestParam(value = "async", required = false) Boolean async,
                                          @RequestParam("api_key") String apiKey);
}
