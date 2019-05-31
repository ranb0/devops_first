package com.devops.poc.adminui.managedbean;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.devops.poc.adminui.util.ApplicationConstantsI;
import com.devops.poc.bean.SdmMasterE;

@Named(value="index")
@SessionScope
public class Index implements Serializable, ApplicationConstantsI {

	private static final long serialVersionUID = 1L;
	private Locale locale = null;
	private Long notification;
	private static final Logger LOGGER = LoggerFactory.getLogger(Index.class);
	private String msisdn;
	private List<SdmMasterE> responseEntity;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String getMsisdn() {
		return msisdn;
	}
	
	public void searchMsisdn() {
		LOGGER.info("Searching for MSISDN : {}", msisdn);
		ResponseEntity<List<SdmMasterE>> responseSprDetails = null;
		
		try {
			
			MultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
			requestParams.add("msisdn", msisdn);
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("http://13.229.115.249:8881/spr/getProfile").queryParams((LinkedMultiValueMap<String, String>) requestParams); 
			UriComponents uriComponents = builder.build().encode(); 
			
			responseSprDetails = restTemplate.exchange(
					uriComponents.toUri()
		    		, HttpMethod.GET
		    		,getRequestHttpEntity(String.class)
		    		,new ParameterizedTypeReference<List<SdmMasterE>>() {
		   		 });
			
			if(null != responseSprDetails) {
				responseEntity =responseSprDetails.getBody();
			}
		} catch(RestClientException e) {
			LOGGER.error("Error Occurred. cause :", e);
		} catch(Exception e) {
			LOGGER.error("Error Occurred. cause :", e);
		}
		
	}
	
	public List<SdmMasterE> getResponseEntity() {
		return responseEntity;
	}

	public void setResponseEntity(List<SdmMasterE> responseEntity) {
		this.responseEntity = responseEntity;
	}

	private HttpEntity<?> getRequestHttpEntity(Object o) {
		if(null != o) {
			return new HttpEntity<>(o);
		}
		
		return null;
	}
	
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void reset() {
		msisdn = null;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Index() {
		locale = (Locale) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("LOCALE_LANG");
		
		if(null == locale) {
			locale = ENGLISH;
		}
	}
	
	@PostConstruct
	public void init() {
	}
	

	public void setEnglish() {
	    locale = ENGLISH;
	    updateViewLocale();
	  }
	
	public void setBengali() {
	    locale = BENGALI;
	    updateViewLocale();
	  }
	
	private void updateViewLocale() {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("LOCALE_LANG", locale);
	    FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	}
	
	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Long getNotification() {
		return notification;
	}
	
	public void setNotification(Long notification) {
		this.notification = notification;
	}
}
