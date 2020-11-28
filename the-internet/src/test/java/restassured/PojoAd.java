package restassured;

public class PojoAd {
	
	private String company;
	private String description;
	private String url;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	@Override
	public String toString() {
		return "PojoAd [company=" + company + ", description=" + description + ", url=" + url + "]";
	}
	
	

}
