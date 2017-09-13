package kr.co.goodcard.vo.mongo;

import java.util.List;

public class Detail {
	
	private String detailCtegory;
	private List<ServiceList> serviceList;
	
	public Detail() {

	}
	
	public Detail(String detailCtegory, List<ServiceList> serviceList) {
		this.detailCtegory = detailCtegory;
		this.serviceList = serviceList;
	}
	
	public String getDetailCtegory() {
		return detailCtegory;
	}
	
	public void setDetailCtegory(String detailCtegory) {
		this.detailCtegory = detailCtegory;
	}
	
	public List<ServiceList> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<ServiceList> serviceList) {
		this.serviceList = serviceList;
	}
	
	@Override
	public String toString() {
		return "Detail [detailCtegory=" + detailCtegory + ", serviceList=" + serviceList + "]";
	}
}
