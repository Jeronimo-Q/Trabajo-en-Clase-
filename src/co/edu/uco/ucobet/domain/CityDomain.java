package co.edu.uco.ucobet.domain;

import java.util.UUID;

import co.edu.uco.crosscuting.helpers.ObjectHelper;
import co.edu.uco.crosscuting.helpers.TextHelper;

public class CityDomain extends Domain{
	
	private String name;
	private CountryDomain country;
	
	private CityDomain(final UUID id, final String name,final CountryDomain country ) {
		super(id);
		setName(name);
		setCountry(country);
	}
	
	public static final CityDomain create (final UUID id , final String name,final CountryDomain country) {
		return new CityDomain(id, name,country);
	}
	
	public String getName() {
		return name;
	}

	private void setName(final String name) {
		this.name = TextHelper.applyTrim(name);
	}
	
	@Override
	public  UUID getId() {
		return super.getId();
	}

	private CountryDomain getCountry() {
		return country;
	}

	private void setCountry(final CountryDomain country) {
		this.country = ObjectHelper.getDefault(country, CountryDomain.create());
	}
	

}
