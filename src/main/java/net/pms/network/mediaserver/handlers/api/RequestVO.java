package net.pms.network.mediaserver.handlers.api;

public class RequestVO {

	public String trackID;
	public int stars;

	public RequestVO(String trackID, int stars) {
		super();
		this.trackID = trackID;
		this.stars = stars;
	}

}
