package co.edu.uco.ucobet.dto;

import co.edu.uco.crosscuting.helpers.TextHelper;
import co.edu.uco.crosscuting.helpers.UUIDHelper;
import co.edu.uco.ucobet.entity.CountryEntity;

public class CountryDTO extends DomainDTO{
	
	private String  name;
	
	public CountryDTO() {
		super(UUIDHelper.getDefaultAssString());
		setName(TextHelper.EMPTY);
	}
	
	public static final  CountryDTO create() {
		return new CountryDTO();
	}
	public String getName() {
		return name;
	}

	public CountryDTO setName(final String name) {
		this.name = TextHelper.applyTrim(name);
		return this;
	}
	
	public CountryDTO setId(final String id) {
		super.setIdentifier(id);
		return this;
	}
	
	@Override
	public  String getId() {
		return super.getId();
	}
	

	public static void main(String[] args) {
		CountryEntity country  = new CountryEntity();
		country.setName(null);
		
		System.out.println(country.getId());
		System.out.println(country.getName());
		
		
		CountryDTO country2 = CountryDTO.create().setName("Colombia");
		
		System.out.println(country2.getName());
	}
	
	
	
	

}