package co.com.cursoangular.util.rest;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class RestUtil {

	private RestUtil() {

	}

	public static MultiValueMap<String, String> plain_text() {

		MultiValueMap<String, String> header = new HttpHeaders();
		header.put("Content-Type", Arrays.asList("plain/text"));

		return header;
	}
}
