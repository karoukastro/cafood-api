package com.carol.cafood.api.model;

import java.util.List;

import com.carol.cafood.domain.model.Cozinha;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.NonNull;

@JacksonXmlRootElement(localName = "cozinhas")
@Data
public class CozinhasXmlWrapper {

	@JacksonXmlProperty(localName = "cozinha")
	@JacksonXmlElementWrapper(useWrapping = false)
	@NonNull
	private List<Cozinha> cozinhas;
	
}
