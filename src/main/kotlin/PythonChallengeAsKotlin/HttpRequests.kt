package PythonChallengeAsKotlin

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun httpRequest(urllink: String): HttpResponse<String>? {
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
            .uri(URI.create(urllink))
            .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    return response;
}