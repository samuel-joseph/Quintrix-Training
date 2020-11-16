package restassured;

public class PojoSupport {

	private String url;
	private String text;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "PojoSupport [url=" + url + ", text=" + text + "]";
	}
	
}
