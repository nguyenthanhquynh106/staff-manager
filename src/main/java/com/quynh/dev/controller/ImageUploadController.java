package com.quynh.dev.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageUploadController {

	@SuppressWarnings("unused")
	@GetMapping("getimage/{photo}")
	public ResponseEntity<ByteArrayResource> getImage(@PathVariable("photo") String photo) throws IOException {
		if (!photo.equals("") || photo != null) {
			Path filename = Paths.get("uploads", photo);
			byte[] buffer = Files.readAllBytes(filename);
			ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
			return ResponseEntity.ok().contentLength(buffer.length).contentType(MediaType.parseMediaType("image/png"))
					.body(byteArrayResource);
		}
		return ResponseEntity.badRequest().build();
	}
}
