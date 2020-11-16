package restassured;

import java.util.List;

public class PojoObject {
	
	private PojoData data;
	private PojoSupport support;
	private PojoAd ad;
	public PojoData getData() {
		return data;
	}
	public void setData(PojoData data) {
		this.data = data;
	}
	public PojoSupport getSupport() {
		return support;
	}
	public void setSupport(PojoSupport support) {
		this.support = support;
	}
	public PojoAd getAd() {
		return ad;
	}
	public void setAd(PojoAd ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "PojoObject [data=" + data + ", support=" + support + ", ad=" + ad + "]";
	}
	
	


	
	
	
	
}
