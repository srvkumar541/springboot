package io.javabrains.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.moviecatalogservice.resources.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		return Collections.singletonList( new CatalogItem( "transformer",  "test", 4));
	}

}
