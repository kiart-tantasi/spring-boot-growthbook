package net.petchblog.growthbook.services;

import growthbook.sdk.java.Experiment;
import growthbook.sdk.java.ExperimentResult;
import growthbook.sdk.java.GBContext;
import growthbook.sdk.java.GrowthBook;
import growthbook.sdk.java.TrackingCallback;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import net.petchblog.growthbook.enums.ExperimentId;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class GBService {

  public boolean isOn(String id, ExperimentId exp)
      throws URISyntaxException, IOException, InterruptedException {
    return getGB(id).isOn(exp.getValue());
  }

  // TODO: use GBFeaturesRepository to reduce features requests
  private String getFeatures() throws URISyntaxException, IOException, InterruptedException {
    System.out.println("...GETTING FEATURES");
    final URI featuresEndpoint = new URI("http://localhost:3100/api/features/sdk-ABp5pRyM3XthoC9k");
    final HttpRequest request = HttpRequest.newBuilder().uri(featuresEndpoint).GET().build();
    final HttpResponse<String> response = HttpClient.newBuilder().build()
        .send(request, HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() != 200) {
      throw new RuntimeException("Cannot get features from GrowthBook server");
    }
    return new JSONObject(response.body()).get("features").toString();
  }

  private TrackingCallback getTrackingCallback() {
    return new TrackingCallback() {
      public <T> void onTrack(
          Experiment<T> experiment,
          ExperimentResult<T> experimentResult
      ) {
        System.out.println("...TRACKING CALLBACK");
        System.out.println("experiment.getKey(): " + experiment.getKey());
        System.out.println("experimentResult.getFeatureId(): " + experimentResult.getFeatureId());
        System.out.println("experimentResult.getValue(): " + experimentResult.getValue());
        System.out.println(
            "experimentResult.getVariationId(): " + experimentResult.getVariationId());
      }
    };
  }

  private GrowthBook getGB(String id)
      throws URISyntaxException, IOException, InterruptedException {
    System.out.println("...CONFIGURING GB CONTEXT FOR ID " + id);
    final JSONObject userAttributesObj = new JSONObject();
    userAttributesObj.put("id", id);
    final GBContext context = GBContext.builder()
        .featuresJson(getFeatures())
        .attributesJson(userAttributesObj.toString())
        .trackingCallback(getTrackingCallback())
        .build();
    return new GrowthBook(context);
  }
}
