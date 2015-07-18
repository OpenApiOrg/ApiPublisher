package com.tcs.opi.app.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResult {

	/*@JsonProperty("metaProperties")
	private String metaProperties;*/
	
	 @JsonProperty("searchListings")
	private List<SearchListing> searchListings;

	public List<SearchListing> getSearchListings() {
		return searchListings;
	}

	public void setSearchListings(List<SearchListing> searchListings) {
		this.searchListings = searchListings;
	}
/*
	public String getMetaProperties() {
		return metaProperties;
	}

	public void setMetaProperties(String metaProperties) {
		this.metaProperties = metaProperties;
	}*/
	
	

}