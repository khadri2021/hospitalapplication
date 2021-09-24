package com.library.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LibraryCatalog {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://free-news.p.rapidapi.com/v1/search?q=Elon%20Musk&lang=en"))
				.header("x-rapidapi-host", "free-news.p.rapidapi.com")
				.header("x-rapidapi-key", "9d026acf82msh3ef2397c22496d5p15d055jsn0a5e8c5ce1dd")
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

}
