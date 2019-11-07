

package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Image;
import com.example.demo.service.ImageService;

@RestController
@RequestMapping("/api")
public class HomeController {

	private ImageService imageService;

	public HomeController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@GetMapping("/images")
	public List<Image> list()

	{
		return imageService.getAllImages();
	}
}